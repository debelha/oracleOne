package br.com.alura.musicplayer.model;

public class FavoritAudios {

    public void put(Audio audio){
        if(audio.getRating() >=9) {
            System.out.println(audio.getName() + " é considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getName() + " a gelra está curtindo!");
        }
    }
}
