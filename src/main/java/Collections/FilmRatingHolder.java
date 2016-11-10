package Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ASUS PC on 06.11.2016.
 */
public class FilmRatingHolder {
    private Map<String,String> imdb;
    private Map<String,String> kinopoisk;

    public FilmRatingHolder() {
        imdb = new HashMap<String, String>();
        imdb.put("Lord of the Rings", "10");
        imdb.put("Lord of the Rings2", "8");
        imdb.put("Lord of the Rings3", "9");
        imdb.put("Lord of the Rings5", "9");

        kinopoisk = new HashMap<String, String>();
        kinopoisk.put("Lord of the Rings", "9");
        kinopoisk.put("Lord of the Rings2", "10");
        kinopoisk.put("Lord of the Rings3", "9");
        kinopoisk.put("Lord of the Rings4", "0");
  }

    public Map<String, String> getImdb() {
        return imdb;
    }

    public Map<String, String> getKinopoisk() {
        return kinopoisk;
    }
}
