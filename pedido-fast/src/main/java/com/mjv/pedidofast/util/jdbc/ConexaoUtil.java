package com.mjv.pedidofast.util.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoUtil {
	public static Connection criarNovaConexao() {
		String url = "jdbc:postgresql://localhost/mjv_school_db";
		Properties props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","postgres");
		try {
			Connection conn = DriverManager.getConnection(url, props);
			System.out.println("Conexao realizada com sucesso");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		//String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
		//Connection conn = DriverManager.getConnection(url);
	}
}
