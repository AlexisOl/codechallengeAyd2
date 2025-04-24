import Platillos.Platillos;
import Platillos.Producto;
import Platillos.TipoPlatillo;
import Platillos.PlatilloBuilderImplementado;
import Platillos.Director;
import Pedidos.Pedidos;
import Pedidos.DescuentoMartes;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Producto pasta = new Producto("Pasta Alfredo", 50);
        Producto bebida = new Producto("Refresco", 10);

        TipoPlatillo tipoPasta = TipoPlatillo.PASTA;
        TipoPlatillo tipoBebida = TipoPlatillo.BEBIDA;

        PlatilloBuilderImplementado builder1 = new PlatilloBuilderImplementado();
        PlatilloBuilderImplementado builder2 = new PlatilloBuilderImplementado();

        Director director = new Director();

        Platillos platillo1 = director.construirPlatilloBasico(builder1, pasta, tipoPasta);
        Platillos platillo2 = director.construirPlatilloBasico(builder2, bebida, tipoBebida);



        Pedidos pedido = new Pedidos();
        pedido.setListaPlatillos(Arrays.asList(platillo1, platillo2));

        // Aplicar descuento Martes de Pasta
        pedido.setEstrategia(new DescuentoMartes());

        System.out.println("Total sin descuento: Q" + pedido.calcularTotal());
        System.out.println("Total con descuento: Q" + pedido.calcularDescuento());

    }
}