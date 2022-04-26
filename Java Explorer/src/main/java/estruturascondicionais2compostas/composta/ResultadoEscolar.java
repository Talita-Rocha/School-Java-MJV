package estruturascondicionais2compostas.composta;

public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 6;
       
       if(nota >= 7)
        System.out.println("Aprovado");

       else
        System.out.println("Reprovado");
    }
}

/*
 Vale ressaltar aqui que no Java em uma condiçãoif/else as vezes 
 necessitamos adicionar um bloco de { }
 se a lógica conter mais de uma linha.*/
