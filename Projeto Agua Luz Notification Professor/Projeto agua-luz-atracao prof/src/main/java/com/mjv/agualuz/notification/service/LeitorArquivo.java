package com.mjv.agualuz.notification.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;

public class LeitorArquivo {
	public List<Contrato> lerContratosTxt(){
		List<String> conteudo = ler("agua-luz-contratos.txt");
		List<Contrato> contratos = new ArrayList<Contrato>();
		for(String linha : conteudo) {
			Contrato c = new Contrato();
			Cadastro cad = new Cadastro();
			cad.setCpf(linha.substring(0,11).trim());
			cad.setRg(linha.substring(11,21).trim());
			cad.setNome(linha.substring(21,51).trim());
			
			c.setCliente(cad);
			
			contratos.add(c);
			
		}
		return contratos;
	}
	public List<Contrato> lerContratosCsv(){
		List<String> conteudo = ler("agua-luz-contratos.csv");
		List<Contrato> contratos = new ArrayList<Contrato>();
		for(String linha : conteudo) {
			String[] campos = linha.split(";");
			
			Contrato c = new Contrato();
			c.setNumeroProtocolo(Long.valueOf(campos[1]));
			Cadastro cad = new Cadastro();
			cad.setCpf(campos[0]);
			cad.setNome(campos[2]);
			c.setCliente(cad);
			
			contratos.add(c);
			
		}
		return contratos;
	}
	private List<String> ler(String nomeArquivo) {
		Path filePath = Paths.get("/estudo/mjv-java-school/agua-luz-output", nomeArquivo);
		try {
			List<String> lines = Files.readAllLines(filePath);
			return lines;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}