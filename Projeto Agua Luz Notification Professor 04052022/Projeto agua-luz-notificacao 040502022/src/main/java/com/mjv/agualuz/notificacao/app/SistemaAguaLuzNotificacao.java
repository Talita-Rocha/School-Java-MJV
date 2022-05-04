package com.mjv.agualuz.notificacao.app;

import com.mjv.agualuz.atracao.model.Contrato;
import com.mjv.agualuz.notificacao.repository.ContratoTxtRepository;
import com.mjv.agualuz.notificacao.service.GeradorMensagem;

public class SistemaAguaLuzNotificacao {
	public static void main(String[] args) {
		ContratoTxtRepository rep = new ContratoTxtRepository();
		
		Contrato contrato =  rep.buscar();
		
		GeradorMensagem gm = new GeradorMensagem();
		
		gm.gerar(contrato);
		
	}
}
