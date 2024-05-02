package audiofy.models;

public class Music extends Track{
    private String album;
    private String artist;
    private String genre;

    public Music(String title, double duration) {
        super(title, duration);
    }

    public Music(String title, double duration, String artist) {
        super(title, duration);
        this.artist = artist;

    }

    // getters and setters

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
    public int getRating() {
        if (this.getTotalPlays() > 2000){
            return 10;
        } else {
            return 7;
        }
    }
}
