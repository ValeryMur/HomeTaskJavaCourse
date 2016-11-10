package typeDataHomeTask2;

import java.util.Scanner;

/**
 * Created by ASUS PC on 02.10.2016.
 */
public class ConversionType {
    public static void main(String[] args) {

        /*
        int symb = 1042-В , 1064-Ш;
        char chsymb = (char) symb;
        System.out.println("1024 = " + chsymb);
        */


        Scanner in = new Scanner(System.in);
        //String input = in.nextLine();

        //Задачка №1
        System.out.print("Введите int которое будет преобразовано в char:");
        int symb1 = in.nextInt();
        char chsymb1 = (char) symb1;
        System.out.println("your int_number is symbol UNICOD = " + chsymb1);

        //Задачка №2
        System.out.print("Введите float которое будет преобразовано в char:");
        float numb = in.nextFloat();
        char chnumb = (char) numb;
        System.out.println("your float_number is symbol UNICOD = " + chnumb);

        //Задачка №3
        System.out.println("Введите float которое будет преобразовано в char, а затем char преобразуется в int:");
        float numb1 = in.nextFloat();
        char chnumb1 = (char) numb1;
        int unicodsymb = chnumb1;
        System.out.print("your float_number is symbol UNICOD = " + chnumb1);

    }
}
/*
        int a = in.nextInt();//считываем целое число
        byte b = in.nextByte();//считываем байтовое число
        String c = in.nextLine();//считываем одну строку целиком
        double d = in.nextDouble();//считываем вещественное число
        long  e = in.nextLong();//считываем длинное целое число
        short f = in.nextShort();//считываем короткое целое число
        String s = in.next();//считываем строку до первого пробела
        */
