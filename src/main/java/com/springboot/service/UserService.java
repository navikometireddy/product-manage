package com.springboot.service;

import com.springboot.model.Feature;
import com.springboot.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserService extends JpaRepository<Product, Integer>{

}
