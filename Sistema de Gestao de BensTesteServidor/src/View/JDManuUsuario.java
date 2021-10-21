package View;

import Bean.UsuariosBean;
import Controle.Metodos;
import DAL.UsuarioDAL;
import javax.swing.*;
import javax.swing.table.*;

public class JDManuUsuario extends javax.swing.JDialog {
    
    UsuariosBean bean = new UsuariosBean();
    UsuarioDAL dal = new UsuarioDAL();
    Metodos m = new Metodos();
    DefaultTableModel modeloTabela;
    private String codigoLinha;
    private int nivel;
    
    public JDManuUsuario(java.awt.Frame parent, boolean modal, int nivel) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        this.nivel = nivel;
        m.listaUser(jTUsuario);
        jTUsuario.setAutoCreateRowSorter(true);
        if (nivel == 2) {
            jBExcluir.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jPDadosUsuario = new javax.swing.JPanel();
        jLId = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLLogin = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jLDicaSenha = new javax.swing.JLabel();
        jTFDicaSenha = new javax.swing.JTextField();
        jTFId = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFLogin = new javax.swing.JTextField();
        jPFSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jCBNivel = new javax.swing.JComboBox();
        jBCadastrar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de Usuarios");

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Manutenção de Usuarios");

        jPDadosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usuario"));

        jLId.setText("ID:");

        jLNome.setText("Nome:");

        jLLogin.setText("Login:");

        jLSenha.setText("Senha:");

        jLDicaSenha.setText("Dica da Senha:");

        jTFId.setEnabled(false);

        jLabel1.setText("Nivel:");

        jCBNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Comum", "Controle" }));
        jCBNivel.setSelectedIndex(-1);
        jCBNivel.setToolTipText("");

        javax.swing.GroupLayout jPDadosUsuarioLayout = new javax.swing.GroupLayout(jPDadosUsuario);
        jPDadosUsuario.setLayout(jPDadosUsuarioLayout);
        jPDadosUsuarioLayout.setHorizontalGroup(
            jPDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosUsuarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDicaSenha)
                    .addComponent(jLId)
                    .addComponent(jLNome)
                    .addComponent(jLLogin)
                    .addComponent(jLSenha)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCBNivel, javax.swing.GroupLayout.Alignment.LEADING, 0, 184, Short.MAX_VALUE)
                        .addComponent(jTFDicaSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPFSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFLogin, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPDadosUsuarioLayout.setVerticalGroup(
            jPDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDadosUsuarioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLId)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLogin)
                    .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDicaSenha)
                    .addComponent(jTFDicaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

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

        jTUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Login", "Senha", "Dica da Senha", "Nivel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTUsuario.getTableHeader().setReorderingAllowed(false);
        jTUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTUsuarioMouseReleased(evt);
            }
        });
        jTUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTUsuarioKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTUsuario);
        if (jTUsuario.getColumnModel().getColumnCount() > 0) {
            jTUsuario.getColumnModel().getColumn(0).setMinWidth(10);
            jTUsuario.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTUsuario.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jBCadastrar)
                        .addGap(10, 10, 10)
                        .addComponent(jBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBExcluir)
                        .addGap(14, 14, 14)
                        .addComponent(jBLimpar))
                    .addComponent(jPDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                        .addComponent(jBSair)))
                .addContainerGap())
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBEditar, jBExcluir, jBLimpar, jBSair});

        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(24, 24, 24)
                        .addComponent(jBSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jPDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBCadastrar)
                            .addComponent(jBEditar)
                            .addComponent(jBExcluir)
                            .addComponent(jBLimpar))
                        .addGap(6, 6, 6)))
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
            .addComponent(jPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        if (jTFNome.getText().length() <= 0 || jTFNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Digite o nome do usuario!!!");
        } else if (jTFLogin.getText().length() <= 0 || jTFLogin.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Digite o login desejado pelo usuario!!!");
        } else if (jCBNivel.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o nivel do usuario!!!");
        } else if (jPFSenha.getPassword().length <= 0 || jPFSenha.getText().length() <= 0 || jPFSenha.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Digite a senha!!!");
        } else {
            bean.setNome(jTFNome.getText());
            bean.setLogin(jTFLogin.getText());
            bean.setSenha(jPFSenha.getText());
            bean.setDica(jTFDicaSenha.getText());
            bean.setNivel(jCBNivel.getSelectedIndex());
            dal.cadastrar(bean);
            m.listaUser(jTUsuario);
        }
        

    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        if (jTFId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um Usuario para ser editado!!!");
        } else {
            bean.setId(Integer.parseInt(jTFId.getText()));
            bean.setNome(jTFNome.getText());
            bean.setLogin(jTFLogin.getText());
            bean.setSenha(jPFSenha.getText());
            bean.setDica(jTFDicaSenha.getText());
            bean.setNivel(jCBNivel.getSelectedIndex());
            dal.editar(bean);
            m.listaUser(jTUsuario);
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        if (jTFId.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Selecione um bem para ser excluido!!!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir '" + jTFNome.getText() + "' ?", "Excluir Usuario", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                bean.setId(Integer.parseInt(jTFId.getText()));
                dal.excluir(bean);
                m.listaUser(jTUsuario);
                limpar();
            }
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed

        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jTUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTUsuarioKeyReleased
        setaCampos();
    }//GEN-LAST:event_jTUsuarioKeyReleased

    private void jTUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsuarioMouseReleased
        setaCampos();
    }//GEN-LAST:event_jTUsuarioMouseReleased
    public void limpar() {
        
        jTFId.setText("");
        jTFNome.setText("");
        jTFLogin.setText("");
        jTFDicaSenha.setText("");
        jPFSenha.setText("");
        jCBNivel.setSelectedIndex(-1);
    }
    
    public JTextField[] dadosUser() {
        JTextField[] tf = {jTFId, jTFNome, jTFLogin, jPFSenha, jTFDicaSenha};
        return tf;
    }
    
    void setaCampos() {
        modeloTabela = (DefaultTableModel) jTUsuario.getModel();
        int linhaselecionada = jTUsuario.getSelectedRow();
        codigoLinha = (String) modeloTabela.getValueAt(jTUsuario.getSelectedRow(), 0);
        JTextField[] tf = dadosUser();
        tf[0].setText(String.valueOf(jTUsuario.getValueAt(linhaselecionada, 0)));
        tf[1].setText(String.valueOf(jTUsuario.getValueAt(linhaselecionada, 1)));
        tf[2].setText(String.valueOf(jTUsuario.getValueAt(linhaselecionada, 2)));
        tf[3].setText(String.valueOf(jTUsuario.getValueAt(linhaselecionada, 3)));
        tf[4].setText(String.valueOf(jTUsuario.getValueAt(linhaselecionada, 4)));
        jCBNivel.setSelectedItem(jTUsuario.getValueAt(linhaselecionada, 5));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox jCBNivel;
    private javax.swing.JLabel jLDicaSenha;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPDadosUsuario;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDicaSenha;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTable jTUsuario;
    // End of variables declaration//GEN-END:variables
}
