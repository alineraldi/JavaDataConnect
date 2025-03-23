/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manipulacaodados;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class ManipulacaoDadosPreparedStatement {
        public static void main(String[] args) {
        try { 
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver JDBC carregado");
        } catch (ClassNotFoundException cnfe) {
            System.out.println( "Driver JDBC nao encontrado: " + cnfe.getMessage());
        }
        
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola", "root", "root");
            System.out.println("Conexão com o banco de dados estabelecida");
        } catch (SQLException sqle) {
            System.out.println("Erro na conexão ao Banco de Dados: " + sqle.getMessage());
        }
        
        Statement stmt = null;
        
        // Objeto para executar comandos SQL ↓
        PreparedStatement ps = null;
        
//        // INSERT
//        String sql = "insert into alunos values (?,?,?,?)";
//        
//        try {
//            ps = con.prepareStatement(sql); // Ligando a variável a uma conexão já existente
//            ps.setInt(1, 2); // ps.tipoDeDado(ordem, valor)
//            ps.setString(2, "Érico");
//            ps.setInt(3, 30);
//            ps.setString(4, "Rua das Araucárias, 20");
//            
//            ps.executeUpdate(); // Finaliza a inserção de dados
//            
//            System.out.println("Dados inseridos com sucesso.");
//        } catch (SQLException sqle) {
//            System.out.println("Erro no acesso ao Banco de Dados: " + sqle.getMessage());
//        }
//        
//        // DELETE
//        String sql = "delete from alunos where id=?";
//        
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(1,2);
//            ps.executeUpdate();
//            System.out.println("Dados excluídos com sucesso.");
//        } catch (SQLException sqle) {
//            System.out.println("Erro no acesso ao Banco de Dados: " + sqle.getMessage());
//        }
        
        // UPDATE
        
        String sql = "update alunos set nome = ? where id = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "Aline");
            ps.setInt(2, 6);
            ps.executeUpdate();
            System.out.println("Dados atualizados com sucesso.");
        } catch (SQLException sqle) {
            System.out.println("Erro no acesso ao Banco de Dados: " + sqle.getMessage());
        }
        
                
                
        // Fechando a conexão
        try {
            con.close();
            System.out.println("Conexão com o banco de dados fechada.");
        } catch (SQLException sqle) {
            System.out.println("Erro no fechamento da conexão: " + sqle.getMessage());
        }
    }
}
