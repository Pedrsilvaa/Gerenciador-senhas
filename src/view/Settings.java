
package view;

public class Settings extends javax.swing.JFrame {

    public Settings() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new javax.swing.JPanel();
        Fundo_Cabecalho = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Texto_1 = new javax.swing.JLabel();
        Letter = new javax.swing.JCheckBox();
        Digit = new javax.swing.JCheckBox();
        Symbol = new javax.swing.JCheckBox();
        Texto_4 = new javax.swing.JLabel();
        Fundo_Slider = new javax.swing.JPanel();
        Amount = new javax.swing.JSlider();
        Confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciador de Contas");
        setName("Settings"); // NOI18N
        setResizable(false);

        Fundo.setBackground(new java.awt.Color(46, 46, 46));

        Fundo_Cabecalho.setBackground(new java.awt.Color(31, 31, 31));

        Titulo.setFont(new java.awt.Font("Verdana Pro", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(224, 224, 224));
        Titulo.setText("Configurações");

        javax.swing.GroupLayout Fundo_CabecalhoLayout = new javax.swing.GroupLayout(Fundo_Cabecalho);
        Fundo_Cabecalho.setLayout(Fundo_CabecalhoLayout);
        Fundo_CabecalhoLayout.setHorizontalGroup(
            Fundo_CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fundo_CabecalhoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Fundo_CabecalhoLayout.setVerticalGroup(
            Fundo_CabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fundo_CabecalhoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Titulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Texto_1.setFont(new java.awt.Font("Verdana Pro", 0, 14)); // NOI18N
        Texto_1.setForeground(new java.awt.Color(224, 224, 224));
        Texto_1.setText("Caracteres permitidos:");

        Letter.setFont(new java.awt.Font("Verdana Pro", 0, 12)); // NOI18N
        Letter.setForeground(new java.awt.Color(224, 224, 224));
        Letter.setSelected(true);
        Letter.setText("Letras");

        Digit.setFont(new java.awt.Font("Verdana Pro", 0, 12)); // NOI18N
        Digit.setForeground(new java.awt.Color(224, 224, 224));
        Digit.setSelected(true);
        Digit.setText("Números");

        Symbol.setFont(new java.awt.Font("Verdana Pro", 0, 12)); // NOI18N
        Symbol.setForeground(new java.awt.Color(224, 224, 224));
        Symbol.setSelected(true);
        Symbol.setText("Símbolos");

        Texto_4.setFont(new java.awt.Font("Verdana Pro", 0, 14)); // NOI18N
        Texto_4.setForeground(new java.awt.Color(224, 224, 224));
        Texto_4.setText("Quantidade de caracteres:");

        Fundo_Slider.setBackground(new java.awt.Color(51, 51, 51));

        Amount.setFont(new java.awt.Font("Verdana Pro", 0, 9)); // NOI18N
        Amount.setForeground(new java.awt.Color(224, 224, 224));
        Amount.setMajorTickSpacing(1);
        Amount.setMaximum(20);
        Amount.setMinimum(8);
        Amount.setMinorTickSpacing(1);
        Amount.setPaintLabels(true);
        Amount.setSnapToTicks(true);

        javax.swing.GroupLayout Fundo_SliderLayout = new javax.swing.GroupLayout(Fundo_Slider);
        Fundo_Slider.setLayout(Fundo_SliderLayout);
        Fundo_SliderLayout.setHorizontalGroup(
            Fundo_SliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fundo_SliderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        Fundo_SliderLayout.setVerticalGroup(
            Fundo_SliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fundo_SliderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Confirm.setBackground(new java.awt.Color(0, 0, 0));
        Confirm.setFont(new java.awt.Font("Verdana Pro", 1, 14)); // NOI18N
        Confirm.setForeground(new java.awt.Color(224, 224, 224));
        Confirm.setText("Confimar");
        Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo_Cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FundoLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(FundoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addComponent(Texto_1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FundoLayout.createSequentialGroup()
                                .addComponent(Letter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Digit)
                                .addGap(44, 44, 44)
                                .addComponent(Symbol))
                            .addComponent(Fundo_Slider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44))
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addComponent(Texto_4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addComponent(Fundo_Cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Texto_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Letter)
                    .addComponent(Digit)
                    .addComponent(Symbol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Texto_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fundo_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_ConfirmMouseClicked

    public boolean getLetterValue() {
        return this.Letter.isSelected();
    }
    
    public boolean getDigitValue() {
        return this.Digit.isSelected();
    }
    
    public boolean getSymbolValue() {
        return this.Symbol.isSelected();
    }
    
    public int getAmount() {
        return (int) this.Amount.getValue();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Amount;
    private javax.swing.JButton Confirm;
    private javax.swing.JCheckBox Digit;
    private javax.swing.JPanel Fundo;
    private javax.swing.JPanel Fundo_Cabecalho;
    private javax.swing.JPanel Fundo_Slider;
    private javax.swing.JCheckBox Letter;
    private javax.swing.JCheckBox Symbol;
    private javax.swing.JLabel Texto_1;
    private javax.swing.JLabel Texto_4;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
