package forms;

import beans.Empresa;
import beans.Funcionario;
import dao.EmpresaDAO;
import dao.FuncionarioDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class FormFuncionario extends javax.swing.JFrame {

    private void preencherComboEmpresa() {
        EmpresaDAO empresaDAO = new EmpresaDAO();
        List<Empresa> lista = empresaDAO.getEmpresa();
        // Percorrer essa lista e cada empresa que ele achar, colocar dentro da ComboBox
        for (Empresa c : lista) {
            cmbEmpresa.addItem(c);
        }
    }
    
    public FormFuncionario() {
        initComponents();
        preencherComboEmpresa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblNomeFunc = new javax.swing.JLabel();
        lblEmpresa = new javax.swing.JLabel();
        lblDataAdmissao = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtDataAdmissao = new javax.swing.JTextField();
        cmbEmpresa = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulário de Funcionários");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setText("Formulário de Funcionários");

        lblNomeFunc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeFunc.setText("Nome do Funcionário:");

        lblEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpresa.setText("Empresa:");

        lblDataAdmissao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataAdmissao.setText("Data de admissão:");

        txtNomeFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFuncionarioActionPerformed(evt);
            }
        });

        txtDataAdmissao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDataAdmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataAdmissaoActionPerformed(evt);
            }
        });

        cmbEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(lblTitle)
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpresa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNomeFunc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDataAdmissao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSalvar)
                        .addComponent(txtNomeFuncionario)
                        .addComponent(cmbEmpresa, 0, 289, Short.MAX_VALUE))
                    .addComponent(txtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeFunc))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpresa)
                    .addComponent(cmbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataAdmissao)
                    .addComponent(txtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFuncionarioActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Pegando os valores do formulário digitado e selecionado pelo usuário
        
        String nomefunc = txtNomeFuncionario.getText();
        Empresa empresaid = (Empresa) cmbEmpresa.getSelectedItem();
        
        // Passando os valores fornecidos pelo usuário
        Funcionario funcionario = new Funcionario();
        funcionario.setNomefunc(nomefunc);
        funcionario.setEmpresaid(empresaid);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            // Método para converter String para Date
            funcionario.setDataadmissao(sdf.parse(txtDataAdmissao.getText()));
        } catch (ParseException ex) {
            System.out.println("Erro ao converter o texto para data.");
        }
        
        // Chamando o método de inserção
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.inserir(funcionario);
        
        // Limpar os campos
        txtNomeFuncionario.setText("");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtDataAdmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataAdmissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataAdmissaoActionPerformed

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
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbEmpresa;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDataAdmissao;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblNomeFunc;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtDataAdmissao;
    private javax.swing.JTextField txtNomeFuncionario;
    // End of variables declaration//GEN-END:variables
}
