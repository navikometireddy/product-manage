package com.springboot.service;

import com.springboot.model.Feature;
import com.springboot.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserService extends JpaRepository<Feature, Integer>{
//    @Query("SELECT enable FROM FEATURE f where f.featurename = ?1 AND f.email = ?2")
//    public List<Feature> findByFeatureAndEmail(String featureName, String email);
public List<Feature> findByFeatureNameAndEmail(String featurename, String emailAddress);
}
