package com.les.bolo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe para fazer a conexão com o banco de dados
 * @author Davi Rodrigues
 * @date 23/10/2019
 */
public class ConnectionFactory {
	public static Connection getConnection() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/ecommerce?useSSL=false&serverTimezone=UTC", "root", "12345");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
