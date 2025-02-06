package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Author: alexxus
 * Created on: 6/02/25
 */
public class anagrama {

    private String palabra1;
    private  String palabra2;

    //constructor
    public anagrama(){}


    public boolean determinarAnangrama(String word1, String word2){

        char[] letrasPalabra1 = word1.toCharArray();
        char[] letrasPalabra2 = word2.toCharArray();

        //aca determinar la cantidad de letras

        // ademas de letras unicas que empieza con 1
        int cantidadLetras1 =1;

        //listas de elementos
        List<Character> letrasUnicas1 = new ArrayList<>();
        List<Integer> cantidadUnica1 = new ArrayList<>();



        int cantidadLetras2 =1;

        //listas de elementos
        List<Character> letrasUnicas2 = new ArrayList<>();
        List<Integer> cantidadUnica2 = new ArrayList<>();
        // esto mismo deberia de estar en el otro arreglo para la palabra2
//        for (int i =0; i < letrasPalabra1.length; i++) {
//            System.out.println(letrasPalabra1[i]);
//            for (int j =i+1; j< letrasPalabra1.length; j++){
//                //siempre y cuando se despues del final
//                if(!letrasUnicas1.contains(letrasPalabra1[i])){
//                    System.out.println("letra:"+letrasPalabra1[i]+"---"+letrasPalabra1[j]);
//                    if(letrasPalabra1[i] == letrasPalabra1[j]){
//                        System.out.println("coincide:"+letrasPalabra1[i]);
//                        cantidadLetras1++;
//                    }
//
//                } else {
//                    break;
//                }
//            }
//
//            //agrego elementos a listas
//            //aca debe de determinar solo las letras unicas
//            if (!letrasUnicas1.contains(letrasPalabra1[i])){
//                letrasUnicas1.add(letrasPalabra1[i]);
//                cantidadUnica1.add(cantidadLetras1);
//
//            }
//            //elimino todo
//            cantidadLetras1=1;
//
//        }
//


        // para la palabra1
        //uso de metodo
        determinarListas(letrasPalabra1, letrasUnicas1, cantidadLetras1,cantidadUnica1 );
        determinarListas(letrasPalabra2, letrasUnicas2, cantidadLetras2,cantidadUnica2 );


        // ya con esto solo comparar
        //conteo de los elementos
        int coincidenciaLetras =0;
        if (letrasUnicas1.size() == letrasUnicas2.size()) {
            for(int i =0; i < letrasUnicas1.size(); i ++) {
                //coincidencia con las letras
                if (letrasUnicas1.contains(letrasUnicas2.get(i))){
                    //aca encontraria el indice
                    int indiceArreglo1=letrasUnicas1.indexOf(letrasUnicas2.get(i));
                    if (Objects.equals(cantidadUnica2.get(i), cantidadUnica1.get(indiceArreglo1))){
                        coincidenciaLetras++;
                        System.out.println("coincide letra: "+letrasUnicas1.get(i));
                        System.out.println("cantidad de letra: "+cantidadUnica2.get(i)+ "---"+ cantidadUnica1.get(indiceArreglo1));
                    }
                }

            }



            if (coincidenciaLetras==letrasUnicas1.size())
            {
                System.out.println("es anagrama");
                return  true;
            }

        } else {
            System.out.println("NO son anagramas");
            return false;
        }


//        for(Character letrasU: letrasUnicas1) {
//            System.out.println(letrasU);
//        }
//
//        for(int cantidad: cantidadUnica1) {
//            System.out.println(cantidad);
//        }


//        for(Character letrasU: letrasUnicas2) {
//            System.out.println(letrasU);
//        }
//
//        for(int cantidad: cantidadUnica2) {
//            System.out.println(cantidad);
//        }


        return false;
    }




    public void determinarListas(char[] letrasPalabra1, List<Character> letrasUnicas1, int cantidadLetras1, List<Integer> cantidadUnica1 ){
        for (int i =0; i < letrasPalabra1.length; i++) {
            System.out.println(letrasPalabra1[i]);
            for (int j =i+1; j< letrasPalabra1.length; j++){
                //siempre y cuando se despues del final
                if(!letrasUnicas1.contains(letrasPalabra1[i])){
                    System.out.println("letra:"+letrasPalabra1[i]+"---"+letrasPalabra1[j]);
                    if(letrasPalabra1[i] == letrasPalabra1[j]){
                        System.out.println("coincide:"+letrasPalabra1[i]);
                        cantidadLetras1++;
                    }

                } else {
                    break;
                }
            }

            //agrego elementos a listas
            //aca debe de determinar solo las letras unicas
            if (!letrasUnicas1.contains(letrasPalabra1[i])){
                letrasUnicas1.add(letrasPalabra1[i]);
                cantidadUnica1.add(cantidadLetras1);

            }
            //elimino todo
            cantidadLetras1=1;

        }
    }


    public String getPalabra1() {
        return palabra1;
    }

    public String getPalabra2() {
        return palabra2;
    }

    public void setPalabra1(String palabra1) {
        this.palabra1 = palabra1;
    }

    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }
}
