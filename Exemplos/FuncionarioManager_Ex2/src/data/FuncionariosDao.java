package data;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

// Essa será a classe responsável pela conexão e finalização da conexão com o banco e com todas as suas etapas de CRUD .
public class FuncionariosDao {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    
    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exemplo_senac", "root", "root");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }
    
    public int salvar(Funcionarios func) {
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO funcionarios VALUES(?,?,?,?)");
            st.setString(1,func.getMatricula());
            st.setString(2, func.getNome());
            st.setString(3, func.getCargo());
            st.setDouble(4, func.getSalario());
            status = st.executeUpdate();
            return status; // Retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
    
    public Funcionarios consultar (String matricula) {
        try {
            Funcionarios funcionario = new Funcionarios();
            st = conn.prepareStatement("SELECT * from funcionarios WHERE matricula = ?");
            st.setString(1, matricula);
            rs = st.executeQuery();
            
            // Verificar se a consulta encontrou o funcionario com a matricula informada
            if(rs.next()){ // se encontrou, vamos carregar os dados
                funcionario.setMatricula(rs.getString("matricula"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSalario(rs.getDouble("salario"));
                return funcionario;
            } else {
                return null;
            }
        } catch (SQLException ex){
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
    
    public boolean excluir(String matricula) {
        try {
            st = conn.prepareStatement("DELETE FROM funcionarios WHERE matricula = ?");
            st.setString(1, matricula);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public int atualizar(Funcionarios func) {
        int status;
        try {
            st = conn.prepareStatement("UPDATE funcionarios SET nome = ?, cargo = ?, salario = ? WHERE matricula = ?");
            st.setString(1, func.getNome());
            st.setString(2, func.getCargo());
            st.setDouble(3, func.getSalario());
            st.setString(4, func.getMatricula());
            status = st.executeUpdate();
            return status; // retornar 1
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }
    
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            
        }
    }
}
