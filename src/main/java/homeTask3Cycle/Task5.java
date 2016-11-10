package homeTask3Cycle;

import java.util.Scanner;

/**
 * Created by ASUS PC on 07.10.2016.
 */
//Task #5
public class Task5 {
    //Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Напишите число месяца от 1 до 12: ");
        int month = in.nextInt();
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "число за пределами  диапазона, вымешленный месяцам";
        }
       System.out.println("season = " + season);
    }
}
