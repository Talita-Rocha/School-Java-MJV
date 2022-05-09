package com.mjv.pedidofast.model.pedido;

public class PedidoItem {
	private Integer id;
	private Double quantidade;
	private Double valorUnitario;
	private Double subtotal;
	
	//em alguns projetos usam
	//o proprio produdo
	//mas hoje com as apis rest
	//usam mais somente o id
	private Integer idProduto;
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
}
