package br.com.alura.musicplayer.model;

public class Music extends Audio{
    private String album;
    private String artist;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public double getRating() {
        if (this.getPlays() > 2000) {
            return 10;
        } else {
            return 8;
        }
    }
}
