/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

/**
 *
 * @author josue
 */
public class frmPrincipalBiblioteca extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipalBiblioteca
     */
    public frmPrincipalBiblioteca() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuRegistrarLibros = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuRegistrarAutores = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuPrestamosDevoluciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Registro");

        mnuRegistrarLibros.setText("Registrar Usuarios");
        mnuRegistrarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistrarLibrosActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRegistrarLibros);
        jMenu1.add(jSeparator2);

        mnuRegistrarAutores.setText("Registrar Autores");
        mnuRegistrarAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistrarAutoresActionPerformed(evt);
            }
        });
        jMenu1.add(mnuRegistrarAutores);
        jMenu1.add(jSeparator3);

        jMenuItem3.setText("Registrar Libros");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        mnuPrestamosDevoluciones.setText("Registrar Préstamos y Devoluciones");
        mnuPrestamosDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrestamosDevolucionesActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPrestamosDevoluciones);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuRegistrarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistrarLibrosActionPerformed
        frmRegistroUsuarios usu = new frmRegistroUsuarios();
        this.setVisible(false);//ocultar formulario actual
        usu.setLocationRelativeTo(null);
        usu.setVisible(true);
       
    }//GEN-LAST:event_mnuRegistrarLibrosActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        frmLibros libros = new frmLibros();
        this.setVisible(false);//ocultar formulario actual
        libros.setLocationRelativeTo(null);
        libros.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mnuRegistrarAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistrarAutoresActionPerformed
       //generamos una instancia al frmRegistroAutores
        frmRegistroAutores autores = new frmRegistroAutores();
        this.setVisible(false);//ocultar formulario actual
        autores.setLocationRelativeTo(null);
        autores.setVisible(true);
    }//GEN-LAST:event_mnuRegistrarAutoresActionPerformed

    private void mnuPrestamosDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrestamosDevolucionesActionPerformed
        // TODO add your handling code here:
        frmPrestamos prestamos = new frmPrestamos();
        this.setVisible(false);//ocultar formulario actual
        prestamos.setLocationRelativeTo(null);
        prestamos.setVisible(true);
    }//GEN-LAST:event_mnuPrestamosDevolucionesActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipalBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem mnuPrestamosDevoluciones;
    private javax.swing.JMenuItem mnuRegistrarAutores;
    private javax.swing.JMenuItem mnuRegistrarLibros;
    // End of variables declaration//GEN-END:variables
}
