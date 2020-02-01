package com.springboot.controller;

import com.springboot.model.Feature;
import com.springboot.service.UserService;
import javafx.application.Application;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ManageUsersController {

    @Autowired
    private UserService userService;

    /**
     * @param featureName name of the feature
     * @param email       email address
     * @return
     * @author navi
     */

    @RequestMapping(value = "/feature", method = RequestMethod.GET)
    public Map<String, String> getFeature(@RequestParam String featureName, @RequestParam String email) {
        HashMap<String, String> map = new HashMap<>();
        List<Feature> l = userService.findByFeatureNameAndEmail(featureName, email);
        if (l.isEmpty()) {
            map.put("canAccess", "false");
        } else {
            l.stream().forEach(a -> map.put("canAccess", a.getEnable()));
        }

        return map;
    }

    /**
     * @param feature lsit of feature values to save in to db
     * @return Success
     * @author Navi
     */
    @RequestMapping(value = "/feature", method = RequestMethod.POST)
    public String addFeature(@RequestBody Feature feature) {
        Feature savedFeature = userService.save(feature);
        return "SUCCESS";
    }

}
