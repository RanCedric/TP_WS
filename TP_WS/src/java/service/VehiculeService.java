/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.ViewVehicule;
import bdd.VehiculeDAO;

import java.util.List;
/**
 *
 * @author Beloha18
 */
public class VehiculeService {   
    public VehiculeService() {
    }
    public List<ViewVehicule> getAllVehicule() throws Exception{
        return VehiculeDAO.allVehicule();
    }
    public void insertVehicule(int VehiculeID,String marque,String modele) throws Exception{
        VehiculeDAO vehiculeDAO = new VehiculeDAO();
        vehiculeDAO.insertVehicule(VehiculeID, marque,modele);
    }
}
