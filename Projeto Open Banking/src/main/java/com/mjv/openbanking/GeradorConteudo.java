package com.mjv.openbanking;

public class GeradorConteudo {
	/**
	 * Método que gera o conteúdo do layout
	 * @param movimentacao
	 * @return
	 */
	
	
	public String gerar (Movimentacao movimentacao) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(movimentacao.getData().toString().replace("-", ""));
		
		//POR ENCADEAMENTO DE MÉTODO - UM MÉTODO DENTRO DO OUTRO;
		//sb.append(String.format("%014d", Long.valueOf(movimentacao.getCpfCnpj().replaceAll("\\D", ""))));
		
		//PODEMOS FAZER ASSIM TAMBÉM, POR PARTES:
		String cpf = movimentacao.getCpfCnpj().replaceAll("\\D", "");
		Long cpfLong = Long.valueOf (cpf);
		String cpfFormatado = String.format("%014d", cpfLong);
		sb.append (cpfFormatado);
		//APPEND RETORNA A PRÓPRIA CLASSE;
		
		String nome = movimentacao.getNomeCliente();
		
		if(nome.length()> 30) 
			sb.append(nome.substring(0, 30));
		
		else {
			sb.append(String.format("%-30s", nome));
		}
		
		sb.append(String.format("%010d", Long.valueOf(movimentacao.getValor().toString().replaceAll("\\D", ""))));
		
		sb.append(movimentacao.getTipo().getSigla());
		
		if(movimentacao.getEstornado()) {
			sb.append("1");
		} else {
			sb.append("0");
		}
		
		return sb.toString();
		
		/*
		COMENTA CADA UM PARA IR RESOLVER POR ETAPA PARA COLOCAR NO FORMATO ESPERADO PELO LAYOUT.
		REMOVER CARACTERES ESPECIAIS NO JAVA;
		
		sb.append(movimentacao.getData().toString().replace("-", ""));
		sb.append(movimentacao.getCpfCnpj());
		sb.append(movimentacao.getCpfCnpj().replaceAll("\\D", ""));
	  	sb.append(movimentacao.getCpfCnpj().replaceAll("[\\.\\-]", "")); \\ CHAMA-SE SCAPE
	  	sb.append(movimentacao.getCpfCnpj().replaceAll("[^a-zA-Z0-9]", "")); REGEX
		sb.append(movimentacao.getNomeCliente());
		sb.append(movimentacao.getValor());
		sb.append(movimentacao.getTipo());				
		sb.append(movimentacao.getEstornado());
		*/
		
		
		
	}

}
