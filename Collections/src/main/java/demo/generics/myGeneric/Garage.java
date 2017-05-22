package demo.generics.myGeneric;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 5/22/2017.
 */
public class Garage <V extends Vehicle> {

    private String name;
    private Car car;
    private Bike bike;
    private List<Vehicle> vehicles;

    public Garage(String name) {
        this.name = name;
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public Garage(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "vehicles=" + vehicles +
                '}';
    }
}
