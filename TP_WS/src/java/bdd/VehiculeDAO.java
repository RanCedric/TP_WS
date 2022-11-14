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
public class VehiculeDAO  {
     public static List<ViewVehicule> allVehicule() throws Exception {
        List<ViewVehicule> list = new ArrayList();
        Connection con = null;
        try {
            con = ConnectionPostgres.getConnectionPostgres();
            list = allVehicule(con);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            assert con != null;
            con.close();
        }
        return list;
    }
      public static List<ViewVehicule> allVehicule(Connection con) throws Exception {
            List<ViewVehicule> list = new ArrayList<>();
        PreparedStatement stmt =  null;
        ResultSet res = null;
        int i = 0;
        try {
            con = ConnectionPostgres.getConnectionPostgres();
            stmt = con.prepareStatement("SELECT * FROM Vehicule");
            res = stmt.executeQuery();
            while (res.next()){
                int vehiculeID = res.getInt(1);
                String VehiculeModel = res.getString(2);
                String MARK  = res.getString(3);
            
                list.add(new ViewVehicule(vehiculeID,VehiculeModel,MARK));
                i++;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            assert stmt != null;
            stmt.close();
            assert res != null;
            res.close();
        }
        return list;
    }
      
      public void insertVehicule  (Connection con,int VehiculeID,String marque,String modele) throws Exception{
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            con = ConnectionPostgres.getConnectionPostgres();
            stmt = con.prepareStatement("INSERT INTO Vehicule(id_vehicule,marque,modele) VALUES (?,?,?)");
            stmt.setInt(1,VehiculeID);
            stmt.setString(2,marque);
            stmt.setString(3,modele);
            res = stmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            assert stmt != null;
            stmt.close();
            assert res != null;
            res.close();
        }
    }

}
