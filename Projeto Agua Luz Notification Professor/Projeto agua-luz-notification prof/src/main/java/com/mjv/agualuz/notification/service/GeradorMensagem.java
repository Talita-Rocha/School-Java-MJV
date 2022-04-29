package com.mjv.agualuz.notification.service;

//3ª ETAPA
//PX ETAPA (4ª) É CRIAR UMA CLASSE QUE SERÁ RESPONSÁVEL PELA FORMATAÇÃO;
//CRIADA UM CATEGORIA DE CLASSE DO TIPO SERVICE, QUE UTILIZARÁ OS MODELOS PARA REALIZAR AS REGRAS DO NEGÓCIO;
//ESTA CLASSE É A RESPONSÁVEL POR ENVIAR A MENSAGEM;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.util.FormatadorUtil;

public class GeradorMensagem {
	public void gerar(Contrato contrato) {
		
		StringBuilder msg = new StringBuilder(); //USADO PARA CONCATENAR MUITA INFORMAÇÃO
		
		//Cadastro cliente = contrato.getCliente();
			
		//String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf()); //TRAZIDO DA CLASSE FORMATADOR UTIL
		
		//PODEMOS FAZER ASSIM:
		//sb.append("Senhor(a) " + cliente.getNome() +" cpf de número " + cpfFormatado );
		
		//OU ASSIM:
		//sb.append(String.format("Senhor(a) %s cpf de número %s, ",cliente.getNome(), cpfFormatado ));
		
		//OU AINDA ASSIM:
		
		msg.append (String.format ("Senhor(a)" , contrato.getCliente().getNome()));
		msg.append (String.format ("cpf de número %d" , contrato.getCliente().getCpf(), ". "));
		msg.append (String.format ("Informamos que, conforme contrato com protocolo de número %d ", contrato.getNumeroProtocolo()));
		msg.append (String.format (", está agendado para a data\\hora ", contrato.getDataHora())); //21/02/2022 16:00h 
		msg.append (String.format ("a instalação do serviço de ", contrato.getServico())); //Água
		msg.append (String.format ("com taxa de valor R$ ",contrato.getValor(), " em sua residência localizada no endereço abaixo: ")); //R$ 127,33
		msg.append (String.format ("\n- Logradouro: ", contrato.getCliente().getEndereco().getLogradouro(), ", ", contrato.getCliente().getEndereco().getNumero()));
		msg.append (String.format ("\n- Complemento: ", contrato.getCliente().getEndereco().getComplemento()));
		msg.append (String.format ("\n- Bairro: ", contrato.getCliente().getEndereco().getBairro()));
		msg.append (String.format ("\n- Cidade: ", contrato.getCliente().getEndereco().getCidade(), " / " , contrato.getCliente().getEndereco().getEstado()));
		msg.append (String.format ("\n-Cep: ", contrato.getCliente().getEndereco().getCep()));
				
		System.out.println(msg.toString());
		//System.out.println("aqui!");
		
	}
}


