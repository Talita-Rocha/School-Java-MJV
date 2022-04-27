package criarnotificacao;

import java.time.LocalDate;
import java.time.LocalTime;

import com.mjv.basenotification.TipoServico;

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
			not01.setLogradouro("Rua Sebastião Firmino");
			not01.setNumero(243);
			not01.setComplemento("AP 210 BL CENTAURO");
			not01.setBairro("São Sebastião");
			not01.setCidade("São Raimundo Nonato");
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
Cada linha de notificação deverá ter a estrutura conforme ilustração seguir:
2022041600013521779118RAIMUNDO NONATO LOUREIRO CASTE0000127548R0
*/


/* O aplicativo deverá enviar a seguinte mensagem:
 * 
 * "Senhor(a)" Gleyson Sampaio "cpf de número" 234.765.987-27 ",  
 * Informamos que conforme contrato com protocolo de número" (2022025687) 
 * "está agendado para a data\hora" (21/02/2022) + (16:00)h "a instalação do serviço 
 * de Água com taxa de valor R$ " (127,33) "em sua residência localizada no endereço abaixo:"

	o* \n "Logradouro: " Rua das Marias, 243
	o* \n "Complemento: " Ap 207, Bloco C
	o* \n "Bairro: " Santo Antonio
	o* \n "Cidade: " São Paulo / SP
	o* \n "Cep: " 27.310-657
	
 * 
 * 
 * */
