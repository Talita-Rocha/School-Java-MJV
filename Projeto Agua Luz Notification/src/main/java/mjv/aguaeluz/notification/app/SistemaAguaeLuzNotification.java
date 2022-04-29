package mjv.aguaeluz.notification.app;

import java.time.LocalDateTime;

import mjv.aguaeluz.notification.model.Cadastro;
import mjv.aguaeluz.notification.model.Contrato;
import mjv.aguaeluz.notification.model.Endereco;


public class SistemaAguaeLuzNotification {

	public static void main(String[] args) {
		Contrato contrato = new Contrato ();
		
		contrato.setNumeroProtocolo(2022025687L);
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 0));
		
		Cadastro cliente = new Cadastro ();
		contrato.setCliente(cliente);
		cliente.setCpf("23476598727");
		cliente.setNomeCliente("Gleyson Sampaio");
		
		//TipoServico descricaoservico = new TipoServico ();
		//contrato.set
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27310657");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua das Marias");
		endereco.setNumero("243");
		endereco.setComplemento("Bloco C");
			
		/*
		GeradorMensagem gm = new GeradorMensagem();
		gm.gerar(contrato);
		 */
		
		
		
	}
}


