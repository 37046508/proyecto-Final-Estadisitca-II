/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class Conexion {
    
    public static Connection getConexion(){
     
        String conexionUrl = "jdbc:server://localhost:1433;"
                + "database=master;"
                +"user=usersql;"
                +"password=000;"
                +"loginTimeout=30;";
        
        try{
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        }catch(SQLException ex){
           System.out.println(ex.toString());
           return null;
        }
        
                
    }
    
}
