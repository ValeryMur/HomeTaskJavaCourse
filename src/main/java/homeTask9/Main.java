package homeTask9;

/**
 * Created by ASUS PC on 06.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Lola","Ivanova", "Female", 30, true );
        System.out.println(human.generalInfo());
       StudyGuy studyGuy = new StudyGuy ("Liza","Ivanova", "Female", 16);
        System.out.println(studyGuy.generalInfo());
        SchoolGuy schoolGuy = new SchoolGuy ("Liza","Ivanova", "Female", 16, "456");
        System.out.println(studyGuy.generalInfo());
        Employee employee = new Employee("Vova","Ivanov", "male", 30,"Genesis");
        System.out.println(employee.generalInfo());
        Teacher teacher = new Teacher("Vova","Ivanov", "male", 30,"Genesis","trainer");
        System.out.println(teacher.generalInfo());
        Footbaler footbaler = new Footbaler("Vova","Ivanov", "male", 30,"Genesis","Dinamo");
        System.out.println(footbaler.generalInfo());
    }
}
