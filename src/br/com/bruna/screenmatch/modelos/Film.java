package br.com.bruna.screenmatch.modelos;

import br.com.bruna.screenmatch.calculos.Classificavel;

public class Film extends Titulo implements Classificavel { // aplica herança á uma classe que no caso se diz o filme extende titulo
    //filme tem tudo o que Titulo tem e + o diretor
    private String diretor;

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (pegaMediaDasAvaliacoes() / 2);  //sendo sobrescrito (substituído) da interface Classificavel.
    }
}
