package com.example.demo.Modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Author: alexxus
 * Created on: 6/03/25
 */

// se define como una entidad
@Entity
public class Driver {
    //se define como el valor de id y que se incremente
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String name;
    private int edad;



    public Driver(){}


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }
}
