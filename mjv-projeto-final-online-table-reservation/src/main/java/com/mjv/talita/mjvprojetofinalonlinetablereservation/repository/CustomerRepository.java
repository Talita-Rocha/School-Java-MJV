package com.mjv.talita.mjvprojetofinalonlinetablereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.talita.mjvprojetofinalonlinetablereservation.model.cadastro.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

