package br.com.bruna.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpispdio;

    //quero poder botar valor em tudo, e quero obter valor de tudo getter and setter
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpispdio() {
        return minutosPorEpispdio;
    }

    public void setMinutosPorEpispdio(int minutosPorEpispdio) {
        this.minutosPorEpispdio = minutosPorEpispdio;
    }
}
