package homeTask3Cycle;

/**
 * Created by ASUS PC on 07.10.2016.
 */
public class Motorcycle {
    private String frame;
    private String wheels;

    public Motorcycle() {
        frame = "default";
        wheels = "default wheels";
    }

    public Motorcycle(String frame) {
        this.frame = frame;
    }

    public Motorcycle(String frame, String wheels) {
        this.frame = frame;
        this.wheels = wheels;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void copyFrom(Motorcycle bike) {
        wheels = bike.getWheels();
        frame = bike.getFrame();
    }

    public static void printSomething(){
        System.out.println("I'm called from Main class");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Motorcycle that = (Motorcycle) o;

        if (frame != null ? !frame.equals(that.frame) : that.frame != null) return false;
        return wheels != null ? wheels.equals(that.wheels) : that.wheels == null;

    }

    @Override
    public int hashCode() {
        int result = frame != null ? frame.hashCode() : 0;
        result = 31 * result + (wheels != null ? wheels.hashCode() : 0);
        return result;
    }
}
