
package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
       static String bd = "prueba";//nombre de la base de datos que esta en mysql
       static String login = "prueba";// usuario
       static String password = "aprobado";// contraseña
       static String url = "jdbc:mysql://localhost/"+bd;

       Connection conn = null;

    public ConexionBD() {
        try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);
         if (conn!=null){
            System.out.println("Conección a base de datos "+bd+". listo");
         }
      }catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }        
    }

    public Connection getConn() {
        return conn;
    }     
}
