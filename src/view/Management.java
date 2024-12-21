
package view;

import view.Settings;
import controller.Controller;
import model.Account;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Management extends javax.swing.JFrame {
    Settings Settings = new Settings();
    Controller Controller = new Controller();
    
    public Management() {
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/assets/icon.png")).getImage());
        initComponents();
        
        AccountPassword.setDocument(new LimitDocument(20));
        
        Fundo_List.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new java.awt.Color(46, 46, 46); // Cor do "thumb" (parte que você arrasta)
                this.trackColor = new java.awt.Color(31, 31, 31); // Cor do fundo da barra
            }
            
            @Override
            protected JButton createDecreaseButton(int orientation) {
                JButton button = new JButton(); // Botão superior (diminuir)
                button.setBackground(new java.awt.Color(64, 64, 64)); // Cor do botão
                button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 46, 46))); // Borda
                return button;
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                JButton button = new JButton(); // Botão inferior (aumentar)
                button.setBackground(new java.awt.Color(64, 64, 64)); // Cor do botão
                button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(46, 46, 46))); // Borda
                return button;
            }
        });
        
        ReadAccounts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new javax.swing.JPanel();
        Fundo_Cabecalho = new javax.swing.JPanel();
        Logotipo = new javax.swing.JLabel();
        Texto_1 = new javax.swing.JLabel();
        Fundo_List = new javax.swing.JScrollPane();
        AccountList = new javax.swing.JList<>();
        Texto_2 = new javax.swing.JLabel();
        Texto_3 = new javax.swing.JLabel();
        AccountName = new javax.swing.JTextField();
        Texto_4 = new javax.swing.JLabel();
        GeneratePassword = new javax.swing.JButton();
        Configure = new javax.swing.JButton();
        CreateAccount = new javax.swing.JButton();
        UpdateAccount = new javax.swing.JButton();
        DeleteAccount = new javax.swing.JButton();
        CopyPassword = new javax.swing.JButton();
        EditAccount = new javax.swing.JButton();
        AccountPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Contas");
        setName("Management"); // NOI18N
        setResizable(false);

        Fundo.setBackground(new java.awt.Color(46, 46, 46));

        Fundo_Cabecalho.setBackground(new java.awt.Color(31, 31, 31));

        Logotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        javax.swing.GroupLayout Fundo_CabecalhoLayout = new javax.swing.GroupLayout(Fundo_Cabecalho);
        Fundo_Cabecalho.setLayout(Fundo_CabecalhoLayout);
        Fundo_CabecalhoLayout.setHorizontalGroup(
            Fundo_CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fundo_CabecalhoLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(Logotipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Fundo_CabecalhoLayout.setVerticalGroup(
            Fundo_CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fundo_CabecalhoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Logotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Texto_1.setBackground(new java.awt.Color(224, 224, 224));
        Texto_1.setFont(new java.awt.Font("Verdana Pro", 1, 18)); // NOI18N
        Texto_1.setForeground(new java.awt.Color(224, 224, 224));
        Texto_1.setText("Contas salvas");

        Fundo_List.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        Fundo_List.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        AccountList.setBackground(new java.awt.Color(31, 31, 31));
        AccountList.setFont(new java.awt.Font("Verdana Pro", 0, 14)); // NOI18N
        AccountList.setForeground(new java.awt.Color(224, 224, 224));
        AccountList.setSelectionBackground(new java.awt.Color(46, 46, 46));
        AccountList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountListMouseClicked(evt);
            }
        });
        Fundo_List.setViewportView(AccountList);

        Texto_2.setFont(new java.awt.Font("Verdana Pro", 1, 18)); // NOI18N
        Texto_2.setForeground(new java.awt.Color(224, 224, 224));
        Texto_2.setText("Guardar conta");

        Texto_3.setFont(new java.awt.Font("Verdana Pro", 0, 14)); // NOI18N
        Texto_3.setForeground(new java.awt.Color(224, 224, 224));
        Texto_3.setText("Digite um nome");

        AccountName.setBackground(new java.awt.Color(51, 51, 51));
        AccountName.setFont(new java.awt.Font("Verdana Pro", 0, 12)); // NOI18N
        AccountName.setForeground(new java.awt.Color(224, 224, 224));

        Texto_4.setFont(new java.awt.Font("Verdana Pro", 0, 14)); // NOI18N
        Texto_4.setForeground(new java.awt.Color(224, 224, 224));
        Texto_4.setText("Digite uma senha");

        GeneratePassword.setBackground(new java.awt.Color(0, 0, 0));
        GeneratePassword.setFont(new java.awt.Font("Verdana Pro", 1, 18)); // NOI18N
        GeneratePassword.setForeground(new java.awt.Color(224, 224, 224));
        GeneratePassword.setText("Gerar senha");
        GeneratePassword.setToolTipText("Gere uma senha aleatória");
        GeneratePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeneratePasswordMouseClicked(evt);
            }
        });

        Configure.setBackground(new java.awt.Color(0, 0, 0));
        Configure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/config.png"))); // NOI18N
        Configure.setToolTipText("Configure quais caracteres serão gerados e o tamanho da senha a ser gerada");
        Configure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfigureMouseClicked(evt);
            }
        });

        CreateAccount.setBackground(new java.awt.Color(0, 0, 0));
        CreateAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/create.png"))); // NOI18N
        CreateAccount.setToolTipText("Cria um novo item para a lista de contas");
        CreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateAccountMouseClicked(evt);
            }
        });

        UpdateAccount.setBackground(new java.awt.Color(0, 0, 0));
        UpdateAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/update.png"))); // NOI18N
        UpdateAccount.setToolTipText("Atualiza a senha de uma conta armazenada");
        UpdateAccount.setEnabled(false);
        UpdateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateAccountMouseClicked(evt);
            }
        });

        DeleteAccount.setBackground(new java.awt.Color(0, 0, 0));
        DeleteAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete.png"))); // NOI18N
        DeleteAccount.setToolTipText("Deleta uma conta");
        DeleteAccount.setEnabled(false);
        DeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteAccountMouseClicked(evt);
            }
        });

        CopyPassword.setBackground(new java.awt.Color(0, 0, 0));
        CopyPassword.setFont(new java.awt.Font("Verdana Pro", 1, 18)); // NOI18N
        CopyPassword.setForeground(new java.awt.Color(224, 224, 224));
        CopyPassword.setText("Copiar");
        CopyPassword.setToolTipText("Copie a senha da conta selecionada na lista");
        CopyPassword.setEnabled(false);
        CopyPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CopyPasswordMouseClicked(evt);
            }
        });

        EditAccount.setBackground(new java.awt.Color(0, 0, 0));
        EditAccount.setFont(new java.awt.Font("Verdana Pro", 1, 18)); // NOI18N
        EditAccount.setForeground(new java.awt.Color(224, 224, 224));
        EditAccount.setText("Editar");
        EditAccount.setToolTipText("Edite a conta selecionada na lista");
        EditAccount.setEnabled(false);
        EditAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditAccountMouseClicked(evt);
            }
        });

        AccountPassword.setBackground(new java.awt.Color(51, 51, 51));
        AccountPassword.setFont(new java.awt.Font("Verdana Pro", 0, 12)); // NOI18N
        AccountPassword.setForeground(new java.awt.Color(224, 224, 224));

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo_Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FundoLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Texto_1)
                    .addComponent(Fundo_List, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                        .addComponent(CopyPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Texto_3)
                    .addComponent(Texto_2)
                    .addComponent(AccountName)
                    .addComponent(Texto_4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                        .addComponent(GeneratePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Configure, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addComponent(CreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AccountPassword))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addComponent(Fundo_Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto_1)
                    .addComponent(Texto_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addComponent(Texto_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Texto_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AccountPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GeneratePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Configure, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addComponent(Fundo_List, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CopyPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(59, 59, 59))
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

    private void GeneratePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeneratePasswordMouseClicked
        boolean letter = Settings.getLetterValue(),
                digit = Settings.getDigitValue(),
                symbol = Settings.getSymbolValue();
        int amount = Settings.getAmount();
                
        String password = Controller.GeneratePassword(letter, digit, symbol, amount);
        AccountPassword.setText(password);
    }//GEN-LAST:event_GeneratePasswordMouseClicked

    private void ConfigureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfigureMouseClicked
        Settings.setVisible(true);
    }//GEN-LAST:event_ConfigureMouseClicked

    private void CreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccountMouseClicked
        if(CreateAccount.isEnabled()) {
            String name = AccountName.getText(),
                   password = AccountPassword.getText();

            if(Controller.VerifyText(name, password)) {
                if(password.length() > 7) {
                    Controller.Create(name, password);
                    ReadAccounts();
                }
                else JOptionPane.showMessageDialog(null, "A senha precisa conter no mínimo sete caracteres", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_CreateAccountMouseClicked

    private void UpdateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateAccountMouseClicked
        if(UpdateAccount.isEnabled()) {
            String name = AccountName.getText(),
                   newPassword = AccountPassword.getText();
        
            if(Controller.VerifyText(newPassword)) {
                CreateAccount.setEnabled(true);
                AccountName.setEditable(true);
                UpdateAccount.setEnabled(false);
                DeleteAccount.setEnabled(false);

                Controller.Update(name, newPassword);
                ReadAccounts();
            }
        }
    }//GEN-LAST:event_UpdateAccountMouseClicked

    private void DeleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccountMouseClicked
        if(DeleteAccount.isEnabled()) {
            String name = AccountName.getText();
        
            CreateAccount.setEnabled(true);
            AccountName.setEditable(true);
            UpdateAccount.setEnabled(false);
            DeleteAccount.setEnabled(false);

            Controller.Delete(name);
            ReadAccounts();
        }
    }//GEN-LAST:event_DeleteAccountMouseClicked

    private void CopyPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CopyPasswordMouseClicked
        if(CopyPassword.isEnabled()) {
            String name = (String) AccountList.getSelectedValue();
            Controller.Copy(name);
            CopyPassword.setEnabled(false);
            EditAccount.setEnabled(false);
        }
    }//GEN-LAST:event_CopyPasswordMouseClicked

    private void EditAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAccountMouseClicked
        if(EditAccount.isEnabled()) {
            String name = (String) AccountList.getSelectedValue();
            String[] data = Controller.GetData(name);

            CreateAccount.setEnabled(false);
            AccountName.setEditable(false);
            UpdateAccount.setEnabled(true);
            DeleteAccount.setEnabled(true);
            CopyPassword.setEnabled(false);
            EditAccount.setEnabled(false);

            AccountName.setText(data[0]);
            AccountPassword.setText(data[1]);
        }
    }//GEN-LAST:event_EditAccountMouseClicked

    private void AccountListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountListMouseClicked
        CopyPassword.setEnabled(true);
        EditAccount.setEnabled(true);
    }//GEN-LAST:event_AccountListMouseClicked
    
    private void ReadAccounts() {
        ArrayList<Account> accounts = Controller.Read();
        DefaultListModel<String> model = new DefaultListModel<>();
    
        model.clear();
        
        for (Account acc : accounts) {
            model.addElement(acc.getName());
        }
    
        AccountList.setModel(model);
        AccountName.setText("");
        AccountPassword.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> AccountList;
    private javax.swing.JTextField AccountName;
    private javax.swing.JTextField AccountPassword;
    private javax.swing.JButton Configure;
    private javax.swing.JButton CopyPassword;
    private javax.swing.JButton CreateAccount;
    private javax.swing.JButton DeleteAccount;
    private javax.swing.JButton EditAccount;
    private javax.swing.JPanel Fundo;
    private javax.swing.JPanel Fundo_Cabecalho;
    private javax.swing.JScrollPane Fundo_List;
    private javax.swing.JButton GeneratePassword;
    private javax.swing.JLabel Logotipo;
    private javax.swing.JLabel Texto_1;
    private javax.swing.JLabel Texto_2;
    private javax.swing.JLabel Texto_3;
    private javax.swing.JLabel Texto_4;
    private javax.swing.JButton UpdateAccount;
    // End of variables declaration//GEN-END:variables
}
