package homeTask6;

import java.util.Scanner;

/**
 * Created by ASUS PC on 19.10.2016.
 */
public class JavaString {
    public static void main(String[] args) {

        //Task #1
        Scanner in = new Scanner(System.in);
        System.out.println("Print phrase: ");
        String frace = in.nextLine();
        System.out.println(frace.replace(" ", ""));

        //Task #2 непонятно как делать
        String frWithNew = "Good new look";
//        String substring1 = frWithNew.substring(9);
        String substring1 = frWithNew.substring(frWithNew.indexOf("new")+3);
        System.out.println(substring1);
        System.out.println("Введите фразу со словом 'new': ");
        String frNew = in.nextLine();
        boolean isContain1 = frNew.contains("new");

//        String number = "25, 6, 8, 39, 8, 10, 2";
//        number = number.replace(",", ""); //.replace(" ","");
//        System.out.println(number);
//        //int num = Integer.valueOf(number);
//        int num = Integer.parseInt(number);
//        System.out.println(num);
//        for(int i=1; i<=num; i++)
//          num+=i;

         //Task #3
        String str = "11, 34, 3, 45, 23, 5, 67";
        str = str.replace(",", "");
        String strArr[] = str.split(" ");
        int numArr[] = new int[strArr.length];
        int summ = 0;

        for (int i = 0; i < strArr.length; i++) {
            //numArr[i] = Integer.parseInt(strArr[i]);
            summ += Integer.parseInt(strArr[i]);
            //System.out.println(numArr[i]);
        }

        System.out.println("Сумма чисел:" + summ);


    }
}
