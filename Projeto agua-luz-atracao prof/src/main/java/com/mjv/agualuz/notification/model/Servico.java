package com.mjv.agualuz.notification.model;

public enum Servico {
	AGUA ("Água",137.21,"A"),
	LUZ("Energia",132.15,"L");
	
	private String descricao;
	private Double valor;
	private String sigla;
	private Servico(String descricao, Double valor, String sigla) {
		this.descricao = descricao;
		this.valor = valor;
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public Double getValor() {
		return valor;
	}
	public String getSigla() {
		return sigla;
	}
	
	
}
