package com.springboot.service;

import com.springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ProductService extends JpaRepository<Product, Long>{

    Optional<Product> findById(Long id);

}
