package br.com.bruna.screenmatch.modelos;

public class Film extends Titulo{ // aplica herança á uma classe que no caso se diz o filme extende titulo
    //filme tem tudo o que Titulo tem e + o diretor
    private String diretor;

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
