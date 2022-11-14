/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdd;

import java.sql.ResultSet;

/**
 *
 * @author Tiavina Ravaka
 */
public class Dao_admin extends DAO{
      public Boolean TestLogin(String login,String mdp)throws Exception{
            Boolean test=false;
           
          try{
               String req="SELECT count(*) FROM Admin where adminEMAIL='"+login+"' AND adminMDP ='"+mdp+"'";
               open();
                    
                stmt = conn.prepareStatement(req);
                ResultSet rs=stmt.executeQuery(); 
               rs.next();
                   
                  int nbr= rs.getInt(1);
                  if(nbr>0){
                      test=true;
                  }
                close();
  
          }
          catch(Exception e){
              ERROR("Dao_admin.TestLogin",e);
          }
                        return test;
    }
      
}
