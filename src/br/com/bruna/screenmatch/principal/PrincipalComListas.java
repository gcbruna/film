package br.com.bruna.screenmatch.principal;

import br.com.bruna.screenmatch.modelos.Film;
import br.com.bruna.screenmatch.modelos.Serie;
import br.com.bruna.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Film meuFilme = new Film("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);
        Film outroFilme = new Film("Avatar", 2023);
        outroFilme.avalia(6);
        Film favorito = new Film("The Matrix", 1999);
        favorito.avalia(4);
        Film outro = new Film("John Wick", 2014);
        outro.avalia(5);
        Serie theLastOfUs = new Serie("The Last Of Us", 2023);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(meuFilme);
        lista.add(outro);
        lista.add(outroFilme);
        lista.add(theLastOfUs);

        //impimir os itens dessa lista
        for (Titulo item: lista) {  //pra cada item da variavel titulo, que ta dentro da lista
            System.out.println(item.getNome());
            Film filme = null;
            if (item instanceof Film && filme.getClassificacao() > 2) {  //para verificar se aquele item da lista é um filme realmente, isso porque ainda existe muito código legado.
                filme = (Film) item;
                System.out.println("Classificação " + filme.getClassificacao());
            }
            ;
        };
    }
}
