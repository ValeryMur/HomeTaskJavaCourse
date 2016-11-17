package homeTask13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ASUS PC on 17.11.2016.
 */
public class CatMap {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Luck", new Cat("Luck"));
        map.put("Tom", new Cat("Tom"));
        map.put("Tim", new Cat("Tim"));
        map.put("Bob", new Cat("Bob"));
        map.put("Toby", new Cat("Toby"));
        map.put("Jack", new Cat("Jack"));
        map.put("Lusy", new Cat("Lusy"));
        map.put("Linda", new Cat("Linda"));
        map.put("Lola", new Cat("Lola"));
        map.put("Big", new Cat("Big"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
//        Set<Map.Entry<String, Cat>> set = map.entrySet();
//        Map<Integer, String> mapFromSet = new HashMap<>();
//        for(Map.Entry<String, Cat> entry : set)
//        {
//            mapFromSet.put(entry.getKey(), entry.getValue());
//        }
//        return set;
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        System.out.println(set);
    }

    public static class Cat {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString() {
            return "Cat "+ this.name;
        }
    }
}
