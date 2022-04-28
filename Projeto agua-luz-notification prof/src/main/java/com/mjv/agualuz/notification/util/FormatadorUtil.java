package com.mjv.agualuz.notification.util;

public class FormatadorUtil {
	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2= cpf.substring(3,6);
		String part3= cpf.substring(6,9);
		String part4= cpf.substring(9,11);
		String cpfFormatador=String.format("%s.%s.%s-%s", part1, part2, part3, part4);
		return cpfFormatador;
	}
}
