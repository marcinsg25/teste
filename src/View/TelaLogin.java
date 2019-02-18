
package View;



public class TelaLogin extends javax.swing.JFrame {
    
    
    
    
   
    public TelaLogin() {
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_acessar = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        JB_user = new javax.swing.JLabel();
        JTusuario = new javax.swing.JTextField();
        JTsenha = new javax.swing.JPasswordField();
        JB_password = new javax.swing.JLabel();
        JL_LogoLogin = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        bt_acessar.setText("Acessar");
        bt_acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_acessarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_acessar);
        bt_acessar.setBounds(260, 170, 73, 40);

        bt_sair.setText("Sair");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });
        getContentPane().add(bt_sair);
        bt_sair.setBounds(350, 170, 70, 40);

        JB_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JB_user.setForeground(new java.awt.Color(255, 255, 255));
        JB_user.setText("Usuário:");
        getContentPane().add(JB_user);
        JB_user.setBounds(180, 80, 80, 30);
        getContentPane().add(JTusuario);
        JTusuario.setBounds(260, 80, 160, 30);
        getContentPane().add(JTsenha);
        JTsenha.setBounds(260, 120, 160, 30);

        JB_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JB_password.setForeground(new java.awt.Color(255, 255, 255));
        JB_password.setText("Senha:");
        getContentPane().add(JB_password);
        JB_password.setBounds(180, 110, 80, 30);

        JL_LogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/secrecy-icon.png"))); // NOI18N
        getContentPane().add(JL_LogoLogin);
        JL_LogoLogin.setBounds(20, 60, 130, 130);

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaLoginVerde3.png"))); // NOI18N
        getContentPane().add(lbl);
        lbl.setBounds(0, 0, 450, 250);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 40, 34, 14);

        setSize(new java.awt.Dimension(450, 243));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // <editor-fold defaultstate="collapsed" desc="BOTÃO ACESSAR"> 
    private void bt_acessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_acessarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();// Fecha a tela login
         
    }//GEN-LAST:event_bt_acessarActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_sairActionPerformed
    // </editor-fold> 
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JB_password;
    private javax.swing.JLabel JB_user;
    private javax.swing.JLabel JL_LogoLogin;
    private javax.swing.JPasswordField JTsenha;
    private javax.swing.JTextField JTusuario;
    private javax.swing.JButton bt_acessar;
    private javax.swing.JButton bt_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl;
    // End of variables declaration//GEN-END:variables
}
