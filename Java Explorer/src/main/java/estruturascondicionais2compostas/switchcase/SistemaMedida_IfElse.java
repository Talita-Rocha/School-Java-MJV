package estruturascondicionais2compostas.switchcase;

//Modo condicional if/else

public class SistemaMedida_IfElse {
	public static void main(String[] args) {
		String sigla = "G";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MEDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
			
		
	}
}