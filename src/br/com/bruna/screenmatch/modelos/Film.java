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

    @Override
    public String toString() {
        return "Filme: " +this.getNome() + " (" +this.getAnoDeLancamento() + ")";
    }

    public Film(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);                //O uso do super em um construtor de uma classe filha tem a finalidade de chamar explicitamente o construtor da classe pai (superclasse). Isso é útil quando a classe filha precisa inicializar os atributos herdados da classe pai ou quando queremos executar algum código presente no construtor da classe pai.
    }
}
