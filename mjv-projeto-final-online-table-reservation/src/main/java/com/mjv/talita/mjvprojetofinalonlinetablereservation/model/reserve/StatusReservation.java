package com.mjv.talita.mjvprojetofinalonlinetablereservation.model.reserve;

public enum StatusReservation {
		
	CANCELADO,
	DISPONIVEL ,
	RESERVADO;

	
	private String StatusReservation;
	
	public String getString () {
		return StatusReservation;
	}
}
