package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class arreglosTest {

    // prueba
    @Test
    void devolucionUnicoArreglo() {
        // EXITO
        // caso que pueda extraer adecuadamente cada uni de los elementos
        // solamente comparar con lo esperado y si es verdadero debe de tirar que si lo pudo extraer
        Object[] pruebaIngreso = new Object[]{1, 2, new Object[]{3}};
        arreglos tesArreglos = new arreglos();
        assertTrue(tesArreglos.devolucionUnicoArreglo(pruebaIngreso));
    }

    @Test
    void falloIngresoArreglo(){
        // ERROR
        // mala definicion del objeto o algo mas debera de devolver falso y pasaria a esta prueba
        Object[] pruebaIngreso = new Object[]{1, 2, new Object[]{3}};

        arreglos testArreglos = new arreglos();
        //caso de mal ingreso de informacion deberia de ser falso
        assertFalse(testArreglos.devolucionUnicoArreglo(pruebaIngreso));


    }

    @Test
    void generacionArreglo() {
    }
}