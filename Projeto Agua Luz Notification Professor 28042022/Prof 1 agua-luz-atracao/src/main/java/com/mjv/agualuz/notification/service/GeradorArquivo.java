package com.mjv.agualuz.notification.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Pais;
import com.mjv.agualuz.notification.util.TextoUtil;

public class GeradorArquivo {
	public void csv(List<Contrato> contratos) {
				
		StringBuilder sb = new StringBuilder();
		//FOREACH
		for(Contrato c : contratos) { 
			Cadastro cad = c.getCliente();
			sb.append(cad.getCpf() + ";");
			sb.append(cad.getRg() + ";");
			sb.append(cad.getNome() + ";");
			sb.append(cad.getCelular() + ";");
			sb.append(cad.getEndereco().getLogradouro() + ";");
			sb.append(cad.getEndereco().getNumero() + ";");
			sb.append(cad.getEndereco().getComplemento() + ";");
			sb.append(cad.getEndereco().getBairro() + ";");
			sb.append(cad.getEndereco().getCidade() + ";");
			sb.append(cad.getEndereco().getEstado() + ";");
			sb.append(cad.getEndereco().getCep() + ";");
			sb.append(cad.getEndereco().getPais() + ";");
			
			//CONTINUAR COM OS DEMAIS ATRIBUTOS E VER SE ESTÃO CORRETOS!
			sb.append(c.getNotificacao().getSiglaNotificacao() + ";");
			sb.append(c.getNumeroProtocolo() + ";");
			sb.append(c.getDataHora() + ";");
			sb.append(c.getDataHora().getHour() + ";"); //VERIFICAR SE É ASSIM MESMO?
			sb.append(c.getServico().getSigla() + ";");
			sb.append(c.getServico().getValor() + ";");
			
				
		}
		System.out.println(sb.toString());
		
		escrever(sb.toString(), "agua-luz-contratos.csv");
		
	}

	public void txt(List<Contrato> contratos) {
		
		StringBuilder sb = new StringBuilder();
		
		for(Contrato c : contratos) {
			Cadastro cad = c.getCliente();
			
			
			//sb.append(cad.getCpf().replaceAll("\\D", "")); // Para remover os caracteres especiais
			sb.append(TextoUtil.ajustar(cad.getRg(),10)); // Para incluir espaços em branco ate 10 e alinhar à esquerda
			sb.append(TextoUtil.ajustar(cad.getNome(),30)); // Para cortar o nome para no máximo 30c e colocar maiusculo.
			sb.append(TextoUtil.ajustar(cad.getEndereco().getLogradouro(),20));
			sb.append(TextoUtil.completar(cad.getEndereco().getNumero(),6));
			sb.append(TextoUtil.ajustar(cad.getEndereco().getComplemento(),10));
			sb.append(TextoUtil.ajustar(cad.getEndereco().getBairro(),15));
			sb.append(TextoUtil.ajustar(cad.getEndereco().getCidade(),30));
			sb.append(TextoUtil.ajustar(cad.getEndereco().getEstado(),2));
			sb.append(TextoUtil.ajustar(cad.getEndereco().getCep(),8));
			//sb.append(TextoUtil.ajustar(cad.getEndereco().getPais(Pais.BRASIL),2));
			
			//verificar com o prof!
			
			//sb.append(TextoUtil.ajustar(c.getNumeroProtocolo(),10));
			//sb.append(TextoUtil.ajustar(c.getDataHora(),8));
			//sb.append(TextoUtil.ajustar(c.getDataHora().getHour(),4));
			//sb.append(TextoUtil.ajustar(c.getServico().getSigla(),1));
			//sb.append(TextoUtil.ajustar(c.getValor(),8));
			//sb.append(TextoUtil.ajustar(c.getNotificacao(),1));
		}
		
		System.out.println(sb.toString());
		escrever(sb.toString(), "agua-luz-contratos.txt");
		
	}
	private void escrever(String conteudo, String nomeArquivo) {
		File dir = new File("/estudo/mjv-java-school/agua-luz-output");
		dir.mkdirs();
		
		Path path = Paths.get(dir.getAbsolutePath(), nomeArquivo);

		try {
			Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
