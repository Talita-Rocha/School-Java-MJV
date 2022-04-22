package com.mjv.openbanking;

import java.time.LocalDate;

public class GeradorArquivo {

	public static void main(String[] args) {
		
		Movimentacao mov1 = new Movimentacao ();
		mov1.setData(LocalDate.of(2022,4,16));
		mov1.setCpfCnpj("135.217.791-18");
		mov1.setNomeCliente("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO");
		mov1.setValor(1275.48);
		mov1.setTipo(TipoMovimentacao.RECEITA);
		mov1.setEstornado(Boolean.FALSE);
		
		//System.out.println(mov1);
		
		GeradorConteudo gc = new GeradorConteudo();
		
		String conteudoGerado = gc.gerar(mov1);
		
		System.out.println(conteudoGerado);
		
		/*
		Cada linha de movimentação deverá ter a estrutura conforme ilustração seguir:
		2022041600013521779118RAIMUNDO NONATO LOUREIRO CASTE0000127548R0
		*/
		
		//CNAB400 PARA VISUALIZAR O LAYOUT PADRÃO DE UM ARQUIVO. POR EX. CAIXA ECONOMICA.
		
				
	}

}
