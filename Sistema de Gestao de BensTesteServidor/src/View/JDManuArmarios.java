package View;

import Bean.ArmariosBean;
import Controle.*;
import DAL.ArmariosDAL;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JDManuArmarios extends javax.swing.JDialog {

    ArmariosBean bean = new ArmariosBean();
    ArmariosDAL dal = new ArmariosDAL();
    Metodos m = new Metodos();
    private DefaultTableModel modeloTabela;
    private int idunidade, nivel;
    Conexao c = new Conexao();
    PreparedStatement ps;
    ResultSet rs;
    Connection con = c.fazConexao();

    public JDManuArmarios(java.awt.Frame parent, boolean modal, int nivel) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        this.nivel = nivel;
        setResizable(false);
        m.listaArmarios(jTArmarios);
        String sql = "select * from unidades";
        m.carreagaCB(sql, "nome", jCBUnidade, "");
        jTArmarios.setAutoCreateRowSorter(true);
        if (nivel == 2) {
            jBExcluir.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jPDadosBloco = new javax.swing.JPanel();
        jLID = new javax.swing.JLabel();
        jTFDescricao = new javax.swing.JTextField();
        jTFId = new javax.swing.JTextField();
        jLUnidade = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jCBAmbiente = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBBloco = new javax.swing.JComboBox();
        jCBUnidade = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTArmarios = new javax.swing.JTable();
        jBCadastrar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jBPesuisar = new javax.swing.JButton();
        jBListarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de Armarios");

        jPDadosBloco.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Bloco"));

        jLID.setText("ID:");

        jTFId.setEnabled(false);

        jLUnidade.setText("Ambiente:");

        jLDescricao.setText("Descrição:");

        jCBAmbiente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBAmbientePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel1.setText("Bloco:");

        jLabel2.setText("Unidade:");

        jCBBloco.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBBlocoPopupMenuWillBecomeVisible(evt);
            }
        });

        jCBUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUnidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDadosBlocoLayout = new javax.swing.GroupLayout(jPDadosBloco);
        jPDadosBloco.setLayout(jPDadosBlocoLayout);
        jPDadosBlocoLayout.setHorizontalGroup(
            jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                        .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLID)
                            .addComponent(jLUnidade))
                        .addGap(5, 5, 5)
                        .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                        .addComponent(jLDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addComponent(jCBBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPDadosBlocoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCBAmbiente, jCBBloco, jCBUnidade});

        jPDadosBlocoLayout.setVerticalGroup(
            jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUnidade)
                    .addComponent(jCBAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescricao)
                    .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTArmarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Ambiente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTArmarios.getTableHeader().setReorderingAllowed(false);
        jTArmarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTArmariosMouseReleased(evt);
            }
        });
        jTArmarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTArmariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTArmarios);
        if (jTArmarios.getColumnModel().getColumnCount() > 0) {
            jTArmarios.getColumnModel().getColumn(0).setMinWidth(40);
            jTArmarios.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTArmarios.getColumnModel().getColumn(0).setMaxWidth(80);
            jTArmarios.getColumnModel().getColumn(2).setPreferredWidth(200);
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
        jLTitulo.setText("Manutenção de Armarios");

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

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jPDadosBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jBCadastrar)
                        .addGap(10, 10, 10)
                        .addComponent(jBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBExcluir)
                        .addGap(14, 14, 14)
                        .addComponent(jBLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBPesuisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBListarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(jBSair)))
                .addContainerGap())
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBEditar, jBExcluir, jBLimpar, jBSair});

        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPDadosBloco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSair)
                    .addComponent(jBCadastrar)
                    .addComponent(jBEditar)
                    .addComponent(jBExcluir)
                    .addComponent(jBLimpar)
                    .addComponent(jBPesuisar)
                    .addComponent(jBListarTodos))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        if (jTFDescricao.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha a Descrição!!!");
        } else if (jCBAmbiente.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Ambiente!!!");
        } else {
            cadastrar();

        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        if (jTFId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um Armario para ser editado!!!");
        } else {
            editar();
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        if (jTFId.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Selecione um Armario para ser excluido!!!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir '" + jTFDescricao.getText() + "' ?", "Excluir Armario", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                bean.setId(Integer.parseInt(jTFId.getText()));
                dal.excluir(bean);
                m.listaArmarios(jTArmarios);
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

    private void jTArmariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTArmariosMouseReleased
        setaCampos();
    }//GEN-LAST:event_jTArmariosMouseReleased

    private void jTArmariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTArmariosKeyReleased
        setaCampos();
    }//GEN-LAST:event_jTArmariosKeyReleased

    private void jBPesuisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesuisarActionPerformed
        if (jTFDescricao.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Digite a descrição para pesquisar!!!");
        } else if (jCBAmbiente.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Ambiente!!!");
        } else if (jCBBloco.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Bloco!!!");
        } else if (jCBUnidade.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha a Unidade!!!");
        } else {
            listaPesquisa();
        }
    }//GEN-LAST:event_jBPesuisarActionPerformed

    private void jBListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarTodosActionPerformed
        m.listaArmarios(jTArmarios);
    }//GEN-LAST:event_jBListarTodosActionPerformed

    private void jCBBlocoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBBlocoPopupMenuWillBecomeVisible
        carregaBloco();
    }//GEN-LAST:event_jCBBlocoPopupMenuWillBecomeVisible

    private void jCBAmbientePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBAmbientePopupMenuWillBecomeVisible
        carregaAmbiente();
    }//GEN-LAST:event_jCBAmbientePopupMenuWillBecomeVisible

    private void jCBUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBUnidadeActionPerformed
        jCBBloco.removeAllItems();
        jCBAmbiente.removeAllItems();
    }//GEN-LAST:event_jCBUnidadeActionPerformed
    void carregaBloco() {
        String sql = "select * from blocos as b,unidades as u "
                + "where b.idunidade=u.idunidade and u.nome = '" + jCBUnidade.getSelectedItem() + "'";

        m.carreagaCB(sql, "descricao", jCBBloco, "");
    }

    void carregaAmbiente() {
        idunidade = m.getId("unidades", "nome", String.valueOf(jCBUnidade.getSelectedItem()), "idunidade");
        String sql = "SELECT a.descricao as ambientes,u.nome as unidade"
                + " from ambientes as a,blocos as b,unidades as u where"
                + " a.idbloco = b.idbloco and b.idunidade = u.idunidade and"
                + " b.descricao = '" + jCBBloco.getSelectedItem() + "' and u.idunidade = " + idunidade;

        m.carreagaCB(sql, "ambientes", jCBAmbiente, "Não Existe");
    }

    void listaPesquisa() {
        String sql = "select ar.idarmario, ar.descricao as armario , "
                + "a.idambiente,a.descricao as ambientes,b.descricao as bloco,u.nome as unidades "
                + "from armarios as ar,ambientes AS a,blocos AS b, "
                + "unidades as u WHERE ar.idambiente=a.idambiente "
                + "and  a.idbloco = b.idbloco and b.idunidade = u.idunidade "
                + "and ar.descricao like '%" + jTFDescricao.getText() + "%' and a.descricao like '%"
                + jCBAmbiente.getSelectedItem() + "%' and b.descricao like '%blo%' "
                + "and u.nome like '%" + jCBUnidade.getSelectedItem() + "%'";
        modeloTabela = (DefaultTableModel) jTArmarios.getModel();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            jTArmarios.removeAll();
            for (int i = modeloTabela.getRowCount() - 1; i >= 0; i--) {
                modeloTabela.removeRow(i);
            }
            while (rs.next()) {
                String bloco = rs.getString("bloco");
                String unidade = rs.getString("unidades");
                String ambiente = rs.getString("ambientes");

                String[] dadosLinhas = {String.valueOf(rs.getInt("idarmario")),
                    rs.getString("armario"), ambiente + " - " + bloco + " - " + unidade};
                modeloTabela.addRow(dadosLinhas);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar Armarios!!!\n\nErro: " + ex.getMessage());
        }
    }

    void limpar() {
        jTFId.setText("");
        jTFDescricao.setText("");
        jCBAmbiente.removeAllItems();
        jCBBloco.removeAllItems();
        jCBUnidade.setSelectedIndex(-1);

    }

    void setaCampos() {
        DefaultTableModel modeloTabela = (DefaultTableModel) jTArmarios.getModel();
        int linhaselecionada = jTArmarios.getSelectedRow();
        String codigoLinha = (String) modeloTabela.getValueAt(jTArmarios.getSelectedRow(), 0);

        String array[] = new String[3];
        String localizacao = String.valueOf(jTArmarios.getValueAt(linhaselecionada, 2));
        array = localizacao.split(" - ");
        String ambi = array[0];
        String bloco = array[1];
        String unidade = array[2];
        String bl = bloco.substring(1);

        jTFId.setText(String.valueOf(jTArmarios.getValueAt(linhaselecionada, 0)));
        jTFDescricao.setText(String.valueOf(jTArmarios.getValueAt(linhaselecionada, 1)));
        jCBUnidade.setSelectedItem(unidade);
        carregaBloco();
        jCBBloco.setSelectedItem(bloco);
        carregaAmbiente();
        jCBAmbiente.setSelectedItem(ambi);
    }

    void cadastrar() {
        String sql = "select a.idambiente,a.descricao as ambiente,"
                + "b.idbloco,b.descricao as bloco,u.idunidade,u.nome as unidade from "
                + " ambientes a,blocos as b,unidades as u "
                + " where a.idbloco = b.idbloco "
                + " and b.idunidade = u.idunidade and u.nome = '" + jCBUnidade.getSelectedItem() + "' and "
                + " b.descricao = '" + jCBBloco.getSelectedItem() + "' "
                + " and a.descricao = '" + jCBAmbiente.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                bean.setIdambiente(rs.getInt("idambiente"));
            }
            bean.setNome(jTFDescricao.getText());
            dal.cadastrar(bean);
            m.listaArmarios(jTArmarios);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o ID do Ambiente!!!\n\nErro: " + ex.getMessage());
        }
    }

    void editar() {
        String sql = "select a.idambiente,a.descricao as ambiente,"
                + "b.idbloco,b.descricao as bloco,u.idunidade,u.nome as unidade from "
                + " ambientes a,blocos as b,unidades as u "
                + " where a.idbloco = b.idbloco "
                + " and b.idunidade = u.idunidade and u.nome = '" + jCBUnidade.getSelectedItem() + "' and "
                + " b.descricao = '" + jCBBloco.getSelectedItem() + "' "
                + " and a.descricao = '" + jCBAmbiente.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                bean.setIdambiente(rs.getInt("idambiente"));
                bean.setId(Integer.parseInt(jTFId.getText()));
            }
            bean.setNome(jTFDescricao.getText());
            dal.editar(bean);
            m.listaArmarios(jTArmarios);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o ID do Ambiente!!!\n\nErro: " + ex.getMessage());
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
    private javax.swing.JComboBox jCBAmbiente;
    private javax.swing.JComboBox jCBBloco;
    private javax.swing.JComboBox jCBUnidade;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPDadosBloco;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTArmarios;
    private javax.swing.JTextField jTFDescricao;
    private javax.swing.JTextField jTFId;
    // End of variables declaration//GEN-END:variables
}
