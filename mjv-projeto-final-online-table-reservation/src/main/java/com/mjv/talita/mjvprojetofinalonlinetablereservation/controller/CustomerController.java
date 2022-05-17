package com.mjv.talita.mjvprojetofinalonlinetablereservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.talita.mjvprojetofinalonlinetablereservation.model.cadastro.Customer;
import com.mjv.talita.mjvprojetofinalonlinetablereservation.repository.CustomerRepository;

@RestController
@RequestMapping("/customers")

public class CustomerController {
	@Autowired
	private CustomerRepository repository;
	
	@PostMapping
	public void gravar(@RequestBody Customer customer) {
		repository.save(customer);
	}
	@GetMapping
	public List<Customer> listar() {
		return repository.findAll();
	}
}
