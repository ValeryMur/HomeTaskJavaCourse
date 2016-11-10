package homeTask9;

/**
 * Created by ASUS PC on 06.11.2016.
 */
public class Footbaler extends Employee {
    private String footbalClub;
    public Footbaler(String name, String surname, String gender, int age, String company, String footbalClub) {
        super(name, surname, gender, age, company);
        this.footbalClub = footbalClub;
    }

    public String getFootbalClub() {
        return footbalClub;
    }

    public void setFootbalClub(String footbalClub) {
        this.footbalClub = footbalClub;
    }

    @Override
    public String generalInfo() {
        return super.generalInfo()+". FootbalClub is: "+footbalClub;
    }
}
