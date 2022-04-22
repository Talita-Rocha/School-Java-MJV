package aula06classes.objetos;

public class SistemaCadastro {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa(null, null, null);
		Pessoa pessoa2 = new Pessoa(null, null);

		
		pessoa1.nome = "Talita Rocha";
		pessoa1.cpf =  "999999999-99";
		pessoa1.endereco = "Estrada da Felicidade";
		
		pessoa2.nome = "Lu Henriques";
		pessoa2.cpf =  "111111111-11";
		//pessoa2.endereco = "Estrada dos Amores";
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.cpf);
		System.out.println(pessoa1.endereco);
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.cpf);
		System.out.println(pessoa2.endereco);
				
	}

}


