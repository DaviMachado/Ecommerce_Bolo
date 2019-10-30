package com.les.bolo.util.teste;

import java.sql.Connection;
import java.sql.SQLException;

import com.les.bolo.util.ConnectionFactory;

/**
 * Classe para testar a conexão com o banco de dados
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public class TestaConexaoFactory {
	
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
	}
	
}
