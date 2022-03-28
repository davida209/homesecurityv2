package com.example.homesecurity.services;

import com.example.homesecurity.models.ProductModel;
import com.example.homesecurity.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    //listar productos

    public ArrayList<ProductModel> getProducts(){
        return (ArrayList<ProductModel>) productRepository.findAll();
    }

    //agregar producto
    public ProductModel saveProduct(ProductModel name){
        return productRepository.save(name);
    }

    //eliminar producto

    public boolean deleteById(Long customer_id) {
        try{
            productRepository.deleteById(customer_id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public Optional<ProductModel> findById(Long product_number) {
        return productRepository.findById(product_number);
    }
}

