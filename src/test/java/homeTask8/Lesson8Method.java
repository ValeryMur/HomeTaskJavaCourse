package homeTask8;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by ASUS PC on 26.10.2016.
 */
public class Lesson8Method {

    @Test
    @Parameters ({"email", "password"})
    public void testA(String email, String password) {
        System.out.println(email + " / "+ password);
    }
    @Test
    public void testB() {
        System.out.println("TestB");
    }
    @Test
    public void testC() {
        System.out.println("TestC");
    }
    @Test
    public void testD() {
        System.out.println("TestD");
    }
    @Test
    public void testE() {
        System.out.println("TestE");
    }
}
