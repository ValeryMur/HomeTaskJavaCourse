package homeTask13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by ASUS PC on 16.11.2016.
 */
public class SortedList {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();
        List<String> inputs = getInputStrings(reader);
       Collections.sort(inputs); //метод для сортировки списка
       System.out.println(inputs);
        //makeSwitch(inputs);
        //System.out.println(inputs);
    }

    private static List<String> getInputStrings(BufferedReader reader) throws IOException {
        List<String> result = new ArrayList<String>();
        while (true){
            System.out.println("Введите строку или Enter чтобы завершить");
            String s = reader.readLine();
            if ("".equals(s)){
                return result;
            }
            result.add(s);
        }
    }


        //реализуйте свой алгоритм сортировки списка при помощи  метода isGreaterThan(String a, String b)
    public static void sort(LinkedList<String> list) {
        for (int j = 0; j < list.size() - 2; j++) {
            for (int i = 0; i < list.size()-1; i++) {
                String a = list.get(i);
                String b = list.get(i + 1);
                if (isGreaterThan(a, b)) {
                    makeSwitch(list, a, b, i, i + 1);
                }
            }}
    }
    public static void makeSwitch(LinkedList<String> list, String a, String b, int indexA, int indexB){
        list.set(indexA,b);
        list.set(indexB,a);
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
