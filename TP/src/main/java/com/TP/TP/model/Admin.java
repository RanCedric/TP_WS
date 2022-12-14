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
public class Admin extends BDD{
    String adminID;
    String adminNAME;
    String adminEMAIL;
    String adminMDP;

    public Admin() {
    }

    public Admin(String adminID, String adminNAME, String adminEMAIL, String adminMDP) {
        this.adminID = adminID;
        this.adminNAME = adminNAME;
        this.adminEMAIL = adminEMAIL;
        this.adminMDP = adminMDP;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAdminNAME() {
        return adminNAME;
    }

    public void setAdminNAME(String adminNAME) {
        this.adminNAME = adminNAME;
    }

    public String getAdminEMAIL() {
        return adminEMAIL;
    }

    public void setAdminEMAIL(String adminEMAIL) {
        this.adminEMAIL = adminEMAIL;
    }

    public String getAdminMDP() {
        return adminMDP;
    }

    public void setAdminMDP(String adminMDP) {
        this.adminMDP = adminMDP;
    }
    
    
}
