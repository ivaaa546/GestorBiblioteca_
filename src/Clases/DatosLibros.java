/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import Clases.Usuario;
import java.sql.Statement;
import java.sql.ResultSet;
import Clases.Libros;
import java.util.HashMap;
import javax.swing.JComboBox;
import java.sql.PreparedStatement;

/**
 *
 * @author pc
 */
public class DatosLibros {
    //declar variable para la conexion
    private Connection con;
    public DatosLibros(){
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //definir nuestro String de conexion
            String db="jdbc:mysql://localhost/gestor_biblioteca?serverTimezone=UTC";
            con = DriverManager.getConnection(db,"root","");
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //metodo para cerrar la conexion
    public void cerrarConexion(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///
    }
    
    public ResultSet mostrarLibros()
    {
        
        try {
            String sql= "Select * from mostralibros order by titulo";
            Statement  st= null;
            st= con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
        }
    
    //cargar en el combox
    public void llenarCombox(JComboBox combo)
    {
        try {
            String sql= "Select nombre from autores order by nombre";
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            combo.addItem("Selecione un autor...");
            while(rs.next())
            {
            
                combo.addItem(rs.getString("nombre"));
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    //metodo para obtener id autor
    public int id_autor(String autor){
    try {
            String sql= "Select id_autor from autores where autor_= '"+ autor+ "'";
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if(rs.next())
            {
            
                return rs.getInt("id_autor");
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
   //metodo para insetardatos a la base de datos
   public boolean insertarLibro(Libros misLibros)
    {
       
        try {
             String sql = "INSERT INTO libros (titulo, isbn, genero, id_autor) VALUES ('"
   // + misLibros.getId_libro()+ "', '"
    + misLibros.getTitulo()+ "' '"
    + misLibros.getIsbn()+ "', '"
    + misLibros.getGenero()+ "', '"
    + misLibros.getAutor()+ "')";
            //permite preparar la base de datos para enviarle consultas
            Statement st= con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
          
    }
   

}
