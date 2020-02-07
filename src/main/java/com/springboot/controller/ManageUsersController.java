package com.springboot.controller;

import com.springboot.model.Feature;
import com.springboot.model.Product;
import com.springboot.service.UserService;
import javafx.application.Application;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ManageUsersController {

    @Autowired
    private UserService userService;



    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        userService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
