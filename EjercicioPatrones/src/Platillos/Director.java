package Platillos;

public class Director {
    public Platillos construirPlatilloBasico(PlatilloBuilder builder, Producto producto, TipoPlatillo tipo) {
        builder.setProducto(producto);
        builder.setTipoPlatillo(tipo);
        return builder.build();
    }
}
