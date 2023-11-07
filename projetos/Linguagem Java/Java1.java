import java.util.Scanner;

public class Java1 {

    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: top Gun: Maverick");

        //Top Gun: Maverick
        int anoDeLancamento =2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        Double notaDoFilme = 8.1;
 // media calculada pela jack, paulo e suelen
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse =(String.format( """
                    Filme top Gun
                    Filme de aventura com galã dos anos 80
                    Muito bom!
                    Ano de lançamento: %d
                """, anoDeLancamento)) ;
        System.out.println(sinopse);

            int classificacao;
            classificacao = (int) (media/2);
        System.out.println(classificacao);



    }
}
