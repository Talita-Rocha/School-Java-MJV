package criarnotificacao;

import java.time.LocalDate;
import java.time.LocalTime;

import com.mjv.basenotification.InstalacaoServico;

public class SistemaGeradorNotificacao {

	public static void main(String[] args) 
	
	{
		Notificacao not1 = new Notificacao ();
			not1.setNomeCliente("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO");
			not1.setCpf("007.324.223.21");
			not1.setProtocoloContrato(1984365);
			not1.setData(LocalDate.of(2022,05,07));
			not1.setHora(LocalTime.of(15,21));
			not1.setSiglaServ(InstalacaoServico.AGUA);
			not1.setTaxaValor(127.33);
			not1.setLogradouro("Rua Sebastião Firmino");
			not1.setNumero(243);
			not1.setComplemento("AP 210 BL CENTAURO");
			not1.setBairro("São Sebastião");
			not1.setCidade("São Raimundo Nonato");
			not1.setUf("SP");
			not1.setCep("07.210.715");
	
	}
}
	
	/*
	{
			GeradorConteudoCad gcc = new GeradorConteudoCad();
			String conteudoGeradoCad = gcc.gerar(cad1);
			
			//GeradorConteudo gc = new GeradorConteudo();
			//String conteudoGerado = gc.gerar(mov1);
			
			//GeradorArquivo ga = new GeradorArquivo ();
			//ga.escreverDisco(conteudoGerado);
	}
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
