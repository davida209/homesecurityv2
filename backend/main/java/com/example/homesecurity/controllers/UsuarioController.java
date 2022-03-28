package com.example.homesecurity.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.homesecurity.models.UsuarioModel;
import com.example.homesecurity.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@Valid @RequestBody UsuarioModel email){

        return this.usuarioService.guardarUsuario(email);
    }

    @GetMapping( path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long user_id) {
        return this.usuarioService.obtenerPorId(user_id);
    }


    @DeleteMapping( path = "/{id}")
    public String deleteById(@PathVariable("id") Long user_id){
        boolean ok = this.usuarioService.eliminarUsuario(user_id);
        if (ok){
            return "Se eliminó el usuario con id " + user_id;
        }else{
            return "No se pudo eliminar el usuario con id" + user_id;
        }
    }

    @GetMapping("/addp")
    public String addp(){
        return "addp";
    }

}