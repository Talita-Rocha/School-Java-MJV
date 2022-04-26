package estruturascondicionais2compostas.atividades;

public class Exemplo3_SwitchCase {

	public static void main(String[] args) {
        int numerodasemana = 1;
         switch (numerodasemana) {

               case 1:
                   System.out.println("Segunda-Feira é o primeiro dia!");
                   break; // não usar o return para switch case!!

               case 2:
                   System.out.println("Terça-Feira é o segundo dia!");
                   break;

               case 3:
                   System.out.println("Quarta-Feira é o terceiro dia!");
                   break;

               case 4:
                   System.out.println("Quinta-Feira é o quarto dia!");
                   break;

               case 5:
                   System.out.println("Sexta-Feira é o quinto dia!");
                   break;

               case 6:
                   System.out.println("Sábado é o sexto dia!");
                   break;

               case 7:
                   System.out.println("Domingo é o sétimo dia!");
                   break;

                   default:
                       System.out.println("Esse dia da semana não existe!!");

         }
    }
	
}
