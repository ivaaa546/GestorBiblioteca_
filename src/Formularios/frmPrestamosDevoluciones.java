/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.DatosLibros;
import Clases.DatosPretamoDevoluciones;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import Clases.Prestamo;
import Clases.Devolucion;
import Clases.Libros;
import Clases.Multas;
import Clases.Usuario;
import Clases.PrestamoBuscar;
import javax.swing.JOptionPane;
/**
 *
 * @author jossq
 */
public class frmPrestamosDevoluciones extends javax.swing.JFrame {

    /**
     * Creates new form frmPrestamos
     */
    public frmPrestamosDevoluciones() {
        initComponents();
        //ocultar el idPrestamo
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbLibro = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbUsuario = new javax.swing.JComboBox<>();
        dcFechaPrestamo = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        dcFechaDevolucion = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrarPrestamo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        cmbEstado = new javax.swing.JComboBox<>();
        btnRegistrarDevolucion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtMulta = new javax.swing.JTextField();
        txtIdPrestamo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnNuevaDevolucion = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("PRÉSTAMOS Y DEVOLUCIONES");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Libro");

        cmbLibro.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Usuario");

        cmbUsuario.setEnabled(false);

        dcFechaPrestamo.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de Préstamo");

        dcFechaDevolucion.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de Devolución");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Estado");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Multa");

        btnRegistrarPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnRegistrarPrestamo.setText("Registrar Prestamo");
        btnRegistrarPrestamo.setEnabled(false);
        btnRegistrarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPrestamoActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
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

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciones una opción", "Prestamo", "Devuelto", " " }));
        cmbEstado.setEnabled(false);

        btnRegistrarDevolucion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarDevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnRegistrarDevolucion.setText("Registrar Devolución");
        btnRegistrarDevolucion.setEnabled(false);
        btnRegistrarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDevolucionActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("ID Prestamo:");

        txtMulta.setBackground(new java.awt.Color(255, 255, 255));
        txtMulta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtMulta.setEnabled(false);

        txtIdPrestamo.setEnabled(false);

        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adicionar.png"))); // NOI18N
        btnNuevo.setText("Nuevo Prestamo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnNuevaDevolucion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevaDevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.png"))); // NOI18N
        btnNuevaDevolucion.setText("Nueva Devolución");
        btnNuevaDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaDevolucionActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/biblioteca33.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(445, 445, 445)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dcFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnRegistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnRegistrarDevolucion)
                        .addGap(30, 30, 30)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevaDevolucion))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel11)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cmbLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(154, 154, 154)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dcFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(194, 194, 194))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(dcFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel6)
                    .addComponent(dcFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarDevolucion)
                    .addComponent(btnRegistrarPrestamo)
                    .addComponent(btnNuevo)
                    .addComponent(btnNuevaDevolucion))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnRegresar)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        frmPrincipalBiblioteca pr = new frmPrincipalBiblioteca();
        this.dispose();
       pr.setLocationRelativeTo(null);
       pr.setVisible(true);
       pr.setExtendedState(JFrame.MAXIMIZED_BOTH); //maximisamos formulario principal
       this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // llamamos al método limpiar
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DatosPretamoDevoluciones lp = new DatosPretamoDevoluciones();
        lp.llenarComboxLibros(cmbLibro);
        lp.llenarComboxUsuarios(cmbUsuario);
        llenarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnRegistrarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPrestamoActionPerformed
       
       if(cmbLibro.getSelectedIndex()==0)
       {
           JOptionPane.showMessageDialog(rootPane, "Debe selecionar el libro", "Libro", HEIGHT);
                cmbLibro.grabFocus();
                return;
       
       }
       if(cmbEstado.getSelectedIndex()==0)
       {
           JOptionPane.showMessageDialog(rootPane, "Debe selecionar el estado", "Estado", HEIGHT);
                cmbEstado.grabFocus();
                return;
       
       }
        if(cmbUsuario.getSelectedIndex()==0)
       {
           JOptionPane.showMessageDialog(rootPane, "Debe selecionar el usuario", "Usuario", HEIGHT);
                cmbUsuario.grabFocus();
                return;
       }
       
       if(dcFechaPrestamo.getDate() == null)
       {
           JOptionPane.showMessageDialog(rootPane, "Debe poner la fecha de prestamo", "Fecha Prestamo", HEIGHT);
                dcFechaPrestamo.grabFocus();
                return;
       }
        
        int id_libro, id_usuario;
        Date fecha_prestamos, fecha_devolucion;
        
        DatosPretamoDevoluciones conectar = new DatosPretamoDevoluciones();
        id_libro = conectar.id_libro(String.valueOf(cmbLibro.getSelectedItem()));
        id_usuario = conectar.id_usuario(String.valueOf(cmbUsuario.getSelectedItem()));
        String estado = (String) cmbEstado.getSelectedItem();
        
        fecha_prestamos = dcFechaPrestamo.getDate();
        
        Prestamo pres= new Prestamo(id_libro, id_usuario,fecha_prestamos, estado );
        
        if(conectar.registrarPrestamo(pres))
    {
        JOptionPane.showMessageDialog(rootPane, "Se ha registrado el presto, tiene 30 para la devolución");
    }
    else{
    
        JOptionPane.showMessageDialog(rootPane, "No ingresado correctamente");
    }
    conectar.cerrarConexion();
    llenarTabla();
    btnRegistrarPrestamo.setEnabled(true);
    cmbLibro.setEnabled(false);
    cmbUsuario.setEnabled(false);
    
    
    }//GEN-LAST:event_btnRegistrarPrestamoActionPerformed

    private void btnRegistrarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDevolucionActionPerformed
         if(txtIdPrestamo.getText().equals(""))
     {
         JOptionPane.showMessageDialog(rootPane, "Debe selecionar el ID del prestamo", "ID Prestamo", HEIGHT);
                cmbUsuario.grabFocus();
                return;
     }
     
     if(cmbEstado.getSelectedIndex()==0)
     {
         JOptionPane.showMessageDialog(rootPane, "Debe selecionar el estado del prestamo", "Estado Prestamo", HEIGHT);
                cmbEstado.grabFocus();
                return;
     }
     if(dcFechaPrestamo.getDate()==null){
         JOptionPane.showMessageDialog(rootPane, "Debe colocar la fecha del prestamo", "Fecha Prestamo", HEIGHT);
                dcFechaPrestamo.grabFocus();
                return;
     }
     
     if(dcFechaDevolucion.getDate()==null){
         JOptionPane.showMessageDialog(rootPane, "Debe colocar la fecha de devolución", "Fecha Devolución", HEIGHT);
                dcFechaDevolucion.grabFocus();
                return;
     }

        DatosPretamoDevoluciones conectar = new DatosPretamoDevoluciones();
         String estado = (String) cmbEstado.getSelectedItem();
         Date fecha_devolucion = dcFechaDevolucion.getDate();
         Date fecha_prestamo = dcFechaPrestamo.getDate();
        int id_prestamo= Integer.parseInt(txtIdPrestamo.getText());
        double multa = conectar.multa(fecha_prestamo, fecha_devolucion);
     if (multa > 0) {
        // Si hay multa, mostrar el valor
        txtMulta.setText(String.valueOf(multa));
        JOptionPane.showMessageDialog(rootPane, "El usuario tiene una multa de: " + multa + " quetzales.");
        
        // Insertar la multa en la base de datos
        Multas ml = new Multas(id_prestamo, multa);
        
        if (conectar.insertarMultar(ml)) {
            JOptionPane.showMessageDialog(rootPane, "Multa registrada correctamente.");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al registrar la multa.");
        }
    }
     else {
        txtMulta.setText("0");
        JOptionPane.showMessageDialog(rootPane, "No hay multa.");
    }
 
    int prestamo = Integer.parseInt(txtIdPrestamo.getText());
    //double prestamo = Double.parseDouble(txtMulta.getText());
    Devolucion dp = new Devolucion(prestamo,fecha_devolucion,estado );
         
    if(conectar.registrarDevolucion(dp))
    {       
       //JOptionPane.showMessageDialog(rootPane, "Devolución correctamente");
    conectar.cerrarConexion();
    llenarTabla();
    btnRegistrarDevolucion.setEnabled(true);
    }
    else{
    
       JOptionPane.showMessageDialog(rootPane, "No ingresado correctamente");
       
    }
    
    //btnRegistrarPrestamo.setEnabled(true);
   
    }//GEN-LAST:event_btnRegistrarDevolucionActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       cmbLibro.setEnabled(true);
       cmbUsuario.setEnabled(true);
       cmbEstado.setEnabled(true);
       dcFechaPrestamo.setEnabled(true);
       btnRegistrarPrestamo.setEnabled(true);
       btnRegistrarDevolucion.setEnabled(false);
       txtIdPrestamo.setEnabled(false);
       btnNuevaDevolucion.setEnabled(true);
       btnNuevo.setEnabled(false);
       
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnNuevaDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaDevolucionActionPerformed
        txtIdPrestamo.setEnabled(true);
        dcFechaPrestamo.setEnabled(true);
        dcFechaDevolucion.setEnabled(true);
        cmbEstado.setEnabled(true);
        btnRegistrarDevolucion.setEnabled(true);
        btnNuevaDevolucion.setEnabled(false);
        cmbLibro.setEnabled(false);
        cmbUsuario.setEnabled(false);
        btnNuevo.setEnabled(true);
        btnRegistrarPrestamo.setEnabled(false);
        btnBuscar.setEnabled(true);
    }//GEN-LAST:event_btnNuevaDevolucionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         if(txtIdPrestamo.getText().equals(""))
     {
         JOptionPane.showMessageDialog(rootPane, "Debe selecionar el ID del prestamo", "ID Prestamo", HEIGHT);
                cmbUsuario.grabFocus();
                return;
     }
        
        
        int  id_prestamo = Integer.parseInt(txtIdPrestamo.getText());
        DatosPretamoDevoluciones co = new DatosPretamoDevoluciones();
        PrestamoBuscar usu= co.buscarPrestamo(id_prestamo);
        if(usu == null){
        JOptionPane.showMessageDialog(rootPane, "Usuario no encotrado");
        txtIdPrestamo.grabFocus();
        co.cerrarConexion();
        return;
        }
      
        String nombreLibro = co.buscarLibro(usu.getId_libro());
        String nombreUsuario = co.buscarUsuario(usu.getId_usuario());
        
        
        cmbLibro.setSelectedItem(nombreLibro);
        cmbUsuario.setSelectedItem(nombreUsuario);
        
        // Mostrar la fecha de préstamo
    dcFechaPrestamo.setDate(usu.getFecha_prestamo()); // Asegúrate de que el método getFechaPrestamo() esté disponible
    
    // Mostrar el estado del préstamo en el JComboBox
    String estadoPrestamo = usu.getEstado(); // Asegúrate de que el método getEstado() esté disponible
    cmbEstado.setSelectedItem(estadoPrestamo); // Ajusta este nombre si tu JComboBox tiene otro nombre
    
// Establecer el valor de la multa en el campo txtMulta
        txtMulta.setText(String.valueOf(co.buscarMulta(id_prestamo)));
    
    
    co.cerrarConexion();
    
    
    
        
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    
    private void limpiar()
    {
        txtMulta.setText("");
        txtIdPrestamo.setText("");
        cmbLibro.setSelectedIndex(0);
        cmbEstado.setSelectedIndex(0);
        cmbUsuario.setSelectedIndex(0);
        
        //para limpiar los campos de fechas
        dcFechaPrestamo.setCalendar(null);
        dcFechaDevolucion.setCalendar(null);
        //cmbMulta.setSelectedIndex(0);
    }
    
    private DefaultTableModel tabla;
    
    private void llenarTabla(){
        try {
        String titulos[] = {"ID_Prestamo", "Libro", "Usuario", "Prestamo", "Devolucion", "Estado"};
        tabla = new DefaultTableModel(null, titulos);
        String registros[] = new String[6];
        DatosPretamoDevoluciones datos = new DatosPretamoDevoluciones();
        ResultSet rs = datos.mostrarPretamosDevoluciones();
        
        while (rs.next()) {
            registros[0] = rs.getString("id_prestamo");          // Índice 0
            registros[1] = rs.getString("titulo_libro");        // Índice 1
            registros[2] = rs.getString("nombre_usuario");       // Índice 2
            registros[3] = rs.getString("fecha_prestamo");      // Índice 3
            registros[4] = rs.getString("fecha_devolucion");    // Índice 4
            registros[5] = rs.getString("estado");               // Índice 5
            tabla.addRow(registros);
        }
        
        tabla1.setModel(tabla);
        
    } catch (SQLException ex) {
        Logger.getLogger(frmPrestamosDevoluciones.class.getName()).log(Level.SEVERE, null, ex);
    }
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
            java.util.logging.Logger.getLogger(frmPrestamosDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrestamosDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrestamosDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrestamosDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrestamosDevoluciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevaDevolucion;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrarDevolucion;
    private javax.swing.JButton btnRegistrarPrestamo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbLibro;
    private javax.swing.JComboBox<String> cmbUsuario;
    private com.toedter.calendar.JDateChooser dcFechaDevolucion;
    private com.toedter.calendar.JDateChooser dcFechaPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtIdPrestamo;
    private javax.swing.JTextField txtMulta;
    // End of variables declaration//GEN-END:variables
}
