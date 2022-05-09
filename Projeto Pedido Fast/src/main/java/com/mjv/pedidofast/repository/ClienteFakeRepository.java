package com.mjv.pedidofast.repository;

import java.util.HashMap;
import java.util.Map;

import com.mjv.pedidofast.model.cadastro.Cliente;
import com.mjv.pedidofast.model.cadastro.Endereco;

public class ClienteFakeRepository {
	private Map<Integer, Cliente> clientes = new HashMap();
	public ClienteFakeRepository() {
		Cliente gleyson = new Cliente();
		gleyson.setCpf("12312");
		gleyson.setId(1);
		gleyson.setNome("GLEYSON SAMPAIO");
		gleyson.setWhatsapp("11958940362");
		Endereco endGleyson = new Endereco();
		endGleyson.setBairro("CENTRO");
		endGleyson.setNumero("SN");
		endGleyson.setLogradouro("RUA DO COMERCIO");
		gleyson.setEndereco(endGleyson);
		
		//adicionando no mapa de clientes
		clientes.put(1, gleyson);
		
		Cliente frank = new Cliente();
		frank.setCpf("986889089");
		frank.setId(2);
		frank.setNome("FRANK MARLON");
		frank.setWhatsapp("98954357976");
		Endereco endfrank = new Endereco();
		endfrank.setBairro("VILA MILITAR");
		endfrank.setNumero("123");
		endfrank.setLogradouro("AV DOS NAVIOS");
		frank.setEndereco(endfrank);
				
		//adicionando no mapa de clientes
		clientes.put(2, gleyson);
	}
	public Cliente buscarPorId(Integer id) {
		return clientes.get(id);
	}
}
