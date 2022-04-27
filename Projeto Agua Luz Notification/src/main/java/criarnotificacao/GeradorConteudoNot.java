package criarnotificacao;

public class GeradorConteudoNot {

	public String gerar (Notificacao notificacao) {
		
		StringBuilder sbn = new StringBuilder();
		
		String nome = notificacao.getNomeCliente();

		if(nome.length()> 30) 
			sbn.append(nome.substring(0, 30));

		else {
			sbn.append(String.format("%-30s", nome));
		}
		
		String cpf = notificacao.getCpf().replaceAll("\\D", "");
		Long cpfLong = Long.valueOf (cpf);
		String cpfFormatado = String.format("%014d", cpfLong);
		
		sbn.append (cpfFormatado);
		
		sbn.append(notificacao.getProtocoloContrato());
		
		sbn.append(notificacao.getData().toString().replace("-", ""));
		
		sbn.append(notificacao.getHora().toString().replace("-", ""));
		
		sbn.append(notificacao.getTipoServico());
		
		sbn.append(notificacao.getTaxaValor());
		//sbn.append(String.format("%010d", Long.valueOf(movimentacao.getValor().toString().replaceAll("\\D", ""))));

		sbn.append(notificacao.getLogradouro());
		
		sbn.append(notificacao.getNumero());
		
		sbn.append(notificacao.getComplemento());
		
		sbn.append(notificacao.getBairro());
		
		sbn.append(notificacao.getCidade());
		
		sbn.append(notificacao.getUf());
		
		sbn.append(notificacao.getCep());
		
		return sbn.toString();
	}

}

/*
	PARA AMANHÃ: CONTINUAR IMPLEMENTANDO O MODELO ABAIXO:
 
 StringBuilder mensagem = new StringBuilder();
		
		mensagem.append("Senhor (a) " + nome + " cpf de número " + cpf + ", Informamos que conforme contrato com "
				+ "protocolo de número " + protocolo + " está \n agendado para a data\\hora " + data + " " 
				+ hora.substring(0, 2)+":"+hora.substring(2, 4) +"h, instalação do serviço de " + servico + " com taxa de valor " + valor + " em "
						+ "sua residência localizada no \n endereço abaixo:\n\n"
				
						+ "	Logradouro: " + logradouro + ", " + num + "\n"
						+ "	Complemento: " + complemento + "\n"
						+ "	Bairro: " + bairro + "\n"
						+ "	Cidade: "+ cidade + "/ " + uf + "\n"
						+ "	CEP: "+ cep);
						
		GravarMsgPronta gravarMsg = new GravarMsgPronta();
		gravarMsg.gravarDisco(mensagem.toString(), protocolo);
		
		
		System.out.println(mensagem);
 */

