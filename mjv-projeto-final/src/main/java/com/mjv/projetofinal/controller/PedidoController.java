package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.model.pedido.Pedido;
import com.mjv.projetofinal.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	@Autowired
	private PedidoRepository repository;
	
	@PostMapping
	public void gravar(@RequestBody Pedido Pedido) {
		repository.save(Pedido);
	}
	@GetMapping
	public List<Pedido> listar(){
		return repository.findAll();
	}
}
