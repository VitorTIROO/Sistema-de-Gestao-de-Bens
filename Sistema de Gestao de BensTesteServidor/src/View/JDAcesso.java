package View;

import Controle.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JDAcesso extends javax.swing.JDialog {

    PreparedStatement ps;
    ResultSet rs;
    Metodos m = new Metodos();
    Connection con = Conexao.fazConexao();
    DefaultTableModel modelo;

    public JDAcesso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        m.listaAcesso(jTAcesso);
        jPPesquisaAvancada.setVisible(false);
        setLocationRelativeTo(this);
        setResizable(false);
        jTAcesso.setAutoCreateRowSorter(true);
        select();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPPrincipal = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCBPesquisa = new javax.swing.JComboBox();
        jLPesquisa = new javax.swing.JLabel();
        jTFPesquisa = new javax.swing.JTextField();
        jTBPesquisaAvancada = new javax.swing.JToggleButton();
        jBPesquisar1 = new javax.swing.JButton();
        jPPesquisaAvancada = new javax.swing.JPanel();
        jCBUsuario = new javax.swing.JCheckBox();
        jTFHora = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jCBData = new javax.swing.JCheckBox();
        jTFData = new javax.swing.JTextField();
        jTFUsuario = new javax.swing.JTextField();
        jCBHora = new javax.swing.JCheckBox();
        jCBHoraSaida = new javax.swing.JCheckBox();
        jTFHoraSaida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAcesso = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acesso de Usuarios");

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Acesso de Usuarios");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Acesso"));

        jCBPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario", "Data", "Hora Entrada", "Hora Saida" }));
        jCBPesquisa.setSelectedIndex(-1);
        jCBPesquisa.setToolTipText("Selecione a opção de pesquisa");

        jLPesquisa.setText("Pesquisar por:");

        jTFPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFPesquisaKeyReleased(evt);
            }
        });

        jTBPesquisaAvancada.setText("Pesquisa Avançada ▼");
        jTBPesquisaAvancada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBPesquisaAvancadaActionPerformed(evt);
            }
        });

        jBPesquisar1.setText("Pesquisar");
        jBPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTBPesquisaAvancada)
                        .addGap(137, 137, 137)
                        .addComponent(jBPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPesquisa)
                    .addComponent(jCBPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTBPesquisaAvancada)
                    .addComponent(jBPesquisar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPPesquisaAvancada.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa Avançada"));

        jCBUsuario.setText("Usuario");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTFUsuario, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCBUsuario, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCBUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUsuarioActionPerformed(evt);
            }
        });

        jTFHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFHoraKeyReleased(evt);
            }
        });

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jCBData.setText("Data");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTFData, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCBData, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCBData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDataActionPerformed(evt);
            }
        });

        jTFData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFDataKeyReleased(evt);
            }
        });

        jTFUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFUsuarioKeyReleased(evt);
            }
        });

        jCBHora.setText("Hora");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTFHora, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCBHora, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCBHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBHoraActionPerformed(evt);
            }
        });

        jCBHoraSaida.setText("Hora Saida");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTFHoraSaida, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jCBHoraSaida, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCBHoraSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBHoraSaidaActionPerformed(evt);
            }
        });

        jTFHoraSaida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFHoraSaidaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPPesquisaAvancadaLayout = new javax.swing.GroupLayout(jPPesquisaAvancada);
        jPPesquisaAvancada.setLayout(jPPesquisaAvancadaLayout);
        jPPesquisaAvancadaLayout.setHorizontalGroup(
            jPPesquisaAvancadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPesquisaAvancadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPesquisaAvancadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPPesquisaAvancadaLayout.createSequentialGroup()
                        .addGroup(jPPesquisaAvancadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBHora)
                            .addComponent(jCBUsuario)
                            .addComponent(jCBData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPPesquisaAvancadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFData)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTFHora, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPPesquisaAvancadaLayout.createSequentialGroup()
                        .addComponent(jCBHoraSaida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFHoraSaida)))
                .addGap(18, 18, 18)
                .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPPesquisaAvancadaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFData, jTFUsuario});

        jPPesquisaAvancadaLayout.setVerticalGroup(
            jPPesquisaAvancadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPesquisaAvancadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPesquisaAvancadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBUsuario)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPesquisaAvancadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBData)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPesquisaAvancadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPesquisaAvancadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBHoraSaida)
                    .addComponent(jTFHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTAcesso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Data", "Hora Entrada", "Hora Saida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAcesso.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTAcesso);
        if (jTAcesso.getColumnModel().getColumnCount() > 0) {
            jTAcesso.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPPesquisaAvancada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPPesquisaAvancada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        pesquisaAvancada();
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jTFPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesquisaKeyReleased
        if (evt.getKeyCode() == 10) {
            pesquisar();
        }
    }//GEN-LAST:event_jTFPesquisaKeyReleased

    private void jBPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisar1ActionPerformed
        pesquisar();
    }//GEN-LAST:event_jBPesquisar1ActionPerformed

    private void jTBPesquisaAvancadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBPesquisaAvancadaActionPerformed
        if (jTBPesquisaAvancada.isSelected()) {
            jPPesquisaAvancada.setVisible(true);
            jTBPesquisaAvancada.setText("Pesquisa Avançada ▲");
            jLPesquisa.setEnabled(false);
            jCBPesquisa.setEnabled(false);
            jBPesquisar1.setEnabled(false);
            jTFPesquisa.setEnabled(false);
            jTFPesquisa.setText("");
        } else {
            jTBPesquisaAvancada.setText("Pesquisa Avançada ▼");
            jPPesquisaAvancada.setVisible(false);
            jLPesquisa.setEnabled(true);
            jCBPesquisa.setEnabled(true);
            jBPesquisar1.setEnabled(true);
            jTFPesquisa.setEnabled(true);
        }
    }//GEN-LAST:event_jTBPesquisaAvancadaActionPerformed

    private void jCBUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBUsuarioActionPerformed
        checkBox(jCBUsuario, jTFUsuario);
    }//GEN-LAST:event_jCBUsuarioActionPerformed

    private void jCBDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDataActionPerformed
        checkBox(jCBData, jTFData);
    }//GEN-LAST:event_jCBDataActionPerformed

    private void jCBHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBHoraActionPerformed
        checkBox(jCBHora, jTFHora);
    }//GEN-LAST:event_jCBHoraActionPerformed

    private void jTFUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsuarioKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_ENTER || evt.getKeyCode() == 10) {
            pesquisaAvancada();
        }
    }//GEN-LAST:event_jTFUsuarioKeyReleased

    private void jTFDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDataKeyReleased
        if (evt.getKeyCode() == 10) {
            pesquisaAvancada();
        }
    }//GEN-LAST:event_jTFDataKeyReleased

    private void jTFHoraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFHoraKeyReleased
        if (evt.getKeyCode() == 10) {
            pesquisaAvancada();
        }
    }//GEN-LAST:event_jTFHoraKeyReleased

    private void jCBHoraSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBHoraSaidaActionPerformed
        checkBox(jCBHoraSaida, jTFHoraSaida);
    }//GEN-LAST:event_jCBHoraSaidaActionPerformed

    private void jTFHoraSaidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFHoraSaidaKeyReleased
        if (evt.getKeyCode() == 10) {
            pesquisaAvancada();
        }
    }//GEN-LAST:event_jTFHoraSaidaKeyReleased
    void pesquisar() {
        int op = jCBPesquisa.getSelectedIndex();
        String sql = "select * from acess where ";
        if (op == 0) {
            sql += "usuario like '%" + jTFPesquisa.getText() + "%'";
            exibiresultado(sql);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não há resultados!!!\n\nPesquise novamente.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (op == 1) {
            sql += "dta like '%" + jTFPesquisa.getText() + "%'";
            exibiresultado(sql);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não há resultados!!!\n\nPesquise novamente.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (op == 2) {
            sql += "hora like '%" + jTFPesquisa.getText() + "%'";
            exibiresultado(sql);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não há resultados!!!\n\nPesquise novamente.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (op == 3) {
            sql += "horasaida like '%" + jTFPesquisa.getText() + "%'";
            exibiresultado(sql);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não há resultados!!!\n\nPesquise novamente.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (op == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma opção para pesquisar!!!", "Pesquisa", JOptionPane.WARNING_MESSAGE);
        }
        System.out.println(sql);
    }

    void pesquisaAvancada() {

        String sql = "select * from acess where "
                + "dta like '%" + jTFData.getText() + "%' and "
                + "hora like '%" + jTFHora.getText() + "%' and "
                + "usuario like '%" + jTFUsuario.getText() + "%'"
                + " and horasaida like '%" + jTFHoraSaida.getText() + "%'";
        exibiresultado(sql);
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Não há resultados!!!\n\nPesquise novamente.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    void exibiresultado(String query) {
        modelo = (DefaultTableModel) jTAcesso.getModel();
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            jTAcesso.removeAll();
            for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            while (rs.next()) {
                String[] dadosLinhas = {String.valueOf(rs.getInt("id")),
                    rs.getString("usuario"),
                    rs.getString("dta"),
                    rs.getString("hora"),
                    rs.getString("horasaida")};
                modelo.addRow(dadosLinhas);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro de pesquisa!!!\n\nErro: " + ex.getMessage());
        }
    }

    void checkBox(JCheckBox c, JTextField tf) {
        if (c.isSelected() == false) {
            tf.setText("");
        }
    }

    void select() {
        jCBData.setSelected(false);
        jCBHora.setSelected(false);
        jCBUsuario.setSelected(false);
        jCBHoraSaida.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBPesquisar1;
    private javax.swing.JCheckBox jCBData;
    private javax.swing.JCheckBox jCBHora;
    private javax.swing.JCheckBox jCBHoraSaida;
    private javax.swing.JComboBox jCBPesquisa;
    private javax.swing.JCheckBox jCBUsuario;
    private javax.swing.JLabel jLPesquisa;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPPesquisaAvancada;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAcesso;
    private javax.swing.JToggleButton jTBPesquisaAvancada;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFHora;
    private javax.swing.JTextField jTFHoraSaida;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTextField jTFUsuario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
