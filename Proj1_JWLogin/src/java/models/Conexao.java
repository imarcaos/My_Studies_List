package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos Melo
 */
public class Conexao {

    private final String classDriver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost/proj1_java";
    private final String user = "root";
    private final String pass = "";

    public Connection conexao() {

        Connection con = null;

        try {
            // carregar o driver
            Class.forName(classDriver);

            // Obter a ligação
            con = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao Abri Conexão: " + e.getMessage());

        }
        return con;
    }

    public void desligarConexao(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro ao Fechar Conexão: " + e.getMessage());
        }
    }

}
