/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cédric
 */
public class DaoKilometrage extends DAO{
 
    public void insertKilo(int idve,Date kilometrageDATE,double kilometrageDEBUT,double kilometrageFIN) throws SQLException{
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try {
            open(); 
            stmt = conn.prepareStatement("INSERT INTO kilometrage VALUES ('default',?,?,?,?)");
            stmt.setInt(2,idve);
            stmt.setDate(3,kilometrageDATE);
            stmt.setDouble(4,kilometrageDEBUT);
            stmt.setDouble(5,kilometrageFIN);
            res = stmt.executeQuery();
            close();
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
