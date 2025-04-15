package data;

import connection.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
                    int idGerado = rs.getInt(1); // Pega o ID gerado pela base de dados
                    filme.setId(idGerado); // Caso queira, associa o ID gerado ao objeto filme
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
    
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException sqle) {
            
        }
    }
}
