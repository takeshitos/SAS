/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sas;

import java.awt.CardLayout;

/**
 *
 * @author Tchuco
 */
public class Enfermeira extends javax.swing.JFrame {

    /**
     * Creates new form Enfermeira
     */
    
    CardLayout   cardLayout;
    
    
    public Enfermeira() {
        initComponents();
        cardLayout = (CardLayout)(panCards.getLayout());
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTop = new javax.swing.JPanel();
        labLogo = new javax.swing.JLabel();
        labEstoque = new javax.swing.JLabel();
        labTriagem = new javax.swing.JLabel();
        labUserImage = new javax.swing.JLabel();
        labUser = new javax.swing.JLabel();
        panCards = new javax.swing.JPanel();
        cardTriagem = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        panInformacoes = new javax.swing.JPanel();
        tfTemperatura = new javax.swing.JTextField();
        labTemperatura = new javax.swing.JLabel();
        tfPressao = new javax.swing.JTextField();
        labPressao = new javax.swing.JLabel();
        labDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPaciente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        cardEstoque = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabEstoque = new javax.swing.JTable();
        btAlterar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panTop.setBackground(new java.awt.Color(255, 255, 255));
        panTop.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(249, 100, 100)));

        labLogo.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://www.dropbox.com/s/lz6r501j7qgsv2u/logoSAS_2_15.png?dl=1")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        labEstoque.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labEstoque.setText("ESTOQUE");
        labEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labEstoqueMouseClicked(evt);
            }
        });

        labTriagem.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labTriagem.setText("TRIAGEM");
        labTriagem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labTriagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labTriagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labTriagemMouseClicked(evt);
            }
        });

        labUserImage.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://www.dropbox.com/s/b6da3hn35crnihb/userProjeto_2_7.png?dl=1")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        labUser.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labUser.setText("Enfermeira");

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labTriagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labUserImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labUser)
                .addGap(35, 35, 35))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTriagem)
                    .addComponent(labEstoque))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopLayout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labUserImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        panCards.setLayout(new java.awt.CardLayout());

        cardTriagem.setBackground(new java.awt.Color(231, 231, 231));

        btSalvar.setBackground(new java.awt.Color(249, 100, 100));
        btSalvar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("SALVAR");
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setMinimumSize(new java.awt.Dimension(73, 18));
        btSalvar.setPreferredSize(new java.awt.Dimension(73, 18));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        panInformacoes.setBackground(new java.awt.Color(255, 255, 255));
        panInformacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 100, 100)));
        panInformacoes.setPreferredSize(new java.awt.Dimension(2, 2));

        tfTemperatura.setBackground(new java.awt.Color(242, 242, 242));
        tfTemperatura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labTemperatura.setText("TEMPERATURA");

        tfPressao.setBackground(new java.awt.Color(242, 242, 242));
        tfPressao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labPressao.setText("PRESSÃO ARTERIAL");

        labDescricao.setText("DESCRIÇÃO");

        jScrollPane1.setBorder(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabPaciente.setBackground(new java.awt.Color(242, 242, 242));
        tabPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tabPaciente.setForeground(new java.awt.Color(51, 51, 51));
        tabPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Paciente", "Horário da Consulta"
            }
        ));
        tabPaciente.setGridColor(new java.awt.Color(204, 204, 204));
        tabPaciente.setRowHeight(30);
        tabPaciente.setRowMargin(7);
        tabPaciente.setSelectionBackground(new java.awt.Color(196, 67, 67));
        tabPaciente.setShowGrid(true);
        jScrollPane1.setViewportView(tabPaciente);

        taDescricao.setBackground(new java.awt.Color(242, 242, 242));
        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        taDescricao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        jScrollPane3.setViewportView(taDescricao);

        javax.swing.GroupLayout panInformacoesLayout = new javax.swing.GroupLayout(panInformacoes);
        panInformacoes.setLayout(panInformacoesLayout);
        panInformacoesLayout.setHorizontalGroup(
            panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInformacoesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1)
                    .addGroup(panInformacoesLayout.createSequentialGroup()
                        .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labTemperatura)
                            .addComponent(tfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPressao, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labPressao))))
                .addGap(30, 30, 30))
        );
        panInformacoesLayout.setVerticalGroup(
            panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInformacoesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panInformacoesLayout.createSequentialGroup()
                        .addComponent(labPressao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPressao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panInformacoesLayout.createSequentialGroup()
                        .addComponent(labTemperatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(labDescricao)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout cardTriagemLayout = new javax.swing.GroupLayout(cardTriagem);
        cardTriagem.setLayout(cardTriagemLayout);
        cardTriagemLayout.setHorizontalGroup(
            cardTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTriagemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        cardTriagemLayout.setVerticalGroup(
            cardTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTriagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cardTriagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        panCards.add(cardTriagem, "cardTriagem");

        cardEstoque.setBackground(new java.awt.Color(231, 231, 231));

        btCadastrar.setBackground(new java.awt.Color(249, 100, 100));
        btCadastrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("CADASTRAR");
        btCadastrar.setActionCommand("<html><center>ALTERAR QUANTIDADE</center></html>");
        btCadastrar.setBorder(null);
        btCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(249, 100, 100), 1, true));

        jScrollPane4.setBorder(null);
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabEstoque.setBackground(new java.awt.Color(242, 242, 242));
        tabEstoque.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tabEstoque.setForeground(new java.awt.Color(51, 51, 51));
        tabEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome do Item", "Quantidade"
            }
        ));
        tabEstoque.setGridColor(new java.awt.Color(204, 204, 204));
        tabEstoque.setIntercellSpacing(new java.awt.Dimension(0, 10));
        tabEstoque.setRowHeight(30);
        tabEstoque.setSelectionBackground(new java.awt.Color(196, 67, 67));
        tabEstoque.setShowGrid(true);
        jScrollPane4.setViewportView(tabEstoque);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        btAlterar1.setBackground(new java.awt.Color(249, 100, 100));
        btAlterar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btAlterar1.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar1.setText("<html>&nbsp;&nbsp;  ALTERAR<br />QUANTIDADE</html>");
        btAlterar1.setActionCommand("<html><center>ALTERAR QUANTIDADE</center></html>");
        btAlterar1.setBorder(null);
        btAlterar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardEstoqueLayout = new javax.swing.GroupLayout(cardEstoque);
        cardEstoque.setLayout(cardEstoqueLayout);
        cardEstoqueLayout.setHorizontalGroup(
            cardEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardEstoqueLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(cardEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(btAlterar1))
                .addGap(22, 22, 22))
        );
        cardEstoqueLayout.setVerticalGroup(
            cardEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(cardEstoqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panCards.add(cardEstoque, "cardEstoque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labTriagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labTriagemMouseClicked
        cardLayout.show(panCards,"cardTriagem");
        labTriagem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labEstoque.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labTriagem.setFont(new java.awt.Font("Verdana", 0, 18));
        labEstoque.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labTriagemMouseClicked

    private void labEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labEstoqueMouseClicked
        cardLayout.show(panCards,"cardEstoque");
        labTriagem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labEstoque.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labEstoque.setFont(new java.awt.Font("Verdana", 0, 18));
        labTriagem.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labEstoqueMouseClicked

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlterar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Enfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Enfermeira().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar1;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel cardEstoque;
    private javax.swing.JPanel cardTriagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labDescricao;
    private javax.swing.JLabel labEstoque;
    private javax.swing.JLabel labLogo;
    private javax.swing.JLabel labPressao;
    private javax.swing.JLabel labTemperatura;
    private javax.swing.JLabel labTriagem;
    private javax.swing.JLabel labUser;
    private javax.swing.JLabel labUserImage;
    private javax.swing.JPanel panCards;
    private javax.swing.JPanel panInformacoes;
    private javax.swing.JPanel panTop;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTable tabEstoque;
    private javax.swing.JTable tabPaciente;
    private javax.swing.JTextField tfPressao;
    private javax.swing.JTextField tfTemperatura;
    // End of variables declaration//GEN-END:variables
}
