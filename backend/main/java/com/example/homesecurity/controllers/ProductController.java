package com.example.homesecurity.controllers;

import com.example.homesecurity.models.VisitaModel;
import com.example.homesecurity.repositories.VisitaRepository;
import com.example.homesecurity.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/visitas")

public class ProductController {

    @Autowired
    ProductService visitaService;

    @Autowired
    VisitaRepository visitaRepository;


    @PostMapping()
    public VisitaModel saveVisita(@Valid @RequestBody VisitaModel name){

        return this.visitaService.saveVisita(name);
    }

    @GetMapping()
    public @ResponseBody Iterable<VisitaModel> getVisitas(){
        return visitaService.getVisitas();
    }
    @GetMapping( path = "/{visita_number}")
    public Optional<VisitatModel> findById(@PathVariable("visita_number") Long visita_number) {
        return this.visitaService.findById(visita_number);
    }

    @RequestMapping(value="/{visita_number}", method=RequestMethod.DELETE)
    public String deleteById(@PathVariable("visita_number")Long visita_number){

        boolean ok = this.visitaService.deleteById(visita_number);
        if (ok){
            return "visita eliminada" + visita_number;
        }else{
            return "no se pudo eliminar la visita" + visita_number;

        }
    }

}
