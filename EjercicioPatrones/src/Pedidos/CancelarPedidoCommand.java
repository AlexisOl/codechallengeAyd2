package Pedidos;

public class CancelarPedidoCommand  implements CommandPedido {
    private Pedidos pedido;


    public CancelarPedidoCommand(Pedidos pedido) {
        this.pedido = pedido;
    }
    @Override
    public void ejecutar() {
        this.pedido.setEstado(EstadoPedido.CANCELADO);

    }

    @Override
    public void deshacer() {
        this.pedido.setEstado(EstadoPedido.PENDIENTE);

    }
}
