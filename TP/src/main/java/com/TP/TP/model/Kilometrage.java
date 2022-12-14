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
public class Kilometrage extends BDD{
    String kilometrageID;
    String vehiculeID;
    String kilometrageDATE;
    String kilometrageDEBUT;
    String kilometrageFIN;

    public Kilometrage(String kilometrageID, String vehiculeID, String kilometrageDATE, String kilometrageDEBUT, String kilometrageFIN) {
        this.kilometrageID = kilometrageID;
        this.vehiculeID = vehiculeID;
        this.kilometrageDATE = kilometrageDATE;
        this.kilometrageDEBUT = kilometrageDEBUT;
        this.kilometrageFIN = kilometrageFIN;
    }

    public Kilometrage() {
    }

    public String getKilometrageID() {
        return kilometrageID;
    }

    public void setKilometrageID(String kilometrageID) {
        this.kilometrageID = kilometrageID;
    }

    public String getVehiculeID() {
        return vehiculeID;
    }

    public void setVehiculeID(String vehiculeID) {
        this.vehiculeID = vehiculeID;
    }

    public String getKilometrageDATE() {
        return kilometrageDATE;
    }

    public void setKilometrageDATE(String kilometrageDATE) {
        this.kilometrageDATE = kilometrageDATE;
    }

    public String getKilometrageDEBUT() {
        return kilometrageDEBUT;
    }

    public void setKilometrageDEBUT(String kilometrageDEBUT) {
        this.kilometrageDEBUT = kilometrageDEBUT;
    }

    public String getKilometrageFIN() {
        return kilometrageFIN;
    }

    public void setKilometrageFIN(String kilometrageFIN) {
        this.kilometrageFIN = kilometrageFIN;
    }
    
    
}
