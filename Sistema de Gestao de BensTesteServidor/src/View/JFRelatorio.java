package View;

import Controle.Metodos;
import javax.swing.ImageIcon;

public class JFRelatorio extends javax.swing.JFrame {

    private String sql, url, caminho = "C:\\SGBens\\src";
    Metodos m = new Metodos();

    public JFRelatorio() {
        initComponents();
        ImageIcon icone = new ImageIcon("C:\\SGBens\\src\\Imagens\\icone.png");
        setIconImage(icone.getImage());
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLImagem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBRealtBensPatrimonio = new javax.swing.JButton();
        jBRelatBensNumIdentificacao = new javax.swing.JButton();
        jBRelatGeral = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBTorneariaPatrimonio = new javax.swing.JButton();
        jBRelatTornearia = new javax.swing.JButton();
        jBTorneariaNumInscricao = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jBLabMetrologiaPatrimonio = new javax.swing.JButton();
        jBRelatLabMetrologia = new javax.swing.JButton();
        jBLabMetrologiaNumInscricao = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jBFresagemPatrimonio = new javax.swing.JButton();
        jBRelatFresagemAjustagem = new javax.swing.JButton();
        jBFresagemNumInscricao = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jBToenoCNCNumInscricao = new javax.swing.JButton();
        jBRelatTornoCnc = new javax.swing.JButton();
        jBTornoCNCPatrimonio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatorios");

        jLTitulo.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Relatorios");

        jLImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/report.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatorio Geral da Unidade"));

        jBRealtBensPatrimonio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRealtBensPatrimonio.setText("Bens com Patrimonio");
        jBRealtBensPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRealtBensPatrimonioActionPerformed(evt);
            }
        });

        jBRelatBensNumIdentificacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRelatBensNumIdentificacao.setText("Bens com N°.Identificação");
        jBRelatBensNumIdentificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRelatBensNumIdentificacaoActionPerformed(evt);
            }
        });

        jBRelatGeral.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRelatGeral.setText("Geral");
        jBRelatGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRelatGeralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBRelatGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRelatBensNumIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRealtBensPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBRealtBensPatrimonio, jBRelatBensNumIdentificacao, jBRelatGeral});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBRelatGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRealtBensPatrimonio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRelatBensNumIdentificacao, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBRealtBensPatrimonio, jBRelatGeral});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatorio Tornearia"));

        jBTorneariaPatrimonio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTorneariaPatrimonio.setText("Bens com Patrimonio");
        jBTorneariaPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTorneariaPatrimonioActionPerformed(evt);
            }
        });

        jBRelatTornearia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRelatTornearia.setText("Tornearia");
        jBRelatTornearia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRelatTorneariaActionPerformed(evt);
            }
        });

        jBTorneariaNumInscricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTorneariaNumInscricao.setText("Bens com N°.Identificação");
        jBTorneariaNumInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTorneariaNumInscricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTorneariaPatrimonio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBRelatTornearia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTorneariaNumInscricao, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBRelatTornearia, jBTorneariaNumInscricao, jBTorneariaPatrimonio});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBRelatTornearia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTorneariaPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTorneariaNumInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBRelatTornearia, jBTorneariaNumInscricao, jBTorneariaPatrimonio});

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatorio do Lab. Metrologia"));

        jBLabMetrologiaPatrimonio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBLabMetrologiaPatrimonio.setText("Bens com Patrimonio");
        jBLabMetrologiaPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLabMetrologiaPatrimonioActionPerformed(evt);
            }
        });

        jBRelatLabMetrologia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRelatLabMetrologia.setText("Lab. Metrologia");
        jBRelatLabMetrologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRelatLabMetrologiaActionPerformed(evt);
            }
        });

        jBLabMetrologiaNumInscricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBLabMetrologiaNumInscricao.setText("Bens com N°.Identificação");
        jBLabMetrologiaNumInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLabMetrologiaNumInscricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBLabMetrologiaPatrimonio)
                    .addComponent(jBLabMetrologiaNumInscricao)
                    .addComponent(jBRelatLabMetrologia, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBLabMetrologiaNumInscricao, jBLabMetrologiaPatrimonio, jBRelatLabMetrologia});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBRelatLabMetrologia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBLabMetrologiaPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBLabMetrologiaNumInscricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatorio da Fresagem e Ajustagem"));

        jBFresagemPatrimonio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBFresagemPatrimonio.setText("Bens com Patrimonio");
        jBFresagemPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFresagemPatrimonioActionPerformed(evt);
            }
        });

        jBRelatFresagemAjustagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRelatFresagemAjustagem.setText("Fresagem e Ajustagem");
        jBRelatFresagemAjustagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRelatFresagemAjustagemActionPerformed(evt);
            }
        });

        jBFresagemNumInscricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBFresagemNumInscricao.setText("Bens com N°.Identificação");
        jBFresagemNumInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFresagemNumInscricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBFresagemPatrimonio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBFresagemNumInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRelatFresagemAjustagem, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBFresagemNumInscricao, jBFresagemPatrimonio, jBRelatFresagemAjustagem});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBRelatFresagemAjustagem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFresagemPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFresagemNumInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatorio do Torno CNC"));

        jBToenoCNCNumInscricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBToenoCNCNumInscricao.setText("Bens com N°.Identificação");
        jBToenoCNCNumInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBToenoCNCNumInscricaoActionPerformed(evt);
            }
        });

        jBRelatTornoCnc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRelatTornoCnc.setText("Torno CNC");
        jBRelatTornoCnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRelatTornoCncActionPerformed(evt);
            }
        });

        jBTornoCNCPatrimonio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBTornoCNCPatrimonio.setText("Bens com Patrimonio");
        jBTornoCNCPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTornoCNCPatrimonioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBToenoCNCNumInscricao, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jBRelatTornoCnc, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jBTornoCNCPatrimonio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBRelatTornoCnc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTornoCNCPatrimonio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBToenoCNCNumInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBToenoCNCNumInscricao, jBTornoCNCPatrimonio});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLImagem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBRelatTorneariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRelatTorneariaActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades "
                + " AS u where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and bl.idunidade = u.idunidade and "
                + " a.idambiente = 1 and bl.idbloco = 3 and "
                + " u.idunidade = 2";
        url = caminho + "\\Relatorios\\RelatBensTorneariaSenaiRoo.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBRelatTorneariaActionPerformed

    private void jBRelatLabMetrologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRelatLabMetrologiaActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades \n"
                + " AS u where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and bl.idunidade = u.idunidade and \n"
                + " a.idambiente = 2 and bl.idbloco = 3 and u.idunidade = 2";
        url = caminho + "\\Relatorios\\RelatBensLabMetrologia.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBRelatLabMetrologiaActionPerformed

    private void jBRelatFresagemAjustagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRelatFresagemAjustagemActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades \n"
                + " AS u where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and bl.idunidade = u.idunidade and \n"
                + " a.idambiente = 4 and bl.idbloco = 3 and u.idunidade = 2";
        url = caminho + "\\Relatorios\\RelaBensFresagemAjustagem.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBRelatFresagemAjustagemActionPerformed

    private void jBRelatTornoCncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRelatTornoCncActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades \n"
                + " AS u where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and bl.idunidade = u.idunidade and \n"
                + " a.idambiente = 3 and bl.idbloco = 3 and \n"
                + " u.idunidade = 2";
        url = caminho + "\\Relatorios\\RelatBensTornoCnc.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBRelatTornoCncActionPerformed

    private void jBRelatGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRelatGeralActionPerformed
        sql = "select b.descricao as ben,b.patrimonio,b.valor,b.modelo,b.marca,u.nome,bo.descricao as bloco\n"
                + "from bens as b,blocos as bo,unidades as U \n"
                + "where b.idbloco = bo.idbloco and bo.idunidade=u.idunidade\n"
                + "and u.idunidade = 2";
        url = caminho + "\\Relatorios\\RelatGeralUnidade.jasper";
        //JOptionPane.showMessageDialog(null, url);
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBRelatGeralActionPerformed

    private void jBRelatBensNumIdentificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRelatBensNumIdentificacaoActionPerformed
        sql = "select b.*,bo.descricao as bloco,u.nome unidade from bens as b,blocos as bo,unidades as u \n"
                + "where b.idbloco = bo.idbloco and bo.idunidade = u.idunidade and b.ni = 1 and "
                + "u.idunidade = 2 order by b.patrimonio asc";
        url = caminho + "\\Relatorios\\RelatBensNumIdentificacao.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBRelatBensNumIdentificacaoActionPerformed

    private void jBRealtBensPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRealtBensPatrimonioActionPerformed
        sql = "select b.*,bo.descricao as bloco,u.nome unidade from bens as b,blocos as bo,unidades as u \n"
                + "where b.idbloco = bo.idbloco and bo.idunidade = u.idunidade and b.ni = 0 and u.idunidade = 2";
        url = caminho + "\\Relatorios\\RelatBensPatrimonio.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBRealtBensPatrimonioActionPerformed

    private void jBTorneariaPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTorneariaPatrimonioActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades AS u \n"
                + "where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and "
                + "bl.idunidade = u.idunidade and a.idambiente = 1 and bl.idbloco = 3 and u.idunidade = 2\n"
                + "and b.ni = 0";
        url = caminho + "\\Relatorios\\RelatBensTorneariaSenaiRoo-Patrimonio.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBTorneariaPatrimonioActionPerformed

    private void jBFresagemNumInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFresagemNumInscricaoActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades \n"
                + " AS u where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and bl.idunidade = u.idunidade and \n"
                + " a.idambiente = 4 and bl.idbloco = 3 and \n"
                + " u.idunidade = 2 and b.ni = 1";
        url = caminho + "\\Relatorios\\RelaBensFresagemAjustagem-NumIden.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBFresagemNumInscricaoActionPerformed

    private void jBLabMetrologiaNumInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLabMetrologiaNumInscricaoActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades \n"
                + " AS u where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and bl.idunidade = u.idunidade and \n"
                + " a.idambiente = 2 and bl.idbloco = 3 and \n"
                + " u.idunidade = 2 and b.ni = 1";
        url = caminho + "\\Relatorios\\RelatBensLabMetrologia-NumIden.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBLabMetrologiaNumInscricaoActionPerformed

    private void jBTorneariaNumInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTorneariaNumInscricaoActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades AS u \n"
                + "where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and "
                + "bl.idunidade = u.idunidade and a.idambiente = 1 and bl.idbloco = 3 and u.idunidade = 2\n"
                + "and b.ni = 1";
        url = caminho + "\\Relatorios\\RelatBensTorneariaSenaiRoo-NumIdent.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBTorneariaNumInscricaoActionPerformed

    private void jBTornoCNCPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTornoCNCPatrimonioActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades \n"
                + " AS u where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and bl.idunidade = u.idunidade and \n"
                + " a.idambiente = 3 and bl.idbloco = 3 and \n"
                + " u.idunidade = 2 and b.ni = 0";
        url = caminho + "\\Relatorios\\RelatBensTornoCnc -Patrimonio.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBTornoCNCPatrimonioActionPerformed

    private void jBToenoCNCNumInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBToenoCNCNumInscricaoActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades \n"
                + " AS u where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and bl.idunidade = u.idunidade and \n"
                + " a.idambiente = 3 and bl.idbloco = 3 and \n"
                + " u.idunidade = 2 and b.ni = 1";
        url = caminho + "\\Relatorios\\RelatBensTornoCnc -NumIndent.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBToenoCNCNumInscricaoActionPerformed

    private void jBLabMetrologiaPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLabMetrologiaPatrimonioActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades \n"
                + " AS u where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and bl.idunidade = u.idunidade and \n"
                + " a.idambiente = 2 and bl.idbloco = 3 and \n"
                + " u.idunidade = 2 and b.ni = 0";
        url = caminho + "\\Relatorios\\RelatBensLabMetrologia-Patrimonio.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBLabMetrologiaPatrimonioActionPerformed

    private void jBFresagemPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFresagemPatrimonioActionPerformed
        sql = "select b.*,a.descricao as ambiente,u.nome as unidade from bens as b,ambientes as a,blocos as bl,unidades \n"
                + " AS u where b.idambiente = a.idambiente and a.idbloco = bl.idbloco and bl.idunidade = u.idunidade and \n"
                + " a.idambiente = 4 and bl.idbloco = 3 and \n"
                + " u.idunidade = 2 and b.ni = 0";
        url = caminho + "\\Relatorios\\RelaBensFresagemAjustagem-Patrimonio.jasper";
        m.chamaRelatorio(sql, url);
    }//GEN-LAST:event_jBFresagemPatrimonioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFresagemNumInscricao;
    private javax.swing.JButton jBFresagemPatrimonio;
    private javax.swing.JButton jBLabMetrologiaNumInscricao;
    private javax.swing.JButton jBLabMetrologiaPatrimonio;
    private javax.swing.JButton jBRealtBensPatrimonio;
    private javax.swing.JButton jBRelatBensNumIdentificacao;
    private javax.swing.JButton jBRelatFresagemAjustagem;
    private javax.swing.JButton jBRelatGeral;
    private javax.swing.JButton jBRelatLabMetrologia;
    private javax.swing.JButton jBRelatTornearia;
    private javax.swing.JButton jBRelatTornoCnc;
    private javax.swing.JButton jBToenoCNCNumInscricao;
    private javax.swing.JButton jBTorneariaNumInscricao;
    private javax.swing.JButton jBTorneariaPatrimonio;
    private javax.swing.JButton jBTornoCNCPatrimonio;
    private javax.swing.JLabel jLImagem;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables

}
