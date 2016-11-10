package homeTask12AbstractClass;

/**
 * Created by ASUS PC on 08.11.2016.
 */
public class MainNationalityHellou {
    public static void main(String[] args) {
        Ukranian ukr = new Ukranian();
        Russian rus = new Russian();
        American american = new American();
        ukr.sayHellou();
        rus.sayHellou();
        american.sayHellou();
    }
}
