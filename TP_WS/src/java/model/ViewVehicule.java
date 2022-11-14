/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Beloha18
 */
public class ViewVehicule {
    private int VehiculeID;
    private String Modele;
    private String marque;
    
    public ViewVehicule(int VehiculeID, String Modele, String marque) {
        this.VehiculeID = VehiculeID;
        this.Modele = Modele;
        this.marque = marque;        
    }

    public ViewVehicule() {
    }

    public int getVehiculeID() {
        return VehiculeID;
    }

    public void setVehiculeID(int VehiculeID) {
        this.VehiculeID = VehiculeID;
    }

    public String getModele() {
        return Modele;
    }

    public void setModele(String Modele) {
        this.Modele = Modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
