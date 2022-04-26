package com.mjv.openbanking;

import java.time.LocalDate;

//BIBLIOTECA LOMBOK
public class Movimentacao {

	//VARIÁVEIS DA CLASSE
	private LocalDate data;
	private String cpfCnpj; // ATENÇÃO AO NOME DECLARADO PRIMEIRA EM MINUSCULO E SEGUNDA EM MAIUSCULO
	private String nomeCliente; // EVITAR ABREVIAR
	private Double valor;
	private TipoMovimentacao tipo; //CRIADO UM ENUM (USADO EM INFORMAÇÕES PRÉ-DEFINIDAS)
	private Boolean estornado;
	
	//JAVA BEANS GETTERS AND SETTERS
	// BOTÃO DIREITO, SOURCE, GENERATE GETTERS AND SETTERS TO CREATE (PARA INSERIR)
	
	// GET retorna o valor do atributo do objeto
	public LocalDate getData() {
		return data;
	}
	// SET define um valor para um atributo do objeto
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
	public Boolean getEstornado() {
		return estornado;
	}
	public void setEstornado(Boolean estornado) {
		this.estornado = estornado;
	}
	public TipoMovimentacao getTipo() {
		return tipo;
	}
	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}
	
	//MÉTODO TO STRING - PARA DEFINIR A ESTRUTURA DA MINHA IMPRESSAO
	// SOURCE GENERATE toString()
	
	@Override
	public String toString() {
		return "Movimentacao [data=" + data + ", cpfCnpj=" + cpfCnpj + ", nomeCliente=" + nomeCliente + ", valor="
				+ valor + ", tipo=" + tipo + ", estornado=" + estornado + "]";
	}
	
	
	
	
	
}
