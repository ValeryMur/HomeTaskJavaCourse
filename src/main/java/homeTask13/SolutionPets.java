package homeTask13;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ASUS PC on 16.11.2016.
 */
public class SolutionPets {

    public static void main(String[] args) {
            Set<Cat> cats = createCats();
            Set<Dog> dogs = createDogs();

            Set<Object> pets = join(cats, dogs);
            printPets(pets);

            removeCats(pets, cats);
            printPets(pets);
        }

        public static Set<Cat> createCats() {
            Set<Cat>cats=new HashSet<Cat>();
            cats.add(new Cat("Tom"));
            cats.add(new Cat("Bob"));
            cats.add(new Cat("Jack"));
            cats.add(new Cat("Luck"));
            //System.out.println(cats);
            return cats;
        }

        public static Set<Dog> createDogs() {
            Set<Dog>dogs=new HashSet<Dog>();
            dogs.add(new Dog("Gav"));
            dogs.add(new Dog("Goov"));
            dogs.add(new Dog("Jessy"));
            return dogs;
        }

        public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
            Set<Object>pets=new HashSet<Object>(cats);
            pets.addAll(dogs);
            return pets;
        }

        public static void removeCats(Set<Object> pets, Set<Cat> cats) {
            pets.removeAll(cats);
        }

        public static void printPets(Set<Object> pets) {
            for (Object p : pets){
                System.out.println(p);
            }
        }

        public static class Cat {
            String name;
            public Cat(String name){
                this.name=name;
            }
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }


            @Override
            public String toString() {
                return "Cat{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }

    public static class Dog {
            String name;
            public Dog(String name){
                this.name=name;
            }
        @Override
            public String toString() {
                return "Dog{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }

}
