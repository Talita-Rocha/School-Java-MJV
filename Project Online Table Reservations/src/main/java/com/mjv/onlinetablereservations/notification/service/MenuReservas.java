package com.mjv.onlinetablereservations.notification.service;

import java.util.Scanner;

public class MenuReservas {

	public static void main(String[] args) {
	
		menuReservas();
	}

public static void menuReservas() {
    Scanner sc = new Scanner(System.in);
        
    Menu menu = new Menu ();
    
    int opcao = 0;
    
    do {
      System.out.println("## Escolha uma das op��es abaixo: ## \n");
      System.out.println("Op��o 1 - Hot�is");
      System.out.println("Op��o 2 - Passagens a�reas");
      System.out.println("Op��o 3 - Aluguel de carro");
      System.out.println("Op��o 4 - Restaurante");
      System.out.println("Op��o 0 - Sair do programa");
      System.out.println("_________________________________________");

      System.out.print("Digite aqui sua op��o de reserva: ");
          opcao = Integer.parseInt(sc.nextLine());
     
      //TRATAR A OP��O 4

      if(opcao == 1) {
    	  System.out.println("A reserva de hotel ainda n�o est� dispon�vel! \n");
    	  System.out.println("Que tal fazer outro tipo de reseva!");
    	  System.out.println("Pressione um tecla para continuar.");
          sc.nextLine();
      }
      
       	else if(opcao == 2){
    	  System.out.println("A reserva de passagens a�reas ainda n�o est� dispon�vel! \n");
    	  System.out.println("Que tal fazer outro tipo de reseva!");
    	  System.out.println("Pressione um tecla para continuar.");
          sc.nextLine();
      	}
      		else if(opcao == 3){
      		  System.out.println("O aluguel de carro ainda n�o est� dispon�vel! \n");
          	  System.out.println("Que tal fazer outro tipo de reseva!");
          	  System.out.println("Pressione um tecla para continuar.");
          	  sc.nextLine();
      		}
      			else if(opcao == 4){
      			//Cria um novo objeto
      			ReservarMesa reservamesaId = new ReservarMesa ();
      			
      			System.out.println("�tima escolha!");
      			sc.nextLine();
      			}
        
    }
    
    while (opcao != 0);
    sc.close();
	}
	
}
     
          
          
    