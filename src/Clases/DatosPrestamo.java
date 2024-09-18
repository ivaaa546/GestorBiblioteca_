/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class DatosPrestamo {
    private Connection con;
    public DatosPrestamo() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String db ="jdbc:mysql://localhost/gestor_biblioteca?serverTimezone=UTC";
            con = DriverManager.getConnection(db,"root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatosAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
