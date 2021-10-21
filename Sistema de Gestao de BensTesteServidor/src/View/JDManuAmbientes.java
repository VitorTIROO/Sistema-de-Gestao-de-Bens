package View;

import Bean.AmbientesBean;
import Controle.*;
import DAL.AmbientesDAL;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDManuAmbientes extends javax.swing.JDialog {

    private AmbientesBean bean = new AmbientesBean();
    private AmbientesDAL dal = new AmbientesDAL();
    private Metodos m = new Metodos();
    private DefaultTableModel modeloTabela;
    private String codigoLinha;
    private int idunidade = 0, nivel;
    Conexao c = new Conexao();
    PreparedStatement ps;
    ResultSet rs;
    Connection con = c.fazConexao();

    public JDManuAmbientes(java.awt.Frame parent, boolean modal, int nivel) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        this.nivel = nivel;
        setResizable(false);
        m.listaAmbientes(jTAmbiente);
        String sql = "select * from unidades";
        m.carreagaCB(sql, "nome", jCBUnidades, "");
        jTAmbiente.setAutoCreateRowSorter(true);
        if (nivel == 2) {
            jBExcluir.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPDadosBloco = new javax.swing.JPanel();
        jLID = new javax.swing.JLabel();
        jTFDescricao = new javax.swing.JTextField();
        jTFId = new javax.swing.JTextField();
        jLUnidade = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jCBBloco = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jCBUnidades = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAmbiente = new javax.swing.JTable();
        jBCadastrar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jBPesuisar = new javax.swing.JButton();
        jBListarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de Ambientes");

        jPDadosBloco.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Bloco"));

        jLID.setText("ID:");

        jTFId.setEnabled(false);

        jLUnidade.setText("Bloco:");

        jLDescricao.setText("Descrição:");

        jCBBloco.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBBlocoPopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel1.setText("Unidade:");

        javax.swing.GroupLayout jPDadosBlocoLayout = new javax.swing.GroupLayout(jPDadosBloco);
        jPDadosBloco.setLayout(jPDadosBlocoLayout);
        jPDadosBlocoLayout.setHorizontalGroup(
            jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                        .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                                .addComponent(jLID)
                                .addGap(39, 39, 39)
                                .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                                .addComponent(jLUnidade)
                                .addGap(25, 25, 25)
                                .addComponent(jCBBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                        .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                                .addComponent(jLDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBUnidades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(35, 35, 35)))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        jPDadosBlocoLayout.setVerticalGroup(
            jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUnidade)
                    .addComponent(jCBBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescricao)
                    .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTAmbiente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Bloco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAmbiente.getTableHeader().setReorderingAllowed(false);
        jTAmbiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTAmbienteMouseReleased(evt);
            }
        });
        jTAmbiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTAmbienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTAmbiente);
        if (jTAmbiente.getColumnModel().getColumnCount() > 0) {
            jTAmbiente.getColumnModel().getColumn(0).setMinWidth(40);
            jTAmbiente.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTAmbiente.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBEditar.setText("Editar");
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Manutenção de Ambientes");

        jBPesuisar.setText("Pesquisar");
        jBPesuisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesuisarActionPerformed(evt);
            }
        });

        jBListarTodos.setText("Listar Todos");
        jBListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPDadosBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBCadastrar)
                        .addGap(10, 10, 10)
                        .addComponent(jBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBPesuisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBListarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(jBSair)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBEditar, jBExcluir, jBLimpar, jBSair});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPDadosBloco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSair)
                    .addComponent(jBCadastrar)
                    .addComponent(jBEditar)
                    .addComponent(jBExcluir)
                    .addComponent(jBLimpar)
                    .addComponent(jBPesuisar)
                    .addComponent(jBListarTodos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        if (jTFDescricao.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha a Descrição!!!");
        } else if (jCBUnidades.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha a Unidade!!!");
        } else if (jCBBloco.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Bloco!!!");
        } else {
            cadastar();
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        if (jTFId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um Ambiente para ser editado!!!");
        } else {
            editar();
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        if (jTFId.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Selecione um Ambiente para ser excluido!!!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir '" + jTFDescricao.getText() + "' ?", "Excluir Ambiente", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                bean.setId(Integer.parseInt(jTFId.getText()));
                dal.excluir(bean);
                m.listaAmbientes(jTAmbiente);
                limpar();
            }
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        c.fechaConexao();
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jTAmbienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAmbienteKeyReleased
        setaCampos();
    }//GEN-LAST:event_jTAmbienteKeyReleased

    private void jTAmbienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAmbienteMouseReleased
        setaCampos();
    }//GEN-LAST:event_jTAmbienteMouseReleased

    private void jCBBlocoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBBlocoPopupMenuWillBecomeVisible
        carregaCbBloco();
    }//GEN-LAST:event_jCBBlocoPopupMenuWillBecomeVisible

    private void jBListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarTodosActionPerformed
        m.listaAmbientes(jTAmbiente);
    }//GEN-LAST:event_jBListarTodosActionPerformed

    private void jBPesuisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesuisarActionPerformed
        if (jTFDescricao.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Digite a descrição para pesquisar!!!");
        } else if (jCBBloco.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Bloco!!!");
        } else if (jCBUnidades.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha a Unidade!!!");
        } else {
            listaPesquisa();
        }
    }//GEN-LAST:event_jBPesuisarActionPerformed
    void listaPesquisa() {
        String sql = "select a.idambiente,a.descricao,b.descricao as bloco,u.nome from "
                + "ambientes AS a,blocos AS b,unidades as u "
                + "WHERE a.idbloco = b.idbloco and b.idunidade = u.idunidade and "
                + "a.descricao like '%" + jTFDescricao.getText() + "%' and "
                + " b.descricao = '" + jCBBloco.getSelectedItem() + "' and"
                + " u.nome = '" + jCBUnidades.getSelectedItem() + "'";
        modeloTabela = (DefaultTableModel) jTAmbiente.getModel();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            jTAmbiente.removeAll();
            for (int i = modeloTabela.getRowCount() - 1; i >= 0; i--) {
                modeloTabela.removeRow(i);
            }
            while (rs.next()) {
                String bloco = rs.getString("bloco");
                String unidade = rs.getString("nome");

                String[] dadosLinhas = {String.valueOf(rs.getInt("idambiente")),
                    rs.getString("descricao"), bloco + " - " + unidade};
                modeloTabela.addRow(dadosLinhas);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar Ambientes!!!\n\nErro: " + ex.getMessage());
        }
    }

    void limpar() {
        jTFId.setText("");
        jTFDescricao.setText("");
        jCBBloco.removeAllItems();
        jCBUnidades.setSelectedIndex(-1);
        jCBBloco.setSelectedIndex(-1);
    }

    void setaCampos() {
        modeloTabela = (DefaultTableModel) jTAmbiente.getModel();
        int linhaselecionada = jTAmbiente.getSelectedRow();
        codigoLinha = (String) modeloTabela.getValueAt(jTAmbiente.getSelectedRow(), 0);
        String localizacao = String.valueOf(jTAmbiente.getValueAt(linhaselecionada, 2));
        String array[] = new String[2];
        array = localizacao.split(" - ");

        String unidade = array[1];
        String bloco = array[0];

        jTFId.setText(String.valueOf(jTAmbiente.getValueAt(linhaselecionada, 0)));
        jTFDescricao.setText(String.valueOf(jTAmbiente.getValueAt(linhaselecionada, 1)));
        jCBUnidades.setSelectedItem(unidade);
        carregaCbBloco();
        jCBBloco.setSelectedItem(bloco);
    }

    void carregaCbBloco() {
        idunidade = m.getId("unidades", "nome", String.valueOf(this.jCBUnidades.getSelectedItem()), "idunidade");
        String sql = "select b.descricao from unidades as a,blocos as b "
                + "where a.idunidade = b.idunidade and b.idunidade = " + idunidade;
        m.carreagaCB(sql, "descricao", jCBBloco, "");
    }

    void editar() {
        String sql = "select b.idbloco,b.descricao,u.idunidade,u.nome from blocos as b,unidades as u "
                + "where b.idunidade = u.idunidade "
                + "and u.nome = '" + jCBUnidades.getSelectedItem() + "'and"
                + " b.descricao = '" + jCBBloco.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                bean.setIdbloco(Integer.parseInt(rs.getString("idbloco")));
            }
            bean.setNome(jTFDescricao.getText());
            bean.setId(Integer.parseInt(jTFId.getText()));
            dal.editar(bean);
            m.listaAmbientes(jTAmbiente);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar id do Bloco!!!\n\nErro: " + ex.getMessage());
        }
    }

    void cadastar() {
        String sql = "select b.idbloco,b.descricao,u.idunidade,u.nome from blocos as b,unidades as u "
                + "where b.idunidade = u.idunidade "
                + "and u.nome = '" + jCBUnidades.getSelectedItem() + "'and"
                + " b.descricao = '" + jCBBloco.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                bean.setIdbloco(Integer.parseInt(rs.getString("idbloco")));
            }
            bean.setNome(jTFDescricao.getText());

            dal.cadastrar(bean);
            m.listaAmbientes(jTAmbiente);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar id do Bloco!!!\n\nErro: " + ex.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBListarTodos;
    private javax.swing.JButton jBPesuisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox jCBBloco;
    private javax.swing.JComboBox jCBUnidades;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPDadosBloco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAmbiente;
    private javax.swing.JTextField jTFDescricao;
    private javax.swing.JTextField jTFId;
    // End of variables declaration//GEN-END:variables
}
