package mjv.aguaeluz.notification.app;

import java.time.LocalDate;
import java.time.LocalTime;

import mjv.aguaeluz.notification.model.TipoServico;
import mjv.aguaeluz.notification.service.GeradorArquivoNot;
import mjv.aguaeluz.notification.util.GeradorConteudoNot;

public class SistemaGeradorNotificacao {

	public static void main(String[] args) 
	
	{
		Notificacao not01 = new Notificacao ();
			
			not01.setNomeCliente("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO");
			not01.setCpf("007.324.223.21");
			not01.setProtocoloContrato(1984365);
			not01.setData(LocalDate.of(2022,05,07));
			not01.setHora(LocalTime.of(15,21));
			not01.setTipoServico(TipoServico.AGUA); 
			not01.setTaxaValor(127.33);
			not01.setLogradouro("Rua Sebasti�o Firmino");
			not01.setNumero(243);
			not01.setComplemento("AP 210 BL CENTAURO");
			not01.setBairro("S�o Sebasti�o");
			not01.setCidade("S�o Raimundo Nonato");
			not01.setUf("SP");
			not01.setCep("07.210.715");
	
			GeradorConteudoNot gcn = new GeradorConteudoNot ();
			String conteudoGeradoNot = gcn.gerar(not01);
			
			GeradorArquivoNot gan = new GeradorArquivoNot ();
			gan.escreverDiscoNot(conteudoGeradoNot);
			
			System.out.println(conteudoGeradoNot);
	}
}
	
/*
Cada linha de notifica��o dever� ter a estrutura conforme ilustra��o seguir:
2022041600013521779118RAIMUNDO NONATO LOUREIRO CASTE0000127548R0
*/


/* O aplicativo dever� enviar a seguinte mensagem:
 * 
 * "Senhor(a)" Gleyson Sampaio "cpf de n�mero" 234.765.987-27 ",  
 * Informamos que conforme contrato com protocolo de n�mero" (2022025687) 
 * "est� agendado para a data\hora" (21/02/2022) + (16:00)h "a instala��o do servi�o 
 * de �gua com taxa de valor R$ " (127,33) "em sua resid�ncia localizada no endere�o abaixo:"

	o* \n "Logradouro: " Rua das Marias, 243
	o* \n "Complemento: " Ap 207, Bloco C
	o* \n "Bairro: " Santo Antonio
	o* \n "Cidade: " S�o Paulo / SP
	o* \n "Cep: " 27.310-657
	
 * 
 * 
 * */
