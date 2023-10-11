package Session2Factory.Factory;

import Session2Factory.Model.Car;
import Session2Factory.Model.Vehicle;

import java.util.Random;

public class CarFactory extends VehicleFactory{

    @Override
    public Vehicle makeVehicle(String name) {
        String serialcode = String.format("%c%c%c%d", name.charAt(0), name.charAt(1), 'T', new Random().nextInt(1000));
        return new Car(name, "Toyota", serialcode, 100000);
    }
}
