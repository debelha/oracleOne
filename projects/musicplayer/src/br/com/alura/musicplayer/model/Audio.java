package br.com.alura.musicplayer.model;

public class Audio {
    private String name;
    private int plays;
    private int likes;
    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlays() {
        return plays;
    }

    public int getLikes() {
        return likes;
    }

    public double getRating() {
        return rating;
    }

    public void like() {
        this.likes++;
    }

    public void play(){
        this.plays++;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
