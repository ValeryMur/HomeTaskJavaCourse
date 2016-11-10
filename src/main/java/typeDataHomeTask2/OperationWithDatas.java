package typeDataHomeTask2;

import java.util.Scanner;

/**
 * Created by ASUS PC on 02.10.2016.
 */
public class OperationWithDatas {
    public static void main(String[] args) {
        //Задачка №1
        int i = 7;
        int o = 2;
        int a = i/o;
        int z = i%o;
        System.out.println("7 деленое на 2 =" + " " + a + " " + "и остаток" + " " + z);

        //Задачка №2
        int twonumb = 23;
        System.out.println("Сумма цифр числа " + twonumb + " =" + (twonumb/10 + twonumb%10));


        //Задачка №3
        double somenumber1 = 23.45;
        int number1 = (int)somenumber1;
        System.out.println ("преобразование 23,45 в целое число:" + " " + number1);

        //Задачка №4
        int threenum = 123;
        System.out.println("Сумма цифр числа " +threenum +" равна "+ ((threenum/100) + (threenum%100)/10 + (threenum%100)%10));


        //Задачка №1
        Scanner in = new Scanner(System.in);
        //String input = in.nextLine();
        System.out.println("Введите число1:");
        int q = in.nextInt();
        System.out.println("Введите число2:");
        int w = in.nextInt();
        int e = q/w;
        int r = q%w;
        System.out.println("Ччло1/Число2=" + " " + e + " " + "и остаток" + " " +r);

        //Зфдачка №2
        System.out.println("Введите двухзначное число: ");
        int twonumb1 = in.nextInt();
        System.out.println("Сумма цифр числа " + twonumb1 + " =" + (twonumb1/10 + twonumb1%10));

        //Зфдачка №3
        System.out.println ("Введите вещественное число с ненулевой дробной частью:");
        double somenumber = in.nextDouble();
        int number = (int)somenumber;
        System.out.println ("преобразование в целое число:" + " " + number);

        //Зфдачка №4
        System.out.println("Введите трехзначное число: ");
        int threenum1 = in.nextInt();
        //System.out.println("Сумма цифр числа " +threenum1 +" равна "+((threenum1%10)+(threenum1/10)%10)+((threenum1/100)%10));
        System.out.println("Сумма цифр числа " +threenum1 +" равна "+ ((threenum1/100) + (threenum1%100)/10 + (threenum1%100)%10));

    }
}
