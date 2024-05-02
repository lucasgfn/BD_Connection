/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acessandobd;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author lucas
 */

public class ConectaBD {
    
    public static Connection conectar(){
        Connection conn = null;
        try{
            String url = "jdbc:postgresql://localhost:5432/agenda";
            String user = "postgres";
            String password = "88042860";
            
            conn = (Connection) DriverManager.getConnection(url, user, password);
            
        }catch(SQLException ex){
            System.out.print("Erro: "+ ex.getMessage());
            
        }
        return conn;
    }

    public static void fecharCoenxao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
