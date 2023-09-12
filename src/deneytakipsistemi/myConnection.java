/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deneytakipsistemi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hamza
 */
public class myConnection {
    
    public static Connection myCon(){
        String url =  "jdbc:derby://localhost:1527/DeneyTakipSistemi";
        String user = "root";
        String pass  = "root";
        
        Connection con = null;
       
       
        try {
            con = DriverManager.getConnection(url,user,pass);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(myConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
            
        
            
            
       
        }
    
    
    
    }
    

