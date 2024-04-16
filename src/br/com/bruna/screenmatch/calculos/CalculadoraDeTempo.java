package br.com.bruna.screenmatch.calculos;

import br.com.bruna.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;  //acumular

    public int getTempoTotal(){ //para quem usar a calculadora poder buscar esse tempo total
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();  //polimorfismo(muitas formas), aqui estamos chamanado filme e serie ao inves de chamar uma por vez
    }
}
