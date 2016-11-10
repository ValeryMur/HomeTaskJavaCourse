package homeTask9;

/**
 * Created by ASUS PC on 06.11.2016.
 */
public class Employee extends Human {
    private String company;
    public Employee(String name, String surname, String gender, int age, String company) {
        super(name, surname, gender, age, true);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String generalInfo() {
        return super.generalInfo()+". Company is:"+company;
    }
}
