package homeTask11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ASUS PC on 06.11.2016.
 */
public class ArrayExeption {
    public static void main(String[] args) throws CustomExeption {
        int [] ar1 = new int[10];
        for(int i=0; i<=9; i++) {
            ar1[i] = (i+1) * 10;
            System.out.println(ar1[i]);
        }
//        double []ar2 = new double[10];
//        for(int i = 0; i <  ar2.length; i++) {
//            ar2[i] =  Math.floor(Math.random() * 10);
//            System.out.print(ar2[i] + "  ");
//        }

        Scanner in = new Scanner(System.in);
        System.out.println("Ввкдите индекс массива: ");
        try {
        int i = in.nextInt();
        System.out.println(ar1[i]);
            if(i == 7 ){
                throw new CustomExeption("Число 7 запрещенно");}
            }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Обращение по недопустимому индексу массива");}
    }
}
