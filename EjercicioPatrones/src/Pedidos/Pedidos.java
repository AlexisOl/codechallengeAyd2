package Pedidos;

import Cliente.Cliente;
import Platillos.Platillos;

import java.util.List;

public class Pedidos {

    private List<Platillos> listaPlatillos;
    private Cliente cliente;
    private Double total;
    private EstadoPedido estado;
    private ReglaDescuento estrategia;


    public void setEstrategia(ReglaDescuento estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularTotal() {
        return listaPlatillos.stream().mapToDouble(p -> p.getProducto().getPrecio()).sum();
    }

    public double calcularDescuento() {

        double total = calcularTotal();
        if (this.estrategia != null){
            total = estrategia.aplicarDescuento(total);
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getTotal() {
        return total;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public List<Platillos> getListaPlatillos() {
        return listaPlatillos;
    }

    public void setListaPlatillos(List<Platillos> listaPlatillos) {
        this.listaPlatillos = listaPlatillos;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
}


