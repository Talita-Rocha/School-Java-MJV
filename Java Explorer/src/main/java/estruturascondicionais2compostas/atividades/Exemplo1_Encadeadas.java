package estruturascondicionais2compostas.atividades;

public class Exemplo1_Encadeadas {

    public static void main(String[] args) {
    	Exemplo1_Encadeadas.simuladorMulta(45);
    }
    static void simuladorMulta(int velocarA) {


        if (velocarA >= 70 && velocarA < 80) {
            System.out.println("Multa Leve");
        } else if (velocarA >= 80 && velocarA < 100) {
            System.out.println("Multa Grave");
        }else if(velocarA >= 100){
            System.out.println("Multa Grav�ssima");
        }else {
            System.out.println("Voc� est� dentro da velocidade e n�o foi multado!");
        }

    }
}