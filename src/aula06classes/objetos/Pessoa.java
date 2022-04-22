package aula06classes.objetos;

public class Pessoa {

	String nome;
	String cpf;
	String endereco;
	
	Pessoa(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco; 
	}
		
	Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = "Não informado";
	}
	Pessoa () {
		
	}
	
	

}
