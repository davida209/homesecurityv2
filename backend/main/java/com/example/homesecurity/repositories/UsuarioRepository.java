package com.example.homesecurity.repositories;

import java.util.ArrayList;

import com.example.homesecurity.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

}