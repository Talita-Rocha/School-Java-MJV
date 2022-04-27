package com.mjv.basenotification;

public enum TipoServico {
	AGUA ("A"),
	LUZ ("L");
		
 	private String tipoServico;
 	private String siglaServico;
 	
 	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	private TipoServico (String siglaServ) {
		this.siglaServico = siglaServ;
	}
	
	public String getSiglaServ () {
		return siglaServico;
	}
	
}
