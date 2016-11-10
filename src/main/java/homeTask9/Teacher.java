package homeTask9;

/**
 * Created by ASUS PC on 06.11.2016.
 */
public class Teacher extends Employee {
    private String specialisation;
    public Teacher(String name, String surname, String gender, int age, String company, String specialisation) {
        super(name, surname, gender, age, company);
        this.specialisation = specialisation;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public String generalInfo() {
        return super.generalInfo()+". Specialisation is: "+specialisation;
    }
}
