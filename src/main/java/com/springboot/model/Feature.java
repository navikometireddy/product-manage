package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "FEATURE")
public class Feature {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer Id;

    @Column(name = "featurename")
    String featureName;

    @Column(name = "email")
    String email;

    @Column(name = "enable")
    String enable;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }


    @Override
    public String toString() {
        return "Feature{" +
                "Id=" + Id +
                ", featureName='" + featureName + '\'' +
                ", email='" + email + '\'' +
                ", enable='" + enable + '\'' +
                '}';
    }
}
