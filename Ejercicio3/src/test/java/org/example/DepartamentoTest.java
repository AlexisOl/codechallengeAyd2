package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void impresionEstudiantes() {
    }


    // ACA LISTO
    // caso de estar bien solo ingresa el estudiante
    @Test
    void ingresoEstudiante() {
        Estudiante nuevoEstudiante1= new Estudiante("Alexis", "Ovalle");
        Estudiante nuevoEstudiante2 = new Estudiante("Estuardo", "Valle");
        Estudiante nuevoEstudiante3 = new Estudiante("Enrique", "Lopez");

        //valor de ejemplo
        Estudiante pruebaEstudiante= new Estudiante("Jose", "Tezo");

        Departamento pruebaDepartamento = new Departamento();

        pruebaDepartamento.ingresoEstudiante(nuevoEstudiante1, 13);
        pruebaDepartamento.ingresoEstudiante(nuevoEstudiante2, 70);
        pruebaDepartamento.ingresoEstudiante(nuevoEstudiante3, 30);

        // que compare con un valor booleano, en este caso 0 como no existe
        Boolean valor = pruebaDepartamento.ingresoEstudiante(pruebaEstudiante, 47);
        assertEquals(true, valor);

    }

    // caso de existir previante alguien con el apellido a ingresar
    // se le cambiara en el map

    @Test
    void ingresoExistente(){
        Estudiante nuevoEstudiante1= new Estudiante("Alexis", "Ovalle");
        Estudiante nuevoEstudiante2 = new Estudiante("Estuardo", "Valle");
        Estudiante nuevoEstudiante3 = new Estudiante("Enrique", "Lopez");

        //valor de ejemplo
        Estudiante pruebaEstudiante= new Estudiante("Jose", "Valle");

        Departamento pruebaDepartamento = new Departamento();

        pruebaDepartamento.ingresoEstudiante(nuevoEstudiante1, 13);
        pruebaDepartamento.ingresoEstudiante(nuevoEstudiante2, 70);
        pruebaDepartamento.ingresoEstudiante(nuevoEstudiante3, 30);

        // que compare con un valor booleano, en este caso 0 como no existe
        Boolean valor = pruebaDepartamento.ingresoEstudiante(pruebaEstudiante, 98);
        assertEquals(false, valor);


    }

    @Test
    void impresionEstudiantesArreglo() {
        String[] valoresPrueba = {"Enrique Lopez- Nota: - 45", "Mario Gomez- Nota: - 13", "Estuardo Valle- Nota: - 30"};


        Estudiante nuevoEstudiante1= new Estudiante("Mario", "Gomez");
        Estudiante nuevoEstudiante2 = new Estudiante("Estuardo", "Valle");
        Estudiante nuevoEstudiante3 = new Estudiante("Enrique", "Lopez");
        Departamento pruebaDepartamento = new Departamento();

        pruebaDepartamento.ingresoEstudiante(nuevoEstudiante1, 13);
        pruebaDepartamento.ingresoEstudiante(nuevoEstudiante2, 30);
        pruebaDepartamento.ingresoEstudiante(nuevoEstudiante3, 45);

        assertArrayEquals(valoresPrueba, pruebaDepartamento.impresionEstudiantesArreglo());

    }
}