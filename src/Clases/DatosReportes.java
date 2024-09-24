/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author pc
 */
public class DatosReportes {
    private Connection con;
    //constructor
    public DatosReportes()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //definir nuestro String de conexion
            String db="jdbc:mysql://localhost/gestor_biblioteca?serverTimezone=UTC";
            con = DriverManager.getConnection(db,"root","");
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatosReportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatosReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //metodo para cerrar la conexion
    public void cerrarConexion(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatosReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///
    }
    
    public ResultSet librosMasPrestados()
    {
        
        try {
            String sql= "Select * from vista_libros_mas_prestados order by id_libro";
            Statement  st= null;
            st= con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    }
    
    public ResultSet usuariosMasPresmos()
    {
        
        try {
            String sql= "Select * from vista_usuarios_mas_prestamos order by id_usuario";
            Statement  st= null;
            st= con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    }
    public ResultSet librosVencidos()
    {
        
        try {
            String sql= "Select * from vista_libros_vencidos order by id_libro";
            Statement  st= null;
            st= con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    }
    
   
}
