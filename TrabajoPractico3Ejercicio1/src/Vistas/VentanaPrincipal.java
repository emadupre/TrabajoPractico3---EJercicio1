/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author Enzo_2
 */
public class VentanaPrincipal extends javax.swing.JFrame {
            
    public VentanaPrincipal() {
        initComponents();
        /* Esto es opcional por si el usuario utiliza el Enter para verificar */
        getRootPane().setDefaultButton(jb_Verificar);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTextField1 = new javax.swing.JTextField();
        jp_Ocultar_Ver = new javax.swing.JPanel();
        jb_Ocultar = new javax.swing.JButton();
        jb_Ver = new javax.swing.JButton();
        jp_Credenciales = new javax.swing.JPanel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_Contrasena = new javax.swing.JLabel();
        jpF_Contrasena = new javax.swing.JPasswordField();
        txtF_usuario = new javax.swing.JTextPane();
        jb_Verificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Credenciales");
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setBackground(java.awt.SystemColor.controlHighlight);
        jTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1.setText(" Inicio de sesion ");
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jb_Ocultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jb_Ocultar.setText("Ocultar");
        jb_Ocultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb_Ocultar.setBorderPainted(false);
        jb_Ocultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_OcultarActionPerformed(evt);
            }
        });

        jb_Ver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jb_Ver.setText("Ver");
        jb_Ver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb_Ver.setBorderPainted(false);
        jb_Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_VerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_Ocultar_VerLayout = new javax.swing.GroupLayout(jp_Ocultar_Ver);
        jp_Ocultar_Ver.setLayout(jp_Ocultar_VerLayout);
        jp_Ocultar_VerLayout.setHorizontalGroup(
            jp_Ocultar_VerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Ocultar_VerLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jb_Ocultar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jb_Ver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_Ocultar_VerLayout.setVerticalGroup(
            jp_Ocultar_VerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Ocultar_VerLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jp_Ocultar_VerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Ocultar)
                    .addComponent(jb_Ver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_Credenciales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese las credenciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        lbl_usuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_usuario.setText("       Usuario:");
        lbl_usuario.setToolTipText("lbl Usuario");

        lbl_Contrasena.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_Contrasena.setText("Contraseña:");

        jpF_Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpF_ContrasenaActionPerformed(evt);
            }
        });

        jb_Verificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jb_Verificar.setText("Verificar");
        jb_Verificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb_Verificar.setBorderPainted(false);
        jb_Verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_VerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_CredencialesLayout = new javax.swing.GroupLayout(jp_Credenciales);
        jp_Credenciales.setLayout(jp_CredencialesLayout);
        jp_CredencialesLayout.setHorizontalGroup(
            jp_CredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CredencialesLayout.createSequentialGroup()
                .addGroup(jp_CredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CredencialesLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jp_CredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_usuario)
                            .addComponent(lbl_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_CredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpF_Contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(txtF_usuario)))
                    .addGroup(jp_CredencialesLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jb_Verificar)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jp_CredencialesLayout.setVerticalGroup(
            jp_CredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CredencialesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_CredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtF_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_CredencialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpF_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jb_Verificar)
                .addContainerGap())
        );

        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jp_Ocultar_Ver, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jp_Credenciales, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Ocultar_Ver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_Credenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_Credenciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_Ocultar_Ver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jb_VerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_VerificarActionPerformed
        
        /* Acá lo que hice es tomar el email y contraseña de los campos */
        /* Seguido de esto, al getText le coloco un .trim para quitar los espacios en blancos y así evitar errores. */
        String emailIngresado = txtF_usuario.getText().trim();
        char[] contraIngresada = jpF_Contrasena.getPassword();
        
        /* Esto es más que nada por si los campos están vacios y le das a verificar. */
        if(emailIngresado.isEmpty() || contraIngresada.length == 0){
            JOptionPane.showMessageDialog(this, "Completar ambos campos.");
            return;
        }
        
        /* Estas serian las credenciales a pedir, o sea, las correctas */
        String emailCorrecto = "alumno@ulp.edu.ar";
        String contraCorrecta = "12345678";
        
        /* Acá hacemos la comparacion tanto del emailIngresado y la contraIngresada, se verifican con la credencial correcta. */
        /* En caso de que sea correcto o no se imprimen mensajes. Dando el acceso o no, en el caso de que no se limpia el campo de la contraseña. */
        if(emailIngresado.equals(emailCorrecto) && String.valueOf(contraIngresada).equals(contraCorrecta)){
            JOptionPane.showMessageDialog(this, "Acceso permitido.");
        } else {
            JOptionPane.showMessageDialog(this, "Datos incorrectos, verifique.");
            txtF_usuario.setText("");
            jpF_Contrasena.setText("");
        }
    }//GEN-LAST:event_jb_VerificarActionPerformed

    private void jpF_ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpF_ContrasenaActionPerformed
        /* Esto es opcional pero si el usuario apreta enter ya se dispara el boton de verificar */
        jb_VerificarActionPerformed(evt);
        
    }//GEN-LAST:event_jpF_ContrasenaActionPerformed

    private void jb_VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_VerActionPerformed
        /* Aca lo que hacemos es que la contraseña se pueda ver normalmente para su correcto ingreso. */
        jpF_Contrasena.setEchoChar((char)0);
    }//GEN-LAST:event_jb_VerActionPerformed

    private void jb_OcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_OcultarActionPerformed
        /* Aca lo que hacemos es que la contraseña se transforme/oculte en el caracter '*'. */
        jpF_Contrasena.setEchoChar('*');
    }//GEN-LAST:event_jb_OcultarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jb_Ocultar;
    private javax.swing.JButton jb_Ver;
    private javax.swing.JButton jb_Verificar;
    private javax.swing.JPasswordField jpF_Contrasena;
    private javax.swing.JPanel jp_Credenciales;
    private javax.swing.JPanel jp_Ocultar_Ver;
    private javax.swing.JLabel lbl_Contrasena;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextPane txtF_usuario;
    // End of variables declaration//GEN-END:variables
}
