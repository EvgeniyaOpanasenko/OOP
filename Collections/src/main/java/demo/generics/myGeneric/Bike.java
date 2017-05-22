package demo.generics.myGeneric;

/**
 * Created by User on 5/22/2017.
 */
public class Bike extends Vehicle {
    private int wheelsNumber;

    public Bike(String holder ) {
        super("Bike", holder);
        this.wheelsNumber = 2;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "wheelsNumber=" + wheelsNumber +
                '}';
    }
}
