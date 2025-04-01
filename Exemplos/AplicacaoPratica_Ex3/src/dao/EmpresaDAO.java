package dao;

import beans.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conexao.Conexao;

public class EmpresaDAO {
    private Conexao conexao;
    private Connection conn;

    public EmpresaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
        }

    public void inserir(Empresa empresa) {
            String sql = "INSERT INTO empresa(nomeempresa, areaatuacao) VALUES" + "(?, ?)";
            try {
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1, empresa.getNomeEmpresa());
                stmt.setString(2, empresa.getAreaAtuacao());
                stmt.execute();
            } catch (Exception e) {
                System.out.println("Erro ao inserir empresa: " + e.getMessage());
            }
    }
    
    public Empresa getEmpresa (int id) {
        String sql = "SELECT * FROM empresa WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            Empresa empresa = new Empresa();
            
            rs.next();
            empresa.setId(id);
            empresa.setNomeEmpresa(rs.getString("nomeempresa"));
            empresa.setAreaAtuacao(rs.getString("areaatuacao"));
            
            return empresa;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }
}
