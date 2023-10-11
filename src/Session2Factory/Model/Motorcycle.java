package Session2Factory.Model;

public class Motorcycle extends Vehicle{
    public Motorcycle(String name, String brand, String serialcode, int price) {
        super(name, brand, serialcode, price);
    }

    @Override
    public void move() {
        System.out.println("Motorcycle named " + name + " is driving");
        System.out.println(brand);
        System.out.println(serialcode);
        System.out.println(price);
    }
}
