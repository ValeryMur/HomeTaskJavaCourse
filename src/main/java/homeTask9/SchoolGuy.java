package homeTask9;

/**
 * Created by ASUS PC on 06.11.2016.
 */
public class SchoolGuy extends StudyGuy {
    private String school;
    public SchoolGuy(String name, String surname, String gender, int age, String school) {
        super(name, surname, gender, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String generalInfo() {
        return super.generalInfo()+". School is: "+school;
    }
}
