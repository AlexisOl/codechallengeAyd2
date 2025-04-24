package Pedidos;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DescuentoMartes implements ReglaDescuento {



    @Override
    public double aplicarDescuento(Double pedido) {
            return pedido * 0.85;
    }
}