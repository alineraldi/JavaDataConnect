package data;

import connection.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FilmeDao {
  
    private Conexao conexao;
    private Connection conn;
    PreparedStatement st;

    public FilmeDao() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    
    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/alineraldi_atividade2", "root", "root");
            return true;
        } catch (ClassNotFoundException | SQLException sqle) {
            System.out.println("Erro ao conectar:" + sqle.getMessage());
            return false;
        }
    }
    
    public int cadastrar(Filme filme) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO filmes "
                    + "(nome, dataLancamento, categoria) VALUES(?,?,?)",
                    java.sql.Statement.RETURN_GENERATED_KEYS);
            st.setString(1,filme.getNome());
            st.setString(2, filme.getDataLancamento());
            st.setString(3, filme.getCategoria());
            status = st.executeUpdate();
            
            if (status > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int idGerado = rs.getInt(1);
                    filme.setId(idGerado); 
                }
            }
            
            return status;
        } catch (SQLException sqle) {
            System.out.println("Erro ao conectar: " + sqle.getMessage());
            return sqle.getErrorCode();
        }
    }
    
    public Filme getFilmeNome(String nome) {
        String sql = "SELECT * FROM filmes WHERE nome LIKE ?";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            Filme filme = new Filme();
            rs.next();
            filme.setId(rs.getInt("id"));
            filme.setNome(rs.getString("nome"));
            filme.setDataLancamento(rs.getString("dataLancamento"));
            filme.setCategoria(rs.getString("categoria"));
            return filme;
        } catch (Exception sqle) {
            System.out.println("Erro ao pesquisar filme: " + sqle.getMessage());
            return null;
        }
    }
    
    
    public Filme getFilmeCategoria(String categoria) {
        String sql = "SELECT * FROM filmes WHERE categoria LIKE ?";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, categoria);

            ResultSet rs = stmt.executeQuery();

            Filme filme = new Filme();
            rs.next();
            filme.setId(rs.getInt("id"));
            filme.setNome(rs.getString("nome"));
            filme.setDataLancamento(rs.getString("dataLancamento"));
            filme.setCategoria(rs.getString("categoria"));
            return filme;
        } catch (Exception sqle) {
            System.out.println("Erro ao pesquisar filme: " + sqle.getMessage());
            return null;
        }
    }
    
    public boolean excluir(String nome) {
        String sql = "DELETE FROM filmes WHERE nome = ?";
                
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, nome);
            int resultado = stmt.executeUpdate();
            return resultado > 0;
        } catch (SQLException sqle) {
            System.out.println("Erro ao excluir filme: " + sqle.getMessage());
            return false;
        }
    }
    
    public boolean editar(Filme filme, String nomeOriginal) {
        if (conn == null) {
        System.out.println("Erro: Conexão com o banco de dados não estabelecida.");
        return false;
        }
        String sql = "UPDATE filmes SET nome = ?, dataLancamento = ?, categoria = ? WHERE nome = ?";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, filme.getNome());
            stmt.setString(2, filme.getDataLancamento());
            stmt.setString(3, filme.getCategoria());
            stmt.setString(4, nomeOriginal);
            
            int resultado = stmt.executeUpdate();
            
            return resultado > 0;
        } catch (SQLException sqle) {
            System.out.println("Erro ao atualizar filme: " + sqle.getMessage());
            sqle.printStackTrace();
            System.out.println("Código de erro SQL: " + sqle.getErrorCode());
            return false;
        }
    }
    
    public DefaultTableModel buscarFilmes() {
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("ID");
        model.addColumn("Nome");
        model.addColumn("Data de Lançamento");
        model.addColumn("Categoria");
        
        String sql = "SELECT id, nome, datalancamento, categoria FROM filmes";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("dataLancamento"),
                    rs.getString("categoria")
                });
            }
        } catch (SQLException sqle) {
            System.out.println("Erro ao encontrar filmes: " + sqle.getMessage());
        }
        
        return model;
    }
    
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException sqle) {
            
        }
    }
}
