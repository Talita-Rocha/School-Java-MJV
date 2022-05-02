package com.mjv.agualuz.notification.app;

//2ª ETAPA
//PX ETAPA (3ª) É CRIAR UMA CLASSE QUE SERÁ RESPONSÁVEL POR ENVIAR A MENSAGEM FORMATADA!

import java.time.LocalDateTime;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.service.GeradorMensagem;

public class SistemaAguaLuzNotification {
	public static void main(String[] args) {
		
		Contrato contrato = new Contrato(); //Objeto "Contrato" que se chama contrato
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 0)); //sobrecarga no of
		contrato.setNumeroProtocolo(2022025687L); //como se trata do tipo long, coloca o L no final
		contrato.setServico("Água");
		contrato.setValor(127.33);
		
		// OS OBJETOS (CONTRATO, CADASTRO E ENDEREÇO) PRECISAM SE COMUNICAR, POIS ESTÃO INTERLIGADOS.
		// CONTRATO PRECISA DE UM CLIENTE QUE PRECISA DE UM ENDEREÇO;
		// ENDEREÇO ESTÁ DENTRO DE CADASTRO, QUE ESTÃO DENTRO DE CONTRATO 

		
	    Cadastro cliente = new Cadastro(); // O OBJETO "CADASTRO" SERÁ CHAMADO DE CLIENTE QUE É DO TIPO CADASTRO
		contrato.setCliente(cliente);	   // contrato.setCliente, pois CLIENTE foi instanciado como CADASTRO dentro da CLASSE CONTRATO;
		cliente.setCpf("23476598727");     // cliente.setCpf e setNome, pois estão instanciado dentro da Classe Cadastro
		cliente.setNome("Gleyson Sampaio");
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);    		
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27310657");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua das Marias");
		endereco.setNumero("243");
		endereco.setComplemento("Bloco C");
		
		//System.out.println(contrato.getNumeroProtocolo());
		//System.out.println(contrato.getCliente().getCpf());
		//System.out.println(contrato.getCliente().getEndereco().getCep()); //CEP ESTÁ DENTRO DE ENDEREÇO QUE ESTÁ DENTRO DE CLIENTE.
		
		// FEITO A PARTE ACIMA, APÓS CRIAR A CLASSE "GERADOR MENSAGEM"
		GeradorMensagem gm = new GeradorMensagem();
		gm.gerar(contrato);
		//System.out.println("Aqui, doido!");
	}
}
