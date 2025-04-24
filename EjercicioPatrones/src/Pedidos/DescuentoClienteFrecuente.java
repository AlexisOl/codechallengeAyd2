package Pedidos;

public class DescuentoClienteFrecuente implements ReglaDescuento {


    @Override
    public double aplicarDescuento(Double pedido) {
        return pedido*0.9;
    }
}