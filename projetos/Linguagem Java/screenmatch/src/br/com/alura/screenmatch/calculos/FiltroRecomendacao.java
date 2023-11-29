package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class FiltroRecomendacao{
    private String recomendacao;

    public void filtra(Classificacao classificacao){
        if (classificacao.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");

        }  else if (classificacao.getClassificacao() >= 2 ) {
            System.out.println("Bem avalidado no momento");

        } else {
            System.out.println("Colque na sua lista para assistir depois");
        }
    }
}
