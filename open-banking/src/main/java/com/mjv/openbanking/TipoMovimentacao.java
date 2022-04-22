package com.mjv.openbanking;

// ENUM É UM OBJETO
public enum TipoMovimentacao {
	//INSTANCIA
	RECEITA ("R"),
	DESPESA ("D");

	// PRIVATE POIS SÓ A CLASSE ENUM PODERÁ ACESSAR
	private String sigla;
	
	private TipoMovimentacao (String sigla) {
		this.sigla = sigla;
	}
	
	// PUBLIC POIS SÓ A CLASSE ENUM PODERÁ ACESSAR
	
	public String getSigla () {
		return sigla;
	}
}
