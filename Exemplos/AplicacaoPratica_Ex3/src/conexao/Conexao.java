package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public Connection getConexao() {
        try {
           Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost/exemplo3",
                        "root",
                        "root"
           ); 
           return conn;
        } catch (Exception e) {
            // A variável “e” armazenará as informações do erro que foi gerado. 
            System.out.println("Erro ao conectar: " + e.getMessage());
                        // Usa-se o getMessage para buscar esse erro dentro da variável.
            return null;
            // Devido a esse erro, não haverá nenhum retorno, por isso, use o null para que o método retorne algo.
        }
    }
}
