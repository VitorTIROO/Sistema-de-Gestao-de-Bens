package View;

import Bean.DivisoesBean;
import Controle.*;
import DAL.DivisoesDAL;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class JDManuDivisoes extends javax.swing.JDialog {

    DivisoesBean bean = new DivisoesBean();
    DivisoesDAL dal = new DivisoesDAL();
    Metodos m = new Metodos();
    private int idunidade, nivel;
    private DefaultTableModel modeloTabela;
    Conexao c = new Conexao();
    PreparedStatement ps;
    ResultSet rs;
    Connection con = c.fazConexao();

    public JDManuDivisoes(java.awt.Frame parent, boolean modal, int nivel) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        this.nivel = nivel;
        m.listaDivisoes(jTDivisoes);
        String sql = "select * from unidades";
        m.carreagaCB(sql, "nome", jCBUnidade, "");
        jTDivisoes.setAutoCreateRowSorter(true);
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
        jCBArmario = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCBUnidade = new javax.swing.JComboBox();
        jCBBloco = new javax.swing.JComboBox();
        jCBAmbiente = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDivisoes = new javax.swing.JTable();
        jBCadastrar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jBPesuisar = new javax.swing.JButton();
        jBListarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de Divisões");
        setResizable(false);

        jPDadosBloco.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Bloco"));

        jLID.setText("ID:");

        jTFId.setEnabled(false);

        jLUnidade.setText("Armario:");

        jLDescricao.setText("Descrição:");

        jCBArmario.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBArmarioPopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel1.setText("Ambiente:");

        jLabel2.setText("Bloco:");

        jLabel3.setText("Unidade:");

        jCBUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUnidadeActionPerformed(evt);
            }
        });

        jCBBloco.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBBlocoPopupMenuWillBecomeVisible(evt);
            }
        });

        jCBAmbiente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBAmbientePopupMenuWillBecomeVisible(evt);
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
                            .addComponent(jLDescricao)
                            .addComponent(jLID)
                            .addComponent(jLUnidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBArmario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPDadosBlocoLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPDadosBlocoLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCBUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPDadosBlocoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCBAmbiente, jCBArmario, jCBBloco, jCBUnidade});

        jPDadosBlocoLayout.setVerticalGroup(
            jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCBUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUnidade)
                    .addComponent(jCBArmario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescricao)
                    .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTDivisoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Armario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTDivisoes.getTableHeader().setReorderingAllowed(false);
        jTDivisoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTDivisoesMouseReleased(evt);
            }
        });
        jTDivisoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTDivisoesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTDivisoes);
        if (jTDivisoes.getColumnModel().getColumnCount() > 0) {
            jTDivisoes.getColumnModel().getColumn(0).setResizable(false);
            jTDivisoes.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTDivisoes.getColumnModel().getColumn(1).setResizable(false);
            jTDivisoes.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTDivisoes.getColumnModel().getColumn(2).setResizable(false);
            jTDivisoes.getColumnModel().getColumn(2).setPreferredWidth(350);
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
        jLTitulo.setText("Manutenção de Divisões");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesuisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBListarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBPesuisar)
                        .addComponent(jBListarTodos))
                    .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSair)
                        .addComponent(jBCadastrar)
                        .addComponent(jBEditar)
                        .addComponent(jBExcluir)
                        .addComponent(jBLimpar)))
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

        setSize(new java.awt.Dimension(991, 383));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        if (jTFDescricao.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha a Descrição!!!");
        } else if (jCBUnidade.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha a Unidade!!!");
        } else if (jCBBloco.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Bloco!!!");
        } else if (jCBAmbiente.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Ambiente!!!");
        } else if (jCBArmario.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Armario!!!");
        } else {
            cadastrar();
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        if (jTFId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione uma Divisão para ser editada!!!");
        } else {
            editar();
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        if (jTFId.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Selecione uma Divisão para ser excluida!!!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir '" + jTFDescricao.getText() + "' ?", "Excluir Divisão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                bean.setId(Integer.parseInt(jTFId.getText()));
                dal.excluir(bean);
                m.listaDivisoes(jTDivisoes);
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

    private void jTDivisoesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDivisoesKeyReleased
        setaCampos();
    }//GEN-LAST:event_jTDivisoesKeyReleased

    private void jTDivisoesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDivisoesMouseReleased
        setaCampos();
    }//GEN-LAST:event_jTDivisoesMouseReleased

    private void jBPesuisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesuisarActionPerformed
        if (jTFDescricao.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Digite a descrição para pesquisar!!!");
        } else if (jCBAmbiente.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Ambiente!!!");
        } else if (jCBBloco.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Bloco!!!");
        } else if (jCBUnidade.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha a Unidade!!!");
        } else if (jCBArmario.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Armario!!!");
        } else {
            listaPesquisa();
        }
    }//GEN-LAST:event_jBPesuisarActionPerformed

    private void jBListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarTodosActionPerformed
        m.listaDivisoes(jTDivisoes);
    }//GEN-LAST:event_jBListarTodosActionPerformed

    private void jCBBlocoPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBBlocoPopupMenuWillBecomeVisible
        carregaBloco();
    }//GEN-LAST:event_jCBBlocoPopupMenuWillBecomeVisible

    private void jCBAmbientePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBAmbientePopupMenuWillBecomeVisible
        carregaAmbiente();
    }//GEN-LAST:event_jCBAmbientePopupMenuWillBecomeVisible

    private void jCBArmarioPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBArmarioPopupMenuWillBecomeVisible
        carregaArmario();
    }//GEN-LAST:event_jCBArmarioPopupMenuWillBecomeVisible

    private void jCBUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBUnidadeActionPerformed
        jCBBloco.removeAllItems();
        jCBAmbiente.removeAllItems();
        jCBArmario.removeAllItems();
    }//GEN-LAST:event_jCBUnidadeActionPerformed

    void listaPesquisa() {
        String sql = "select d.iddivisao,d.descricao as divisao, ar.idarmario ,"
                + "ar.descricao as armario,a.idambiente,a.descricao as ambiente,"
                + "b.idbloco,b.descricao as bloco,u.idunidade,u.nome as unidade from "
                + "divisoes as d, armarios as ar,ambientes a,blocos as b,unidades as u "
                + "where d.idarmario = ar.idarmario and ar.idambiente = a.idambiente "
                + "and a.idbloco = b.idbloco and b.idunidade = u.idunidade "
                + "and u.nome like '%" + jCBUnidade.getSelectedItem() + "%' "
                + "and b.descricao like '%" + jCBBloco.getSelectedItem() + "%' "
                + "and a.descricao like '%" + jCBAmbiente.getSelectedItem() + "%'"
                + " and ar.descricao like'%" + jCBArmario.getSelectedItem() + "%' "
                + "and d.descricao like '%" + jTFDescricao.getText() + "%'";

        modeloTabela = (DefaultTableModel) jTDivisoes.getModel();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            jTDivisoes.removeAll();
            for (int i = modeloTabela.getRowCount() - 1; i >= 0; i--) {
                modeloTabela.removeRow(i);
            }
            while (rs.next()) {
                String armario = rs.getString("armario");
                String bloco = rs.getString("bloco");
                String unidade = rs.getString("unidade");
                String ambiente = rs.getString("ambiente");

                String[] dadosLinhas = {String.valueOf(rs.getInt("iddivisao")),
                    rs.getString("divisao"), armario + " - " + ambiente + " - " + bloco + " - " + unidade};
                modeloTabela.addRow(dadosLinhas);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar Armarios!!!\n\nErro: " + ex.getMessage());
        }
    }

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

    void carregaArmario() {
        int idunidade = m.getId("unidades", "nome", String.valueOf(jCBUnidade.getSelectedItem()), "idunidade");
        int idambiente = m.getId("ambientes", "descricao", String.valueOf(jCBAmbiente.getSelectedItem()), "idambiente");
        String sql = "SELECT ar.descricao as armarios,a.descricao as ambientes,u.nome as unidade "
                + "from armarios as ar,ambientes as a,blocos as b,unidades as u where "
                + " ar.idambiente = a.idambiente and a.idbloco = b.idbloco and "
                + "b.idunidade = u.idunidade and b.descricao = '" + jCBBloco.getSelectedItem() + "' "
                + "and u.idunidade = " + idunidade + " and a.idambiente = " + idambiente;

        m.carreagaCB(sql, "armarios", jCBArmario, "Não Existe");
    }

    void limpar() {
        jTFId.setText("");
        jTFDescricao.setText("");
        jCBUnidade.setSelectedIndex(-1);
        jCBBloco.removeAllItems();
        jCBAmbiente.removeAllItems();
        jCBArmario.removeAllItems();
    }

    void setaCampos() {
        DefaultTableModel modeloTabela = (DefaultTableModel) jTDivisoes.getModel();
        int linhaselecionada = jTDivisoes.getSelectedRow();
        String codigoLinha = (String) modeloTabela.getValueAt(jTDivisoes.getSelectedRow(), 0);

        String localizacao = String.valueOf(jTDivisoes.getValueAt(linhaselecionada, 2));
        String array[] = new String[4];
        array = localizacao.split(" - ");
        String armario = array[0];
        String ambiente = array[1];
        String bloco = array[2];
        String unidade = array[3];

        jTFId.setText(String.valueOf(jTDivisoes.getValueAt(linhaselecionada, 0)));
        jTFDescricao.setText(String.valueOf(jTDivisoes.getValueAt(linhaselecionada, 1)));
        jCBUnidade.setSelectedItem(unidade);
        carregaBloco();
        jCBBloco.setSelectedItem(bloco);
        carregaAmbiente();
        jCBAmbiente.setSelectedItem(ambiente);
        carregaArmario();
        jCBArmario.setSelectedItem(armario);

    }

    void cadastrar() {
        String sql = "select ar.idarmario ,ar.descricao as armario,a.idambiente,a.descricao as ambiente,"
                + "b.idbloco,b.descricao as bloco,u.idunidade,u.nome as unidade from "
                + "armarios as ar,ambientes a,blocos as b,unidades as u "
                + "where ar.idambiente = a.idambiente and a.idbloco = b.idbloco "
                + "and b.idunidade = u.idunidade and u.nome = '" + jCBUnidade.getSelectedItem() + "'"
                + " and b.descricao = '" + jCBBloco.getSelectedItem() + "' "
                + "and a.descricao = '" + jCBAmbiente.getSelectedItem() + "' "
                + "and ar.descricao = '" + jCBArmario.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                bean.setIdarmario(rs.getInt("idarmario"));
            }
            bean.setDescricao(jTFDescricao.getText());
            dal.cadastrar(bean);
            m.listaDivisoes(jTDivisoes);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o id do Armario!!!\n\nErro: " + ex.getMessage());
        }
    }

    void editar() {
        String sql = "select ar.idarmario ,ar.descricao as armario,a.idambiente,a.descricao as ambiente,"
                + "b.idbloco,b.descricao as bloco,u.idunidade,u.nome as unidade from "
                + "armarios as ar,ambientes a,blocos as b,unidades as u "
                + "where ar.idambiente = a.idambiente and a.idbloco = b.idbloco "
                + "and b.idunidade = u.idunidade and u.nome = '" + jCBUnidade.getSelectedItem() + "'"
                + " and b.descricao = '" + jCBBloco.getSelectedItem() + "' "
                + "and a.descricao = '" + jCBAmbiente.getSelectedItem() + "' "
                + "and ar.descricao = '" + jCBArmario.getSelectedItem() + "'";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                bean.setIdarmario(rs.getInt("idarmario"));
            }
            bean.setId(Integer.parseInt(jTFId.getText()));
            bean.setDescricao(jTFDescricao.getText());
            dal.editar(bean);
            m.listaDivisoes(jTDivisoes);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o id do Armario!!!\n\nErro: " + ex.getMessage());
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
    private javax.swing.JComboBox jCBArmario;
    private javax.swing.JComboBox jCBBloco;
    private javax.swing.JComboBox jCBUnidade;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPDadosBloco;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDivisoes;
    private javax.swing.JTextField jTFDescricao;
    private javax.swing.JTextField jTFId;
    // End of variables declaration//GEN-END:variables
}
