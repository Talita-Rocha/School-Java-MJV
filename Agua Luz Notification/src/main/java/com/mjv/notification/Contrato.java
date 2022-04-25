package com.mjv.notification;

import java.time.LocalDate;

public class Contrato {

	private Integer protocoloContrato;
	private LocalDate data;
	private LocalDate hora;
	private Double taxaValor; 
	private InstalacaoServico siglaServ;
	private TipoNotificacao tipoNotificacao;
	
	
	public Integer getProtocoloContrato() {
		return protocoloContrato;
	}
	public void setProtocoloContrato(Integer protocoloContrato) {
		this.protocoloContrato = protocoloContrato;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalDate getHora() {
		return hora;
	}
	public void setHora(LocalDate hora) {
		this.hora = hora;
	}
	public Double getTaxaValor() {
		return taxaValor;
	}
	public void setTaxaValor(Double taxaValor) {
		this.taxaValor = taxaValor;
	}
	public InstalacaoServico getSiglaServ() {
		return siglaServ;
	}
	public void setSiglaServ(InstalacaoServico siglaServ) {
		this.siglaServ = siglaServ;
	}
	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}
	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}
	
}
