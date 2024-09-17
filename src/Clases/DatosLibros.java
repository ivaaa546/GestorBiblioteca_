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
            String sql= "Select * from mostralibros order by id_libro";
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

    //metodo para obtener id autor sirve para agregar 
    public int id_autor(String autor){
    try {
            String sql = "SELECT id_autor FROM autores WHERE nombre = '" + autor + "'";
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
    
    //para buscar nombre autor por el combobox sirve para buscar    
    public String nombreAutor(int codigo)
    {
        try {
            String sql= "Select nombre  from autores where id_autor ='" + codigo + "'";
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
    
    
   //metodo para insetardatos a la base de datos
   public boolean insertarLibro(Libros misLibros) {
    try {
        String sql = "INSERT INTO libros (titulo, isbn, genero, id_autor) VALUES ('"
            + misLibros.getTitulo() + "', '"
            + misLibros.getIsbn() + "', '"
            + misLibros.getGenero() + "', "
            + misLibros.getAutor() + ")"; // Suponiendo que getAutor() devuelve un int
        
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        return true;
    } catch (SQLException ex) {
        Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
}
   //metodo para buscar los auotores por medio del id
   public Libros getLibros(String titulo)
   {    
      
        try {
            Libros lib= null;
            String sql= "Select * from libros where titulo= '" + titulo+ "' ";
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            if(rs.next()){
            
                lib= new Libros(
                rs.getString("titulo"),
                rs.getString("isbn"),
                rs.getString("genero"),
                rs.getInt("id_autor"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }return null;
   
   }
   
   //metodo para buscar
   public Libros buscarL(String titulo)
   {
        try {
            Libros lib= null;
            String sql= "Select * from libros where titulo= '" + titulo+ "' ";
            
            // Permite preparar la base de datos para enviarle consultas
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
            lib = new Libros(
                rs.getString("titulo"),
                rs.getString("isbn"),  // Cambia "Nombre" por "Apellido" o el campo correcto
                rs.getString("genero"),
                rs.getInt("id_autor")
            );
            
        }
            return lib;
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
   }
   
   //metodo para eliminar 
   public boolean eliminarLibro(Libros libro)
   {
        try {
            String sql = "DELETE FROM libros WHERE titulo='"+libro.getTitulo()+"'";
            //permite preparar la base de datos para enviarle consultas
            Statement st= con.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        }return false;
   }

   //actualizar libro
  // Método para actualizar un libro en la base de datos
    /*public boolean actualizarL(Libros lib) {
        try {
            // SQL para actualizar el libro, buscando por el título original
            String sql = "UPDATE libros SET titulo = '" + lib.getTitulo() + "', "
                       + "isbn = '" + lib.getIsbn() + "', "
                       + "genero = '" + lib.getGenero() + "', "
                       + "id_autor = '" + lib.getAutor() + "' "
                       + "WHERE titulo = '" + lib.getTitulo()+ "'";

            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }   */
   public boolean actualizarL(Libros lib) {
    try {
        String sql = "UPDATE libros SET id_libro = '" + lib.getTitulo()+ "', "
                    + "titulo = '" + lib.getTitulo()+ "', "
                   + "isbn = '" + lib.getIsbn() + "', "
                   + "genero = '" + lib.getGenero() + "', "
                   + "id_autor = '" + lib.getAutor() + "' ";

        Statement st = con.createStatement();
        st.executeUpdate(sql);
        return true;

    } catch (SQLException ex) {
        Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
}
   
   // Método para editar un libro en la base de datos
public boolean editarLibro(Libros libro, int idLibro) {
    try {
        // Consulta SQL para actualizar los datos del libro
        String sql = "UPDATE libros SET titulo = ?, isbn = ?, genero = ?, id_autor = ? WHERE id_libro = ?";

        // Preparar la consulta
        PreparedStatement pst = con.prepareStatement(sql);

        // Asignar los valores a los placeholders de la consulta
        pst.setString(1, libro.getTitulo());  // Establecer el título
        pst.setString(2, libro.getIsbn());    // Establecer el ISBN
        pst.setString(3, libro.getGenero());  // Establecer el género
        pst.setInt(4, libro.getAutor());      // Establecer el id del autor
        pst.setInt(5, idLibro);               // Establecer el id del libro que se va a actualizar

        // Ejecutar la actualización
        int filasActualizadas = pst.executeUpdate();

        // Verificar si la actualización fue exitosa
        if (filasActualizadas > 0) {
            System.out.println("El libro se ha actualizado correctamente.");
            return true;
        } else {
            System.out.println("No se encontró un libro con el ID proporcionado.");
            return false;
        }
    } catch (SQLException ex) {
        Logger.getLogger(DatosLibros.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
}


}


