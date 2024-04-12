package br.com.bruna.screenmatch.modelos;

public class Film {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;  // Ele não deixa nem ler, nem escrever. Então o atributo privado não é somente leitura, ele está escondido, é necessário encontrar outra forma de acessá-lo.
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){    //método   não devolve nada, mas faz alguma coisa (não tem um retorno)
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;  //pega o que ja tinha na  avaliacao e incrementa e ir somando todas as avaliacoes
        totalDeAvaliacoes++;  //cada vez que colocar uma avaliação, ele ir incrementando essa minha total de avaliacoes
    }

    double pegaMediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;      //retorna
    }

    int getTotalDeAvaliacoes(){    // retornasse e exibisse o total de avaliações, sem que seja possível alterá-lo. Isso é o que chamamos de "método acessor".
        return totalDeAvaliacoes;
    }
}