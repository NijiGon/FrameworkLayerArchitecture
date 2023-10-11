package Session2Factory.Factory;

import Session2Factory.Model.Car;
import Session2Factory.Model.Motorcycle;
import Session2Factory.Model.Vehicle;

import java.util.Random;

public class MotorcycleFactory extends VehicleFactory{
    @Override
    public Vehicle makeVehicle(String name) {
        String serialcode = String.format("%c%c%c%d", name.charAt(0), name.charAt(1), 'Y', new Random().nextInt(1000));
        return new Motorcycle(name, "Yamaha", serialcode, 100000);
    }
}
