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
        theLastOfUs.setTemporadas(1);
        theLastOfUs.setEpisodiosPorTemporada(8);
        theLastOfUs.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + theLastOfUs.getDuracaoEmMinutos() + " minutos");

        Film outroFilme = new Film();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
    }
}
