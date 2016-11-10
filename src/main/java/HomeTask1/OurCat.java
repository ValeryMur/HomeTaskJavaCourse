package HomeTask1;

/**
 * Created by ASUS PC on 02.10.2016.
 */
public class OurCat {
    public static void main(String[] args) {
        Cat ourcat= new Cat();
        ourcat.eat();
        ourcat.sleep();
        String say = ourcat.speak("Play with me");
        System.out.println(say);
    }
}
