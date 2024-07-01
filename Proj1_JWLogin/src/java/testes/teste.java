/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Conexao;

/**
 *
 * @author Marcos Melo
 */
public class teste {

    public static void main(String[] args) {

        try {
            Conexao conexao = new Conexao();
            Connection con = null;
            con = conexao.conexao();
            System.out.println(con.isClosed()); // false tem conexão.
            
            conexao.desligarConexao(con);
            System.out.println(con.isClosed()); // true conexão fechada.
            
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
