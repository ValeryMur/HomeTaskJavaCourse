package typeDataHomeTask2;

/**
 * Created by ASUS PC on 02.10.2016.
 */
public class TypesDatas {
    public static void main(String[] args) {
        String a = "Hello", b = "World";
        System.out.println(a + " " + b);

        String c = 2 + 2 + ""; // "4"
        System.out.println(c);
        String d = "" + 2 + 2; // "22"
        //d = "" + (2 + 2); // а теперь d тоже "4"
        System.out.println(d);
        String foo = "a string";
        String bar = "a string"; // bar будет указывать на тот же объект что и foo
        String baz = new String("a string"); // Чтобы гарантированно создать новую строку надо вызвать конструктор
        System.out.println("foo == baz ? " + (foo == baz));
        System.out.println("foo равен baz ? " + (foo.equals(baz)));

            char ch = 'J';
            int intCh = (int) ch;
            System.out.println("J corresponds with "+ intCh);

    }
}
