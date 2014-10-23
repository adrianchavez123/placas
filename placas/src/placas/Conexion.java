/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian
 */
public class Conexion {
   
    public Connection con;
    public PreparedStatement pst;
    public ResultSet rs;
    public Statement st;
    
    
    public boolean conectar()
    {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/placas","root","");

         return true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean login(String username, String password)
    {
        try {
            String sentencia ="select idusuario  from usuarios where password = md5('"+password+"') and usuario ='"+username +"';";
            System.out.println(sentencia);
            
            pst = con.prepareStatement(sentencia);
            
            rs =  pst.executeQuery();
            
            while (rs.next())
            {
                System.out.println(rs.getString(1));
                //idUsuario = Integer.parseInt(rs.getString(1));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    public void close()
    {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    boolean ingresar(String Strplaca, String Strmodelo, String Strmarca, String Strcolor, int causa, String fecha, String archivo) {
        try
        {
            String sentencia ="insert into placas(placa,modelo,marca,color,causa,fecha,imagen)"
                    + "values('"
                    +Strplaca+"','"+Strmodelo+"','"+Strmarca+"','"+Strcolor+"',"+causa+",'"+fecha+"','"+archivo+"')";
            System.out.println(sentencia);
            
            st = con.createStatement();
            st.execute(sentencia);
            
            return true;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
