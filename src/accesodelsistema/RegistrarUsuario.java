/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodelsistema;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class RegistrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarUsuario
     */
    public RegistrarUsuario() {
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

        jPanel1 = new javax.swing.JPanel();
        DNITexto = new javax.swing.JTextField();
        NombreTexto = new javax.swing.JTextField();
        ApellidoMaternoTexto = new javax.swing.JTextField();
        ApellidoPaternoTexto = new javax.swing.JTextField();
        EdadTexto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NacimientoTexto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CelularTexto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        UsuarioTexto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Confirmarboton = new javax.swing.JButton();
        RetornoBoton = new javax.swing.JButton();
        Contraseñatexto = new javax.swing.JPasswordField();
        Contraseñatexto2 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.yellow);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DNITexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNITextoActionPerformed(evt);
            }
        });
        getContentPane().add(DNITexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 46, 68, -1));

        NombreTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextoActionPerformed(evt);
            }
        });
        getContentPane().add(NombreTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 83, 68, -1));
        getContentPane().add(ApellidoMaternoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 163, 68, -1));
        getContentPane().add(ApellidoPaternoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 126, 68, -1));

        EdadTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadTextoActionPerformed(evt);
            }
        });
        getContentPane().add(EdadTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 200, 68, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DNI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 48, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 85, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ApellidoPaterno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 128, -1, -1));

        jLabel4.setText("ApellidoMaterno");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 165, -1, -1));

        jLabel5.setText("Edad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 202, -1, -1));
        getContentPane().add(NacimientoTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 237, 68, -1));

        jLabel6.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 239, -1, -1));
        getContentPane().add(CelularTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 274, 68, -1));

        jLabel7.setText("Celular");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 276, -1, -1));

        jLabel8.setText("Usuario");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 313, -1, -1));

        UsuarioTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioTextoActionPerformed(evt);
            }
        });
        getContentPane().add(UsuarioTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 311, 68, -1));

        jLabel9.setText("Contraseña");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 348, -1, -1));

        jLabel10.setText("RepetirContraseña");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 390, -1, -1));

        Confirmarboton.setText("Regresar");
        Confirmarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarbotonActionPerformed(evt);
            }
        });
        getContentPane().add(Confirmarboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 385, -1, -1));

        RetornoBoton.setText("Guardar");
        RetornoBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetornoBotonMouseClicked(evt);
            }
        });
        RetornoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetornoBotonActionPerformed(evt);
            }
        });
        getContentPane().add(RetornoBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 385, -1, -1));
        getContentPane().add(Contraseñatexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 348, 78, -1));

        Contraseñatexto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contraseñatexto2ActionPerformed(evt);
            }
        });
        getContentPane().add(Contraseñatexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 388, 78, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DNITextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNITextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNITextoActionPerformed

    private void EdadTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadTextoActionPerformed

    private void UsuarioTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioTextoActionPerformed

    private void NombreTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextoActionPerformed

    private void ConfirmarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarbotonActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_ConfirmarbotonActionPerformed

    private void RetornoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetornoBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RetornoBotonActionPerformed

    private void Contraseñatexto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contraseñatexto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contraseñatexto2ActionPerformed

    private void RetornoBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetornoBotonMouseClicked
        // TODO add your handling code here:
        try {
            try (BufferedWriter escribirTXT = new BufferedWriter(new FileWriter("Usuario.txt", true))) {
                String dni = DNITexto.getText();
                String nombre = NombreTexto.getText();
                String ApePaterno = ApellidoPaternoTexto.getText();
                String ApeMaterno = ApellidoMaternoTexto.getText();
                String edad = EdadTexto.getText();
                String Nacimiento = NacimientoTexto.getText();
                String Celular = CelularTexto.getText();
                String usuario = UsuarioTexto.getText();
                String contrasena = Contraseñatexto.getText();
                String ConfirContrasena = Contraseñatexto2.getText();

                escribirTXT.write(dni + "," + nombre + "," + ApePaterno + "," + ApeMaterno + "," 
                        + edad + ", "+ Nacimiento+","+ Celular+"," + usuario + "," + contrasena+","+ConfirContrasena);
                escribirTXT.flush();
                escribirTXT.newLine();
                escribirTXT.close();
                JOptionPane.showMessageDialog(null, "Registro Exitoso", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            System.out.println("problema al crear el  archivo de datos");
        }
    }//GEN-LAST:event_RetornoBotonMouseClicked

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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoMaternoTexto;
    private javax.swing.JTextField ApellidoPaternoTexto;
    private javax.swing.JTextField CelularTexto;
    private javax.swing.JButton Confirmarboton;
    private javax.swing.JPasswordField Contraseñatexto;
    private javax.swing.JPasswordField Contraseñatexto2;
    private javax.swing.JTextField DNITexto;
    private javax.swing.JTextField EdadTexto;
    private javax.swing.JTextField NacimientoTexto;
    private javax.swing.JTextField NombreTexto;
    private javax.swing.JButton RetornoBoton;
    private javax.swing.JTextField UsuarioTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
