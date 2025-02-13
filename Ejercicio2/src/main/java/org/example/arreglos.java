package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: alexxus
 * Created on: 13/02/25
 */
public class arreglos {

    private int[] ingresoArreglo;
    private int cantidadFinalArreglo;
    private ArrayList<Object> arregloDatos = new ArrayList<>();

    public arreglos(){}



    public boolean devolucionUnicoArreglo(Object[] elementos){
        // en este caso comenzar a ver de que tipo de dato es, el caso
        //aca debera de determinar cuantos datos son primitivos y cuantos ciclos se debera de hacer
        for (int i =0; i < elementos.length; i++){
            // compara si ya hay un dato primitivo dentro
            if( elementos[i] instanceof Integer || elementos[i] instanceof String){
                System.out.println("tipo primitivo:" + elementos[i]);
                // aca le ingreso los primitivos que haya
                setCantidadFinalArreglo(getCantidadFinalArreglo()+1);
                //aca deberia de ingresarse
                ingresoIndividual(elementos[i]);
                //luego como se que ya nos valores como tal los guardo en un string
            } else if (elementos[i] instanceof Object[]){
                System.out.println("ingreso en otro arreglo");
                //aca genero recursividad para que vuelva a entrar a hacer la determinacion si es o no primitivo
                devolucionUnicoArreglo((Object[]) elementos[i]);
            }
            System.out.println(elementos[i]);
        }

        //ACA DEBERA DE DETERMINAR SI TIENE EXITO
        if(getCantidadFinalArreglo() ==getArregloDatos().size()) {
            return true;
        }

        return false;
    }


    public Object[]  generacionArreglo(){
        Object[] arregloFinal = new Object[getCantidadFinalArreglo()];

        for (int i =0; i <  this.arregloDatos.size(); i++) {
            arregloFinal[i]= this.arregloDatos.get(i);
        }

        return arregloFinal;
    }



    // aca setter


    public void setCantidadFinalArreglo(int cantidadFinalArreglo) {
        this.cantidadFinalArreglo = cantidadFinalArreglo;
    }

    public int getCantidadFinalArreglo() {
        return cantidadFinalArreglo;
    }

    public  void ingresoIndividual(Object valor) {
        this.arregloDatos.add(valor);
    }

    public void setArregloDatos(ArrayList<Object> arregloDatos) {
        this.arregloDatos = arregloDatos;
    }


    public ArrayList<Object> getArregloDatos() {
        return arregloDatos;
    }


    public void imprimirDatos(){
        for (Object valores: this.arregloDatos) {
            System.out.println(valores);
        }
    }


}
