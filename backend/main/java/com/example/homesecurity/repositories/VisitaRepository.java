package com.example.homesecurity.repositories;


import com.example.homesecurity.models.VisitaModel;
import org.springframework.data.repository.CrudRepository;

public interface VisitaRepository extends CrudRepository<VisitaModel, Long> {

    @Override
    Iterable<VisitaModel> findAll();
}
