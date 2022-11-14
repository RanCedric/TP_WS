/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bdd.Dao_admin;

/**
 *
 * @author Tiavina Ravaka
 */
public class Service_admin {
    Dao_admin d=new Dao_admin();
   
    public Boolean valider(String login,String mdp) throws Exception{
        Boolean test=false;
        if(d.TestLogin(login,mdp)==true){
            test=true;
        }
        return test;
    }
}
