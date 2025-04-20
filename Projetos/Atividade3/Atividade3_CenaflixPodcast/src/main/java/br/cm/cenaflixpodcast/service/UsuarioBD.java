package br.cm.cenaflixpodcast.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioBD {
    public static Usuario validarUsuario(Usuario usuario) {
        String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        Usuario usuarioEncontrado = null;
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/alineraldi_cenaflix_podcasts", "root", "root");
            PreparedStatement statement = conexao.prepareStatement(sql);
            
            statement.setString(1, usuario.getLogin());
            statement.setString(2, usuario.getSenha());
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {
                usuarioEncontrado = new Usuario();
                usuarioEncontrado.setId(rs.getInt("id"));
                usuarioEncontrado.setNome(rs.getString("nome"));
                usuarioEncontrado.setLogin(rs.getString("login"));
                usuarioEncontrado.setSenha(rs.getString("senha"));
                usuarioEncontrado.setTipo(rs.getString("tipo"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao validar usuario: " + e.getMessage());
            e.printStackTrace();
        }
        return usuarioEncontrado;
    }
}
