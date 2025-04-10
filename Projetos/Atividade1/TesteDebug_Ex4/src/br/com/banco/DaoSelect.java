package br.com.banco;

import br.com.model.DadosPessoa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoSelect {
    
    private ConexaoMySql conexao;
    private Statement stm;
    private Connection con;
    private ResultSet rs;
    
    public void connect() {
        try {
            conexao = new ConexaoMySql();
            con = conexao.getConnection();
            stm = con.createStatement();
        } catch (SQLException sqle) {
            Logger.getLogger(DaoSelect.class.getName()).log(Level.SEVERE, null, sqle);
        }
    }
    
    public void deconnect() {
        try {
            stm.close();
            con.close();
        } catch (SQLException sqle) {
            Logger.getLogger(DaoSelect.class.getName()).log(Level.SEVERE, null, sqle); // está registrando um erro grave no log, dizendo que algo deu muito errado durante a execução (como uma falha na conexão com o banco de dados), e incluindo todos os detalhes técnicos dessa exceção.
                    JOptionPane.showMessageDialog(null, sqle.getMessage());
        }
    }
    
    public ResultSet selectPessoa() {
        try {
            return stm.executeQuery("SELECT * FROM PESSOA");
        } catch (SQLException sqle) {
            Logger.getLogger(DaoSelect.class.getName()).log(Level.SEVERE, null, sqle);
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        }
        return null;
    }
    
    public void insertPessoa(DadosPessoa d) {
        try {
            stm.execute("INSERT INTO PESSOA (NOME, TELEFONE, IDADE, PESO, CPF) VALUES ('"+d.getNome()+"','"+d.getTelefone()+"','"+d.getIdade()+"','"+d.getPeso()+"','"+d.getCpf()+"');");
        } catch (SQLException sqle) {
            Logger.getLogger(DaoSelect.class.getName()).log(Level.SEVERE, null, sqle);
            JOptionPane.showMessageDialog(null, sqle.getMessage());
        }
    }
}
