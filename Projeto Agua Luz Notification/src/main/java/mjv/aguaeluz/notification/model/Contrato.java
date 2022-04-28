package mjv.aguaeluz.notification.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Contrato {

	private Integer protocoloContrato;
	private LocalDate data;
	private LocalTime hora;
	private Double taxaValor; 
	private TipoServico siglaServ;
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
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public Double getTaxaValor() {
		return taxaValor;
	}
	public void setTaxaValor(Double taxaValor) {
		this.taxaValor = taxaValor;
	}
	public TipoServico getSiglaServ() {
		return siglaServ;
	}
	public void setSiglaServ(TipoServico siglaServ) {
		this.siglaServ = siglaServ;
	}
	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}
	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}
	
}
