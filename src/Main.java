import br.com.bruna.screenmatch.modelos.Film; //O importe é a forma que uma classe se referencia a outra quando estão em pacotes diferentes

public class Main {
    public static void main(String[] args) {
        Film meuFilme = new Film(); //criando o espaço na memoria é o objeto
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(190);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("Total de Avaliação: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMediaDasAvaliacoes());

    }
}
