package estruturascondicionais2compostas.atividades;

public class Exemplo3_SwitchCase {

	public static void main(String[] args) {
        int numerodasemana = 1;
         switch (numerodasemana) {

               case 1:
                   System.out.println("Segunda-Feira � o primeiro dia!");
                   break; // n�o usar o return para switch case!!

               case 2:
                   System.out.println("Ter�a-Feira � o segundo dia!");
                   break;

               case 3:
                   System.out.println("Quarta-Feira � o terceiro dia!");
                   break;

               case 4:
                   System.out.println("Quinta-Feira � o quarto dia!");
                   break;

               case 5:
                   System.out.println("Sexta-Feira � o quinto dia!");
                   break;

               case 6:
                   System.out.println("S�bado � o sexto dia!");
                   break;

               case 7:
                   System.out.println("Domingo � o s�timo dia!");
                   break;

                   default:
                       System.out.println("Esse dia da semana n�o existe!!");

         }
    }
	
}
