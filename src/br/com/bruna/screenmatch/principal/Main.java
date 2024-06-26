package br.com.bruna.screenmatch.principal;

import br.com.bruna.screenmatch.calculos.CalculadoraDeTempo;
import br.com.bruna.screenmatch.calculos.FiltroRecomendacao;
import br.com.bruna.screenmatch.modelos.Episodios;
import br.com.bruna.screenmatch.modelos.Film; //O importe é a forma que uma classe se referencia a outra quando estão em pacotes diferentes
import br.com.bruna.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Film meuFilme = new Film("O Poderoso Chefão", 1970); //criando o espaço na memoria é o objeto
        meuFilme.setDuracaoEmMinutos(190);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos()  + " minutos");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("Total de Avaliação: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMediaDasAvaliacoes());

        Serie theLastOfUs = new Serie("The Last Of Us", 2023);
        theLastOfUs.exibeFichaTecnica();
        theLastOfUs.setAtiva(true);
        theLastOfUs.setTemporadas(1);
        theLastOfUs.setEpisodiosPorTemporada(8);
        theLastOfUs.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar The Last Of Us: " + theLastOfUs.getDuracaoEmMinutos() + " minutos");

        Film outroFilme = new Film("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setIncluidoNoPlano(true);


        Film favorito = new Film("The Matrix", 1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);


        Film outro = new Film("John Wick", 2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);


        Serie serie = new Serie("La Casa de Papel", 2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        serie.exibeFichaTecnica();
        outro.exibeFichaTecnica();
        favorito.exibeFichaTecnica();


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie("theLastOfUs");
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);

        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        ArrayList<Film> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outro);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " +listaDeFilmes.size());
        System.out.println("Primeiro Filme: " +listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);
    }
}
