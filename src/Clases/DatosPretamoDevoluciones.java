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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import java.sql.PreparedStatement;
import Clases.Prestamo;
import Clases.Devolucion;
import Clases.Multas;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author pc
 */
public class DatosPretamoDevoluciones {
    private Connection con;
    public DatosPretamoDevoluciones(){
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //definir nuestro String de conexion
            String db="jdbc:mysql://localhost/gestor_biblioteca?serverTimezone=UTC";
            con = DriverManager.getConnection(db,"root","");
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatosPretamoDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatosPretamoDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //metodo para cerrar la conexion
    public void cerrarConexion(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatosPretamoDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///
        ///
    }
     public ResultSet mostrarPretamosDevoluciones()
    {
        
        
        try {
            String sql= "Select * from mostaprestamos order by id_prestamo";
            Statement  st= null;
            st= con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatosPretamoDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
        
    }   

    
        //cargar en el combox
    public void llenarComboxUsuarios(JComboBox combo)
    {
        try {
            String sql= "Select nombre from usuarios order by nombre";
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            combo.addItem("Selecione un usuario...");
            while(rs.next())
            {
            
                combo.addItem(rs.getString("nombre"));
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    //cargar en el combox
    public void llenarComboxLibros(JComboBox combo)
    {
        try {
            String sql= "Select titulo from libros order by titulo";
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            combo.addItem("Selecione un libro...");
            while(rs.next())
            {
            
                combo.addItem(rs.getString("titulo"));
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //metodo para obtener id libro sirve para agregar 
    public int id_libro(String libro){
    
        try {
            String sql = "SELECT id_libro FROM libros WHERE titulo = '" + libro + "'";
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if(rs.next())
            {
            
                return rs.getInt("id_libro");
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatosPretamoDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    //metodo para obtener id usuario sirve para agregar 
    public int id_usuario(String usuario)
    {
        try {
            String sql = "SELECT id_usuario FROM usuarios WHERE nombre = '" + usuario + "'";
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(sql);
             if(rs.next())
            {
            
                return rs.getInt("id_usuario");
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatosPretamoDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public boolean registrarPrestamo(Prestamo prestamo)
    {
        String sql = "INSERT INTO prestamos (id_libro, id_usuario, fecha_prestamo, estado) VALUES (?, ?, ?, ?)";
    try (PreparedStatement pst = con.prepareStatement(sql)) {
        pst.setInt(1, prestamo.getId_libro());
        pst.setInt(2, prestamo.getId_usuario());

        // Si getFecha_prestamo() devuelve un objeto Date
        java.sql.Date fechaPrestamo = new java.sql.Date(prestamo.getFecha_prestamo().getTime());
        pst.setDate(3, fechaPrestamo);
        pst.setString(4, prestamo.getEstado());

        pst.executeUpdate();
        return true;
    } catch (SQLException ex) {
        Logger.getLogger(DatosPretamoDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }

    }
     public boolean registrarDevolucion(Devolucion devolucion)
     {
         try {
        String sql = "UPDATE prestamos SET fecha_devolucion = ?, estado = ? WHERE id_prestamo = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        // Convertir java.util.Date a java.sql.Date
        java.sql.Date fechaDevolucion = new java.sql.Date(devolucion.getFecha_devolucion().getTime());

        // Asignar valores a los placeholders
        ps.setDate(1, fechaDevolucion);              // Para fecha_devolucion
        ps.setString(2, devolucion.getEstado());     // Para estado
        ps.setInt(3, devolucion.getId_prestamo());   // Para id_prestamo (el que falta)

        // Ejecutar la consulta
        ps.executeUpdate();
        return true;
    } catch (SQLException ex) {
        Logger.getLogger(DatosPretamoDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
        
     }
     //insertar multas
     public boolean insertarMultar(Multas multa)
     {  String sql = "INSERT INTO multas (id_prestamo, monto) VALUES (?, ?)";
        try(PreparedStatement pst = con.prepareStatement(sql)) {
        pst.setInt(1, multa.getId_prestamo());
        pst.setDouble(2, multa.getMonto());
        pst.executeUpdate();
        return true;     
        } catch (SQLException ex) {
            Logger.getLogger(DatosPretamoDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
     }
     
     public double multa(Date fechaPrestamo, Date fechaDevolucion){
         long MILLISECONDS_IN_A_DAY = 86400000;
         int DIAS_MAXIMO = 30;
         double MULTA_POR_DIA = 10.0;
         // Calcular la diferencia en días entre la fecha de préstamo y la fecha de devolución
        long diffInMillies = fechaDevolucion.getTime() - fechaPrestamo.getTime();
        long diasDePrestamo = TimeUnit.MILLISECONDS.toDays(diffInMillies);
        
        // Si se pasa de los 30 días, calcular la multa
        if (diasDePrestamo > DIAS_MAXIMO) {
            long diasRetraso = diasDePrestamo - DIAS_MAXIMO;
            return diasRetraso * MULTA_POR_DIA;
        }
         
     return 0;
     
     }
    
   public PrestamoBuscar buscarPrestamo(int id_prestamo)
   {
        try {
            PrestamoBuscar prestamo= null;
            String sql= "Select * from prestamos where id_prestamo= '" + id_prestamo+ "' ";
            // Permite preparar la base de datos para enviarle consultas
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()) {
            prestamo = new PrestamoBuscar(
                rs.getInt("id_prestamo"),
                rs.getInt("id_libro"), 
                rs.getInt("id_usuario"),
                rs.getDate("fecha_prestamo"),
                rs.getString("estado")
            );
            }
             return prestamo;
        } catch (SQLException ex) {
            Logger.getLogger(DatosPretamoDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
                return null;
        }
   
   }
   
   //para buscar nombre libro por el combobox sirve para buscar    
    public String buscarLibro(int codigo)
    {
        try {
            String sql= "Select titulo  from libros where id_libro ='" + codigo + "'";
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if(rs.next())
            {
            
                return rs.getString("titulo");
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String buscarUsuario(int codigo)
    {
        try {
            String sql= "Select nombre  from usuarios where id_usuario ='" + codigo + "'";
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if(rs.next())
            {
            
                return rs.getString("nombre");
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String buscarMulta(int codigo)
    {
        try {
            String sql= "Select monto  from multas where id_prestamo ='" + codigo + "'";
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if(rs.next())
            {
            
                return rs.getString("monto");
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Sin multa";
    }
   
}
