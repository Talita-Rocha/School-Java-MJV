package com.mjv.notification;

import java.time.LocalDate;

public class SistemaGeradorNotificacao {

	public static void main(String[] args) 
	
	{
		Cadastro cad1 = new Cadastro ();
			cad1.setNomeCliente("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO");
			cad1.setRg("337655");
			cad1.setCpf("007.324.223.21");
			cad1.setCelular("(11) 99768-1515");
	}
	{
		Residencia res1 = new Residencia ();
			res1.setLogradouro("Rua Sebastião Firmino");
			res1.setNumero(123);
			res1.setComplemento("AP 210 BL CENTAURO");
			res1.setBairro("São Sebastião");
			res1.setCidade("São Raimundo Nonato");
			res1.setUf("Sp");
			res1.setCep("07.210.715");
			res1.setSiglaPais(Pais.Brasil);
	}
		{
		Contrato cont1 = new Contrato ();
			cont1.setProtocoloContrato(1984365); 
			cont1.setData(null); //07/05/2022 
			cont1.setHora(null); //15:21 
			cont1.setTaxaValor(127.35);
			cont1.setTipoNotificacao(TipoNotificacao.SMS);
			cont1.setSiglaServ(InstalacaoServico.AGUA);
	}
	
				
}
