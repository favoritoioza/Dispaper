/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Favorito
 */
public class modelo extends database {
    
    public modelo(){} //constructor de la clase.
    
    public String buscarUser(String nombre) throws java.sql.SQLException{       
        String q = "SELECT pswd FROM responsable where usuario='"+nombre+"'";
        String pswd="";
        try {
                PreparedStatement pstm = this.getConexion().prepareStatement(q);
                ResultSet res = pstm.executeQuery();
                res.next();
                pswd = res.getString("pswd");
                res.close();
                return pswd;
            }catch(SQLException e){
                System.err.println( e.getMessage() );
                return null;
            }
        
    }
    public ResultSet buscarMarca() throws java.sql.SQLException{       
        String q = "SELECT * FROM  `marca`;";
        try {
                PreparedStatement pstm = this.getConexion().prepareStatement(q);
                ResultSet res = pstm.executeQuery();
                res.next();
                return res;
            }catch(SQLException e){
                System.err.println( e.getMessage() );
                return null;
            }
    }
    public ResultSet buscarClasePapel() throws java.sql.SQLException{       
        String q = "SELECT * FROM  `clase_papel`;";
        try {
                PreparedStatement pstm = this.getConexion().prepareStatement(q);
                ResultSet res = pstm.executeQuery();
                res.next();
                return res;
            }catch(SQLException e){
                System.err.println( e.getMessage() );
                return null;
            }
    }
    
}
