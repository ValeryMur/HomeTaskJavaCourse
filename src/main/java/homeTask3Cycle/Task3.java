package homeTask3Cycle;

/**
 * Created by ASUS PC on 06.10.2016.
 */
//Task  #3
public class Task3 {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 5, d = 6, e=7;
        int min;
        int max;
        if (a<b) {min=a;} else {min=b;}
        if (c<min) {min=c;}
        if (d<min) {min=d;}
        if (e<min) {min=e;}
        System.out.println("Наименьшее число: " + min);
        if (a>b) {max=a;} else {max=b;}
        if (c>max) {max=c;}
         if (d>max) {max=d;}
         if (e>max) {max=e;}
        System.out.println("Наибольшее число: " + max);

        //Task #4 сравнение строк
        String str1 = new String("Петя");
        String str2 = new String("Петя");
        String str3 = new String("Тески");
        boolean b2 = str1.equals(str2);
        if (str1.equals(str2)) {
            System.out.println(str3);
        }
    }
}
