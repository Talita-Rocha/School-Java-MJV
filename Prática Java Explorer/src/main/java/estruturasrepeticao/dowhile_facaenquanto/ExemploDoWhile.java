package estruturasrepeticao.dowhile_facaenquanto;

import java.util.Random;

//Jo�ozinho resolveu ligar para o seu amigo dizendo que hoje se entupiu de comer docinhos:

public class ExemploDoWhile {
	
		public static void main(String[] args) {
			System.out.println("Discando...");
			
			do {
				//excutando repetidas vezes at� algu�m atender
				System.out.println("Telefone tocando");
			
			}while(tocando());
			
			System.out.println("Al� !!!");
		}
		private static boolean tocando() {
			boolean atendeu = new Random().nextInt(3)==1;
			System.out.println("Atendeu? " + atendeu);
			//negando o ato de continuar tocando
			return ! atendeu;
		}
}
