package homeTask3Cycle;

import java.util.Scanner;

/**
 * Created by ASUS PC on 07.10.2016.
 */
//Task #10
public class Task10 {
    //Дано число n при помощи цикла for посчитать факториал n!
    public static void main(String[] args) {
        int n = 4;
        int result=1;
        for (int i =1; i<=n ; i++){
            result*=i;
        }
        System.out.println(result);
    }
}
