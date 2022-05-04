package mjv.aguaeluz.notification.model;

import java.time.LocalDateTime;

public class Contrato {

	private Long numeroProtocolo;
	private LocalDateTime dataHora;
	private Cadastro cliente;
	private TipoServico descricaoServico;
	private TipoServico valorServico;
	private TipoServico siglaServico;
	private TipoNotificacao descricaoNotificacao;
	private TipoNotificacao siglaNotificacao;
	
	public Long getNumeroProtocolo() {
		return numeroProtocolo;
	}
	public void setNumeroProtocolo(Long numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	public TipoServico getDescricaoServico() {
		return descricaoServico;
	}
	public void setDescricaoServico(TipoServico descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
	public TipoServico getValorServico() {
		return valorServico;
	}
	public void setValorServico(TipoServico valorServico) {
		this.valorServico = valorServico;
	}
	public TipoServico getSiglaServico() {
		return siglaServico;
	}
	public void setSiglaServico(TipoServico siglaServico) {
		this.siglaServico = siglaServico;
	}
	public TipoNotificacao getDescricaoNotificacao() {
		return descricaoNotificacao;
	}
	public void setDescricaoNotificacao(TipoNotificacao descricaoNotificacao) {
		this.descricaoNotificacao = descricaoNotificacao;
	}
	public TipoNotificacao getSiglaNotificacao() {
		return siglaNotificacao;
	}
	public void setSiglaNotificacao(TipoNotificacao siglaNotificacao) {
		this.siglaNotificacao = siglaNotificacao;
	}
			
}
