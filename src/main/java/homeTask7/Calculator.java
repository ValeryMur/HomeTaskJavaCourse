package homeTask7;

import java.util.Scanner;
import java.util.logging.StreamHandler;

import static java.lang.Character.toChars;

/**
 * Created by ASUS PC on 23.10.2016.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            System.out.println("Введите выражение :");
            String out = scn.next();
            calculate(out.toCharArray());
    }

    private static void calculate(char[] input) {
        if(input.length==1){
            System.out.println("Ваш результат равен: "+toInt(input[0]));
            System.exit(0);
        }
       for(int i=0;i<input.length;i++){
          if(input[i]=='*') {
              int a1 = toInt(input[i-1]);
              int a2 = toInt(input[i+1]);
              int mul = mul(a1,a2);
              calculate(copyArray(i,input,mul));
          }
           if(input[i]=='/') {
               int a1 = toInt(input[i-1]);
               int a2 = toInt(input[i+1]);
               int div = div(a1,a2);
               calculate(copyArray(i,input,div));
           }
           if(input[i]=='-'){
               int a1 = toInt(input[i-1]);
               int a2 = toInt(input[i+1]);
               int dif = dif(a1,a2);
               calculate(copyArray(i,input,dif));
           }
           if(input[i]=='+'){
               int a1 = toInt(input[i-1]);
               int a2 = toInt(input[i+1]);
               int sum = sum(a1, a2);
               calculate(copyArray(i, input, sum));
           }
       }
    }

    private static char[] copyArray(int index, char[] input, int opResult) {
        char[] result = new char[input.length - 2];
        int skipCount = 0;
        for (int i = 0; i < input.length; i++) {
            if (i == index - 1 || i == index + 1) {
                skipCount++;
                continue;
            }
            if (i == index) {
                result[i - 1] = Character.forDigit(opResult, 10);
                continue;
            }
            if (skipCount == 2) {
                result[i - skipCount] = input[i];
                continue;
            }
            result[i] = input[i];
        }
        return result;
    }

    private static int toInt(char a) {
        return Character.getNumericValue(a);
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int dif(int a, int b) {
        return a - b;
    }

    private static int div(int a, int b) {
        return a / b;
    }

    private static int mul(int a, int b) {
        return a * b;
    }

}
