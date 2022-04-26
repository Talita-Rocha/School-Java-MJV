package com.mjv.basenotification;

public enum TipoNotificacao {
	SMS ("S"),
	WHATSAPP ("W");

	private String tipoNotificacao;
	
	private TipoNotificacao(String tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}

	public String getTipoNotificacao () {
		return tipoNotificacao;
	}




}
