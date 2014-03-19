/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Favorito
 */
import java.sql.*;
/**
 * 
 * @author Oldayr
 */
public class database {

  /* DATOS PARA LA CONEXION */
  /** base de datos por defecto es test*/
  private String db = "dis_paper";
  /** usuario */
  private String user = "root";
  /** contraseña de MySql*/
  private String password = "";
  /** Cadena de conexion */
  private String url = "jdbc:mysql://localhost/"+db;
  /** variable para trabajar con la conexion a la base de datos */
  private Connection conn = null;

   /** Constructor de clase */
   public database(){
        this.url = "jdbc:mysql://localhost/"+this.db;
       try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection( this.url, this.user , this.password );
         if (conn!=null){
            System.out.println("OK base de datos "+this.db+" listo");
         }
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }catch(ClassNotFoundException e){
         System.err.println( e.getMessage() );
      }
   }

   public Connection getConexion()
   {
    return this.conn;
   }
}
