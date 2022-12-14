/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TP.TP.service;

import com.TP.TP.model.Vehicule;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cédric
 */
@RestController
public class Vehicule_Service {
    // build create employee REST API

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @PostMapping("/insert_vehicule")
    public Vehicule insert_vehicule(@RequestParam(name="matriculation") String a,@RequestParam(name="marque") String b) {
        Vehicule v = new Vehicule("0",a,b);
        v.dontSave("vehiculeID");
        v.save();
        return v;

    }
    
    @GetMapping("/list_vehicule")
    public ArrayList<String[]> list_vehicule(){
        Vehicule v = new Vehicule();
        return v.select();
    }
    
    @GetMapping("/get_vehicule")
    public Vehicule get_vehicule(@RequestParam(name="id") String id_vehivule){
        Vehicule voiture = new Vehicule();
        voiture.getById(id_vehivule);
        return voiture;
    }
    
    @GetMapping("/delete_vehicule")
    public Vehicule delete_vehicule(@RequestParam(name="id") String id_vehivule){
        Vehicule voiture = new Vehicule();
        voiture.delete(id_vehivule);
        return voiture;
    }
}

