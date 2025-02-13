package org.example;

public class Main {
    public static void main(String[] args) {

        arreglos nuevoArreglos = new arreglos();
        Object[] valores = new Object[]{1, "b", new Object[]{3,"a"}, 5, new Object[]{6,7, new Object[]{8, 9}}};
        System.out.println(
                nuevoArreglos.devolucionUnicoArreglo(valores)

        );
        System.out.println("arreglo final");
        for (Object finArreglo: nuevoArreglos.generacionArreglo()) {
            System.out.println(finArreglo);
        }


    }
}