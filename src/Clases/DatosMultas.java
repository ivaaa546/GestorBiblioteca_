/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class DatosMultas {
    //declar variable para la conexion
    private Connection con;
    public DatosMultas(){
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //definir nuestro String de conexion
            String db="jdbc:mysql://localhost/gestor_biblioteca?serverTimezone=UTC";
            con = DriverManager.getConnection(db,"root","");
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatosMultas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatosMultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //metodo para cerrar la conexion
    public void cerrarConexion(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatosMultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///
    }
    
    public ResultSet mostrarMultas()
    {
        
        try {
            String sql= "Select * from vista_multas order by id_multa";
            Statement  st= null;
            st= con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatosMultas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
     public Multas buscarMulta(int id_prestamo)
   {
        try {
            Multas  multas= null;
            String sql= "Select * from multas where id_prestamo= '" + id_prestamo+ "' ";
            // Permite preparar la base de datos para enviarle consultas
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()) {
            multas = new Multas(
                rs.getInt("id_prestamo"),
                rs.getDouble("monto")
                
            );
            }
             return multas;
        } catch (SQLException ex) {
            Logger.getLogger(DatosPretamoDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
                return null;
        }
   
   }
     
     //metodo para eliminar 
   public boolean eliminarMulta(Multas multa)
   {
        try {
            String sql = "DELETE FROM multas WHERE id_prestamo='"+multa.getId_prestamo()+"'";
            //permite preparar la base de datos para enviarle consultas
            Statement st= con.createStatement();
            st.executeUpdate(sql);
            return true;  // Indica éxito
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }return false;
   }
}
