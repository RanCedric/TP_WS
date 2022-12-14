/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Cédric
 */
public class Kilometrage {
    
    int vehiculeID;
    Date kilometrageDATE;
    double kilometrageDEBUT;
    double kilometrageFIN;

    public int getVehiculeID() {
        return vehiculeID;
    }

    public void setVehiculeID(int vehiculeID) {
        this.vehiculeID = vehiculeID;
    }

    public Date getKilometrageDATE() {
        return kilometrageDATE;
    }

    public void setKilometrageDATE(Date kilometrageDATE) {
        this.kilometrageDATE = kilometrageDATE;
    }

    public double getKilometrageDEBUT() {
        return kilometrageDEBUT;
    }

    public void setKilometrageDEBUT(double kilometrageDEBUT) {
        this.kilometrageDEBUT = kilometrageDEBUT;
    }

    public double getKilometrageFIN() {
        return kilometrageFIN;
    }

    public void setKilometrageFIN(double kilometrageFIN) {
        this.kilometrageFIN = kilometrageFIN;
    }
    
}
