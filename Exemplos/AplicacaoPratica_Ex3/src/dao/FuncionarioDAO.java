package dao;

import beans.Funcionario;
import beans.Empresa;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class FuncionarioDAO {
    
    private Conexao conexao;
    private Connection conn;

    public FuncionarioDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
        }

    public void inserir(Funcionario funcionario) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String sql = "INSERT INTO funcionario(nomefunc, empresaid, admissao) VALUES" + "(?, ?, ?)";
            try {
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1, funcionario.getNomefunc());
                stmt.setInt(2, funcionario.getEmpresaid().getId());
                stmt.setString(3, sdf.format(funcionario.getDataadmissao()));
                stmt.execute();
            } catch (Exception e) {
                System.out.println("Erro ao inserir funcionario: " + e.getMessage());
            }
    }
    
      
    public void editar(Funcionario funcionario) {
        String sql = "UPDATE funcionario SET nomefunc=?, empresaid=? WHERE id=?";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, funcionario.getNomefunc());
            stmt.setInt(2, funcionario.getEmpresaid().getId());
            stmt.setInt(3, funcionario.getId());
            
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao editar empresa " + e.getMessage());
        }
    }
    
    public void excluir (int id) {
        String sql = "DELETE FROM funcionario WHERE id = ?";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao excluir empresa: " + e.getMessage());
        }
    }
    
}
