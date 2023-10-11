package Session2Factory.Model;

public class Car extends Vehicle{

    public Car(String name, String brand, String serialcode, int price){
        super(name, brand, serialcode, price);
    }
    @Override
    public void move() {
        System.out.println("Car named " + name + " is driving");
        System.out.println(brand);
        System.out.println(serialcode);
        System.out.println(price);
    }
}
