package Pedidos;

public class EnviarPedidoComand implements CommandPedido{

    private Pedidos pedido;


    public EnviarPedidoComand(Pedidos pedido) {
        this.pedido = pedido;
    }

    @Override
    public void ejecutar() {
        this.pedido.setEstado(EstadoPedido.ENVIANDO_A_COCINA);
    }

    @Override
    public void deshacer() {
        this.pedido.setEstado(EstadoPedido.PENDIENTE);
    }
}
