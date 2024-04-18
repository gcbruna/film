package br.com.bruna.screenmatch.modelos;

import br.com.bruna.screenmatch.calculos.Classificavel;

public class Episodios implements Classificavel {
    private int numero;
    private String nome;
    private String serie;
    private int totalVisualizacao;

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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacao > 100){
            return 4;
        }else {
            return 2;
        }
    }
}
