package com.mjv.agualuz.notification.util;

//4ª ETAPA
//CRIADA UM CATEGORIA DE CLASSE DO TIPO UTIL (UTILITÁRIA), QUE SERÁ RESPONSAVEL PELA FORMATAÇÃO;
//TEM COMO CARACTERÍSTICA O RECURSO DOS MÉTODOS STATIC
//ESSA FORMATAÇÃO PODERÁ SER UTILIZADA POR OUTROS

public class FormatadorUtil {
	
	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2= cpf.substring(3,6);
		String part3= cpf.substring(6,9);
		String part4= cpf.substring(9,11);
		
		String cpfFormatado=String.format("%s.%s.%s-%s", part1, part2, part3, part4);
		
		return cpfFormatado;
	}
}
