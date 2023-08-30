import br.com.spotify2.modules.Favoritos;
import br.com.spotify2.modules.Musica;
import br.com.spotify2.modules.PodCast;


public class Main {
    public static void main(String[] args) {

        Musica musicaDoVitor = new Musica();
        musicaDoVitor.setTitulo("Conexão de mafia");
        musicaDoVitor.setColaborador("Matue");
        musicaDoVitor.setDuracao(4);
        musicaDoVitor.setGenero("Trap");
        int contadorMusica = 1;
        while (contadorMusica <= 2500) {
            musicaDoVitor.reproduzir();
            contadorMusica++;
        }
        musicaDoVitor.curtir(true);

        musicaDoVitor.exibeInfoAudio();
        System.out.println("Genero: " + musicaDoVitor.getGenero());
        PodCast podCast = new PodCast();
        podCast.setTitulo("Pod pah");
        podCast.setCategoria("humor");
        podCast.setEpisodio(10);
        podCast.setColaborador("Vitor e Ellen");
        podCast.setDuracao(140);
        int contadorPodCast = 1;

        while (contadorPodCast <= 35) {
            podCast.reproduzir();
            contadorPodCast++;
        }

        podCast.exibeInfoAudio();
        System.out.println("Categoria: " + podCast.getCategoria());

        Musica musicaEllen = new Musica();
        musicaEllen.setTitulo("Carolina");
        musicaEllen.setColaborador("Luiz gonzaga");
        musicaEllen.setDuracao(4);
        musicaEllen.setGenero("Baiao");

        Favoritos meusFavoritos = new Favoritos();
        meusFavoritos.inclui(musicaDoVitor);
        meusFavoritos.inclui(podCast);
        meusFavoritos.inclui(musicaEllen);

    }
}