/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import beans.Empresa;
import dao.EmpresaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author aline
 */
public class FormEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form FormEmpresa
     */
    public FormEmpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblEmpresa = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblNomeEmpresa = new javax.swing.JLabel();
        lblAreaAtuacao = new javax.swing.JLabel();
        lblPesquisaId = new javax.swing.JLabel();
        lblPesquisaNome = new javax.swing.JLabel();
        txtNomeEmpresa = new javax.swing.JTextField();
        txtPesquisaNome = new javax.swing.JTextField();
        cmbArea = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnPesquisarId = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEmpCadast = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtPesquisaId = new javax.swing.JTextField();
        btnPesquisarNome = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblEmpresa.setText("Empresa");

        lblId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblId.setText("ID:");

        lblNomeEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomeEmpresa.setText("Nome da Empresa:");

        lblAreaAtuacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAreaAtuacao.setText("Área de Atuação:");

        lblPesquisaId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPesquisaId.setText("Pesquisar empresa por ID:");

        lblPesquisaNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPesquisaNome.setText("Pesquisar empresa por nome:");

        txtNomeEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtPesquisaNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cmbArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração", "Contabilidade", "Medicina", "Informática", "Outros" }));

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnPesquisarId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPesquisarId.setText("Pesquisar");
        btnPesquisarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarIdActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 0, 51));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEmpCadast.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEmpCadast.setText("Empresas Cadastradas");
        btnEmpCadast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpCadastActionPerformed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtPesquisaId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnPesquisarNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPesquisarNome.setText("Pesquisar");
        btnPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarNomeActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPesquisarNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarId))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAreaAtuacao, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNomeEmpresa, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNomeEmpresa)
                                            .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblPesquisaId)
                                            .addComponent(lblId)
                                            .addComponent(lblPesquisaNome))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPesquisaId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(15, 15, 15)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEmpCadast)
                                .addGap(30, 30, 30)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarId)
                    .addComponent(txtPesquisaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisaId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarNome)
                    .addComponent(lblPesquisaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeEmpresa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreaAtuacao)
                    .addComponent(cmbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnEmpCadast)
                    .addComponent(btnEditar))
                .addGap(12, 12, 12))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nomeEmpresa = txtNomeEmpresa.getText();
        String areaAtuacao = cmbArea.getSelectedItem().toString();
        
        Empresa empresa = new Empresa();
        
        empresa.setNomeEmpresa(nomeEmpresa);
        empresa.setAreaAtuacao(areaAtuacao);
        
        EmpresaDAO empresaDAO = new EmpresaDAO();
        empresaDAO.inserir(empresa);
        
        txtNomeEmpresa.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarIdActionPerformed
        int idPesquisa = Integer.parseInt(txtPesquisaNome.getText());

        EmpresaDAO empresaDAO = new EmpresaDAO();
        Empresa empresa = (Empresa) empresaDAO.getEmpresa();

        if (empresa == null) {
            JOptionPane.showMessageDialog(this, "Curso não encontrado!");
        } else {
            txtNomeEmpresa.setText(empresa.getNomeEmpresa());
            cmbArea.setSelectedItem(empresa.getAreaAtuacao());
        }
    }//GEN-LAST:event_btnPesquisarIdActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int id = Integer.parseInt(txtId.getText());
        
        EmpresaDAO empresaDAO = new EmpresaDAO();
        empresaDAO.excluir(id);
        
        txtId.setText("");
        txtNomeEmpresa.setText("");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEmpCadastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpCadastActionPerformed
        //Vinculando o formRelatorioEmpresas ao botão Empresas Cadastradas
        FormRelatorioEmpresas fre = new FormRelatorioEmpresas();
        //Mostrando o form quando clicar no botão
        fre.setVisible(true);
    }//GEN-LAST:event_btnEmpCadastActionPerformed

    private void btnPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarNomeActionPerformed
            
        
        String nomepesquisa = txtPesquisaNome.getText();

        EmpresaDAO empresaDAO = new EmpresaDAO();
        Empresa empresa = empresaDAO.getEmpresaNome(nomepesquisa);

        if (empresa == null) {
            JOptionPane.showMessageDialog(this, "Empresa não encontrado!");
        } else {
            txtId.setText(String.valueOf(empresa.getId()));
            txtNomeEmpresa.setText(empresa.getNomeEmpresa());
            cmbArea.setSelectedItem(empresa.getAreaAtuacao());
        }
    }//GEN-LAST:event_btnPesquisarNomeActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Pegar o código que o usuário digitou no campo de texto, converte para inteiro e salvar da variavel id
        int id = Integer.parseInt(txtId.getText());
        String nomeempresa = txtNomeEmpresa.getText();
        String areadeatuacao = cmbArea.getSelectedItem().toString();

        Empresa empresa = new Empresa();
        empresa.setId(id);
        empresa.setNomeEmpresa(nomeempresa);
        empresa.setAreaAtuacao(areadeatuacao);

        EmpresaDAO empresaDAO = new EmpresaDAO();
        empresaDAO.editar(empresa);

        //limpando os campos
        txtId.setText("");
        txtNomeEmpresa.setText("");
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEmpCadast;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisarId;
    private javax.swing.JButton btnPesquisarNome;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAreaAtuacao;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblPesquisaId;
    private javax.swing.JLabel lblPesquisaNome;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeEmpresa;
    private javax.swing.JTextField txtPesquisaId;
    private javax.swing.JTextField txtPesquisaNome;
    // End of variables declaration//GEN-END:variables
}
