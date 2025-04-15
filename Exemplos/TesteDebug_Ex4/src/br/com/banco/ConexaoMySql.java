package br.com.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoMySql {

    public Connection getConection() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/exemplo4", "root", "root");
            return conexao;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoMySql.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }

}