/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

/**
 *
 * @author Cedric
 */
public class Url {
    public static String getBdaUrl(){
        return "jdbc:postgresql://localhost:5432/tp_ws";
    }
    
    public static String getBdaUser(){
        return "postgres";
    }
    
    public static String getBdaMdp(){
        return "admin";
    }
}
