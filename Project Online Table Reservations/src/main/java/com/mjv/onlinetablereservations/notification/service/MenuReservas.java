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
      System.out.println("## Escolha uma das opções abaixo: ## \n");
      System.out.println("Opção 1 - Hotéis");
      System.out.println("Opção 2 - Passagens aéreas");
      System.out.println("Opção 3 - Aluguel de carro");
      System.out.println("Opção 4 - Restaurante");
      System.out.println("Opção 0 - Sair do programa");
      System.out.println("_________________________________________");

      System.out.print("Digite aqui sua opção de reserva: ");
          opcao = Integer.parseInt(sc.nextLine());
     
      //TRATAR A OPÇÃO 4

      if(opcao == 1) {
    	  System.out.println("A reserva de hotel ainda não está disponível! \n");
    	  System.out.println("Que tal fazer outro tipo de reseva!");
    	  System.out.println("Pressione um tecla para continuar.");
          sc.nextLine();
      }
      
       	else if(opcao == 2){
    	  System.out.println("A reserva de passagens aéreas ainda não está disponível! \n");
    	  System.out.println("Que tal fazer outro tipo de reseva!");
    	  System.out.println("Pressione um tecla para continuar.");
          sc.nextLine();
      	}
      		else if(opcao == 3){
      		  System.out.println("O aluguel de carro ainda não está disponível! \n");
          	  System.out.println("Que tal fazer outro tipo de reseva!");
          	  System.out.println("Pressione um tecla para continuar.");
          	  sc.nextLine();
      		}
      			else if(opcao == 4){
      			//Cria um novo objeto
      			ReservarMesa reservamesaId = new ReservarMesa ();
      			
      			System.out.println("Ótima escolha!");
      			sc.nextLine();
      			}
        
    }
    
    while (opcao != 0);
    sc.close();
	}
	
}
     
          
          
    