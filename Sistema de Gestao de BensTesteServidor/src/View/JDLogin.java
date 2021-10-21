package View;

import Controle.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class JDLogin extends javax.swing.JDialog {

    PreparedStatement ps;
    Conexao conexao = new Conexao();
    Connection con = conexao.fazConexao();
    ResultSet rs;
    private int nivel, cont = 0;
    private String nome;
    private String data, hora;

    public JDLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBEntrar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLDicaSenha = new javax.swing.JLabel();
        jTFLogin = new javax.swing.JTextField();
        jPFSenha = new javax.swing.JPasswordField();
        jLLogin = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Bens Patrimoniais - Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jBEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        jBEntrar.setText("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });

        jBCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jBCancelar.setText("Sair");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLDicaSenha.setBackground(new java.awt.Color(255, 0, 51));
        jLDicaSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTFLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPFSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPFSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPFSenhaKeyReleased(evt);
            }
        });

        jLLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLLogin.setText("Login:");

        jLSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLSenha.setText("Senha:");

        jLTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SENAI1.png"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadeado_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jBEntrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLLogin)
                        .addGap(11, 11, 11)
                        .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLDicaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLLogin)
                            .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLDicaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBEntrar)
                            .addComponent(jBCancelar)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBCancelar, jBEntrar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        conexao.fechaConexao();
        System.exit(0);
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jPFSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFSenhaKeyReleased
        if (evt.getKeyCode() == 10) {
            entrar();
        }
    }//GEN-LAST:event_jPFSenhaKeyReleased

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        entrar();
    }//GEN-LAST:event_jBEntrarActionPerformed
    
    private void entrar() {
        String sql = "select * from usuarios WHERE login = ? and senha = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, jTFLogin.getText());
            ps.setString(2, jPFSenha.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                nivel = rs.getInt("nivel");
                nome = rs.getString("nome");
                JDPrincipal p = new JDPrincipal(nivel, nome);
                dispose();
                p.setVisible(true);
                acesso();
                conexao.fechaConexao();
            } else {
                cont = cont + 1;
                String di = "select * from usuarios where login = ?";
                ps = con.prepareStatement(di);
                ps.setString(1, jTFLogin.getText());
                rs = ps.executeQuery();
                if (rs.next()) {
                    jLDicaSenha.setText(rs.getString("dicasenha"));
                    JOptionPane.showMessageDialog(null, "Senha Incorreta!!!");
                    jPFSenha.requestFocus();
                    jPFSenha.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário não existe!!!");
                }
                if (cont == 3) {
                    System.exit(0);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se logar!!!\n\nErro: " + ex.getMessage());
        }
    }

    private void acesso() {
        try {
            PreparedStatement pt;
            ResultSet r;
            Connection c = Conexao.fazConexao();
            String s = "INSERT INTO acess (usuario,dta,hora,horasaida) VALUES (?,?,?,?)";
            java.util.Date data = new java.util.Date();
            SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat hformata = new SimpleDateFormat("HH:mm:ss");

            pt = c.prepareStatement(s);
            pt.setString(1, jTFLogin.getText());
            pt.setString(2, formata.format(data) + "  ");
            pt.setString(3, hformata.format(data));
            pt.setString(4, "Ainda Está Logado");
            pt.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o acesso!!!\n\nErro: " + ex.getMessage());
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDLogin dialog = new JDLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLDicaSenha;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFLogin;
    // End of variables declaration//GEN-END:variables
}
