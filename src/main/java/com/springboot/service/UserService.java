package com.springboot.service;

import com.springboot.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserService extends JpaRepository<Feature, Integer>{

    /**
     * @author navi
     * @param featureName name of the feature
     * @param emailAddress email address
     * @return status of feature
     */
    public List<Feature> findByFeatureNameAndEmail(String featureName, String emailAddress);
}
