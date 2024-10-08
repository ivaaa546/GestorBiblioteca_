/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.DatosLibros;
import Clases.DatosReportes;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.jdi.connect.spi.Connection;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class frmReportes extends javax.swing.JFrame {

    /**
     * Creates new form frmReportes
     */
    public frmReportes() {
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

        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLibros = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnlibVencidos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Anterior.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Reportes");

        btnLibros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLibros.setText("Libros más prestados");
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });

        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUsuarios.setText("Usuarios con más prestamos");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnlibVencidos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlibVencidos.setText("Libros vencidos");
        btnlibVencidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlibVencidosActionPerformed(evt);
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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/biblioteca33.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLibros)
                                .addGap(36, 36, 36)
                                .addComponent(btnUsuarios)
                                .addGap(35, 35, 35)
                                .addComponent(btnlibVencidos)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLibros)
                            .addComponent(btnUsuarios)
                            .addComponent(btnlibVencidos)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frmPrincipalBiblioteca pr = new frmPrincipalBiblioteca();
       this.dispose();
       pr.setLocationRelativeTo(null);
       pr.setVisible(true);
       pr.setExtendedState(JFrame.MAXIMIZED_BOTH); //maximisamos formulario principal
    }//GEN-LAST:event_btnRegresarActionPerformed
    ///Libros más prestados
    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        
        Document documento = new Document();
        try {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String nombreArchivo = "librosPrestados" + timestamp + ".pdf";
            
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            String texto = "Reporte de libros más prestados";
            Paragraph parrafo = new Paragraph(texto);
            parrafo.setAlignment(Paragraph.ALIGN_CENTER); // Centrar el párrafo
            parrafo.setSpacingAfter(20f);
            documento.open();
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(3);
            tabla.addCell("Id Libro:");
            tabla.addCell("Titulo");
            tabla.addCell("Cantidad Prestamos");

            DatosReportes conectar = new DatosReportes();
            ResultSet rs = conectar.librosMasPrestados();
            if(rs.next()){
                                       
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                    } while (rs.next());
                    documento.add(tabla);                    
                }
            conectar.cerrarConexion();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmReportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(frmReportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        
            documento.close();
            JOptionPane.showMessageDialog(rootPane, "Reporte generado");
        }
        
        
    // Llenar la tabla antes de generar el reporte
    llenarTabla1();

    }//GEN-LAST:event_btnLibrosActionPerformed
    ///Usuarios con más prestamos
    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        
        Document documento = new Document();
        try {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String nombreArchivo = "UsuariosPrestamos" + timestamp + ".pdf";
            
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            String texto = "Reporte de usuarios con más prestamos";
            Paragraph parrafo = new Paragraph(texto);
            parrafo.setAlignment(Paragraph.ALIGN_CENTER); // Centrar el párrafo
            parrafo.setSpacingAfter(20f);
            documento.open();
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(3);
            tabla.addCell("Id Usuario:");
            tabla.addCell("Nombre");
            tabla.addCell("Cantidad Prestamos");
            
            
            DatosReportes conectar = new DatosReportes();
            ResultSet rs = conectar.usuariosMasPresmos();
            
            if(rs.next()){
                                       
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                    } while (rs.next());
                    documento.add(tabla);                    
                }
            conectar.cerrarConexion();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmReportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(frmReportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        
            documento.close();
            JOptionPane.showMessageDialog(rootPane, "Reporte generado");
        }
        
        llenarTabla2();
       
    }//GEN-LAST:event_btnUsuariosActionPerformed
  ///Libros vencidos
    private void btnlibVencidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlibVencidosActionPerformed
      
        Document documento = new Document();
        try {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String nombreArchivo = "librosVencidos" + timestamp + ".pdf";
            
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            String texto = "Reporte de libros más prestados";
            Paragraph parrafo = new Paragraph(texto);
            parrafo.setAlignment(Paragraph.ALIGN_CENTER); // Centrar el párrafo
            parrafo.setSpacingAfter(20f);
            documento.open();
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell("Id Libro:");
            tabla.addCell("Titulo");
            tabla.addCell("Fecha Prestamo");
            tabla.addCell("Dias vencidos");
            
            DatosReportes conectar = new DatosReportes();
            ResultSet rs = conectar.librosVencidos();
            if(rs.next()){
                                       
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                    } while (rs.next());
                    documento.add(tabla);                    
                }
            conectar.cerrarConexion();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmReportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(frmReportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmReportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        
            documento.close();
            JOptionPane.showMessageDialog(rootPane, "Reporte generado");
        }
        
        llenarTabla3();
    }//GEN-LAST:event_btnlibVencidosActionPerformed

    //llenar tabla reportes de libros más prestados
    private DefaultTableModel tabla;
    
    private void llenarTabla1(){
        try {
            String titulos[]={"ID_libro","Titulo", "Cantidad Prestamo"};
            tabla = new DefaultTableModel(null, titulos);
            String registros[]= new String[3];
            DatosReportes datos= new DatosReportes();
            ResultSet rs=  datos.librosMasPrestados();
            while(rs.next()){
                
                registros[0] = rs.getString("id_libro");
                registros[1] = rs.getString("titulo");
                registros[2] = rs.getString("cantidad_prestamos");
                tabla.addRow(registros);
            }
            tabla1.setModel(tabla);
            
        } catch (SQLException ex) {
            Logger.getLogger(frmLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //llenar tabla reportes usuarios con más préstamos
    private DefaultTableModel tabla2;
    
    private void llenarTabla2(){
        try {
            String titulos[]={"Id Usuario","Nombre", "Cantidad Prestamo"};
            tabla = new DefaultTableModel(null, titulos);
            String registros[]= new String[3];
            DatosReportes datos= new DatosReportes();
            ResultSet rs=  datos.usuariosMasPresmos();
            while(rs.next()){
                
                registros[0] = rs.getString("id_usuario");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("cantidad_prestamos");
                tabla.addRow(registros);
            }
            tabla1.setModel(tabla);
            
        } catch (SQLException ex) {
            Logger.getLogger(frmLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //llenar tabla reportes usuarios con más préstamos
    private DefaultTableModel tabla3;

private void llenarTabla3() {
    try {
        String titulos[] = {"Id Libro", "Título", "Fecha prestamo", "Dias vencidos"};
        tabla3 = new DefaultTableModel(null, titulos); // Cambia tabla a tabla3
        String registros[] = new String[4];
        DatosReportes datos = new DatosReportes();
        
        // Asegúrate de que este método devuelva un ResultSet
        ResultSet rs = datos.librosVencidos();
        
        while (rs.next()) {
            registros[0] = rs.getString("id_libro");
            registros[1] = rs.getString("titulo");
            registros[2] = rs.getString("fecha_prestamo");
            registros[3] = rs.getString("dias_vencidos");
            tabla3.addRow(registros);
        }
        
        // Asegúrate de que tabla1 es el JTable correcto
        tabla1.setModel(tabla3);
        
    } catch (SQLException ex) {
        Logger.getLogger(frmLibros.class.getName()).log(Level.SEVERE, null, ex);
    }
}
         //reporte libros más prestados
    public void reporteLibPrestados()
    {
        
    
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
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnlibVencidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
