package com.example.primeirocrud.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/crud_javafx";
    private static final String USUARIO = "root";
    private static final String SENHA = "admin";

    // Método para obter conexão com o banco de dados
    public static Connection obterConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException | ClassNotFoundException e) {
            throw new SQLException("Erro ao obter conexão: " + e.getMessage());
        }
    }

    // Método para fechar a conexão corretamente
    public static void fecharConexao(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexão fechada com sucesso.");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}