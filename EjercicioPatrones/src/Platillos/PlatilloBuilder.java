package Platillos;

public interface PlatilloBuilder {
    void setProducto(Producto producto);
    void setTipoPlatillo(TipoPlatillo tipoPlatillo);
    Platillos build();
}
