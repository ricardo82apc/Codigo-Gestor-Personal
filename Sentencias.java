
package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Sentencias {
    ConexionBD con;
    Connection conn;
    public String [] datos=new String[10];
    public String [] dato=new String[7];
    public String [] log=new String[3];
    public String [] upl=new String[9];
     
     
    public Sentencias(){        
        con = new ConexionBD();
    } 

    public void NuevoTrabajador(String run, String nom, String ape, String dir, String car, String dep, String sb, String afp, String sal){
        String reg;
        try{            
            //validacion de rut en BD antes de insertar
            PreparedStatement pstm = con.getConn().prepareStatement("select * from trabajador where rut= ?");
            pstm.setString(1, run);
            ResultSet res = pstm.executeQuery();
            res.next();
            reg = res.getString("rut");
            res.close();
            JOptionPane.showMessageDialog(null,"Trabajador " + run + " ya existe en Base de Datos " );
        }catch(SQLException e){}          
        try{       
            PreparedStatement pstm = con.getConn().prepareStatement("insert into " + "trabajador (rut, nombre, apellido, direccion, cargo, departamento, sueldobase, afp, salud)" + " values(?,?,?,?,?,?,?,?,?)");            
            pstm.setString(1, run);
            pstm.setString(2, nom);
            pstm.setString(3, ape);                        
            pstm.setString(4, dir);                        
            pstm.setString(5, car);                        
            pstm.setString(6, dep);                        
            pstm.setString(7, sb);                       
            pstm.setString(8, afp);                        
            pstm.setString(9, sal);                        
            pstm.execute();
            pstm.close();          
            JOptionPane.showMessageDialog(null,"Datos Guardados");                    
        }catch(SQLException e){}
        try {                
            PreparedStatement pstm = con.getConn().prepareStatement("delete from trabajador_eliminado where rut = ?"); 
            pstm.setString(1, run);
            pstm.execute();
            pstm.close(); 
                
            }catch(SQLException e){
            System.out.println(e);
            }   
    }
    
    public void ModificarTrabajador(String run, String nom, String ape, String dir, String car, String dep, String sb, String afp, String sal){
        try {            
            PreparedStatement pstm = con.getConn().prepareStatement("update trabajador " + "set nombre=?, "+" apellido=?, "+" direccion=?, "+" cargo=?, "+" departamento=?, "+" sueldobase=?, "+" afp=?, "+" salud=? "+" where rut = ? ");           
            pstm.setString(1, nom);                                 
            pstm.setString(2, ape);
            pstm.setString(3, dir);                        
            pstm.setString(4, car);                        
            pstm.setString(5, dep);
            pstm.setString(6, sb);
            pstm.setString(7, afp);
            pstm.setString(8, sal);
            pstm.setString(9, run);
            pstm.execute();
            pstm.close();           
            JOptionPane.showMessageDialog(null,"Datos Modificados");           
        }catch(SQLException e){}
    } 
    
    public void EliminarTrabajador(String run, String nom, String ape, String car, String dep, String mot, String fech){
        try {                
            PreparedStatement pstm = con.getConn().prepareStatement("delete from trabajador where rut = ?"); 
            pstm.setString(1, run);
            pstm.execute();
            pstm.close(); 
                
            }catch(SQLException e){
            System.out.println(e);
            }            
        try{       
            PreparedStatement pstm = con.getConn().prepareStatement("insert into " + "trabajador_eliminado (rut, nombre, apellido, cargo, departamento, motivo, fecha)" + " values(?,?,?,?,?,?,?)");            
            pstm.setString(1, run);
            pstm.setString(2, nom);
            pstm.setString(3, ape);
            pstm.setString(4, car);                        
            pstm.setString(5, dep);                        
            pstm.setString(6, mot);                       
            pstm.setString(7, fech);                                                
            pstm.execute();
            pstm.close();          
            JOptionPane.showMessageDialog(null,"Trabajador Eliminado");                    
        }catch(SQLException e){}
    }
    
    //TRAER DATOS LOGIN
    public String[] login(String usu){
        String reg=(null);
        try{            
            //validacion de rut en BD antes de insertar
            PreparedStatement pstm = con.getConn().prepareStatement("select usuario from login where usuario= ?");
            pstm.setString(1, usu);
            ResultSet res = pstm.executeQuery();
            res.next();
            reg = res.getString("usuario");
            res.close();            
        }catch(SQLException e){}
        try{ 
            PreparedStatement pstm = con.getConn().prepareStatement("select * from login where usuario= ?");
            pstm.setString(1, usu);
            ResultSet res = pstm.executeQuery();
            res.next();
            log[0] = res.getString("usuario");
            log[1] = res.getString("password");                     
            res.close();            
        }catch (SQLException ex){}
            log[2]=reg;            
        return log;
    }        
    
     //TRAER DATOS TABLA TRABAJADOR
    
    public String[] update(String run){ 
       
        try{            
            //validacion de rut en BD antes de insertar
            PreparedStatement pstm = con.getConn().prepareStatement("select rut from trabajador where rut= ?");
            pstm.setString(1, run);
            ResultSet res = pstm.executeQuery();
            res.next();
            datos[9] = res.getString("rut");
            res.close();            
        }catch(SQLException e){}
        try{
            PreparedStatement pstm = con.getConn().prepareStatement("select * from trabajador where rut= ?");
            pstm.setString(1, run);
            ResultSet res = pstm.executeQuery();
            res.next();
            datos[0] = res.getString("rut");
            datos[1] = res.getString("nombre");      
            datos[2] = res.getString("apellido");     
            datos[3] = res.getString("direccion");     
            datos[4] = res.getString("cargo");      
            datos[5] = res.getString("departamento");        
            datos[6] = res.getString("sueldobase");
            datos[7] = res.getString("afp");
            datos[8] = res.getString("salud");   
            res.close();
        }catch (SQLException ex){}
        return datos;
    }        
    
    //TRAER DATOS TABLA TRABAJADOR ELIMINADOS
    public String[] updateEliminado(String run){       
        try{
            PreparedStatement pstm = con.getConn().prepareStatement("select * from trabajador_eliminado where rut= ?");
            pstm.setString(1, run);
            ResultSet res = pstm.executeQuery();
            res.next();
            dato[0] = res.getString("rut");
            dato[1] = res.getString("nombre");      
            dato[2] = res.getString("apellido");     
            dato[3] = res.getString("cargo");     
            dato[4] = res.getString("departamento");      
            dato[5] = res.getString("motivo");        
            dato[6] = res.getString("fecha");   
            res.close();
        }catch (SQLException ex) {}
        return dato;
    }
    
    public void NuevaLiquidacion(String run, String nom, String ape, String car, String dep, String dt, String he, String sb, String fech){
        try{       
            PreparedStatement pstm = con.getConn().prepareStatement("insert into " + "liquidacion (rut, nombre, apellido, cargo, departamento, diastrabajados, horasextras, sueldobase, fecha)" + " values(?,?,?,?,?,?,?,?,?)");            
            pstm.setString(1, run);
            pstm.setString(2, nom);
            pstm.setString(3, ape);
            pstm.setString(4, car);                        
            pstm.setString(5, dep);                        
            pstm.setString(6, dt);                       
            pstm.setString(7, he);
            pstm.setString(8, sb);
            pstm.setString(9, fech);
            pstm.execute();
            pstm.close();                              
        }catch(SQLException e){}
    }
    
     //TRAER DATOS TABLA LIQUIDACION
    public String[] updateLiquidacion(String run, String fech){       
        try{
            PreparedStatement pstm = con.getConn().prepareStatement("select * from liquidacion where rut= ? and fecha= ?");
            pstm.setString(1, run);
            pstm.setString(2, fech);
            ResultSet res = pstm.executeQuery();
            res.next();
            upl[0] = res.getString("rut");
            upl[1] = res.getString("nombre");      
            upl[2] = res.getString("apellido");     
            upl[3] = res.getString("cargo");     
            upl[4] = res.getString("departamento");      
            upl[5] = res.getString("diastrabajados");        
            upl[6] = res.getString("horasextras");
            upl[7] = res.getString("sueldobase");
            upl[8] = res.getString("fecha");   
            res.close();
        }catch (SQLException ex){}
        return upl;
    }        
}
