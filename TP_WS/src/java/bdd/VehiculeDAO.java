/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bdd;
import model.ViewVehicule;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Beloha18
 */
public class VehiculeDAO extends DAO {
     public List<ViewVehicule> allVehicule() throws Exception {
        ArrayList<ViewVehicule> list = new ArrayList();
        try {
            open();
            list = (ArrayList<ViewVehicule>) allVehicule(conn);
            close();
        } catch (Exception ex) {
            ERROR("VehiculeDAO.allVehicull",ex);
        }
        return list;
    }
      public List<ViewVehicule> allVehicule(Connection con) throws Exception {
            List<ViewVehicule> list = new ArrayList<>();
        PreparedStatement stmt =  null;
        ResultSet res = null;
        int i = 0;
        try {
            stmt = conn.prepareStatement("SELECT * FROM Vehicule");
            res = stmt.executeQuery();
            while (res.next()){
                int vehiculeID = res.getInt(1);
                String VehiculeModel = res.getString(2);
                String MARK  = res.getString(3);
            
                list.add(new ViewVehicule(vehiculeID,VehiculeModel,MARK));
                i++;
            }
        } catch (Exception ex) {
            ERROR("Vehicule.allVehicul",ex);
        }
        return list;
    }
      
      public void insertVehicule  (int VehiculeID,String marque,String modele) throws Exception{
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            stmt = conn.prepareStatement("INSERT INTO Vehicule(id_vehicule,marque,modele) VALUES (?,?,?)");
            stmt.setInt(1,VehiculeID);
            stmt.setString(2,marque);
            stmt.setString(3,modele);
            res = stmt.executeQuery();
        } catch (Exception e) {
            ERROR("Vehicule.insertVehicule",e);
        }
        finally {
            assert stmt != null;
            stmt.close();
            assert res != null;
            res.close();
        }
    }

}
