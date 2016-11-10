package Collections;

import java.util.*;

/**
 * Created by ASUS PC on 06.11.2016.
 */
public class Main {

//    public static void main(String[] args) {
//        FilmRatingHolder holder = new FilmRatingHolder();
//        for (String key : holder.getImdb().keySet()) {
//            String imdbRating;
//            String kinopoiskRating = holder.getKinopoisk().get(key);
//            if(kinopoiskRating!=null){
//                imdbRating=holder.getImdb().get(key);
//                System.out.println("Film name: "+key+"Kinopoisk rating: "+kinopoiskRating+". Imdb rating: "+imdbRating);
//            }
//        }
//    }
public static void main(String[] args) {
    List<String> arrayList = new ArrayList<String>();
    arrayList.add("one");
    arrayList.add("ourElem");
    arrayList.add("one");
//    for(String record:arrayList){
//        System.out.println(record);
        System.out.println(arrayList.get(1));
//    }

    Set<String> stringSet = new HashSet<String>();
    stringSet.add("two");
    stringSet.add("two");
    stringSet.add("two");
    for(String record:stringSet){
        System.out.println(record);
    }
}
}
