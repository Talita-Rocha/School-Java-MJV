package criarnotificacao;

import java.time.LocalDate;
import java.time.LocalTime;

import com.mjv.basenotification.Cadastro;
import com.mjv.basenotification.Residencia;
import com.mjv.basenotification.Contrato;
import com.mjv.basenotification.TipoNotificacao;
import com.mjv.basenotification.TipoServico;

public class Notificacao {

	private String nomeCliente;
	private String cpf;
	private Integer protocoloContrato;
	private LocalDate data;
	private LocalTime hora;
	private TipoServico tipoServico;
	private Double taxaValor; 
	
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
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
	public TipoServico getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	public Double getTaxaValor() {
		return taxaValor;
	}
	public void setTaxaValor(Double taxaValor) {
		this.taxaValor = taxaValor;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "Notificacao [nomeCliente=" + nomeCliente + ", cpf=" + cpf + ", protocoloContrato=" + protocoloContrato
				+ ", data=" + data + ", hora=" + hora + ", tipoServico=" + tipoServico + ", taxaValor=" + taxaValor
				+ ", logradouro=" + logradouro + ", numero=" + numero + " , complemento=" + complemento + ", bairro="
				+ bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + "]";
	}
	
}
	

	

