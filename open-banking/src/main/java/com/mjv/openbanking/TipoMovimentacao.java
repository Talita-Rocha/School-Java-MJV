package com.mjv.openbanking;

// ENUM � UM OBJETO
public enum TipoMovimentacao {
	//INSTANCIA
	RECEITA ("R"),
	DESPESA ("D");

	// PRIVATE POIS S� A CLASSE ENUM PODER� ACESSAR
	private String sigla;
	
	private TipoMovimentacao (String sigla) {
		this.sigla = sigla;
	}
	
	// PUBLIC POIS S� A CLASSE ENUM PODER� ACESSAR
	
	public String getSigla () {
		return sigla;
	}
}
