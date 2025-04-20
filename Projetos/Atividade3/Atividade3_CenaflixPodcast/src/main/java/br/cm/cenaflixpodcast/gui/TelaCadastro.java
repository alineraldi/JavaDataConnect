package br.cm.cenaflixpodcast.gui;

import br.cm.cenaflixpodcast.persistencia.Podcast;
import br.cm.cenaflixpodcast.persistencia.PodcastDAO;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {


    public TelaCadastro() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblProdutor = new javax.swing.JLabel();
        lblNomeEpisodio = new javax.swing.JLabel();
        txtProdutor = new javax.swing.JTextField();
        txtNomeEpisodio = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lblSubtitle = new javax.swing.JLabel();
        lblNumeroEpisodio = new javax.swing.JLabel();
        txtNumeroEpisodio = new javax.swing.JTextField();
        txtDuracao = new javax.swing.JTextField();
        lblDuracao = new javax.swing.JLabel();
        lblUrlRepositorio = new javax.swing.JLabel();
        txtUrlRepositorio = new javax.swing.JTextField();
        btnListagem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(20, 20, 20));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("CENAFLIX");

        lblProdutor.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutor.setText("Produtor");

        lblNomeEpisodio.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeEpisodio.setText("Nome do Episódio");

        txtProdutor.setBackground(new java.awt.Color(34, 34, 34));
        txtProdutor.setForeground(new java.awt.Color(255, 255, 255));
        txtProdutor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));

        txtNomeEpisodio.setBackground(new java.awt.Color(34, 34, 34));
        txtNomeEpisodio.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeEpisodio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));

        btnCadastrar.setBackground(new java.awt.Color(229, 9, 20));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblSubtitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(153, 153, 153));
        lblSubtitle.setText("CADASTRAR PODCAST");

        lblNumeroEpisodio.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroEpisodio.setText("Nº do Episódio");

        txtNumeroEpisodio.setBackground(new java.awt.Color(34, 34, 34));
        txtNumeroEpisodio.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroEpisodio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));

        txtDuracao.setBackground(new java.awt.Color(34, 34, 34));
        txtDuracao.setForeground(new java.awt.Color(255, 255, 255));
        txtDuracao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));

        lblDuracao.setForeground(new java.awt.Color(255, 255, 255));
        lblDuracao.setText("Duração");

        lblUrlRepositorio.setForeground(new java.awt.Color(255, 255, 255));
        lblUrlRepositorio.setText("URL do Repositório");

        txtUrlRepositorio.setBackground(new java.awt.Color(34, 34, 34));
        txtUrlRepositorio.setForeground(new java.awt.Color(255, 255, 255));
        txtUrlRepositorio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(85, 85, 85), 1, true));

        btnListagem.setBackground(new java.awt.Color(255, 255, 255));
        btnListagem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListagem.setForeground(new java.awt.Color(34, 34, 34));
        btnListagem.setText("Catálogo");
        btnListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("podcasts");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNumeroEpisodio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumeroEpisodio, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addComponent(lblProdutor)
                                .addComponent(lblNomeEpisodio)
                                .addComponent(lblDuracao)
                                .addComponent(lblUrlRepositorio)
                                .addComponent(txtDuracao)
                                .addComponent(txtNomeEpisodio)
                                .addComponent(txtUrlRepositorio)
                                .addComponent(txtProdutor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblSubtitle)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(btnListagem)))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)))
                .addGap(18, 18, 18)
                .addComponent(lblSubtitle)
                .addGap(18, 18, 18)
                .addComponent(lblProdutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNomeEpisodio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroEpisodio)
                    .addComponent(txtNumeroEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDuracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUrlRepositorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUrlRepositorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnListagem))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            String produtor = txtProdutor.getText();
            String nomeEpisodio = txtNomeEpisodio.getText();
            int numeroEpisodio = Integer.parseInt(txtNumeroEpisodio.getText());
            String duracao = txtDuracao.getText();
            String urlRepositorio = txtUrlRepositorio.getText();
            
            Podcast p = new Podcast();
            p.setProdutor(produtor);
            p.setNome(nomeEpisodio);
            p.setNumero(numeroEpisodio);
            p.setDuracao(duracao);
            p.setUrl(urlRepositorio);
            
            PodcastDAO podcastDao = new PodcastDAO();
            podcastDao.cadastrar(p);
            
            JOptionPane.showMessageDialog(this, "Boa! Podcast cadastrado com sucesso.");
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha! Tente novamente.");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemActionPerformed
        TelaListagem telaListagem = new TelaListagem();
        telaListagem.setVisible(true);
    }//GEN-LAST:event_btnListagemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnListagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblNomeEpisodio;
    private javax.swing.JLabel lblNumeroEpisodio;
    private javax.swing.JLabel lblProdutor;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUrlRepositorio;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtNomeEpisodio;
    private javax.swing.JTextField txtNumeroEpisodio;
    private javax.swing.JTextField txtProdutor;
    private javax.swing.JTextField txtUrlRepositorio;
    // End of variables declaration//GEN-END:variables
}
