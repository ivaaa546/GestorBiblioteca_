/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author josue
 */
public class DatosAutor {
    private Connection con;
    
    public DatosAutor() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db ="jdbc:mysql://localhost/gestor_biblioteca?serverTimezone=UTC";
            con = DriverManager.getConnection(db,"root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatosAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void CerrarConexion(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatosAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean insertarAutor(Autor autor_) {
    String sql = "INSERT INTO autores(nombre, nacionalidad, fecha_nacimiento, fecha_fallecimiento) VALUES (?, ?, ?, ?)";
    try (PreparedStatement pst = con.prepareStatement(sql)) {
        pst.setString(1, autor_.getNombre());
        pst.setString(2, autor_.getNacionalidad());
        pst.setDate(3, new java.sql.Date(autor_.getFecha_nacimiento().getTime()));
        
        if (autor_.getFecha_fallecimiento() != null) {
            pst.setDate(4, new java.sql.Date(autor_.getFecha_fallecimiento().getTime()));
        }
        else {
            pst.setNull(4, java.sql.Types.DATE);
        }
        
        pst.executeUpdate();
        return true;
    } catch (SQLException ex) {
        Logger.getLogger(DatosAutor.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
    }
    
    //metodo para obtener Autores
    public ResultSet mostrarAutores() {
        try {
            String sql = "SELECT * FROM autores ORDER BY id_autor";
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatosAutor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
    

