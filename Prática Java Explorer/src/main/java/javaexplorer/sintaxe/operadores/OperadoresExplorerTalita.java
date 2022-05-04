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
		
		valor1 = valor1 +1; //1� ex
		valor2++;           //2� ex
		++valor3;           //3� ex.
		--valor4;	        //4� ex
		
		System.out.println("Exemplo Operador Unario 2:  " + valor1 + "  Incrementado"+"\n"); 
		System.out.println("Exemplo Operador Unario 2:  " + valor2 + "  P�s-Incrementado"+"\n");
		System.out.println("Exemplo Operador Unario 2:  " + (++valor3) + "  Pr�-Incrementado"+"\n");
		System.out.println("Exemplo Operador Unario 2:  " + (--valor4) + "  Pr�-Decrementado"+"\n");
	}
	
	static void exemploOperadorUnarioProf () {
		int valorprof = 5;
		
		//valor = valor+1;
		//valor++;
				
		//System.out.println("Exemplo Operador Unario Prof : " + valorprof + "\n");
		//System.out.println("Exemplo Operador Unario Prof : " + valorprof + "\n");
		System.out.println("Exemplo Operador Unario Prof:  " + (++valorprof) + "  Pr�-Incrementado"+"\n");
		System.out.println("Exemplo Operador Unario Prof:  " + (--valorprof) + "  Pr�-Decrementado"+"\n");
		System.out.println("Exemplo Operador Unario Prof:  " + (valorprof++) + "  P�s-Incrementado"+"\n");
		System.out.println("Exemplo Operador Unario Prof:  " + (valorprof--) + "  P�s-Decrementado"+"\n");
		
		boolean verdadeira = true;
		
		System.out.println(!verdadeira);
	}
}
