package com.mjv.onlinetablereservations.notification.service;

import java.time.LocalTime;
import java.util.Scanner;

public class Timetable {
	
	public static void main(String[] args) {
	  
	Scanner entrada = new Scanner(System.in);
	
	System.out.println ("\t SELECIONAR O HORÁRIO. \r");
	System.out.println ("Reservas a partir de 12:00 até 21:00 com intervalos de 30 minutos.");
	System.out.println ("Antecedência mínima de 2 horas e sujeita à disponibilidade! \r");
	System.out.println ("Digite o horário desejado: (hh:mm) ");
	
	int  hour = entrada.nextInt(); 
	   switch (hour) {
	     case 1:
	       System.out.println("O número escolhido foi: 1.");
	       break;
	     case 2:
	       System.out.println("O número escolhido foi: 2.");
	       break;
	     case 3:
	       System.out.println("O número escolhido foi: 3.");
	       break;
	     case 4:
	       System.out.println("O número escolhido foi: 4.");
	       break;
	     case 5:
	       System.out.println("O número escolhido foi: 5.");
	       break;
	     case 6:
	       System.out.println("O número escolhido foi: 6.");
	       break;
	     case 7:
	       System.out.println("O número escolhido foi: 7.");
	       break;
	     case 8:
	       System.out.println("O número escolhido foi: 8.");
	       break;
	     case 9:
	       System.out.println("O número escolhido foi: 9.");
	       break;
	     case 10:
	       System.out.println("O número escolhido foi: 10.");
	       break;
	     default:
	       System.out.println("O número escolhido é inválido! Digite um número entre 1 a 10.");
	   } 
	 } 
	}
