package homeTask9;

/**
 * Created by ASUS PC on 06.11.2016.
 */
public class Student extends StudyGuy {
    private String university;
    public Student(String name, String surname, String gender, int age, String university) {
        super(name, surname, gender, age);
        this.university = university;
    }

    @Override
    public String generalInfo() {
        return super.generalInfo()+". University is: "+university;
    }
}
