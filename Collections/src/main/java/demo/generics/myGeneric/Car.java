package demo.generics.myGeneric;

/**
 * Created by User on 5/22/2017.
 */
public class Car extends Vehicle {

    private int wheelsNumber;

    public Car(String holder) {
        super("Ford", holder);
        this.wheelsNumber = 4;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheelsNumber=" + wheelsNumber +
                "} " + super.toString();
    }
}
