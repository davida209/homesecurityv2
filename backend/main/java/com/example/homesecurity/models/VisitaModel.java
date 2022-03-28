package com.example.homesecurity.models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Blob;

@Entity
@Table(name="visitas")
public class VisitaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    int visita_number;

    @Size(min = 4, max = 100)
    @NotEmpty (message = "Completa este campo")
    String name;


    @Size(min = 8, max = 250, message = "mucho texto")
    @NotEmpty (message = "Completa este campo")
    String description;


    @NotEmpty (message = "Completa este campo")
    String category;

    public VisitaModel() {
    }

    public int getVisita_number() {
        return visita_number;
    }

    public void setVisita_number(int visita_number) {
        this.visita_number = visita_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
