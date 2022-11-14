/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

import java.sql.*;
import java.*;

/**
 *
 * @author Cedric
 */
public class DAO {
    Connection conn;
    PreparedStatement stmt;
    
    public void ERROR(String errorLocation,Exception e){
		System.out.println("");
		System.out.println("//debut");
		System.out.println("//	"+"bdd."+errorLocation);
		System.out.println("//	"+e.getMessage());
		System.out.println("//fin");
		System.out.println("");
	}
    
    public void open(){
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(util.Url.getBdaUrl(),util.Url.getBdaUser(),util.Url.getBdaMdp());
        }
	    catch(ClassNotFoundException | SQLException e){
            ERROR("DAO.open",e);
	    }
    }

    public void testConnection (){
        try{
            open();
            System.out.println("connection base de donne valider");
            close();
        }
        catch(Exception e){
            System.out.println("erreur de connection base de donne");
        }
    }
    
    public boolean confirme(String requete){
        boolean reponse = true;
        try{
            open();
            stmt = conn.prepareStatement(requete);			
            ResultSet ret = stmt.executeQuery();
            close();            
        }
        catch(SQLException e){
            ERROR("DAO.confirme",e);
            reponse = false;
        }
        return reponse;
    }
    public void close(){
        try{
            this.conn.close();
        }
        catch(SQLException e){
            ERROR("DAO.close",e);
        }
    }
}