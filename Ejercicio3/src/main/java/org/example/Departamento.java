package org.example;

import java.util.HashMap;

/**
 * Author: alexxus
 * Created on: 27/02/25
 */
public class Departamento {
    private HashMap<Estudiante, Integer> historialPunteos = new HashMap<>();

    public Departamento(){}

    //metodo  que imprime en consola
    public void impresionEstudiantes(){
        System.out.println("-- Informacion de estudiante --");
        for (Estudiante estudiantes : this.getHistorialPunteos().keySet()) {
            System.out.println(
                    estudiantes.getNombre()+ " "
                            + estudiantes.getApellido()
                            + "- Nota: - "
                            + this.getHistorialPunteos().get(estudiantes));
        }

    }


    public String[] impresionEstudiantesArreglo(){
        String [] infoEstudiantes = new String[this.getHistorialPunteos().size()];
        int valorContadorArreglo =0;
        String informacionEspecifica;
        for (Estudiante estudiantes : this.getHistorialPunteos().keySet()) {
            informacionEspecifica=
                    estudiantes.getNombre()+ " "
                            + estudiantes.getApellido()
                            + "- Nota: - "
                            + this.getHistorialPunteos().get(estudiantes);
            infoEstudiantes[valorContadorArreglo] = informacionEspecifica;
            valorContadorArreglo++;
        }


        return  infoEstudiantes;
    }



    //metodo que ingresa nuevos estudiantes
    public boolean ingresoEstudiante(Estudiante nuevoEstudiante, Integer punteo){
        // verificar el ingreso previo
        for (Estudiante nombres : this.getHistorialPunteos().keySet()) {
            if (nombres.getApellido() == nuevoEstudiante.getApellido()) {
                //aca actualizaria
                // pero no actualiza tan bien, a lo mejor eliminar el registro y cargar todo
                this.getHistorialPunteos().remove(nombres);
                // luego el ingreso de la informacion
                this.getHistorialPunteos().put(nuevoEstudiante, punteo);
                return false;
            }
        }
        this.getHistorialPunteos().put(nuevoEstudiante, punteo);
        return true;
    }


    public HashMap<Estudiante, Integer> getHistorialPunteos() {
        return historialPunteos;
    }

    public void setHistorialPunteos(HashMap<Estudiante, Integer> historialPunteos) {
        this.historialPunteos = historialPunteos;
    }
}
