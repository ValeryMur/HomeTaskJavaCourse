package homeTask3Cycle;

/**
 * Created by ASUS PC on 07.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Motorcycle suzuki = new Motorcycle();
        Motorcycle yamaha = new Motorcycle();
        yamaha.printSomething();
        Motorcycle.printSomething();
        System.out.println("old frame is "+yamaha.getFrame());
        yamaha.setFrame("new frame");
        System.out.println("yamaha new frame is "+yamaha.getFrame());
        System.out.println("suzuki frame is "+suzuki.getFrame());
        getMotorcycle();
        suzuki.copyFrom(yamaha);
    }

    public static Motorcycle getMotorcycle(){
        return new Motorcycle();
    }
}
