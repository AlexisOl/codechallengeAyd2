package Platillos;
public enum TipoPlatillo {
    PASTA("Pasta"),
    BEBIDA("Bebida"),
    POSTRE("Postre"),
    ENSALADA("Ensalada");

    private final String nombre;

    TipoPlatillo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
