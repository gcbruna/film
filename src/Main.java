import br.com.bruna.screenmatch.calculos.CalculadoraDeTempo;
import br.com.bruna.screenmatch.modelos.Film; //O importe é a forma que uma classe se referencia a outra quando estão em pacotes diferentes
import br.com.bruna.screenmatch.modelos.Film;
import br.com.bruna.screenmatch.modelos.Serie;
public class Main {
    public static void main(String[] args) {
        Film meuFilme = new Film(); //criando o espaço na memoria é o objeto
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(190);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos()  + " minutos");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("Total de Avaliação: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMediaDasAvaliacoes());

        Serie theLastOfUs = new Serie();
        theLastOfUs.setNome("The Last Of Us");
        theLastOfUs.setAnoDeLancamento(2023);
        theLastOfUs.exibeFichaTecnica();
        theLastOfUs.setAtiva(true);
        theLastOfUs.setTemporadas(1);
        theLastOfUs.setEpisodiosPorTemporada(8);
        theLastOfUs.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar The Last Of Us: " + theLastOfUs.getDuracaoEmMinutos() + " minutos");

        Film outroFilme = new Film();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setIncluidoNoPlano(true);


        Film favorito = new Film();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);


        Film outro = new Film();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);


        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

       serie.exibeFichaTecnica();
       outro.exibeFichaTecnica();
       favorito.exibeFichaTecnica();

        System.out.println("Tempo total: " + calculadora.getTempoTotal());
    }
}
