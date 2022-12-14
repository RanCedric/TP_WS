/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TP.TP.model;

import bdd.BDD;
/**
 *
 * @author Cédric
 */
public class Vehicule extends BDD{
    String vehiculeID;
    String vehiculeMatriculation;
    String vahiculeMark;

    public Vehicule() {
    }

    public Vehicule(String vehiculeID, String vehiculeMatriculation, String vahiculeMark) {
        this.vehiculeID = vehiculeID;
        this.vehiculeMatriculation = vehiculeMatriculation;
        this.vahiculeMark = vahiculeMark;
    }

    public String getVehiculeID() {
        return vehiculeID;
    }

    public void setVehiculeID(String vehiculeID) {
        this.vehiculeID = vehiculeID;
    }

    public String getVehiculeMatriculation() {
        return vehiculeMatriculation;
    }

    public void setVehiculeMatriculation(String vehiculeMatriculation) {
        this.vehiculeMatriculation = vehiculeMatriculation;
    }

    public String getVahiculeMark() {
        return vahiculeMark;
    }

    public void setVahiculeMark(String vahiculeMark) {
        this.vahiculeMark = vahiculeMark;
    }
    
}