package com.mjv.openbanking;

import java.time.LocalDate;

public class Movimentacao {
	private LocalDate data;
	private Double valor;
	private String cpfCnpj;
	private String nomeCliente;
	private Boolean estornada;
	private TipoMovimentacao tipo;
	
	// java beans - getters e setters - source -> Generate getters and setters

	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public Boolean getEstornada() {
		return estornada;
	}
	
	public void setEstornada(Boolean estornada) {
		this.estornada = estornada;
	}
	
	public TipoMovimentacao getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Movimentacao [data=" + data + ", valor=" + valor + ", cpfCnpj=" + cpfCnpj + ", nomeCliente="
				+ nomeCliente + ", estornada=" + estornada + ", tipo=" + tipo + "]";
	}	
}