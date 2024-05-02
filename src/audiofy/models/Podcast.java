package audiofy.models;

public class Podcast extends Track {
    private String host;
    private String description;

    // Constructors

    public Podcast(String title, double duration) {
        super(title, duration);
    }

    public Podcast(String title, double duration, String host) {
        super(title, duration);
        this.host = host;
    }

    // getters and setters

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // overrides methods

    @Override
    public int getRating() {
        if (this.getLikes() > 500) {
            return 10;
        } else {
            return 5;
        }
    }
}
