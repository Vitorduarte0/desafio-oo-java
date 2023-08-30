package br.com.spotify2.modules;

public class Favoritos {
    public void inclui(Audio audio) {
        if (audio.getTotalDeReproducao() >= 2000) {
            System.out.println(audio.getTitulo() + " Está na lista de mais ouvida da galera");
        } else if (audio.getTotalDeReproducao() > 30) {
            System.out.println("Uau " + audio.getTitulo() + " está sendo muito curtida pela a galera!");
        } else {
            System.out.println(audio.getTitulo() + " está na lista de favoritos da galera...");
        }
    }
}
