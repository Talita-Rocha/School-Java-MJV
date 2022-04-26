package estruturascondicionais2compostas.switchcase;

/*
Por�m um cen�rio que poder�amos adequar o uso do switch/case para melhorar nosso algor�timo seria conforme ilustra��o abaixo:

	Imagina que fomos requisitados a criar um sistema de plano telef�nico onde:
		O sistema ter� 03 planos: BASIC, MIDIA , TURBO
			BASIC: 100 minutos de liga��o
			MIDIA: 100 minutos de liga��o + Whats e Intagram gr�tis
			TURBO: 100 minutos de liga��o + Whats e Intagram gr�tis + 5Gb Youtube
*/
//Modo condicional switch/case
public class PlanoOperadora_SwitchCase {

	public static void main(String[] args) {
		String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Intagram gr�tis");
			}
			case "B": {
				System.out.println("100 minutos de liga��o");
			}
		}
	}
}

