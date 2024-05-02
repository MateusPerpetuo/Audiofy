package audiofy.main;

import audiofy.models.Favorites;
import audiofy.models.Music;
import audiofy.models.Podcast;
import audiofy.models.Track;

public class main {
    public static void main(String[] args) {

        Music myMusic = new Music("Forever", 3.50,"Kiss");

        for (int i = 0; i <1000; i++) {
            myMusic.toPlay();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.toLike();
        }

        Podcast myPodcast = new Podcast("BolhaDev", 43.25, "Marcus Mendes") ;

        for (int i = 0; i <5000; i++) {
            myPodcast.toPlay();
        }
        for (int i = 0; i < 1000; i++) {
            myMusic.toLike();
        }

        Music myMusic2 = new Music("What Does The Fox Say?", 3.45,"Ylvis");

        for (int i = 0; i <2000; i++) {
            myMusic.toPlay();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.toLike();
        }

        Favorites myFavorites =  new Favorites();
        myFavorites.toInclude(myMusic);
        myFavorites.toInclude(myMusic2);
        myFavorites.toInclude(myPodcast);
    }
}
