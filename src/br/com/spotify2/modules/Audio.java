package br.com.spotify2.modules;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducao;
    private String colaborador;
    private int totalDeCurtidas;

    public void exibeInfoAudio() {
        System.out.println("----------------------------------------");
        System.out.println("Exibindo informações do audio...");
        System.out.println(
                "Titulo: " + titulo +
                "\nDuração: " + duracao +
                "\ntotalDeCurtidas: " + totalDeCurtidas +
                "\nArtista: " + colaborador +
                "\nTotal de reprodução: " + totalDeReproducao
        );
    }

    public void reproduzir() {
        this.totalDeReproducao++;
    }

    public void curtir (boolean curtido) {
        if (!curtido) {
            System.out.println("Esse audio não foi curtido");
        } else {
            System.out.println("você curtiu esse audio...");
            totalDeCurtidas++;
        }
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public String getColaborador() {
        return colaborador;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }
}
