package homeTask9;

/**
 * Created by ASUS PC on 01.11.2016.
 */
public class Human{
    private String name;
    private String surname;
    private String gender;
    private int age;
    private boolean hasWork;

     public Human(String name, String surname, String gender, int age, boolean hasWork){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.hasWork = hasWork;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname(){
        return  surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String generalInfo(){
        return ("Name is: "+ name + ". Surname is: "+ surname+". Gender is: " + gender+". Age is: " + age);
    }

}
