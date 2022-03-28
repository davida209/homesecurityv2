package com.example.homesecurity.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.homesecurity.models.UsuarioModel;
import com.example.homesecurity.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel email){
        return usuarioRepository.save(email);
    }

    public Optional<UsuarioModel> obtenerPorId(Long customer_id){
        return usuarioRepository.findById(customer_id);
    }



    public boolean eliminarUsuario(Long customer_id) {
        try{
            usuarioRepository.deleteById(customer_id);
            return true;
        }catch(Exception err){
            return false;
        }
    }




    
}