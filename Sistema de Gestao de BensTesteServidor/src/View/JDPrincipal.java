package View;

import Controle.*;
import java.sql.*;
import java.text.*;
import java.util.Date;
import javax.swing.*;

public class JDPrincipal extends javax.swing.JFrame {

    private int nivel, id;

    public JDPrincipal(int nivel, String nome) {
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        this.nivel = nivel;
        setExtendedState(MAXIMIZED_BOTH);
        if (nivel == 1) {
            jMManutencoes.setVisible(false);
            jMIAcesso.setVisible(false);

        } else if (nivel == 2) {
            jMIManuUser.setVisible(false);
            jMIAcesso.setVisible(false);
        }
        jLUsuario.setText(nome + "  ");
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer = new org.netbeans.examples.lib.timerbean.Timer();
        jTBBarraDeStatus = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLHora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMSistema = new javax.swing.JMenu();
        jMIMapa = new javax.swing.JMenuItem();
        jMIPesquisar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMIRelatorios = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMILogoff = new javax.swing.JMenuItem();
        jMIAcesso = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMISair = new javax.swing.JMenuItem();
        jMManutencoes = new javax.swing.JMenu();
        jMIManuUnidades = new javax.swing.JMenuItem();
        jMIManuBlocos = new javax.swing.JMenuItem();
        jMIManuAmbientes = new javax.swing.JMenuItem();
        jMIArmarios = new javax.swing.JMenuItem();
        jMIDivisoes = new javax.swing.JMenuItem();
        jMIManuBens = new javax.swing.JMenuItem();
        jMIManuUser = new javax.swing.JMenuItem();
        jMAjuda = new javax.swing.JMenu();
        jMISobre = new javax.swing.JMenuItem();
        jMIExibiAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SRBP - Sistema de Rastreabilidade de Bens Patimoniais");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTBBarraDeStatus.setBackground(new java.awt.Color(255, 255, 255));
        jTBBarraDeStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTBBarraDeStatus.setFloatable(false);
        jTBBarraDeStatus.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Usuario: ");
        jTBBarraDeStatus.add(jLabel1);

        jLUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLUsuario.setText("Nome do Usúario");
        jTBBarraDeStatus.add(jLUsuario);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Data: ");
        jTBBarraDeStatus.add(jLabel2);

        jLData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLData.setText("Data Atual");
        jTBBarraDeStatus.add(jLData);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Hora: ");
        jTBBarraDeStatus.add(jLabel3);

        jLHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLHora.setText("Hora Atual");
        jTBBarraDeStatus.add(jLHora);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo oc - full_1.JPG"))); // NOI18N

        jMSistema.setText("Sistema");

        jMIMapa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMIMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/map-32.png"))); // NOI18N
        jMIMapa.setText("Mapa da Unidade");
        jMIMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMapaActionPerformed(evt);
            }
        });
        jMSistema.add(jMIMapa);

        jMIPesquisar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMIPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/11362_32x32.png"))); // NOI18N
        jMIPesquisar.setText("Pesquisar Bens");
        jMIPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesquisarActionPerformed(evt);
            }
        });
        jMSistema.add(jMIPesquisar);
        jMSistema.add(jSeparator3);

        jMIRelatorios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMIRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Relat.png"))); // NOI18N
        jMIRelatorios.setText("Relatorios");
        jMIRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRelatoriosActionPerformed(evt);
            }
        });
        jMSistema.add(jMIRelatorios);
        jMSistema.add(jSeparator2);

        jMILogoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMILogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logout-icon.png"))); // NOI18N
        jMILogoff.setText("Logoff");
        jMILogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMILogoffActionPerformed(evt);
            }
        });
        jMSistema.add(jMILogoff);

        jMIAcesso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMIAcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/access.png"))); // NOI18N
        jMIAcesso.setText("Acesso");
        jMIAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAcessoActionPerformed(evt);
            }
        });
        jMSistema.add(jMIAcesso);
        jMSistema.add(jSeparator1);

        jMISair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMISair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exit (1).png"))); // NOI18N
        jMISair.setText("Encerrar");
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMSistema.add(jMISair);

        jMenuBar.add(jMSistema);

        jMManutencoes.setText("Manutenções");

        jMIManuUnidades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMIManuUnidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home-icon (2).png"))); // NOI18N
        jMIManuUnidades.setText("Manutenção de Unidades");
        jMIManuUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIManuUnidadesActionPerformed(evt);
            }
        });
        jMManutencoes.add(jMIManuUnidades);

        jMIManuBlocos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMIManuBlocos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/blockdevice.png"))); // NOI18N
        jMIManuBlocos.setText("Manutenção de Blocos");
        jMIManuBlocos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIManuBlocosActionPerformed(evt);
            }
        });
        jMManutencoes.add(jMIManuBlocos);

        jMIManuAmbientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMIManuAmbientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/students3.png"))); // NOI18N
        jMIManuAmbientes.setText("Manutenção de Ambientes");
        jMIManuAmbientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIManuAmbientesActionPerformed(evt);
            }
        });
        jMManutencoes.add(jMIManuAmbientes);

        jMIArmarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMIArmarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cabinet (8).png"))); // NOI18N
        jMIArmarios.setText("Manutenção de Armarios");
        jMIArmarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIArmariosActionPerformed(evt);
            }
        });
        jMManutencoes.add(jMIArmarios);

        jMIDivisoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMIDivisoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/library.png"))); // NOI18N
        jMIDivisoes.setText("Manutenção de Divisões");
        jMIDivisoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIDivisoesActionPerformed(evt);
            }
        });
        jMManutencoes.add(jMIDivisoes);

        jMIManuBens.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMIManuBens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/maintenance-icon (9).png"))); // NOI18N
        jMIManuBens.setText("Manutenção de Bens");
        jMIManuBens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIManuBensActionPerformed(evt);
            }
        });
        jMManutencoes.add(jMIManuBens);

        jMIManuUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMIManuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/11725_32x32.png"))); // NOI18N
        jMIManuUser.setText("Manutenção de Usuarios");
        jMIManuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIManuUserActionPerformed(evt);
            }
        });
        jMManutencoes.add(jMIManuUser);

        jMenuBar.add(jMManutencoes);

        jMAjuda.setText("Ajuda");

        jMISobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMISobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/info.png"))); // NOI18N
        jMISobre.setText("Sobre");
        jMISobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISobreActionPerformed(evt);
            }
        });
        jMAjuda.add(jMISobre);

        jMIExibiAjuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMIExibiAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/11676_32x32.png"))); // NOI18N
        jMIExibiAjuda.setText("Exibir Ajuda");
        jMAjuda.add(jMIExibiAjuda);

        jMenuBar.add(jMAjuda);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTBBarraDeStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 477, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jTBBarraDeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMIManuBensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManuBensActionPerformed
        JDManuBens cadastro = new JDManuBens(this, true, "-1", "", "", "", "", "", 0, "", "", "", "", "", "", nivel);
        cadastro.show();
    }//GEN-LAST:event_jMIManuBensActionPerformed

    private void jMIManuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManuUserActionPerformed

        JDManuUsuario user = new JDManuUsuario(null, true, nivel);
        user.setVisible(true);

    }//GEN-LAST:event_jMIManuUserActionPerformed

    private void timerOnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerOnTime
        setaDataHora();
    }//GEN-LAST:event_timerOnTime

    private void jMIManuUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManuUnidadesActionPerformed
        JDManuUnidade uni = new JDManuUnidade(null, true, nivel);
        uni.setVisible(true);
    }//GEN-LAST:event_jMIManuUnidadesActionPerformed

    private void jMIManuBlocosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManuBlocosActionPerformed
        JDManuBloco b = new JDManuBloco(null, true, nivel);
        b.setVisible(true);
    }//GEN-LAST:event_jMIManuBlocosActionPerformed

    private void jMIManuAmbientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManuAmbientesActionPerformed
        JDManuAmbientes a = new JDManuAmbientes(null, true, nivel);
        a.setVisible(true);
    }//GEN-LAST:event_jMIManuAmbientesActionPerformed

    private void jMIArmariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIArmariosActionPerformed
        JDManuArmarios ar = new JDManuArmarios(null, true, nivel);
        ar.setVisible(true);
    }//GEN-LAST:event_jMIArmariosActionPerformed

    private void jMIDivisoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIDivisoesActionPerformed
        JDManuDivisoes d = new JDManuDivisoes(null, true, nivel);
        d.setVisible(true);
    }//GEN-LAST:event_jMIDivisoesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(null, "Deseja Mesmo Sair do Sistema?", "Sair do Sistema",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            acesso();
            System.exit(0);
        } else {
            setDefaultCloseOperation(JDPrincipal.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMISobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISobreActionPerformed
        JDSobre s = new JDSobre(null, true);
        s.setVisible(true);
    }//GEN-LAST:event_jMISobreActionPerformed

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISairActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja Mesmo Sair do Sistema?", "Sair do Sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            acesso();
            System.exit(0);
        }
    }//GEN-LAST:event_jMISairActionPerformed

    private void jMILogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMILogoffActionPerformed
        dispose();
        JDLogin login = new JDLogin(null, true);
        login.setVisible(true);
    }//GEN-LAST:event_jMILogoffActionPerformed

    private void jMIRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRelatoriosActionPerformed
        JFRelatorio r = new JFRelatorio();
        r.setVisible(true);
    }//GEN-LAST:event_jMIRelatoriosActionPerformed

    private void jMIPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesquisarActionPerformed
        JDPesquisaBens p = new JDPesquisaBens(this, true, nivel);
        p.setVisible(true);
    }//GEN-LAST:event_jMIPesquisarActionPerformed

    private void jMIMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMapaActionPerformed
        JDMap m = new JDMap(null, true);
        m.setVisible(true);
    }//GEN-LAST:event_jMIMapaActionPerformed

    private void jMIAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAcessoActionPerformed
        JDAcesso a = new JDAcesso(null, true);
        a.setVisible(true);
    }//GEN-LAST:event_jMIAcessoActionPerformed
    public void setaDataHora() {
        Date data = new Date();
        SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hformata = new SimpleDateFormat("HH:mm:ss");
        jLData.setText(formata.format(data) + "  ");
        jLHora.setText(hformata.format(data));

    }

    public void acesso() {
        try {

            PreparedStatement pst;
            ResultSet rs;
            Connection cx = Conexao.fazConexao();
            pst = cx.prepareStatement("select max(id) as id from acess");
            rs = pst.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
                //JOptionPane.showMessageDialog(null, id);
            }

            PreparedStatement pt;
            ResultSet r;
            Connection c = Conexao.fazConexao();
            String s = "UPDATE acess SET dta = ?,horasaida = ? WHERE id = " + id;
            pt = c.prepareStatement(s);
            //pt.setString(1, nomePrimeiro);
            pt.setString(1, jLData.getText());
            pt.setString(2, jLHora.getText());
            pt.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o acesso!!!\n\nErro: " + ex.getMessage());
        }
    }
    
    /*public static void main(String args[]){
        new JDPrincipal(0, "Vitor").setVisible(true);
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLHora;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMAjuda;
    private javax.swing.JMenuItem jMIAcesso;
    private javax.swing.JMenuItem jMIArmarios;
    private javax.swing.JMenuItem jMIDivisoes;
    private javax.swing.JMenuItem jMIExibiAjuda;
    private javax.swing.JMenuItem jMILogoff;
    private javax.swing.JMenuItem jMIManuAmbientes;
    private javax.swing.JMenuItem jMIManuBens;
    private javax.swing.JMenuItem jMIManuBlocos;
    private javax.swing.JMenuItem jMIManuUnidades;
    private javax.swing.JMenuItem jMIManuUser;
    private javax.swing.JMenuItem jMIMapa;
    private javax.swing.JMenuItem jMIPesquisar;
    private javax.swing.JMenuItem jMIRelatorios;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JMenuItem jMISobre;
    private javax.swing.JMenu jMManutencoes;
    private javax.swing.JMenu jMSistema;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jTBBarraDeStatus;
    private org.netbeans.examples.lib.timerbean.Timer timer;
    // End of variables declaration//GEN-END:variables

}
