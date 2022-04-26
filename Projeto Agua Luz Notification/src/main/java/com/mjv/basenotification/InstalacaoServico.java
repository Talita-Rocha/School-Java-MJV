package com.mjv.basenotification;

public enum InstalacaoServico {
	AGUA ("A"),
	LUZ ("L");
		
	private String siglaServ;
	
	private InstalacaoServico (String siglaServ) {
		this.siglaServ = siglaServ;
	}
	
	public String getSiglaServ () {
		return siglaServ;
	}
	
}
