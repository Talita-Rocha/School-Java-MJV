package com.mjv.talita.mjvprojetofinalonlinetablereservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.talita.mjvprojetofinalonlinetablereservation.model.reserve.Reserve;
import com.mjv.talita.mjvprojetofinalonlinetablereservation.repository.ReserveRepository;

@RestController
@RequestMapping("/reserves")
public class ReserveController {

	@Autowired
	private ReserveRepository repository;
	
	@PostMapping
	public void gravar (@RequestBody Reserve Reserve) {
		repository.save(Reserve);
	}
	@GetMapping
	public List<Reserve> listar(){
		return repository.findAll();
	}
}
