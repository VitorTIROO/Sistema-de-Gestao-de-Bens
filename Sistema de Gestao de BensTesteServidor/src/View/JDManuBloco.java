package View;

import Bean.BlocosBean;
import Controle.*;
import Controle.Metodos;
import DAL.BlocoDAL;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDManuBloco extends javax.swing.JDialog {

    BlocoDAL dal = new BlocoDAL();
    BlocosBean bean = new BlocosBean();
    Metodos m = new Metodos();
    private DefaultTableModel modeloTabela;
    private int nivel;
    Conexao c = new Conexao();
    Connection con = c.fazConexao();
    PreparedStatement ps;
    ResultSet rs;

    public JDManuBloco(java.awt.Frame parent, boolean modal, int nivel) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        this.nivel = nivel;
        setResizable(false);
        m.listaBlocos(jTBloco);
        String sql = "select * from unidades";
        m.carreagaCB(sql, "nome", jCBUnidade, "");
        jTBloco.setAutoCreateRowSorter(true);
        if (nivel == 2) {
            jBExcluir.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jPDadosBloco = new javax.swing.JPanel();
        jLID = new javax.swing.JLabel();
        jTFDescricao = new javax.swing.JTextField();
        jTFId = new javax.swing.JTextField();
        jLUnidade = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jCBUnidade = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBloco = new javax.swing.JTable();
        jBLimpar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        jBPesuisar = new javax.swing.JButton();
        jBListarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de Blocos");

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Manutenção de Blocos");

        jPDadosBloco.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Bloco"));

        jLID.setText("ID:");

        jTFId.setEnabled(false);

        jLUnidade.setText("Unidade:");

        jLDescricao.setText("Descrição:");

        javax.swing.GroupLayout jPDadosBlocoLayout = new javax.swing.GroupLayout(jPDadosBloco);
        jPDadosBloco.setLayout(jPDadosBlocoLayout);
        jPDadosBlocoLayout.setHorizontalGroup(
            jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                        .addComponent(jLUnidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBUnidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                        .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDescricao)
                            .addComponent(jLID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPDadosBlocoLayout.setVerticalGroup(
            jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosBlocoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLID)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUnidade)
                    .addComponent(jCBUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosBlocoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescricao)
                    .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTBloco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Unidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTBloco.getTableHeader().setReorderingAllowed(false);
        jTBloco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTBlocoMouseReleased(evt);
            }
        });
        jTBloco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBlocoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTBloco);
        if (jTBloco.getColumnModel().getColumnCount() > 0) {
            jTBloco.getColumnModel().getColumn(0).setMinWidth(40);
            jTBloco.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTBloco.getColumnModel().getColumn(0).setMaxWidth(80);
        }

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

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBPesuisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBListarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jBSair)))
                .addContainerGap())
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBEditar, jBExcluir, jBLimpar, jBSair});

        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        c.fechaConexao();
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        if (jTFId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione uma Unidade para ser editado!!!");
        } else {
            bean.setIdbloco(Integer.parseInt(jTFId.getText()));
            bean.setDescricao(jTFDescricao.getText());
            bean.setIdunidade(m.getId("unidades", "nome", String.valueOf(jCBUnidade.getSelectedItem()), "idunidade"));
            dal.editar(bean);
            m.listaBlocos(jTBloco);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        if (jTFId.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Selecione um Bloco para ser excluido!!!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir '" + jTFDescricao.getText() + "' ?", "Excluir Bloco", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                bean.setIdbloco(Integer.parseInt(jTFId.getText()));
                dal.excluir(bean);
                m.listaBlocos(jTBloco);
                limpar();
            }
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        if (jTFDescricao.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha a Descrição!!!");
        } else {
            bean.setDescricao(jTFDescricao.getText());
            bean.setIdunidade(m.getId("unidades", "nome", String.valueOf(jCBUnidade.getSelectedItem()), "idunidade"));
            dal.cadastrar(bean);
            m.listaBlocos(jTBloco);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jTBlocoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBlocoKeyReleased
        setaCampos();
    }//GEN-LAST:event_jTBlocoKeyReleased

    private void jTBlocoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBlocoMouseReleased
        setaCampos();
    }//GEN-LAST:event_jTBlocoMouseReleased

    private void jBPesuisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesuisarActionPerformed
        if (jTFDescricao.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Digite a descrição para pesquisar!!!");
        } else if (jCBUnidade.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha a unidade para pesquisar!!!");
        } else {
            listaPesquisa();
        }
    }//GEN-LAST:event_jBPesuisarActionPerformed

    private void jBListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarTodosActionPerformed
        m.listaBlocos(jTBloco);
    }//GEN-LAST:event_jBListarTodosActionPerformed
    void listaPesquisa() {
        String sql = "select b.idbloco,b.descricao,a.nome as unidade from blocos as b,"
                + " unidades as a where b.idunidade = a.idunidade "
                + " and a.nome like '%" + jCBUnidade.getSelectedItem() + "%'"
                + " and b.descricao like '%" + jTFDescricao.getText() + "%'";
        modeloTabela = (DefaultTableModel) jTBloco.getModel();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            jTBloco.removeAll();
            for (int i = modeloTabela.getRowCount() - 1; i >= 0; i--) {
                modeloTabela.removeRow(i);
            }
            while (rs.next()) {
                String[] dadosLinhas = {String.valueOf(rs.getInt("idbloco")), rs.getString("descricao"), rs.getString("unidade")};
                modeloTabela.addRow(dadosLinhas);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro de pesquisa!!!\n\nErro: " + ex.getMessage());
        }
    }

    void limpar() {
        jTFId.setText("");
        jTFDescricao.setText("");
        jCBUnidade.setSelectedIndex(-1);
    }

    void setaCampos() {
        DefaultTableModel modeloTabela = (DefaultTableModel) jTBloco.getModel();
        int linhaselecionada = jTBloco.getSelectedRow();
        String codigoLinha = (String) modeloTabela.getValueAt(jTBloco.getSelectedRow(), 0);

        jTFId.setText(String.valueOf(jTBloco.getValueAt(linhaselecionada, 0)));
        jTFDescricao.setText(String.valueOf(jTBloco.getValueAt(linhaselecionada, 1)));
        jCBUnidade.setSelectedItem(jTBloco.getValueAt(linhaselecionada, 2));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBListarTodos;
    private javax.swing.JButton jBPesuisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox jCBUnidade;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUnidade;
    private javax.swing.JPanel jPDadosBloco;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBloco;
    private javax.swing.JTextField jTFDescricao;
    private javax.swing.JTextField jTFId;
    // End of variables declaration//GEN-END:variables
}
