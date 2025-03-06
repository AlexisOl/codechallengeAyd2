package com.example.demo.Controlador;

import com.example.demo.Modelos.Driver;
import com.example.demo.Repositorios.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Author: alexxus
 * Created on: 6/03/25
 */
// se define que sea un controlador
@RestController
// que sea de consulta
@RequestMapping(path = "/ejercicio4")
public class DriverController {
    @Autowired

    private DriverRepository driverRepository;



    //consultas

    //CRUD
    //create
    @PostMapping(path = "/ingreso")
    public @ResponseBody String ingresoDriver(@RequestParam String name, @RequestParam int age){
        Driver nuevoDriver = new Driver();
        nuevoDriver.setName(name);
        nuevoDriver.setEdad(age);
        driverRepository.save(nuevoDriver);
        return "ingresado";
    }

    //read
    @GetMapping(path = "/leer")
    public @ResponseBody Iterable<Driver> lecturaDriver(){
        return driverRepository.findAll();
    }

    // update
    @PutMapping(path = "/actualizar")
    public @ResponseBody String actualizacion(@RequestParam int id, @RequestParam String name, @RequestParam int age) {
        Optional<Driver> encontradoDriver = driverRepository.findById(id);
        encontradoDriver.get().setName(name);
        encontradoDriver.get().setEdad(age);

        return "actualizado";

    }

    //delete

    //@DeleteMapping(path = "/eliminar")

}
