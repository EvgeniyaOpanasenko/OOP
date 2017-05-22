package demo.generics.myGeneric;

/**
 * Created by User on 5/22/2017.
 */
public class Run {
    public static void main(String[] args) {

        Garage garage = new Garage("GarageName");

        garage.addVehicle(new Car("carHolder"));
        garage.addVehicle(new Bike("bikeHolder"));

        System.out.println(garage);

        MyCar myCar = new MyCar("MyType");

        // will not be added
        //garage.addVehicle(myCar);
    }
}
