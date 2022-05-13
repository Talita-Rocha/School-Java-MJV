package com.mjv.pedidofast.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mjv.pedidofast.model.cadastro.Cliente;
import com.mjv.pedidofast.util.jdbc.ConexaoUtil;

public class ClienteJDBCRepository {
	//fazer update / delete / selecionar
	private Connection conexao;

	public ClienteJDBCRepository() {
		conexao = ConexaoUtil.criarNovaConexao();
	}

	public void incluir(Cliente cliente) {
		try {
			String SQL_INSERT = "INSERT INTO cliente (cpf, nome, whatsapp) VALUES(?,?,?)";
			PreparedStatement preparedStatement = conexao.prepareStatement(SQL_INSERT);

			preparedStatement.setString(1, cliente.getCpf());
			preparedStatement.setString(2, cliente.getNome());
			preparedStatement.setLong(3, cliente.getWhatsapp());

			int row = preparedStatement.executeUpdate();

			// rows affected
			System.out.println(row); // 1
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
