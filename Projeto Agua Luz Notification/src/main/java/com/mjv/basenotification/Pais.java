package com.mjv.basenotification;

public enum Pais {
	
	Argentina ("AR"),
	Brasil("BR"),
	Chile ("CL");
	
	private String siglaPais;
	
	private Pais (String siglaPais) {
		this.siglaPais = siglaPais;
	}
	
	public String getSiglaPais () {
		return siglaPais;
	}
}
