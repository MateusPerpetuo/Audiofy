package audiofy.models;

public class Favorites {
    public void toInclude(Track track){
        if ( track.getRating() >= 9) {
            System.out.println( track.getTitle()
                    + ": it's considered everyone's all time favorite!");
        } else if (track.getRating() >=6) {
            System.out.println( track.getTitle()
                    + ": it's also one of the ones everyone is enjoying!");
        } else {
            System.out.println( track.getTitle()
                    + ": maybe try it letter!");
        }
    }
}
