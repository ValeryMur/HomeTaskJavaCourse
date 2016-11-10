package homeTask3Cycle;

/**
 * Created by ASUS PC on 07.10.2016.
 */
//Task #8 Вывести на экран (с помощью циклов) таблицу умножения 10*10.

public class Task8 {
    public static void main(String[] args) {
        for (int s = 0; s <= 100; s += 10) {
            System.out.print(s + " ");
        }

        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();

        }

    }
}
