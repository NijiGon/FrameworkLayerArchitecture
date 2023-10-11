package Session2Factory.Factory;

import Session2Factory.Model.Vehicle;

public abstract class VehicleFactory {
    public Vehicle orderVehicle(String name){
        System.out.println("Making a vehicle");
        return makeVehicle(name);
    }

    public abstract Vehicle makeVehicle(String name);
}
