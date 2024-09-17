/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;
import Formularios.frmPrincipalBiblioteca;
import Formularios.frmRegistroUsuarios;
import javax.swing.JFrame;




/**
 *
 * @author pc
 */
public class GestorBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipalBiblioteca pr = new frmPrincipalBiblioteca();
       pr.setLocationRelativeTo(null);
       pr.setVisible(true);
       pr.setExtendedState(JFrame.MAXIMIZED_BOTH); //maximisamos formulario principal 
    }
    
}
