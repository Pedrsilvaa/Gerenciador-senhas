
package view;

import javax.swing.JOptionPane;
import view.Management;
        
public class Login extends javax.swing.JFrame {
    private boolean Visibility = false;
    
    public Login() {
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/assets/icon.png")).getImage());
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new javax.swing.JPanel();
        Fundo_Cabecalho = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Texto_Senha = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        ChangeVisibility = new javax.swing.JButton();
        Accessing = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Contas");
        setName("Login"); // NOI18N
        setResizable(false);

        Fundo.setBackground(new java.awt.Color(46, 46, 46));

        Fundo_Cabecalho.setBackground(new java.awt.Color(31, 31, 31));

        Titulo.setFont(new java.awt.Font("Verdana Pro", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(224, 224, 224));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Login");

        javax.swing.GroupLayout Fundo_CabecalhoLayout = new javax.swing.GroupLayout(Fundo_Cabecalho);
        Fundo_Cabecalho.setLayout(Fundo_CabecalhoLayout);
        Fundo_CabecalhoLayout.setHorizontalGroup(
            Fundo_CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fundo_CabecalhoLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 400, Short.MAX_VALUE))
        );
        Fundo_CabecalhoLayout.setVerticalGroup(
            Fundo_CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );

        Texto_Senha.setFont(new java.awt.Font("Verdana Pro", 0, 18)); // NOI18N
        Texto_Senha.setForeground(new java.awt.Color(224, 224, 224));
        Texto_Senha.setText("Digite a senha para acessar o gerenciador");

        Password.setBackground(new java.awt.Color(51, 51, 51));
        Password.setFont(new java.awt.Font("Verdana Pro", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(224, 224, 224));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        ChangeVisibility.setBackground(new java.awt.Color(0, 0, 0));
        ChangeVisibility.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/visible.png"))); // NOI18N
        ChangeVisibility.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeVisibilityMouseClicked(evt);
            }
        });

        Accessing.setBackground(new java.awt.Color(0, 0, 0));
        Accessing.setFont(new java.awt.Font("Verdana Pro", 1, 18)); // NOI18N
        Accessing.setForeground(new java.awt.Color(224, 224, 224));
        Accessing.setText("Acessar");
        Accessing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccessingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo_Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FundoLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto_Senha)
                    .addComponent(Accessing, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChangeVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addComponent(Fundo_Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(Texto_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ChangeVisibility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Accessing, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeVisibilityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeVisibilityMouseClicked
        switch(Visibility) {
            case false:
                Password.setEchoChar('\u0000');
                ChangeVisibility.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hidden.png")));
                Visibility = true;
                break;
                
            case true:
                Password.setEchoChar('\u2022');
                ChangeVisibility.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/visible.png")));
                Visibility = false;
                break;
        }
    }//GEN-LAST:event_ChangeVisibilityMouseClicked

    private void AccessingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccessingMouseClicked
        VerifyAccess();
    }//GEN-LAST:event_AccessingMouseClicked

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        VerifyAccess();
    }//GEN-LAST:event_PasswordActionPerformed

    private void VerifyAccess() {
        Management Management = new Management();
        String inputPassword = Password.getText();
                
        if(!inputPassword.equals("")) { // Digite sua senha
            JOptionPane.showMessageDialog(null, "Erro ao efetuar login.\nTente novamente", "Login", JOptionPane.ERROR_MESSAGE);
            Password.setText("");
        }
        else {
            JOptionPane.showMessageDialog(null, "Login efetuado com sucesso.", "Login", JOptionPane.INFORMATION_MESSAGE);
            Management.setVisible(true);
            this.dispose();
        }
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accessing;
    private javax.swing.JButton ChangeVisibility;
    private javax.swing.JPanel Fundo;
    private javax.swing.JPanel Fundo_Cabecalho;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Texto_Senha;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
