package Session2Factory.Main;

import Session2Factory.Factory.CarFactory;
import Session2Factory.Factory.DaihatsuFactory;
import Session2Factory.Factory.MotorcycleFactory;
import Session2Factory.Factory.VehicleFactory;
import Session2Factory.Model.Car;
import Session2Factory.Model.Vehicle;

public class Main {
    Main(){
        VehicleFactory factory = new MotorcycleFactory();
        Vehicle vehicle1 = factory.orderVehicle("Lightning McQueen");
        vehicle1.move();
        Vehicle vehicle2 = factory.orderVehicle("Toyota");
        vehicle2.move();
        Vehicle vehicle3 = factory.orderVehicle("Lightning McQueen");
        vehicle3.move();
        Vehicle vehicle4 = factory.orderVehicle("Toyota");
        vehicle4.move();
    }
    public static void main(String[] args) {
        new Main();
    }
}
