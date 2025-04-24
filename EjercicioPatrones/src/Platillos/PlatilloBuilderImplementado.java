package Platillos;

public class PlatilloBuilderImplementado implements PlatilloBuilder {

        private Platillos platillos;

        public  PlatilloBuilderImplementado() {
            this.platillos = new Platillos();
        }

        @Override
        public void setProducto(Producto producto) {
            platillos.setProducto(producto);
        }

        @Override
        public void setTipoPlatillo(TipoPlatillo tipoPlatillo) {
            platillos.setTipoPlatillo(tipoPlatillo);
        }

        @Override
        public Platillos build() {
            if (platillos.getProducto() == null) {
                throw new IllegalStateException("El producto no puede ser nulo");
            }
            return platillos;
        }

}
