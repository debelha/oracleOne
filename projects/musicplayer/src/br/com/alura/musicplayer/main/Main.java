package br.com.alura.musicplayer.main;

import br.com.alura.musicplayer.model.FavoritAudios;
import br.com.alura.musicplayer.model.Music;
import br.com.alura.musicplayer.model.Podcast;

public class Main {
    public static void main(String[] args) {
        Music music1 = new Music();
        music1.setName("Colar de Miçanga");
        music1.setArtist("Baiana Syatem");

        for (int i = 0; i < 1000; i++) {
            music1.play();
        }

        for (int i = 0; i < 50; i++) {
            music1.like();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setName("BolhaDev");
        podcast1.setHost("Marcos Mender");

        for (int i = 0; i < 5000; i++) {
            podcast1.play();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.like();
        }

        FavoritAudios favorits = new FavoritAudios();
        favorits.put(podcast1);
        favorits.put(music1);
    }
}
