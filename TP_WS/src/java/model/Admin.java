/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tiavina Ravaka
 */
public class Admin {
        String adminID;
	String adminNAME;
	String adminEMAIL;
	String adminMDP;

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

    public Admin(String adminID, String adminNAME, String adminEMAIL, String adminMDP) {
        this.adminID = adminID;
        this.adminNAME = adminNAME;
        this.adminEMAIL = adminEMAIL;
        this.adminMDP = adminMDP;
    }

    public Admin(String adminEMAIL, String adminMDP) {
        this.adminEMAIL = adminEMAIL;
        this.adminMDP = adminMDP;
    }
        
}
