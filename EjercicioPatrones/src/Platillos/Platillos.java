package Platillos;

public class Platillos {
    private TipoPlatillo tipoPlatillo;
    private Producto producto;

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setTipoPlatillo(TipoPlatillo tipoPlatillo) {
        this.tipoPlatillo = tipoPlatillo;
    }

    public TipoPlatillo getTipoPlatillo() {
        return tipoPlatillo;
    }
}
