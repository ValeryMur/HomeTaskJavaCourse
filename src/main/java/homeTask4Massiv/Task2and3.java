package homeTask4Massiv;

/**
 * Created by ASUS PC on 09.10.2016.
 */
public class Task2and3 {
    static int ar[] = {1,3,9,-6,5,4,7,
            2,-1};
    static int min =1;
    static int max=1;

    public static void main(String[] args) {

        for (int i : ar) {
            if (i>max) {
                max = i;
            }
                if (i<min) {
                    min=i;
                }

            }
        System.out.println("Min num: " + min);
        System.out.println("Max num: " + max);
    }

}
