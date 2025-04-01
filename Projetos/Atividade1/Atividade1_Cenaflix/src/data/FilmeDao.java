package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class FilmeDao {
  
    Connection conn;
    PreparedStatement st;
    
    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/alineraldi_atividade1", "root", "root");
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
    
    
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException sqle) {
            
        }
    }
}
