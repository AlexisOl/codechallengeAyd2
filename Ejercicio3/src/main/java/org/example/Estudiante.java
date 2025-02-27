package org.example;

import java.awt.*;

/**
 * Author: alexxus
 * Created on: 27/02/25
 */
public class Estudiante {
    private String nombre;
    private String apellido;


    public Estudiante(){}


    public Estudiante(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
