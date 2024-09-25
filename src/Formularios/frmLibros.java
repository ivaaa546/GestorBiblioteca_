/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.DatosLibros;
import Clases.DatosUsuarios;
import Clases.Libros;
import Clases.LibrosModificar;
import Clases.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;


/**
 *
 * @author pc
 */
public class frmLibros extends javax.swing.JFrame {

    /**
     * Creates new form frmLibros
     */
    public frmLibros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        cmbAutor = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        txtIdLibro = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setText("Libros");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Autor:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Titulo:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("ISBN:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Género:");

        txtIsbn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIsbn.setEnabled(false);
        txtIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnActionPerformed(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTitulo.setEnabled(false);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        txtGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtGenero.setEnabled(false);
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adicionar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Anterior.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo Libro");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        cmbAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbAutor.setEnabled(false);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        txtIdLibro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIdLibro.setEnabled(false);
        txtIdLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdLibroActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("ID Libro:");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/biblioteca33.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11)
                        .addGap(251, 251, 251)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(58, 58, 58)
                                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel10)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(94, 94, 94)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(81, 81, 81)
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(cmbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBuscar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAgregar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnModificar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnEliminar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnNuevo))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       frmPrincipalBiblioteca pr = new frmPrincipalBiblioteca();
       this.dispose();
       pr.setLocationRelativeTo(null);
       pr.setVisible(true);
       pr.setExtendedState(JFrame.MAXIMIZED_BOTH); //maximisamos formulario principal
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DatosLibros gt = new DatosLibros();
        gt.llenarCombox(cmbAutor);
        llenarTabla();
        
        
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
   
      if(txtTitulo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el titulo del libro", "Titulo libro", HEIGHT);
            txtTitulo.grabFocus();
            return;
        }  

        if(txtIsbn.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el ISBN del libro", "ISBN", HEIGHT);
            txtIsbn.grabFocus();
            return;
        } 
        if(txtGenero.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el genero del libro", "Genero", HEIGHT);
            txtGenero.grabFocus();
            return;
        } 
        if(cmbAutor.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(rootPane, "Debe selecionar el autor", "Autor", HEIGHT);
                cmbAutor.grabFocus();
                return;
            }
        
    String titulo, isbn, genero;
    int id_autor;
    // Obtener los valores de los campos de texto
    titulo = txtTitulo.getText().trim();
    isbn = txtIsbn.getText().trim();
    genero = txtGenero.getText().trim();
    
    DatosLibros conectar = new DatosLibros();
    int idAutor = conectar.id_autor(String.valueOf(cmbAutor.getSelectedItem()));
    
    Libros lib= new Libros(titulo,isbn,genero,idAutor);
    
    if(conectar.insertarLibro(lib))
    {
        JOptionPane.showMessageDialog(rootPane, "Producto ingresado correctamente");
    }
    else{
    
        JOptionPane.showMessageDialog(rootPane, "No ingresado correctamente");
    }
    conectar.cerrarConexion();
    llenarTabla();
    
    
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        
        int rta= JOptionPane.showConfirmDialog(rootPane,"Está seguro de querer eliminar el libro" );
       if(rta!=0){
            return;
        }
       
       DatosLibros co= new DatosLibros();
       Libros lib = co.buscarLibroTitulo(txtTitulo.getText());
       
        if(lib==null){
        JOptionPane.showMessageDialog(rootPane, "Libro no encontrado");
        txtTitulo.grabFocus();
        co.cerrarConexion();    
        return;
        }
        
        if(co.eliminarLibro(lib))
        {
            JOptionPane.showMessageDialog(rootPane, "Libro borrado correctamente");
        
        }
        
        else {
            JOptionPane.showMessageDialog(rootPane, "Libro no borrado");
        }
        llenarTabla();
        
        limpiar();
        
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

      // Pedir al usuario que ingrese el criterio de búsqueda
    String valorBusqueda = JOptionPane.showInputDialog("Ingrese el valor para buscar (Título, Autor, ISBN o Género):");
    
    // Validar que el usuario ingresó algo
    if (valorBusqueda == null || valorBusqueda.trim().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Debe ingresar un valor para buscar", "Búsqueda", HEIGHT);
        return;
    }
    
    // Preguntar al usuario qué tipo de criterio utilizará para la búsqueda
    String[] opciones = {"Título", "Autor", "ISBN", "Género"};
    String criterio = (String) JOptionPane.showInputDialog(rootPane, "Seleccione el criterio de búsqueda:", 
                            "Criterio de Búsqueda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

    // Validar que el usuario seleccionó un criterio
    if (criterio == null) {
        JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un criterio de búsqueda", "Criterio", HEIGHT);
        return;
    }

    DatosLibros co = new DatosLibros();
    List<Libros> librosEncontrados = new ArrayList<>();

    // Buscar según el criterio seleccionado
    switch (criterio) {
        case "Título":
            librosEncontrados = co.buscarLibros("titulo", valorBusqueda);
            break;
        case "Autor":
            int idAutor = co.buscarIdAutor(valorBusqueda); // Se asume que buscarIdAutor devuelve el ID del autor
            if (idAutor != -1) {
                librosEncontrados = co.buscarLibros("id_autor", String.valueOf(idAutor));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Autor no encontrado");
                co.cerrarConexion();
                return;
            }
            break;
        case "ISBN":
            librosEncontrados = co.buscarLibros("isbn", valorBusqueda);
            break;
        case "Género":
            librosEncontrados = co.buscarLibros("genero", valorBusqueda);
            break;
        default:
            JOptionPane.showMessageDialog(rootPane, "Criterio no válido");
            co.cerrarConexion();
            return;
    }
    
    // Si no se encontraron libros, mostrar mensaje
    if (librosEncontrados.isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "No se encontraron libros para el criterio de búsqueda");
        co.cerrarConexion();
        return;
    }

    // Tomar el primer libro de la lista para mostrarlo en el formulario
    Libros lib = librosEncontrados.get(0);
    String nombreAutor = co.nombreAutor(lib.getAutor());

    // Mostrar los datos del libro en los campos del formulario
    txtTitulo.setText(lib.getTitulo());
    txtIsbn.setText(lib.getIsbn());
    txtGenero.setText(lib.getGenero());
    cmbAutor.setSelectedItem(nombreAutor);

    // Habilitar botones y campos para modificar/eliminar
    btnModificar.setEnabled(true);
    txtTitulo.setEnabled(true);
    txtIsbn.setEnabled(true);
    txtIdLibro.setEnabled(true);
    txtGenero.setEnabled(true);
    cmbAutor.setEnabled(true);
    btnEliminar.setEnabled(true);
    btnAgregar.setEnabled(false);

    co.cerrarConexion();
       
    }//GEN-LAST:event_btnBuscarActionPerformed
    

    
    private void txtIdLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdLibroActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(txtIdLibro.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el ID libro", "ID libro", HEIGHT);
            txtIdLibro.grabFocus();
            return;
        }  
   DatosLibros datosLibros = new DatosLibros();  // Crear una instancia de DatosLibros
// Recoger los valores de los campos del formulario
    String titulo = txtTitulo.getText();      // Campo de texto para el título
    String isbn = txtIsbn.getText();          // Campo de texto para el ISBN
    String genero = txtGenero.getText();      // Campo de texto para el género
    String autorNombre = (String) cmbAutor.getSelectedItem();  // Nombre del autor seleccionado en el ComboBox
    int idAutor = datosLibros.id_autor(autorNombre);  // Obtener el ID del autor a partir del nombre

    int idLibro = Integer.parseInt(txtIdLibro.getText());  // ID del libro que vamos a editar (es necesario)

    // Crear un objeto Libros con los nuevos valores
    Libros libro = new Libros(titulo, isbn, genero, idAutor);

    // Llamar al método para editar el libro
    boolean exito = datosLibros.editarLibro(libro, idLibro);  // Editar el libro

    // Verificar si la edición fue exitosa
    if (exito) {
        JOptionPane.showMessageDialog(null, "El libro se ha actualizado correctamente.");
    } else {
        JOptionPane.showMessageDialog(null, "Error al actualizar el libro.");
    }

    // Cerrar la conexión a la base de datos
    datosLibros.cerrarConexion();
    llenarTabla();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        txtTitulo.setEnabled(true);
        txtIsbn.setEnabled(true);
        //txtIdLibro.setEnabled(true);
        txtGenero.setEnabled(true);
        cmbAutor.setEnabled(true);
        btnAgregar.setEnabled(true);
        limpiar();
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed
    
    //llenar tabla
    private DefaultTableModel tabla;
    
    private void llenarTabla(){
        try {
            String titulos[]={"ID_libro","Titulo", "ISBN", "Genero", "Autor"};
            tabla = new DefaultTableModel(null, titulos);
            String registros[]= new String[5];
            DatosLibros datos= new DatosLibros();
            ResultSet rs=  datos.mostrarLibros();
            while(rs.next()){
                
                registros[0] = rs.getString("id_libro");
                registros[1] = rs.getString("titulo");
                registros[2] = rs.getString("isbn");
                registros[3] = rs.getString("genero");
                registros[4] = rs.getString("AUTORES");
                tabla.addRow(registros);
            }
            tabla1.setModel(tabla);
            
        } catch (SQLException ex) {
            Logger.getLogger(frmLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void limpiar(){
        txtTitulo.setText("");
        txtIsbn.setText("");
        txtIdLibro.setText("");
        txtGenero.setText("");
         cmbAutor.setSelectedIndex(0);
    
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbAutor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
