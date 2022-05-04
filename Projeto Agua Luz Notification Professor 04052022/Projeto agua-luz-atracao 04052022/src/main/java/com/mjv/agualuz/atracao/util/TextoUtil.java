package com.mjv.agualuz.atracao.util;

public class TextoUtil {
	public static String removerCaracteresEspeciais(String texto) {
		return texto.replaceAll("\\D", "");
	}
	public static String completar(String textoOrigianal, int tamanhoMaximo) {
		//%-10s
		String formato = "%-" + tamanhoMaximo + "s";
		String textoFormatado = String.format(formato, textoOrigianal);
		return textoFormatado;
	}
	public static String completarZeroEsquerda(Number numero, int tamanhoMaximo) {
		String formato = "%0" + tamanhoMaximo + "d";
		String textoFormatado = String.format(formato, numero);
		return textoFormatado;
	}
	public static String cortar(String textoOrigianal, int tamanhoMaximo) {
		//jr
		/*
		String novoTexto="";
		if(textoOrigianal.length() <=tamanhoMaximo)
			novoTexto= textoOrigianal;
		else {
			novoTexto = textoOrigianal.substring(0,tamanhoMaximo);
		}
		*/
		//return novoTexto;
		return textoOrigianal.substring(0,Math.min(tamanhoMaximo, textoOrigianal.length()));
	}
	public static String ajustar(String textoOrigianal, int tamanhoMaximo) {
		String textoAjustado = completar(textoOrigianal, tamanhoMaximo);
		textoAjustado = cortar(textoAjustado, tamanhoMaximo);
		return textoAjustado;
	}
	public static void main(String[] args) {
		String nomeGrande = "GLEYSON SAMPAIO DE OLIVEIRA";
		System.out.println(cortar(nomeGrande, 10));
		
		//criticos e pessimistas
		String nomePequeno = "GLEYSON";
		System.out.println(cortar(nomePequeno, 10));
		
		
		
	}
}
