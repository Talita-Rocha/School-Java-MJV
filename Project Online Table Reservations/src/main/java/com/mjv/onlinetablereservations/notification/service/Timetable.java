package com.mjv.onlinetablereservations.notification.service;

import java.time.LocalTime;
import java.util.Scanner;

public class Timetable {
	
	public static void main(String[] args) {
	  
	Scanner entrada = new Scanner(System.in);
	
	System.out.println ("\t SELECIONAR O HOR�RIO. \r");
	System.out.println ("Reservas a partir de 12:00 at� 21:00 com intervalos de 30 minutos.");
	System.out.println ("Anteced�ncia m�nima de 2 horas e sujeita � disponibilidade! \r");
	System.out.println ("Digite o hor�rio desejado: (hh:mm) ");
	
	int  hour = entrada.nextInt(); 
	   switch (hour) {
	     case 1:
	       System.out.println("O n�mero escolhido foi: 1.");
	       break;
	     case 2:
	       System.out.println("O n�mero escolhido foi: 2.");
	       break;
	     case 3:
	       System.out.println("O n�mero escolhido foi: 3.");
	       break;
	     case 4:
	       System.out.println("O n�mero escolhido foi: 4.");
	       break;
	     case 5:
	       System.out.println("O n�mero escolhido foi: 5.");
	       break;
	     case 6:
	       System.out.println("O n�mero escolhido foi: 6.");
	       break;
	     case 7:
	       System.out.println("O n�mero escolhido foi: 7.");
	       break;
	     case 8:
	       System.out.println("O n�mero escolhido foi: 8.");
	       break;
	     case 9:
	       System.out.println("O n�mero escolhido foi: 9.");
	       break;
	     case 10:
	       System.out.println("O n�mero escolhido foi: 10.");
	       break;
	     default:
	       System.out.println("O n�mero escolhido � inv�lido! Digite um n�mero entre 1 a 10.");
	   } 
	 } 
	}
