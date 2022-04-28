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

public class GeradorArquivo {
	public void csv(List<Contrato> contratos) {
		StringBuilder sb = new StringBuilder();
		
		for(Contrato c : contratos) {
			Cadastro cad = c.getCliente();
			sb.append(cad.getCpf() + ";");
			sb.append(cad.getRg() + ";");
			sb.append(cad.getNome() + ";");
		}
		System.out.println(sb.toString());
		
		escrever(sb.toString(), "agua-luz-contratos.csv");
		
	}

	public void txt(List<Contrato> contratos) {
		StringBuilder sb = new StringBuilder();
		
		for(Contrato c : contratos) {
			Cadastro cad = c.getCliente();
			sb.append(cad.getCpf());//remover os caracteres especiais
			sb.append(cad.getRg());// incluir espaços em branco ate 10 e alinhar a equerda
			sb.append(cad.getNome());//cortar o nome para no máximo 30c e colocar maiusculo.
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
