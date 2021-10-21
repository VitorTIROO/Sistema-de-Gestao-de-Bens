package View;

import Bean.*;
import Controle.*;
import DAL.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class JDManuBens extends javax.swing.JDialog {

    Conexao conexao = new Conexao();
    DefaultTableModel modeloTabela = new DefaultTableModel();
    Connection con = conexao.fazConexao();
    ResultSet rs;
    PreparedStatement ps;
    BensBean bean = new BensBean();
    BensDAL dal = new BensDAL();
    Metodos m = new Metodos();
    private int idunidade, nivel, ni;
    private String codigoLinha, id = "", tipo = "", descricao = "", marca = "",
            modelo = "", patrimonio = "", valor = "", divisao = "", armario = "",
            ambiente = "", bloco = "", unidade = "";
    private String sql = "", campo = "";

    public JDManuBens(java.awt.Frame parent, boolean modal, String id, String tipo, String descricao, String marca,
            String modelo, String patrimonio, int ni, String valor, String divisao, String armario, String ambiente, String bloco,
            String unidade, int nivel) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        setResizable(false);
        m.listaBens(jTBens);
        m.carreagaCB("select * from unidades", "nome", jCBUnidades, "");
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.patrimonio = patrimonio;
        this.ni = ni;
        this.valor = valor;
        this.bloco = bloco;
        this.ambiente = ambiente;
        this.armario = armario;
        this.divisao = divisao;
        this.unidade = unidade;
        this.nivel = nivel;

        if (nivel == 2) {
            //jBExcluir.setEnabled(false);
        }
        jTBens.setAutoCreateRowSorter(true);
        //    setaNoBean();
        setaNosCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        bGIdentificacao = new javax.swing.ButtonGroup();
        jPPrincipal = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jBEditar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTBens = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLMarca = new javax.swing.JLabel();
        jTFModelo = new javax.swing.JTextField();
        jLModelo = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jLId = new javax.swing.JLabel();
        jTFPatrimonio = new javax.swing.JTextField();
        jTFDescricao = new javax.swing.JTextField();
        jTFMarca = new javax.swing.JTextField();
        jLValor = new javax.swing.JLabel();
        jFTFValor = new javax.swing.JFormattedTextField();
        jLTipo = new javax.swing.JLabel();
        jCBTipo = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLBloco = new javax.swing.JLabel();
        jLAmbientes = new javax.swing.JLabel();
        jLArmarios = new javax.swing.JLabel();
        jLDivisao = new javax.swing.JLabel();
        jCBUnidades = new javax.swing.JComboBox();
        jCBBlocos = new javax.swing.JComboBox();
        jCBAmbientes = new javax.swing.JComboBox();
        jCBArmarios = new javax.swing.JComboBox();
        jCBDivisoes = new javax.swing.JComboBox();
        jRBNIdentificacao = new javax.swing.JRadioButton();
        jRBPatrimonio = new javax.swing.JRadioButton();
        jTFNumIdentificacao = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SRBP - Sistema de Rastreabilidade de Bens Patimoniais - Manutenção de Bens");

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Manutenção de Bens");

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

        jTBens.setModel(new javax.swing.table.DefaultTableModel(
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
        jTBens.getTableHeader().setReorderingAllowed(false);
        jTBens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBensMouseClicked(evt);
            }
        });
        jTBens.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBensKeyReleased(evt);
            }
        });
        jScrollPane.setViewportView(jTBens);
        if (jTBens.getColumnModel().getColumnCount() > 0) {
            jTBens.getColumnModel().getColumn(0).setMinWidth(20);
            jTBens.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTBens.getColumnModel().getColumn(0).setMaxWidth(50);
            jTBens.getColumnModel().getColumn(3).setPreferredWidth(50);
            jTBens.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTBens.getColumnModel().getColumn(7).setPreferredWidth(300);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Bem"));

        jLMarca.setText("Marca:");

        jLModelo.setText("Modelo:");

        jLDescricao.setText("Descrição:");

        jTFId.setEnabled(false);

        jLId.setText("ID:");

        jLValor.setText("Valor:");

        jFTFValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jLTipo.setText("Tipo:");

        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maquina", "Equipamento", "Ferramenta", "Instrumento" }));
        jCBTipo.setSelectedIndex(-1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Localização"));

        jLabel1.setText("Unidade:");

        jLBloco.setText("Bloco:");

        jLAmbientes.setText("Ambiente:");

        jLArmarios.setText("Armario:");

        jLDivisao.setText("Divisão:");

        jCBUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUnidadesActionPerformed(evt);
            }
        });

        jCBBlocos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBBlocosPopupMenuWillBecomeVisible(evt);
            }
        });

        jCBAmbientes.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBAmbientesPopupMenuWillBecomeVisible(evt);
            }
        });

        jCBArmarios.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBArmariosPopupMenuWillBecomeVisible(evt);
            }
        });

        jCBDivisoes.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jCBDivisoesPopupMenuWillBecomeVisible(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLBloco)
                    .addComponent(jLAmbientes)
                    .addComponent(jLArmarios)
                    .addComponent(jLDivisao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBBlocos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCBDivisoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBArmarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCBAmbientes, jCBArmarios, jCBBlocos, jCBDivisoes, jCBUnidades});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBloco)
                    .addComponent(jCBBlocos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAmbientes)
                    .addComponent(jCBAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLArmarios)
                    .addComponent(jCBArmarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDivisao)
                    .addComponent(jCBDivisoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bGIdentificacao.add(jRBNIdentificacao);
        jRBNIdentificacao.setText("Nº. Identificação:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTFNumIdentificacao, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jRBNIdentificacao, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        bGIdentificacao.add(jRBPatrimonio);
        jRBPatrimonio.setText("Patrimonio:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTFPatrimonio, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jRBPatrimonio, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBNIdentificacao)
                    .addComponent(jRBPatrimonio)
                    .addComponent(jLModelo)
                    .addComponent(jLMarca)
                    .addComponent(jLDescricao)
                    .addComponent(jLTipo)
                    .addComponent(jLId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNumIdentificacao)
                    .addComponent(jFTFValor)
                    .addComponent(jTFPatrimonio)
                    .addComponent(jTFModelo)
                    .addComponent(jTFMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLValor)
                .addGap(313, 313, 313))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jFTFValor, jTFDescricao, jTFMarca, jTFModelo, jTFPatrimonio});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLId))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipo)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescricao)
                    .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMarca)
                    .addComponent(jTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLModelo)
                    .addComponent(jTFModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBPatrimonio)
                    .addComponent(jTFPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBNIdentificacao)
                    .addComponent(jTFNumIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLValor)
                    .addComponent(jFTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jBCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBExcluir)
                        .addGap(14, 14, 14)
                        .addComponent(jBLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 787, Short.MAX_VALUE)
                        .addComponent(jBSair)))
                .addContainerGap())
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPPrincipalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBEditar, jBExcluir, jBLimpar, jBPesquisar, jBSair});

        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBEditar)
                        .addComponent(jBExcluir)
                        .addComponent(jBLimpar)
                        .addComponent(jBPesquisar)
                        .addComponent(jBSair))
                    .addComponent(jBCadastrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        if (jCBTipo.getSelectedIndex() == -1 || jCBTipo.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Tipo!!!");
        } else if (jTFDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a Descrição!!!");
        } else if (jTFMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a Marca!!!");
        } else if (jTFModelo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Modelo!!!");
        } else if (jFTFValor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Valor!!!");
        } else if (jCBUnidades.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha a Unidade!!!");
        } else if (jCBBlocos.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Bloco!!!");
        } else if (jCBAmbientes.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Ambiente!!!");
        } else if (jCBArmarios.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Armario!!!");
        } else if (jCBDivisoes.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha a Divisão!!!");
        } else if (jRBPatrimonio.isSelected()) {
            if (jTFPatrimonio.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha o Patrimonio!!!");
            } else {
                cadastraBens();
            }
        } else if (jRBNIdentificacao.isSelected()) {
            if (jTFNumIdentificacao.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha o Numero de Identificação!!!");
            } else {
                cadastraBens();
            }
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
        conexao.fechaConexao();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed

        if (jTFId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela para ser editado!!!");
        } else if (jCBTipo.getSelectedIndex() == -1 || jCBTipo.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Tipo!!!");
        } else if (jTFDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a Descrição!!!");
        } else if (jTFMarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a Marca!!!");
        } else if (jTFModelo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Modelo!!!");
        } else if (jFTFValor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Valor!!!");
        } else if (jCBUnidades.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha a Unidade!!!");
        } else if (jCBBlocos.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Bloco!!!");
        } else if (jCBAmbientes.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Ambiente!!!");
        } else if (jCBArmarios.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha o Armario!!!");
        } else if (jCBDivisoes.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Escolha a Divisão!!!");
        } else if (jRBPatrimonio.isSelected()) {
            if (jTFPatrimonio.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha o Patrimonio!!!");
            } else {
                editar();
            }
        } else if (jRBNIdentificacao.isSelected()) {
            if (jTFNumIdentificacao.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha o Numero de Identificação!!!");
            } else {
                editar();
            }
        }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jTBensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBensMouseClicked
        setaCampos();
    }//GEN-LAST:event_jTBensMouseClicked

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        if (jTFId.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Selecione um bem para ser excluido!!!");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir '" + jTFDescricao.getText() + "' ?", "Excluir Bem", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                bean.setIdBen(Integer.parseInt(jTFId.getText()));
                dal.excluir(bean);
                m.listaBens(jTBens);
                limpar();
            }
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTBensKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBensKeyReleased
        setaCampos();
    }//GEN-LAST:event_jTBensKeyReleased

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        JDPesquisaBens p = new JDPesquisaBens(null, true, nivel);
        dispose();
        p.show();
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jCBBlocosPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBBlocosPopupMenuWillBecomeVisible
        carregaBloco();
    }//GEN-LAST:event_jCBBlocosPopupMenuWillBecomeVisible

    private void jCBAmbientesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBAmbientesPopupMenuWillBecomeVisible
        carregaAmbiente();
    }//GEN-LAST:event_jCBAmbientesPopupMenuWillBecomeVisible

    private void jCBArmariosPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBArmariosPopupMenuWillBecomeVisible
        carregaArmario();
    }//GEN-LAST:event_jCBArmariosPopupMenuWillBecomeVisible

    private void jCBDivisoesPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBDivisoesPopupMenuWillBecomeVisible
        carregaDivisao();
    }//GEN-LAST:event_jCBDivisoesPopupMenuWillBecomeVisible

    private void jCBUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBUnidadesActionPerformed
        jCBBlocos.removeAllItems();
        jCBAmbientes.removeAllItems();
        jCBArmarios.removeAllItems();
        jCBDivisoes.removeAllItems();

    }//GEN-LAST:event_jCBUnidadesActionPerformed

    void carregaBloco() {
        String sql = "select * from blocos as b,unidades as u "
                + "where b.idunidade=u.idunidade and u.nome = '" + jCBUnidades.getSelectedItem() + "'";

        m.carreagaCB(sql, "descricao", jCBBlocos, "");

    }

    void carregaAmbiente() {
        idunidade = m.getId("unidades", "nome", String.valueOf(jCBUnidades.getSelectedItem()), "idunidade");
        String sql = "SELECT a.descricao as ambientes,u.nome as unidade"
                + " from ambientes as a,blocos as b,unidades as u where"
                + " a.idbloco = b.idbloco and b.idunidade = u.idunidade and"
                + " b.descricao = '" + jCBBlocos.getSelectedItem() + "' and u.idunidade = " + idunidade;

        m.carreagaCB(sql, "ambientes", jCBAmbientes, " ");
    }

    void carregaArmario() {
        idunidade = m.getId("unidades", "nome", String.valueOf(jCBUnidades.getSelectedItem()), "idunidade");
        int idambiente = m.getId("ambientes", "descricao", String.valueOf(jCBAmbientes.getSelectedItem()), "idambiente");
        String sql = "SELECT ar.descricao as armarios,a.descricao as ambientes,u.nome as unidade "
                + "from armarios as ar,ambientes as a,blocos as b,unidades as u where "
                + " ar.idambiente = a.idambiente and a.idbloco = b.idbloco and "
                + "b.idunidade = u.idunidade and b.descricao = '" + jCBBlocos.getSelectedItem() + "' "
                + "and u.idunidade = " + idunidade + " and a.idambiente = " + idambiente;

        m.carreagaCB(sql, "armarios", jCBArmarios, " ");
    }

    void carregaDivisao() {
        idunidade = m.getId("unidades", "nome", String.valueOf(jCBUnidades.getSelectedItem()), "idunidade");
        int idambiente = m.getId("ambientes", "descricao", String.valueOf(jCBAmbientes.getSelectedItem()), "idambiente");

        String sql = "select d.descricao from divisoes as d,armarios ar,ambientes as am,blocos as b,unidades as u "
                + "where d.idarmario=ar.idarmario and ar.idambiente=am.idambiente and "
                + "am.idbloco = b.idbloco and b.idunidade=u.idunidade and "
                + "u.nome = '" + jCBUnidades.getSelectedItem() + "' and"
                + " b.descricao = '" + jCBBlocos.getSelectedItem() + "' and"
                + " am.descricao = '" + jCBAmbientes.getSelectedItem() + "' and"
                + " ar.descricao = '" + jCBArmarios.getSelectedItem() + "'";

        m.carreagaCB(sql, "descricao", jCBDivisoes, " ");
    }

    public JTextField[] dadosBens() {
        JTextField[] tf = {jTFId, jTFDescricao, jTFMarca, jTFModelo, jTFPatrimonio, jFTFValor, jTFNumIdentificacao};
        return tf;
    }

    void setaCampos() {

        int linhaSelecionada = jTBens.getSelectedRow();
        //     if (evt.getClickCount() == 2 && (nivel == 0 || nivel == 2)) {

        if (m.contaChar(String.valueOf(jTBens.getValueAt(linhaSelecionada, 7)), '-') == 5) {
            chamabens5();
        } else if (m.contaChar(String.valueOf(jTBens.getValueAt(linhaSelecionada, 7)), '-') == 4) {
            chamabens4();
        } else if (m.contaChar(String.valueOf(jTBens.getValueAt(linhaSelecionada, 7)), '-') == 3) {
            chamabens3();
        } else if (m.contaChar(String.valueOf(jTBens.getValueAt(linhaSelecionada, 7)), '-') == 2) {
            chamabens2();
        }

        //  }
    }

    void chamabens5() {
        int linhaSelecionada = jTBens.getSelectedRow();
        JTextField[] tf = dadosBens();
        try {
            String localizacao = String.valueOf(jTBens.getValueAt(linhaSelecionada, 7));
            String array[] = new String[5];
            array = localizacao.split(" - ");
            String divisao = array[0];
            String armario = array[1];
            String ambiente = array[2];
            String bloco = array[3];
            String unidade = array[4];

            tf[0].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 0)));
            tf[1].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 1)));
            tf[2].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 3)));
            tf[3].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 4)));
            tf[5].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 6)));

            ResultSet r;
            Conexao cn = new Conexao();
            PreparedStatement p;
            Connection c = cn.fazConexao();
            String sql = "select * from bens where patrimonio =  " + jTBens.getValueAt(linhaSelecionada, 5);
            p = c.prepareStatement(sql);
            r = p.executeQuery();
            if (r.next()) {
                int n = r.getInt("ni");
                if (n == 0) {
                    jRBPatrimonio.setSelected(true);
                    jTFNumIdentificacao.setText("");
                    tf[4].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 5)));
                } else if (n == 1) {
                    jRBNIdentificacao.setSelected(true);
                    jTFPatrimonio.setText("");
                    tf[6].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 5)));
                }
            }
            jCBTipo.setSelectedItem(jTBens.getValueAt(linhaSelecionada, 2));
            jCBUnidades.setSelectedItem(unidade);
            carregaBloco();
            jCBBlocos.setSelectedItem(bloco);
            carregaAmbiente();
            jCBAmbientes.setSelectedItem(ambiente);
            carregaArmario();
            jCBArmarios.setSelectedItem(armario);
            carregaDivisao();
            jCBDivisoes.setSelectedItem(divisao);

            cn.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar se é ni ou patrimonio!!!\n\nErro: " + ex.getMessage());
        }

    }

    void chamabens4() {
        int linhaSelecionada = jTBens.getSelectedRow();
        JTextField[] tf = dadosBens();
        try {
            String localizacao = String.valueOf(jTBens.getValueAt(linhaSelecionada, 7));
            String array[] = new String[5];
            array = localizacao.split(" - ");
            //  String divisao = array[0];
            String armario = array[0];
            String ambiente = array[1];
            String bloco = array[2];
            String unidade = array[3];

            tf[0].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 0)));
            tf[1].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 1)));
            tf[2].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 3)));
            tf[3].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 4)));
            tf[5].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 6)));

            ResultSet r;
            Conexao cn = new Conexao();
            PreparedStatement p;
            Connection c = cn.fazConexao();
            String sql = "select * from bens where patrimonio =  " + jTBens.getValueAt(linhaSelecionada, 5);
            p = c.prepareStatement(sql);
            r = p.executeQuery();
            if (r.next()) {
                int n = r.getInt("ni");
                if (n == 0) {
                    jRBPatrimonio.setSelected(true);
                    jTFNumIdentificacao.setText("");
                    tf[4].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 5)));
                } else if (n == 1) {
                    jRBNIdentificacao.setSelected(true);
                    jTFPatrimonio.setText("");
                    tf[6].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 5)));
                }
            }

            jCBTipo.setSelectedItem(jTBens.getValueAt(linhaSelecionada, 2));
            jCBUnidades.setSelectedItem(unidade);
            carregaBloco();
            jCBBlocos.setSelectedItem(bloco);
            carregaAmbiente();
            jCBAmbientes.setSelectedItem(ambiente);
            carregaArmario();
            jCBArmarios.setSelectedItem(armario);
            carregaDivisao();
            jCBDivisoes.setSelectedItem(" ");

            cn.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar se é ni ou patrimonio!!!\n\nErro: " + ex.getMessage());
        }

    }

    void chamabens3() {
        int linhaSelecionada = jTBens.getSelectedRow();
        JTextField[] tf = dadosBens();
        try {
            String localizacao = String.valueOf(jTBens.getValueAt(linhaSelecionada, 7));
            String array[] = new String[5];
            array = localizacao.split(" - ");
            //  String divisao = array[0];
            //String armario = array[0];
            String ambiente = array[0];
            String bloco = array[1];
            String unidade = array[2];

            tf[0].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 0)));
            tf[1].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 1)));
            tf[2].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 3)));
            tf[3].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 4)));
            tf[5].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 6)));

            ResultSet r;
            Conexao cn = new Conexao();
            PreparedStatement p;
            Connection c = cn.fazConexao();
            String sql = "select * from bens where patrimonio =  " + jTBens.getValueAt(linhaSelecionada, 5);
            p = c.prepareStatement(sql);
            r = p.executeQuery();
            if (r.next()) {
                int n = r.getInt("ni");
                if (n == 0) {
                    jRBPatrimonio.setSelected(true);
                    jTFNumIdentificacao.setText("");
                    tf[4].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 5)));
                } else if (n == 1) {
                    jRBNIdentificacao.setSelected(true);
                    jTFPatrimonio.setText("");
                    tf[6].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 5)));
                }
            }

            jCBTipo.setSelectedItem(jTBens.getValueAt(linhaSelecionada, 2));
            jCBUnidades.setSelectedItem(unidade);
            carregaBloco();
            jCBBlocos.setSelectedItem(bloco);
            carregaAmbiente();
            jCBAmbientes.setSelectedItem(ambiente);
            carregaArmario();
            jCBArmarios.setSelectedItem(" ");
            carregaDivisao();
            jCBDivisoes.setSelectedItem(" ");

            cn.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar se é ni ou patrimonio!!!\n\nErro: " + ex.getMessage());
        }

    }

    void chamabens2() {
        int linhaSelecionada = jTBens.getSelectedRow();
        JTextField[] tf = dadosBens();
        try {
            String localizacao = String.valueOf(jTBens.getValueAt(linhaSelecionada, 7));
            String array[] = new String[5];
            array = localizacao.split(" - ");
            //  String divisao = array[0];
            //String armario = array[0];
            String ambiente = array[0];
            String bloco = array[1];
            String unidade = array[2];

            tf[0].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 0)));
            tf[1].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 1)));
            tf[2].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 3)));
            tf[3].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 4)));
            tf[5].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 6)));

            ResultSet r;
            Conexao cn = new Conexao();
            PreparedStatement p;
            Connection c = cn.fazConexao();
            String sql = "select * from bens where patrimonio =  " + jTBens.getValueAt(linhaSelecionada, 5);
            p = c.prepareStatement(sql);
            r = p.executeQuery();
            if (r.next()) {
                int n = r.getInt("ni");
                if (n == 0) {
                    jRBPatrimonio.setSelected(true);
                    jTFNumIdentificacao.setText("");
                    tf[4].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 5)));
                } else if (n == 1) {
                    jRBNIdentificacao.setSelected(true);
                    jTFPatrimonio.setText("");
                    tf[6].setText(String.valueOf(jTBens.getValueAt(linhaSelecionada, 5)));
                }
            }

            jCBTipo.setSelectedItem(jTBens.getValueAt(linhaSelecionada, 2));
            jCBUnidades.setSelectedItem(unidade);
            carregaBloco();
            jCBBlocos.setSelectedItem(bloco);
            carregaAmbiente();
            jCBAmbientes.setSelectedItem(ambiente);
            carregaArmario();
            jCBArmarios.setSelectedItem(" ");
            carregaDivisao();
            jCBDivisoes.setSelectedItem(" ");

            cn.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar se é ni ou patrimonio!!!\n\nErro: " + ex.getMessage());
        }

    }

    public void limpar() {
        jTFId.setText("");
        jTFDescricao.setText("");
        jTFMarca.setText("");
        jFTFValor.setText("");
        jTFPatrimonio.setText("");
        jTFNumIdentificacao.setText("");
        bGIdentificacao.clearSelection();
        jTFModelo.setText("");
        jCBTipo.setSelectedIndex(-1);
        jCBUnidades.setSelectedIndex(-1);
        jCBBlocos.removeAllItems();
        jCBAmbientes.removeAllItems();
        jCBArmarios.removeAllItems();
        jCBDivisoes.removeAllItems();
    }

    void setaNoBean() {
        bean.setIdBen(Integer.parseInt(id));
        bean.setDescricao(descricao);

        PreparedStatement pst;
        ResultSet rst;
        String sql = "select * from ambientes as a,blocos as b,unidades as u where "
                + "a.idbloco=b.idbloco and b.idunidade=u.idunidade"
                + " and a.descricao = '" + ambiente + "' and b.descricao = '" + bloco + "' "
                + "and u.nome = '" + unidade + "'";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                bean.setIdambiente(rs.getInt("idambiente"));

                //bean.setIddivisao(rs.getInt);
            }
            bean.setMarca(marca);
            bean.setModelo(modelo);
            bean.setPatrimonio(patrimonio);
            bean.setValor(valor);
            bean.setTipo(tipo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar id do ambiente e da divisão");
        }

    }

    void setaNosCampos() {
        if (id.equals("-1")) {

        } else {
            jTFId.setText(id);
            jCBTipo.setSelectedItem(tipo);
            jTFDescricao.setText(descricao);
            jTFMarca.setText(marca);
            jTFModelo.setText(modelo);
            if (ni == 0) {
                jRBPatrimonio.setSelected(true);
                jTFNumIdentificacao.setText("");
                jTFPatrimonio.setText(patrimonio);
            } else if (ni == 1) {
                jRBNIdentificacao.setSelected(true);
                jTFPatrimonio.setText("");
                jTFNumIdentificacao.setText(patrimonio);
            }

            jFTFValor.setText(valor);
            jCBUnidades.setSelectedItem(unidade);
            carregaBloco();
            jCBBlocos.setSelectedItem(bloco);
            carregaAmbiente();
            jCBAmbientes.setSelectedItem(ambiente);
            carregaArmario();
            jCBArmarios.setSelectedItem(armario);
            carregaDivisao();
            jCBDivisoes.setSelectedItem(divisao);
        }
    }

    void cadastraBens() {

        try {

            if (jCBAmbientes.getSelectedItem().equals(" ")) {
                bean.setIdambiente(0);
                bean.setIdarmario(0);
                bean.setIddivisao(0);
            } else {
                ////////////////////Pega Id do Ambiente\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
                PreparedStatement prs;
                ResultSet rss;
                Conexao cn = new Conexao();
                Connection coc = cn.fazConexao();

                String sqlAmbiente = "select * from ambientes as a,blocos as b, unidades as u "
                        + " where a.idbloco = b.idbloco AND b.idunidade = u.idunidade and"
                        + " a.descricao = '" + jCBAmbientes.getSelectedItem() + "' and "
                        + " b.descricao = '" + jCBBlocos.getSelectedItem() + "' and "
                        + "u.nome = '" + jCBUnidades.getSelectedItem() + "'";

                prs = coc.prepareStatement(sqlAmbiente);
                rss = prs.executeQuery();
                if (rss.next()) {
                    bean.setIdambiente(rss.getInt("idambiente"));
                    cn.fechaConexao();
                } else {
                    JOptionPane.showMessageDialog(null, "Ambiente não Existe!!");
                }
            }
            if (jCBArmarios.getSelectedItem().equals(" ")) {
                bean.setIdarmario(0);
                bean.setIddivisao(0);
            } else {
                ////////////////////Pega Id do Armario\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
                PreparedStatement p;
                ResultSet r;
                Conexao ca = new Conexao();
                Connection c = ca.fazConexao();

                String sqlArmario = "select * from armarios as ar,ambientes as a,blocos as b, unidades as u "
                        + " where ar.idambiente = a.idambiente and a.idbloco = b.idbloco AND "
                        + " b.idunidade = u.idunidade and ar.descricao = '" + jCBArmarios.getSelectedItem() + "' and "
                        + " a.descricao = '" + jCBAmbientes.getSelectedItem() + "' and "
                        + " b.descricao = '" + jCBBlocos.getSelectedItem() + "' and "
                        + "u.nome = '" + jCBUnidades.getSelectedItem() + "'";
                p = c.prepareStatement(sqlArmario);
                r = p.executeQuery();
                if (r.next()) {
                    bean.setIdarmario(r.getInt("idarmario"));
                    ca.fechaConexao();
                } else {
                    JOptionPane.showMessageDialog(null, "Armario não Existe!!!");
                }
                /*---------------------------------------------------------------------------*/
            }
            if (jCBDivisoes.getSelectedItem().equals(" ")) {
                bean.setIddivisao(0);
            } else {
                ////////////////////Pega Id do Divisão\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
                PreparedStatement p1;
                ResultSet r1;
                Conexao cv = new Conexao();
                Connection c1 = cv.fazConexao();

                String sqlDivisao = "select * from divisoes as d,armarios as ar,ambientes as a,blocos as b, unidades as u \n"
                        + " where ar.idambiente = a.idambiente and a.idbloco = b.idbloco AND "
                        + " b.idunidade = u.idunidade and d.descricao = '" + jCBDivisoes.getSelectedItem() + "' and "
                        + "  ar.descricao = '" + jCBArmarios.getSelectedItem() + "' and "
                        + " a.descricao = '" + jCBAmbientes.getSelectedItem() + "' and "
                        + " b.descricao = '" + jCBBlocos.getSelectedItem() + "' and "
                        + "u.nome = '" + jCBUnidades.getSelectedItem() + "'";
                p1 = c1.prepareStatement(sqlDivisao);
                r1 = p1.executeQuery();
                if (r1.next()) {
                    bean.setIddivisao(r1.getInt(" "));
                    cv.fechaConexao();
                } else {
                    JOptionPane.showMessageDialog(null, "Divisão não Existe!!!");
                }
                /*----------------------------------------------------------------------------*/
            }
            ///////////////////Pega Id do Bloco/////////////////////////////////////////////
            String sqlbloco = "select * from blocos as b, unidades as u "
                    + " where b.idunidade = u.idunidade and "
                    + " b.descricao = '" + jCBBlocos.getSelectedItem() + "' and "
                    + "u.nome = '" + jCBUnidades.getSelectedItem() + "'";
            PreparedStatement ps1;
            ResultSet rs1;
            Conexao cb = new Conexao();
            Connection con1 = cb.fazConexao();
            ps1 = con1.prepareStatement(sqlbloco);
            rs1 = ps1.executeQuery();
            if (rs1.next()) {
                bean.setIdbloco(rs1.getInt("idbloco"));
                cb.fechaConexao();
            }
            /*----------------------------------------------------------------------------*/

            bean.setDescricao(jTFDescricao.getText());
            bean.setMarca(jTFMarca.getText());
            bean.setModelo(jTFModelo.getText());
            if (jRBPatrimonio.isSelected() == true) {
                bean.setPatrimonio(jTFPatrimonio.getText());
                bean.setNi(0);
            } else if (jRBNIdentificacao.isSelected() == true) {
                bean.setPatrimonio(jTFNumIdentificacao.getText());
                bean.setNi(1);
            }
            bean.setTipo(String.valueOf(jCBTipo.getSelectedItem()));
            bean.setValor(jFTFValor.getText());
            dal.cadastrar(bean);
            m.listaBens(jTBens);
//            JOptionPane.showMessageDialog(null, "\tDADOS DO BEM\n\nDESCRIÇÃO: " + bean.getDescricao()
//                    + "\nTIPO: " + bean.getTipo() + "\nMARCA: " + bean.getMarca() + "\nMODELO: "
//                    + bean.getModelo() + "\nIDARMARIO: " + bean.getIdarmario() + "\nIDBLOCO: " + bean.getIdbloco()
//                    + "\nIDAMBIENTE: " + bean.getIdambiente() + "\nIDDIVISAO: " + bean.getIddivisao());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o id da divisão"
                    + ", do ambiente e do armario!!!\n\nErro: " + ex.getMessage(),
                    "Erro de SQL!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    void editar() {

        try {

            if (jCBAmbientes.getSelectedItem().equals(" ")) {
                bean.setIdambiente(0);
                bean.setIdarmario(0);
                bean.setIddivisao(0);
            } else {
                ////////////////////Pega Id do Ambiente\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
                PreparedStatement prs;
                ResultSet rss;
                Conexao cn = new Conexao();
                Connection coc = cn.fazConexao();

                String sqlAmbiente = "select * from ambientes as a,blocos as b, unidades as u "
                        + " where a.idbloco = b.idbloco AND b.idunidade = u.idunidade and"
                        + " a.descricao = '" + jCBAmbientes.getSelectedItem() + "' and "
                        + " b.descricao = '" + jCBBlocos.getSelectedItem() + "' and "
                        + "u.nome = '" + jCBUnidades.getSelectedItem() + "'";

                prs = coc.prepareStatement(sqlAmbiente);
                rss = prs.executeQuery();
                if (rss.next()) {
                    bean.setIdambiente(rss.getInt("idambiente"));
                    cn.fechaConexao();
                } else {
                    JOptionPane.showMessageDialog(null, "Ambiente não Existe!!");
                }
            }
            if (jCBArmarios.getSelectedItem().equals(" ")) {
                bean.setIdarmario(0);
                bean.setIddivisao(0);
            } else {
                ////////////////////Pega Id do Armario\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
                PreparedStatement p;
                ResultSet r;
                Conexao ca = new Conexao();
                Connection c = ca.fazConexao();

                String sqlArmario = "select * from armarios as ar,ambientes as a,blocos as b, unidades as u "
                        + " where ar.idambiente = a.idambiente and a.idbloco = b.idbloco AND "
                        + " b.idunidade = u.idunidade and ar.descricao = '" + jCBArmarios.getSelectedItem() + "' and "
                        + " a.descricao = '" + jCBAmbientes.getSelectedItem() + "' and "
                        + " b.descricao = '" + jCBBlocos.getSelectedItem() + "' and "
                        + "u.nome = '" + jCBUnidades.getSelectedItem() + "'";
                p = c.prepareStatement(sqlArmario);
                r = p.executeQuery();
                if (r.next()) {
                    bean.setIdarmario(r.getInt("idarmario"));
                    ca.fechaConexao();
                } else {
                    JOptionPane.showMessageDialog(null, "Armario não Existe!!!");
                }
                /*---------------------------------------------------------------------------*/
            }
            if (jCBDivisoes.getSelectedItem().equals(" ")) {
                bean.setIddivisao(0);
            } else {
                ////////////////////Pega Id do Divisão\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
                PreparedStatement p1;
                ResultSet r1;
                Conexao cv = new Conexao();
                Connection c1 = cv.fazConexao();

                String sqlDivisao = "select * from divisoes as d,armarios as ar,ambientes as a,blocos as b, unidades as u \n"
                        + " where ar.idambiente = a.idambiente and a.idbloco = b.idbloco AND "
                        + " b.idunidade = u.idunidade and d.descricao = '" + jCBDivisoes.getSelectedItem() + "' and "
                        + "  ar.descricao = '" + jCBArmarios.getSelectedItem() + "' and "
                        + " a.descricao = '" + jCBAmbientes.getSelectedItem() + "' and "
                        + " b.descricao = '" + jCBBlocos.getSelectedItem() + "' and "
                        + "u.nome = '" + jCBUnidades.getSelectedItem() + "'";
                p1 = c1.prepareStatement(sqlDivisao);
                r1 = p1.executeQuery();
                if (r1.next()) {
                    bean.setIddivisao(r1.getInt("iddivisao"));
                    cv.fechaConexao();
                } else {
                    JOptionPane.showMessageDialog(null, "Divisão não Existe!!!");
                }
                /*----------------------------------------------------------------------------*/
            }
            ///////////////////Pega Id do Bloco/////////////////////////////////////////////
            String sqlbloco = "select * from blocos as b, unidades as u "
                    + " where b.idunidade = u.idunidade and "
                    + " b.descricao = '" + jCBBlocos.getSelectedItem() + "' and "
                    + "u.nome = '" + jCBUnidades.getSelectedItem() + "'";
            PreparedStatement ps1;
            ResultSet rs1;
            Conexao cb = new Conexao();
            Connection con1 = cb.fazConexao();
            ps1 = con1.prepareStatement(sqlbloco);
            rs1 = ps1.executeQuery();
            if (rs1.next()) {
                bean.setIdbloco(rs1.getInt("idbloco"));
                cb.fechaConexao();
            }
            /*----------------------------------------------------------------------------*/
            bean.setIdBen(Integer.parseInt(jTFId.getText()));;
            bean.setDescricao(jTFDescricao.getText());
            bean.setMarca(jTFMarca.getText());
            bean.setModelo(jTFModelo.getText());
            if (jRBPatrimonio.isSelected() == true) {
                bean.setPatrimonio(jTFPatrimonio.getText());
                bean.setNi(0);
            } else if (jRBNIdentificacao.isSelected() == true) {
                bean.setPatrimonio(jTFNumIdentificacao.getText());
                bean.setNi(1);
            }
            bean.setTipo(String.valueOf(jCBTipo.getSelectedItem()));
            bean.setValor(jFTFValor.getText());
            dal.editar(bean);
            m.listaBens(jTBens);
//            JOptionPane.showMessageDialog(null, "\tDADOS DO BEM EDITADO\n\nDESCRIÇÃO: " + bean.getDescricao()
//                    + "\nTIPO: " + bean.getTipo() + "\nMARCA: " + bean.getMarca() + "\nMODELO: "
//                    + bean.getModelo() + "\nIDARMARIO: " + bean.getIdarmario() + "\nIDBLOCO: " + bean.getIdbloco()
//                    + "\nIDAMBIENTE: " + bean.getIdambiente() + "\nIDDIVISAO: " + bean.getIddivisao());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o id da divisão"
                    + " e do ambiente!!!\n\nErro: " + ex.getMessage(),
                    "Erro de SQL!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGIdentificacao;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox jCBAmbientes;
    private javax.swing.JComboBox jCBArmarios;
    private javax.swing.JComboBox jCBBlocos;
    private javax.swing.JComboBox jCBDivisoes;
    private javax.swing.JComboBox jCBTipo;
    private javax.swing.JComboBox jCBUnidades;
    private javax.swing.JFormattedTextField jFTFValor;
    private javax.swing.JLabel jLAmbientes;
    private javax.swing.JLabel jLArmarios;
    private javax.swing.JLabel jLBloco;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLDivisao;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLMarca;
    private javax.swing.JLabel jLModelo;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRBNIdentificacao;
    private javax.swing.JRadioButton jRBPatrimonio;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTBens;
    private javax.swing.JTextField jTFDescricao;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFMarca;
    private javax.swing.JTextField jTFModelo;
    private javax.swing.JTextField jTFNumIdentificacao;
    private javax.swing.JTextField jTFPatrimonio;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
