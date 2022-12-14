/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TP.TP.service;

import com.TP.TP.model.Admin;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class Admin_Service {
    // build create employee REST API

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @PostMapping("/insert_admin")
    public Admin insert_admin(@RequestParam(name="adminNAME") String a,@RequestParam(name="adminEMAIL") String b,@RequestParam(name="adminMDP") String c) {
        Admin v = new Admin("0",a,b,c);
        v.dontSave("adminID");
        v.save();
        return v;
    }
    
    @GetMapping("/list_admin")
    public ArrayList<String[]> list_admin(){
        Admin v = new Admin();
        return v.select();
    }
    
    @GetMapping("/get_admin")
    public Admin get_admin(@RequestParam(name="id") String id){
        Admin admin = new Admin();
        admin.getById(id);
        return admin;
    }
    
    @GetMapping("/delete_admin")
    public Admin delete_admin(@RequestParam(name="id") String id){
        Admin admin = new Admin();
        admin.delete(id);
        return admin;
    }
    
    @PostMapping("/login_admin")
    public Admin login_admin(@RequestParam(name="mail") String mail,@RequestParam(name="mdp") String mdp){
        Admin admin = new Admin();
        try{
            ResultSet response = admin.response("select * from admin where adminEMAIL = '"+mail+"' and adminMDP='"+mdp+"'");
            while(response.next()){
                admin.getById(response.getString(1));
            }
        }
        catch(SQLException e){}
        return admin;
    }
}

