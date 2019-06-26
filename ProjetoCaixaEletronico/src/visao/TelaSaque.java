/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import SingletonPattern.Sessao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Otavio & Alan
 */
public class TelaSaque extends javax.swing.JFrame {

    /**
     * Creates new form TelaSaque
     */
    public TelaSaque() {
        initComponents();
        
         Sessao sessao = Sessao.getSessao(); 
        String nomeUsuario = sessao.getNome();
        Float saldoUsuario = sessao.getSaldo();
        
        
        txtSaldo.setText(String.valueOf(saldoUsuario));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtValorSaque = new javax.swing.JTextField();
        botaoSair = new javax.swing.JButton();
        botaoConfirmar = new javax.swing.JButton();
        camposObrigatorios = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Valor que deseja sacar: ");

        txtValorSaque.setText("R$");
        txtValorSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorSaqueActionPerformed(evt);
            }
        });

        botaoSair.setText("Voltar");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });

        camposObrigatorios.setForeground(new java.awt.Color(255, 0, 51));

        txtSaldo.setEditable(false);
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Saldo: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tela Saque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoSair))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(camposObrigatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorSaque, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(camposObrigatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtValorSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSair)
                    .addComponent(botaoConfirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        TelaPrincipal tela = new TelaPrincipal(); 
        tela.setVisible(true);
        dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_botaoSairActionPerformed

    private void txtValorSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorSaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorSaqueActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        int contador = 0 ; 
        if (txtValorSaque.getText().length() > 0) {
        txtValorSaque.setVisible(true);
        contador++;
    } else {
      camposObrigatorios.setText("*Todos campos sao obrigatorios");
    }
     
        if(contador == 1) {
            Sessao sessao = Sessao.getSessao();
            try {
            
                      Class.forName("com.mysql.jdbc.Driver");
                       Connection con = null; 
                            PreparedStatement pstmt = null; 
                      
                      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcaixaeletronico", "root", "");
                      
                      Statement stm = con.createStatement(); 
                      
                      //Aqui fica a consulta
                      String sql = "select * from conta where nome = '"+sessao.getNome()+"'";
                      
                      //Aqui fica a execução da consulta
                      ResultSet rs = stm.executeQuery(sql);
                      
     
                      //Esse NEXT quer dizer que a consulta é verdadeira, então se houver um NEXT, dá para entrar    
                      if (rs.next()) {
                          
                          //(1) Aqui iremos mexer com o saldo do usuário que está fazendo depósito
                          Float saldoAtualUsuario = Float.valueOf(rs.getString("saldo"));
                          Float valorSaque = Float.valueOf(txtValorSaque.getText());
                          
                          Float calculoSaldoAtual = saldoAtualUsuario - valorSaque; 
                  
                          if(calculoSaldoAtual >= 0){ 
                         //Essa sessão atualiza o saldo do Usuario ao clicar no botao, fazendo ele perder o dinheiro que transferiu
                          PreparedStatement pUsuario = con.prepareStatement("UPDATE conta SET saldo = ? WHERE id_conta = ?");   
                          pUsuario.setFloat(1, calculoSaldoAtual);
                          pUsuario.setInt(2, sessao.getId());
                          pUsuario.execute();
                          pUsuario.close();
                          
                          PreparedStatement pRegistroSaque = con.prepareStatement("INSERT INTO saque (valor, id_contaFK) values (?, ?)");
                          pRegistroSaque.setFloat(1, valorSaque);
                          pRegistroSaque.setInt(2, sessao.getId());
                          pRegistroSaque.execute();
                          pRegistroSaque.close();

                          JOptionPane.showMessageDialog(null, "Saque realizado!");
                          
                          sessao.setSaldo(calculoSaldoAtual);
                          TelaPrincipal tela = new TelaPrincipal();
                          tela.setVisible(true);
                          dispose(); 
                          } else 
                              JOptionPane.showMessageDialog(null, "Saldo indisponível");

                          
                      } else {
                      JOptionPane.showMessageDialog(null, "Saque impossível");                       
                      }

                  } 
                  catch (ClassNotFoundException | SQLException | HeadlessException e) {
                      JOptionPane.showConfirmDialog(null, e);
                  }
            
            
            
            
        }
        else {
            camposObrigatorios.setText("*Todos campos sao obrigatorios");
        }
        
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSaque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel camposObrigatorios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtValorSaque;
    // End of variables declaration//GEN-END:variables
}
