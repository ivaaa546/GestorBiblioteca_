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


/**
 *
 * @author pc
 */
public class DatosUsuarios {
        //declar variable para la conexion
    private Connection con;
    //constructor
    public DatosUsuarios()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //definir nuestro String de conexion
            String db="jdbc:mysql://localhost/gestor_biblioteca?serverTimezone=UTC";
            con = DriverManager.getConnection(db,"root","");
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //metodo para cerrar la conexion
    public void cerrarConexion(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///
    }
    
    
        //metodo para insetardatos a la base de datos
    public boolean insertUsuario(Usuario usuario_)
    {
       
        try {
             String sql = "INSERT INTO usuarios (nombre, tipo_usuario, apellido, numero_cel, fecha_ingreso, direccion) VALUES ('"
    + usuario_.getNombre() + "', '"
    + usuario_.getTipoUsuario()+ "', '"
    + usuario_.getApellido()+ "', '"
    + usuario_.getTelefono()+ "', '"
    + usuario_.getFecha()+ "','"
    + usuario_.getDireccion()+ "' )";
            //permite preparar la base de datos para enviarle consultas
            Statement st= con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DatosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
          
    }
}
