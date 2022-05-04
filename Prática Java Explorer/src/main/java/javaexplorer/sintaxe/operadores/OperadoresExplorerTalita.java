package javaexplorer.sintaxe.operadores;

public class OperadoresExplorerTalita {

	public static void main(String[] args) {
		exemploOperadorUnario1();
		
		exemploOperadorUnario2();

		exemploOperadorUnarioProf();
	}
	
	static void exemploOperadorUnario1 () {
		int numero = 10;
		
		numero = -numero;
		
		System.out.println("Exemplo Operador Unario1 : " + numero +"\n");
	}
	
	static void exemploOperadorUnario2 () {
		int valor1 = 5;
		int valor2 = 5;
		int valor3 = 5;
		int valor4 = 5;
		
		valor1 = valor1 +1; //1º ex
		valor2++;           //2º ex
		++valor3;           //3º ex.
		--valor4;	        //4º ex
		
		System.out.println("Exemplo Operador Unario 2:  " + valor1 + "  Incrementado"+"\n"); 
		System.out.println("Exemplo Operador Unario 2:  " + valor2 + "  Pós-Incrementado"+"\n");
		System.out.println("Exemplo Operador Unario 2:  " + (++valor3) + "  Pré-Incrementado"+"\n");
		System.out.println("Exemplo Operador Unario 2:  " + (--valor4) + "  Pré-Decrementado"+"\n");
	}
	
	static void exemploOperadorUnarioProf () {
		int valorprof = 5;
		
		//valor = valor+1;
		//valor++;
				
		//System.out.println("Exemplo Operador Unario Prof : " + valorprof + "\n");
		//System.out.println("Exemplo Operador Unario Prof : " + valorprof + "\n");
		System.out.println("Exemplo Operador Unario Prof:  " + (++valorprof) + "  Pré-Incrementado"+"\n");
		System.out.println("Exemplo Operador Unario Prof:  " + (--valorprof) + "  Pré-Decrementado"+"\n");
		System.out.println("Exemplo Operador Unario Prof:  " + (valorprof++) + "  Pós-Incrementado"+"\n");
		System.out.println("Exemplo Operador Unario Prof:  " + (valorprof--) + "  Pós-Decrementado"+"\n");
		
		boolean verdadeira = true;
		
		System.out.println(!verdadeira);
	}
}
