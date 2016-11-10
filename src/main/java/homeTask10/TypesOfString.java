package homeTask10;

/**
 * Created by ASUS PC on 03.11.2016.
 */
public class TypesOfString {
    public static void main(String[] args) {

        String output = "Some text";
        int count = 1000;
        for (int i = 0; i < count; i++)
            output = output + "Some text";
        long time = System.currentTimeMillis();
//creates 100 new objects
        System.out.println(output);
        System.out.println(time);

        StringBuilder output1 = new StringBuilder();
        int count1 = 1000;
        for (int i = 0; i < count1; i++)
            output1.append("Some text"); //use 1 object only
        long time1 = System.currentTimeMillis();
        System.out.println(output1);
        System.out.println(time1);

        StringBuffer output2 = new StringBuffer();
        int count2 = 1000;
        for (int i = 0; i < count1; i++)
            output2.append("Some text"); //use 1 object only
        long time2 = System.currentTimeMillis();
        System.out.println(output2);
        System.out.println(time2);


    }
}