package com.mjv.agualuz.notification.util;

	public class TextoUtil {
		//junit
		public static void main(String[] args) {
			String[] contratos =  {"Gleyson Sampaio","Raimundo Nonato Loureiro Castelo Branco"};
			for(String contrato: contratos) {
				
				System.out.println(ajustar(contrato, 30));
			}
			//PARA COMPLETAR O TAMANHO DO LAYOUT
			/*
			String palavra = "GLEYSON";
			String novaPalavra = completar(palavra, 10);
			System.out.println(novaPalavra);
			
			//PARA CORTAR OS CARACTERES MAIORES QUE O TAMANHO DO LAYOUT 
			String nome = "Raimundo Nonato Loureiro Castelo Branco";
			String nomeCortado = cortar(nome, 30);
			System.out.println(nomeCortado);
			
			//PARA AJUSTAR O TAMANHO PARA ATÉ 30 CARACTERES
			String nome = "Raimundo Nonato";
			String nomeCortado = cortar(nome, 30);
			System.out.println(nomeCortado);
			*/
		}
		//ESTE MÉTODO TEM ÚNICA RESPONSABILIDADE, MAS REALIZA DUAS OPERAÇÕES.
		
		public static String removerCaracteresEspeciais(String texto) {
			return texto.replaceAll("\\D", "");
		}
				
		public static String ajustar(String textoOriginal, int tamanhoMaximo) {
			String textoAjustado = completar(textoOriginal, tamanhoMaximo);
			textoAjustado = cortar(textoAjustado, tamanhoMaximo);
			return textoAjustado;
		}
		public static String completar(String textoOriginal, int tamanhoMaximo) {
			//"%-10s"
			String formato = "%-" + tamanhoMaximo + "s";
			String textoFormatado = String.format(formato, textoOriginal);
			return textoFormatado;
		}
		public static String cortar(String textoOriginal, int tamanhoMaximo) {
			int max = Math.min(tamanhoMaximo, textoOriginal.length()); //LENGHT DETERMINA O TAMANHO MAX DE UMA STRING.
			return textoOriginal.substring(0,max);
		}
	}
