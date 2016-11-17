package homeTask13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by ASUS PC on 17.11.2016.
 */
public class MinNumber {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(integerList);
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        //return list.indexOf (Collections.min(list));
        int min = list.get(0);
        for (int i : list){
            min = min < i ? min : i;
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        Integer [] ar1= new Integer[n];
        for (int i = 0 ;i<n; i++){
            ar1[i] =  (int)(Math.random()*n);
        }
        //List<Integer> integerList = Arrays.asList(ar1); - так тоже можно
        List<Integer> integerList = new ArrayList<Integer>(ar1.length);

        for (int i=0; i<ar1.length; i++)
        {
            integerList.add(ar1[i]);
        }
        return integerList;
    }
}
