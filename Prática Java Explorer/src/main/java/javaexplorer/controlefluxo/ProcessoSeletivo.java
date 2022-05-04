package javaexplorer.controlefluxo;

import java.util.Random;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatosSelecionados = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO"};
		//primeiro um for para selecionar os candidatos
		for(String candidato: candidatosSelecionados) {
			case4(candidato);
		}
		
	}
	static void case4(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("N�O CONSEGUIMOS CONTATO COM " + candidato +", N�MERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}
	
	//m�todo auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
}