package View;

import Controle.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class JDPesquisaBens extends javax.swing.JDialog {

    private DefaultTableModel modelo = new DefaultTableModel();
    private PreparedStatement ps;
    private Metodos m = new Metodos();
    private ResultSet rs;
    private Conexao co = new Conexao();
    private Connection con = Conexao.fazConexao();
    private int nivel, divisao, armario, ambiente, ni;
    private String bloco = "", unidade = "", div = "", am = "", ar = "";

    public JDPesquisaBens(java.awt.Frame parent, boolean modal, int nivel) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        m.listaBens(jTResultado);
        this.nivel = nivel;
        jTResultado.setAutoCreateRowSorter(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jBSair = new javax.swing.JButton();
        jPTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultado = new javax.swing.JTable();
        jLBusca = new javax.swing.JLabel();
        jCBBusca = new javax.swing.JComboBox();
        jTFPesquisa = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jChBUnidades = new javax.swing.JCheckBox();
        jCBUnidades = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Bens");

        jLTitulo.setBackground(new java.awt.Color(51, 51, 51));
        jLTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(0, 204, 51));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Senai - MT");

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jPTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado da Pesquisa"));

        jTResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Tipo", "Marca", "Modelo", "Patrimonio/N.I", "Valor", "Localização"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTResultado.getTableHeader().setReorderingAllowed(false);
        jTResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTResultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTResultado);
        if (jTResultado.getColumnModel().getColumnCount() > 0) {
            jTResultado.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTResultado.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTResultado.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTResultado.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTResultado.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTResultado.getColumnModel().getColumn(5).setPreferredWidth(70);
            jTResultado.getColumnModel().getColumn(7).setPreferredWidth(250);
        }

        javax.swing.GroupLayout jPTableLayout = new javax.swing.GroupLayout(jPTable);
        jPTable.setLayout(jPTableLayout);
        jPTableLayout.setHorizontalGroup(
            jPTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPTableLayout.setVerticalGroup(
            jPTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLBusca.setText("Pesquisar por:");

        jCBBusca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Descrição", "Marca", "Modelo", "Patrimonio/N.I", "Tipo", "Valor" }));
        jCBBusca.setSelectedIndex(-1);

        jTFPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFPesquisaKeyReleased(evt);
            }
        });

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jChBUnidades.setText("E por Unidade:");
        jChBUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBUnidadesActionPerformed(evt);
            }
        });

        jCBUnidades.setEnabled(false);

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                        .addGap(0, 943, Short.MAX_VALUE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jLBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jChBUnidades)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBUnidades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)))
                .addContainerGap())
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBPesquisar))
                    .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jChBUnidades)
                        .addComponent(jCBUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLBusca)
                        .addComponent(jCBBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        co.fechaConexao();
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jTResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadoMouseClicked
        if (evt.getClickCount() == 2 && (nivel == 0 || nivel == 2)) {
            int linhaSelecionada = jTResultado.getSelectedRow();
            if (m.contaChar(String.valueOf(jTResultado.getValueAt(linhaSelecionada, 7)), '-') == 5) {
                chamabens5();
            } else if (m.contaChar(String.valueOf(jTResultado.getValueAt(linhaSelecionada, 7)), '-') == 4) {
                chamabens4();
            } else if (m.contaChar(String.valueOf(jTResultado.getValueAt(linhaSelecionada, 7)), '-') == 3) {
                chamabens3();
            } else if (m.contaChar(String.valueOf(jTResultado.getValueAt(linhaSelecionada, 7)), '-') == 2) {
                chamabens2();
            }

        }
    }//GEN-LAST:event_jTResultadoMouseClicked

    private void jChBUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBUnidadesActionPerformed
        if (jChBUnidades.isSelected()) {
            jCBUnidades.setEnabled(true);
            m.carreagaCB("select * from unidades", "nome", jCBUnidades, "");
        } else {
            jCBUnidades.removeAllItems();
            jCBUnidades.setEnabled(false);
        }
    }//GEN-LAST:event_jChBUnidadesActionPerformed

    private void jTFPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesquisaKeyReleased
        if (evt.getKeyCode() == 10) {
            pesquisar();
        }
    }//GEN-LAST:event_jTFPesquisaKeyReleased

    void pesquisar() {
        String query = "select b.idben,b.descricao as ben ,b.tipo,b.marca, "
                + "b.modelo,b.patrimonio,b.valor,u.nome as unidade,b.iddivisao,\n"
                + "b.idarmario,b.idambiente,b.idbloco,bl.descricao as bloco from\n"
                + " bens as b,blocos as bl,unidades as u where b.idbloco = \n"
                + "bl.idbloco and bl.idunidade = u.idunidade and \n";
        int op = jCBBusca.getSelectedIndex();
        if (op == 0) {
            query += "b.descricao like '%" + jTFPesquisa.getText() + "%'";
            exibiresultado(query);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não há resultados!!!\n\nPesquise novamente.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (op == 1) {
            query += "b.marca like '%" + jTFPesquisa.getText() + "%'";
            exibiresultado(query);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não há resultados!!!\n\nPesquise novamente.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (op == 2) {
            query += "b.modelo like '%" + jTFPesquisa.getText() + "%'";
            exibiresultado(query);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não há resultados!!!\n\nPesquise novamente.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (op == 3) {
            query += "b.patrimonio like '%" + jTFPesquisa.getText() + "'";
            exibiresultado(query);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não há resultados!!!\n\nPesquise novamente.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (op == 4) {
            query += "b.tipo like '%" + jTFPesquisa.getText() + "%'";
            exibiresultado(query);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não há resultados!!!\n\nPesquise novamente.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (op == 5) {
            query += "b.valor like '%" + jTFPesquisa.getText() + "%'";
            exibiresultado(query);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Não há resultados!!!\n\nPesquise novamente.", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (op == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma opção para pesquisar!!!", "Pesquisa", JOptionPane.WARNING_MESSAGE);
        }
        if (jChBUnidades.isSelected()) {
            if (jCBUnidades.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Escolha a unidade!!!", "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                query += " and u.nome like '%" + jCBUnidades.getSelectedItem() + "%'";
                exibiresultado(query);
            }
        }
        System.out.println(query);

    }

    void chamabens5() {
        try {
            int linhaSelecionada = jTResultado.getSelectedRow();
            String id = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 0));
            String tipo = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 2));
            String descricao = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 1));
            String marca = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 3));
            String modelo = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 4));
            String patrimonio = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 5));
            String valor = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 6));
            String localizacao = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 7));
            String array[] = new String[5];
            array = localizacao.split(" - ");
            String divisao = array[0];
            String armario = array[1];
            String ambiente = array[2];
            String bloco = array[3];
            String unidade = array[4];
            ResultSet r;
            Conexao cn = new Conexao();
            PreparedStatement p;
            Connection c = cn.fazConexao();
            String sql = "select * from bens where patrimonio =  " + patrimonio;
            p = c.prepareStatement(sql);
            r = p.executeQuery();
            if (r.next()) {
                ni = r.getInt("ni");
            }
            dispose();
            JDManuBens b = new JDManuBens(null, true, id, tipo, descricao, marca, modelo, patrimonio, ni, valor, divisao, armario, ambiente, bloco, unidade, nivel);

            b.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o campo NI!!!\n\nErro: " + ex.getMessage());
        }
    }

    void chamabens4() {
        try {
            int linhaSelecionada = jTResultado.getSelectedRow();
            String id = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 0));
            String tipo = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 2));
            String descricao = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 1));
            String marca = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 3));
            String modelo = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 4));
            String patrimonio = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 5));
            String valor = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 6));
            String localizacao = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 7));
            String array[] = new String[5];
            array = localizacao.split(" - ");
            //String divisao = array[0];
            String armario = array[0];
            String ambiente = array[1];
            String bloco = array[2];
            String unidade = array[3];
            ResultSet r;
            Conexao cn = new Conexao();
            PreparedStatement p;
            Connection c = cn.fazConexao();
            String sql = "select * from bens where patrimonio =  " + patrimonio;
            p = c.prepareStatement(sql);
            r = p.executeQuery();
            if (r.next()) {
                ni = r.getInt("ni");
            }
            JDManuBens b = new JDManuBens(null, true, id, tipo, descricao, marca, modelo, patrimonio, ni, valor, " ", armario, ambiente, bloco, unidade, nivel);
            dispose();
            b.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o campo NI!!!\n\nErro: " + ex.getMessage());
        }
    }

    void chamabens3() {
        try {
            int linhaSelecionada = jTResultado.getSelectedRow();
            String id = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 0));
            String tipo = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 2));
            String descricao = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 1));
            String marca = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 3));
            String modelo = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 4));
            String patrimonio = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 5));
            String valor = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 6));
            String localizacao = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 7));
            String array[] = new String[5];
            array = localizacao.split(" - ");
            String ambiente = array[0];
            String bloco = array[1];
            String unidade = array[2];
            ResultSet r;
            Conexao cn = new Conexao();
            PreparedStatement p;
            Connection c = cn.fazConexao();
            String sql = "select * from bens where patrimonio =  " + patrimonio;
            p = c.prepareStatement(sql);
            r = p.executeQuery();
            if (r.next()) {
                ni = r.getInt("ni");
            }
            JDManuBens b = new JDManuBens(null, true, id, tipo, descricao, marca, modelo, patrimonio, ni, valor, " ", " ", ambiente, bloco, unidade, nivel);
            dispose();
            b.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o campo NI!!!\n\nErro: " + ex.getMessage());
        }
    }

    void chamabens2() {
        try {
            int linhaSelecionada = jTResultado.getSelectedRow();
            String id = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 0));
            String tipo = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 2));
            String descricao = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 1));
            String marca = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 3));
            String modelo = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 4));
            String patrimonio = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 5));
            String valor = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 6));
            String localizacao = String.valueOf(jTResultado.getValueAt(linhaSelecionada, 7));
            String array[] = new String[5];
            array = localizacao.split(" - ");
            //        String divisao = array[0];
            //          String armario = array[1];
//            String ambiente = array[2];
            String bloco = array[0];
            String unidade = array[1];

            ResultSet r;
            Conexao cn = new Conexao();
            PreparedStatement p;
            Connection c = cn.fazConexao();
            String sql = "select * from bens where patrimonio =  " + patrimonio;
            p = c.prepareStatement(sql);
            r = p.executeQuery();
            if (r.next()) {
                ni = r.getInt("ni");
            }
            JDManuBens b = new JDManuBens(null, true, id, tipo, descricao, marca, modelo, patrimonio, ni, valor, " ", " ", " ", bloco, unidade, nivel);
            dispose();
            b.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o campo NI!!!\n\nErro: " + ex.getMessage());
        }
    }

    void exibiresultado(String query) {
        modelo = (DefaultTableModel) jTResultado.getModel();
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            jTResultado.removeAll();
            for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            while (rs.next()) {
                divisao = rs.getInt("iddivisao");
                armario = rs.getInt("idarmario");
                ambiente = rs.getInt("idambiente");
                unidade = rs.getString("unidade");
                bloco = rs.getString("bloco");
                if (divisao == 0) {
                    div = "";
                } else {
                    div = m.getCampo("divisoes", "iddivisao", divisao, "descricao") + " - ";
                }
                if (armario == 0) {
                    ar = "";
                } else {
                    ar = m.getCampo("armarios", "idarmario", armario, "descricao") + " - ";
                }
                if (ambiente == 0) {
                    am = "";
                } else {
                    am = m.getCampo("ambientes", "idambiente", ambiente, "descricao") + " - ";
                }

                String[] dadosLinhas = {String.valueOf(rs.getInt("idben")),
                    rs.getString("ben"),
                    rs.getString("tipo"),
                    rs.getString("marca"),
                    rs.getString("modelo"),
                    rs.getString("patrimonio"),
                    rs.getString("valor"),
                    div + ar + am + bloco + " - " + unidade};
                modelo.addRow(dadosLinhas);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro de pesquisa!!!\n\nErro: " + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox jCBBusca;
    private javax.swing.JComboBox jCBUnidades;
    private javax.swing.JCheckBox jChBUnidades;
    private javax.swing.JLabel jLBusca;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFPesquisa;
    private javax.swing.JTable jTResultado;
    // End of variables declaration//GEN-END:variables
}
