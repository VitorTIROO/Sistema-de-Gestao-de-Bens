package View;

import Bean.UnidadesBean;
import Controle.*;
import DAL.UnidadeDAL;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDManuUnidade extends javax.swing.JDialog {

    UnidadesBean bean = new UnidadesBean();
    UnidadeDAL dal = new UnidadeDAL();
    Metodos m = new Metodos();
    DefaultTableModel modeloTabela;
    Conexao c = new Conexao();
    Connection con = c.fazConexao();
    PreparedStatement ps;
    ResultSet rs;
    private int nivel;

    public JDManuUnidade(java.awt.Frame parent, boolean modal, int nivel) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        this.nivel = nivel;
        setResizable(false);
        //preencherTabela("select * from unidades");
        m.listaUnidades(jTUnidades);
        jBMapa.setVisible(false);
        jTUnidades.setAutoCreateRowSorter(true);
        if (nivel == 2) {
            jBExcluir.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUnidades = new javax.swing.JTable();
        jPDadosUnidade = new javax.swing.JPanel();
        jLId = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jBMapa = new javax.swing.JButton();
        jBPesuisar = new javax.swing.JButton();
        jBListarTodos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de Unidades");

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Manutenção de Unidades");

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

        jTUnidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ));
        jTUnidades.getTableHeader().setReorderingAllowed(false);
        jTUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTUnidadesMouseReleased(evt);
            }
        });
        jTUnidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTUnidadesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTUnidades);
        if (jTUnidades.getColumnModel().getColumnCount() > 0) {
            jTUnidades.getColumnModel().getColumn(0).setMinWidth(40);
            jTUnidades.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTUnidades.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jPDadosUnidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Unidade"));

        jLId.setText("ID:");

        jLNome.setText("Nome:");

        jTFId.setEnabled(false);

        jBMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/map-32.png"))); // NOI18N
        jBMapa.setToolTipText("Mapa da Unidade");
        jBMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMapaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPDadosUnidadeLayout = new javax.swing.GroupLayout(jPDadosUnidade);
        jPDadosUnidade.setLayout(jPDadosUnidadeLayout);
        jPDadosUnidadeLayout.setHorizontalGroup(
            jPDadosUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosUnidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPDadosUnidadeLayout.createSequentialGroup()
                        .addComponent(jLNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPDadosUnidadeLayout.createSequentialGroup()
                        .addComponent(jLId)
                        .addGap(18, 18, 18)
                        .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPDadosUnidadeLayout.setVerticalGroup(
            jPDadosUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosUnidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPDadosUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDadosUnidadeLayout.createSequentialGroup()
                        .addGroup(jPDadosUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLId)
                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDadosUnidadeLayout.createSequentialGroup()
                        .addComponent(jBMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPDadosUnidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jBSair))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jPDadosUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBEditar, jBExcluir, jBLimpar, jBListarTodos, jBPesuisar, jBSair});

        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPDadosUnidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBEditar)
                    .addComponent(jBExcluir)
                    .addComponent(jBLimpar)
                    .addComponent(jBPesuisar)
                    .addComponent(jBListarTodos)
                    .addComponent(jBSair))
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
        if (jTFNome.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o Nome!!!");
        } else {
            bean.setNome(jTFNome.getText());
            dal.cadastrar(bean);
            m.listaUnidades(jTUnidades);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        if (jTFId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione uma Unidade para ser editado!!!");
        } else {
            bean.setId(Integer.parseInt(jTFId.getText()));
            bean.setNome(jTFNome.getText());
            dal.editar(bean);
            m.listaUnidades(jTUnidades);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        if (jTFId.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Selecione uma Unidade para ser excluida!!!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir '" + jTFNome.getText() + "' ?", "Excluir Unidade", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                bean.setId(Integer.parseInt(jTFId.getText()));
                dal.excluir(bean);
                m.listaUnidades(jTUnidades);
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

    private void jTUnidadesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTUnidadesKeyReleased
        setaCampos();
        if (jTFNome.getText().equalsIgnoreCase("Senai Rondonopolis")) {
            jBMapa.setVisible(true);
        } else {
            jBMapa.setVisible(false);
        }
    }//GEN-LAST:event_jTUnidadesKeyReleased

    private void jTUnidadesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUnidadesMouseReleased
        setaCampos();
        if (jTFNome.getText().equalsIgnoreCase("Senai Rondonopolis")) {
            jBMapa.setVisible(true);
        } else {
            jBMapa.setVisible(false);
        }
    }//GEN-LAST:event_jTUnidadesMouseReleased

    private void jBPesuisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesuisarActionPerformed
        if (jTFNome.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Digite o nome para pesquisar!!!");
        } else {
            listaPesquisa();
        }
    }//GEN-LAST:event_jBPesuisarActionPerformed

    private void jBListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarTodosActionPerformed
        m.listaUnidades(jTUnidades);
    }//GEN-LAST:event_jBListarTodosActionPerformed

    private void jBMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMapaActionPerformed
        setVisible(false);
        JDMap m = new JDMap(null, true);
        m.setVisible(true);
    }//GEN-LAST:event_jBMapaActionPerformed
    void listaPesquisa() {
        String sql = "select * from unidades where nome like '%" + jTFNome.getText() + "%'";
        modeloTabela = (DefaultTableModel) jTUnidades.getModel();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            jTUnidades.removeAll();
            for (int i = modeloTabela.getRowCount() - 1; i >= 0; i--) {
                modeloTabela.removeRow(i);
            }
            while (rs.next()) {
                String[] dadosLinhas = {String.valueOf(rs.getInt("idunidade")), rs.getString("nome")};
                modeloTabela.addRow(dadosLinhas);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar unidade!!!\n\nErro: " + ex.getMessage());
        }
    }

    void limpar() {
        jTFId.setText("");
        jTFNome.setText("");
    }

    void setaCampos() {
        DefaultTableModel modeloTabela = (DefaultTableModel) jTUnidades.getModel();
        int linhaselecionada = jTUnidades.getSelectedRow();
        String codigoLinha = (String) modeloTabela.getValueAt(jTUnidades.getSelectedRow(), 0);

        jTFId.setText(String.valueOf(jTUnidades.getValueAt(linhaselecionada, 0)));
        jTFNome.setText(String.valueOf(jTUnidades.getValueAt(linhaselecionada, 1)));
    }

//    public void preencherTabela(String sql) {
//
//        try {
//            ArrayList dados = new ArrayList();
//
//            String[] Colunas = new String[]{"ID", "Nome"};
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            //if(rs.next()){
//            while (rs.next()) {
//                dados.add(new Object[]{rs.getInt("idunidade"), rs.getString("nome")});
//            }
//            ModeloTabela modelo = new ModeloTabela(dados, Colunas);
//            jTUnidades.setModel(modelo);
//            //}
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Erro ao prrencher ArrayList!!!\nErro: " + ex.getMessage());
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBListarTodos;
    private javax.swing.JButton jBMapa;
    private javax.swing.JButton jBPesuisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPDadosUnidade;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTable jTUnidades;
    // End of variables declaration//GEN-END:variables
}
