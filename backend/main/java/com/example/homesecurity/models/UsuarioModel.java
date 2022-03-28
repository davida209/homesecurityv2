package com.example.homesecurity.models;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.RowId;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "user")

public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    int user_id;

    @Size(min = 8, max = 50, message=" error")
    @NotEmpty(message="Este campo es obligatorio")
    String full_name;

    @Email
    @NotEmpty(message="err")
    String email;


    String password;

    @NotEmpty(message="err")
    String username;

    @Size(min = 10, max = 12)
    @Digits(fraction = 0, integer = 12)
    @NotEmpty(message="err")

    String phone;

    @NotEmpty(message="err")
    @Size(min = 10, max = 200, message=" @introduce un correo ")
    String address;



    public UsuarioModel() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) { this.role = role; }
    
}