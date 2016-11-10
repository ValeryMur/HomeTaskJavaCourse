package homeTask3Cycle;

/**
 * Created by ASUS PC on 05.10.2016.
 */
public class CycleHomeTask1 {
     public static int min( int a, int b, int c, int d) {
         return min(min(a, b), min(c, d));

//         int result1 = min(a,b);
//         int result2 = min(c,d);

//         if (min(a, b) < min(c, d)) {
//             return min(a, b);
//         } else {
//             return min(c, d);
//         }
     }
     public static int min(int rrr, int ffff) {
         if (rrr < ffff)
             return rrr;
         else
             return ffff;
     }

    public static void main(String[] args) {
        System.out.println("Min number is "+ min(4,8,-10,22));
    }
//
//    public static void main(String[] args) {
//        int a = 3, b = 4, c = 5, d = 6;
//        int less = getLess(getLess(a, b), getLess(c, d));
//        System.out.println("Наименьшее число: " + less);
//    }
//
//    public static int getLess(int a, int b) {
//        return a < b ? a : b;
//    }

    //Task #1, 2=6
//    public static void main(String[] args) {
//        int a = 3, b = 4, c = 5, d = 6;
//        int min;
//        if (a>b) {
//            min = b;
//        } else
//            min = a;
//        if (c<min) {
//            min = c;
//        } else if (d<min) {
//            min=d;
//        }
//        System.out.println("Наименьшее число: " + min);
//        int sum = a+b+c+d-min;
//        System.out.println("Суииа чисел без минимального числа: " + sum);
//    }
}