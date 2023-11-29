package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Episodio implements Classificacao {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalvisualizacoes;

    public int getTotalvisualizacoes() {
        return totalvisualizacoes;
    }

    public void setTotalvisualizacoes(int totalvisualizacoes) {
        this.totalvisualizacoes = totalvisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalvisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }

    }
}
