package aula04;

public class Vari�vel_exemplo {

			public static void main(String[] args) {
			/*
			 * esta linha � considerada como declara��o de vari�vel iniciamos a exist�ncia
			 * variavel numero com valor 5 regra: tipo + nome + valor
			 */
			int numero = 5;

			/*
			 * na linha abaixo iremos alterar o valor do var�avel para 10 observe que o tipo
			 * n�o � mais necess�rio, pois a vari�vel j� foi declarada anteriormente
			 */
			numero = 10;

			System.out.print(numero);
			
			/*
			 * ao usar a palavra reservada final, voc� determina que jamais
			 * esta variavel poder� obter outro valor;
			 * logo a linha 25 vai apresentar um erro de compila��o
			 * isso � considerado uma CONSTANTE na linguagem Java
			 */
			final double VALOR_DE_PI = 3.14;
			
		//	VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compila��o!
		}
	}
	
	

