package homeTask4Massiv;

/**
 * Created by ASUS PC on 09.10.2016.
 */
public class Task5 {
    public static void main(String[] args) {
        int ar[] = {1, 3, 9, -6, 5, 4, 7, 2, -1};
        int sum=0;
        for (int a:ar) {
            sum += a;
        }

        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        System.out.println("result = " +sum/ar.length);
    }
}
