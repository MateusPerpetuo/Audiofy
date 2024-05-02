package audiofy.models;

public abstract class Track {

    private String title;
    private double duration;
    private long totalPlays;
    private long likes;
    private int rating;

    // methods

    public void toLike (){
        this.likes ++;
    }

    public void toPlay(){
        this.totalPlays ++;
    }

    // constructors

    public Track(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    // getter and setters

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public long getTotalPlays() {
        return totalPlays;
    }

    public long getLikes() {
        return likes;
    }

    public int getRating() {
        return rating;
    }
}
