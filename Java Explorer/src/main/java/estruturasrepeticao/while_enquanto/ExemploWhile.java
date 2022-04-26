package estruturasrepeticao.while_enquanto;

import java.util.concurrent.ThreadLocalRandom;

/*Jo�ozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, 
logo, enquanto o valor dos doces n�o igualar a R$ 50,00 ele foi adicionando itens no carrinho.
*/

public class ExemploWhile {
	public static void main(String[] args) {
		double mesada = 50.0;
	        while(mesada>0) {
	            Double valorDoce = valorAleatorio();
	            if(valorDoce > mesada)
	                valorDoce = mesada;

	            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
	            mesada = mesada - valorDoce;
	        }
	        System.out.println("Mesada:" + mesada);
	        System.out.println("Jo�ozinho gastou toda a sua mesada em doces");
	        
	        /*
	        * N�o se preocupe quanto a formata��o de valores
	        * Iremos explorar os recursos de formata��o em breve !!
	        */
	   }
	   private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
	   }
}
