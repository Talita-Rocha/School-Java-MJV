package mjv.aguaeluz.notification.model;

public enum TipoServico {
	AGUA ( "Água", 127.33, "A"),
	LUZ ( "Energia", 132.15, "L");
		
 	private String descricaoServico;
 	private Double valorServico;
 	private String siglaServico;
 	
 	private TipoServico(String descricaoServico, Double valorServico, String siglaServico) {
 		this.descricaoServico = descricaoServico;
 		this.valorServico = valorServico;
 		this.siglaServico = siglaServico;
 			
 	}
 	// PQ NÃO ENTROU O SET MESMO????
 	
 	public String getDescricaoServico() {
		return descricaoServico;
	}
 	public Double getValorServico() {
 		return valorServico;
 	}
 	public String getSiglaServico() {
		return siglaServico;
	}

}

