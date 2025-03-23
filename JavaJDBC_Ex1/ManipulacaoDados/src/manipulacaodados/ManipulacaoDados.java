/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulacaodados;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ManipulacaoDados {

    public static void main(String[] args) {
        try { // Em todas etapas de manipulação de banco de dados, o Java considera algum risco e é obrigatório o uso do comando try-catch, para o que sistema tenha já alguma resposta no caso de ocorrer algum erro.
            
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
        
        try {
            stmt = con.createStatement();
            System.out.println("Pronto para execucao de comandos sql");
        } catch (SQLException sqle) {
            System.out.println("Erro no acesso ao Banco de Dados" + sqle.getMessage());
        }

        try { // INSERT
            String sql = null;
            sql = "insert into alunos (nome, idade, endereco) values ('Ana', '23', 'Rua 7 de Setembro 826')";
            stmt.executeUpdate(sql);
            System.out.println("Dados inseridos.");
        } catch (SQLException sqle) {
            System.out.println("Erro inserindo: " + sqle.getMessage());
        }

        try { // UPDATE
            String sql = null;
            sql = "update alunos set idade = '58' where id = 1";
            stmt.executeUpdate(sql);
            System.out.println("Dados atualizados.");
        } catch (SQLException sqle) {
            System.out.println("Erro atualizacao: " + sqle.getMessage());
        }
        
        try { // DELETE
            String sql = null;
            sql = "delete from alunos where id=1";
            stmt.executeUpdate(sql);
            System.out.println("Dados removidos.");
        } catch (SQLException sqle) {
            System.out.println("Erro remocao: " + sqle.getMessage());
        }
        
        try {
            String sql = "select id, nome, idade, endereco from alunos";
            
            // Executando o comando SELECT
            ResultSet rs = stmt.executeQuery(sql);
            
            System.out.println("Dados da tabela alunos do Banco de Dados");
            System.out.println("----------------------");
            
            // Exibindo resultados
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                String endereco = rs.getString("endereco");
                System.out.println(id + " - " + nome + " - " + idade + " - " + endereco);
            } 
        } catch (SQLException sqle) {
                    System.out.println("Erro efetuando consulta: " + sqle.getMessage());
          }
        
        try {
            con.close();
            System.out.println("Conexão com o Banco de Dados fechada.");
        } catch (SQLException sqle) {
            System.out.println("Erro no fechamento da conexão: " + sqle.getMessage());
        }
        
        }
    
}
