package estruturascondicionais2compostas.switchcase;

//Modo condicional switch / case
//Observe que a n�vel de sintaxe n�o tivemos nenhum ganho quanto a redu��o de c�digos 
//e ainda tivemos mais uma preocupa��o em informar a palavra break em cada alternativa.

public class SistemaMedida_SwitchCase {
	
	public static void main(String[] args) {
		String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MEDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		
	}

}
