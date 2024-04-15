package br.com.bruna.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;  // Ele não deixa nem ler, nem escrever. Então o atributo privado não é somente leitura, ele está escondido, é necessário encontrar outra forma de acessá-lo.
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica(){    //método   não devolve nada, mas faz alguma coisa (não tem um retorno)
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;  //pega o que ja tinha na  avaliacao e incrementa e ir somando todas as avaliacoes
        totalDeAvaliacoes++;  //cada vez que colocar uma avaliação, ele ir incrementando essa minha total de avaliacoes
    }

    public double pegaMediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;      //retorna
    }

    public int getTotalDeAvaliacoes(){    // retornasse e exibisse o total de avaliações, sem que seja possível alterá-lo. Isso é o que chamamos de "método acessor".
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {   // setter - deixar a pessoa incluir um nome
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
