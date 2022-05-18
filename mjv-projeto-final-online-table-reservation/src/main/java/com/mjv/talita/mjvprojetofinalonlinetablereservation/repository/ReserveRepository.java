package com.mjv.talita.mjvprojetofinalonlinetablereservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.talita.mjvprojetofinalonlinetablereservation.model.reserve.Reserve;

public interface ReserveRepository extends JpaRepository<Reserve, Integer> {

	

}
