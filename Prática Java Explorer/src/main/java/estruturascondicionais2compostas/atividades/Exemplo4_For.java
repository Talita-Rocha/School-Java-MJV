package estruturascondicionais2compostas.atividades;

public class Exemplo4_For {

	public static void main(String[] args) {

        System.out.println("Decrescente: ");
        Exemplo4_For.ContagemRegressiva(5);
       
        System.out.println("-----");
        
        System.out.println("Crescente: ");
        Exemplo4_For.ContagemCrescente(5);

    }

    static void ContagemRegressiva(int numero) {
        for(int i=numero; i>0; i--) {
            System.out.println(i);
        }

    }
    static void ContagemCrescente(int numero1) {
        for(int j=0; j<numero1; j++) {
            System.out.println(j);
        }
    }
}
