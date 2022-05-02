package com.mjv.agualuz.notification.model;

public enum TipoNotificacao {
	SMS ( "SMS", "S"),
	WHATSAPP ("Whastapp","W");

	private String descricaoNotificacao;
	private String siglaNotificacao;
	
	private TipoNotificacao (String descricaoNotificacao, String siglaNotificacao) {
		this.descricaoNotificacao = descricaoNotificacao;
		this.siglaNotificacao = siglaNotificacao;
	}

	public String getDescricaoNotificacao () {
		return descricaoNotificacao;
	}
	public String getSiglaNotificacao() {
		return siglaNotificacao;
	}

}
