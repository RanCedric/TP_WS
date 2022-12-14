/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TP.TP.service;

import com.TP.TP.model.Kilometrage;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 *
 * @author Cédric
 */
@RestController
public class Kilometrage_Service {
    // build create employee REST API

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @PostMapping("/insert_kilometrage")
    public Kilometrage insert_kilometrage(@RequestParam(name="vehiculeID") String a,@RequestParam(name="kilometrageDATE") String b,@RequestParam(name="kilometrageDEBUT") String c,@RequestParam(name="kilometrageFIN") String d) {
        Kilometrage v = new Kilometrage("0",a,b,c,d);
        v.dontSave("kilometrageID");
        v.save();
        return v;
    }
    
    @GetMapping("/list_kilometrage")
    public ArrayList<String[]> list_kilometrage(){
        Kilometrage v = new Kilometrage();
        return v.select();
    }
    
    @GetMapping("/get_kilometrage")
    public Kilometrage get_kilometrage(@RequestParam(name="id") String id){
        Kilometrage kilometrage = new Kilometrage();
        kilometrage.getById(id);
        return kilometrage;
    }
    
    @GetMapping("/delete_kilometrage")
    public Kilometrage delete_kilometrage(@RequestParam(name="id") String id){
        Kilometrage kilometrage = new Kilometrage();
        kilometrage.delete(id);
        return kilometrage;
    }
}

