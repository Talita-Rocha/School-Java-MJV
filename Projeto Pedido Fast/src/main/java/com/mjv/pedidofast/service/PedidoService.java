package com.mjv.pedidofast.service;

import java.util.List;

import com.mjv.pedidofast.model.pedido.Pedido;
import com.mjv.pedidofast.model.pedido.PedidoItem;

public class PedidoService {
	//aqui é toda a lógica de negócio do sistema
	//relacionado ao pedido
	public void concluir(Pedido pedido) {
		Double valorTotalPedido = 0.0d;
		List<PedidoItem> itens = pedido.getItens();
		for(PedidoItem item: itens) {
			valorTotalPedido = valorTotalPedido + item.getSubtotal();
		}
		pedido.setValorTotal(valorTotalPedido);
		//ufa parece que o pedido foi concluido
		//podemos imprimir ou gravar no banco
	}
}
