package homeTask4Massiv;

/**
 * Created by ASUS PC on 09.10.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        int ar[] = {1, 3, 9, -6, 5, 4, 7, 2, -1};
        int min=ar[0];
        int max=ar[0];
        int maxIndex=0;
        int minIndex=0;
        for (int i = 0; i < ar.length; i++) {
            //System.out.print(ar[i] + " ");
            if (ar[i]>max) {
                max = ar[i];
                maxIndex=i;
            }
            if (ar[i]<min) {
                min=ar[i];
                minIndex=i;
            }
        }
        ar[maxIndex]=min;
        ar[minIndex]=max;
        for (int a: ar) {
            System.out.print(a + ",");
        }
    }
}
