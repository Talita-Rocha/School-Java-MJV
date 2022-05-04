package com.mjv.agualuz.atracao.app;

import com.mjv.agualuz.atracao.model.Contrato;
import com.mjv.agualuz.atracao.repository.ContratoRepository;
import com.mjv.agualuz.atracao.service.GeradorArquivo;

public class SistemaAguaLuzAtracao {
	public static void main(String[] args) {
		
		ContratoRepository rep = new ContratoRepository();
		Contrato contrato = rep.pegarUnicoContrato();
		
		GeradorArquivo ga = new GeradorArquivo();
		ga.txt(contrato);
		
	}
}
