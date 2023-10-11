package Session2Factory.Model;

public abstract class Vehicle {
    // protected -> bisa diakses selama 1 package
    protected String name;
    protected String brand;
    protected String serialcode;
    protected int price;

    public Vehicle(String name, String brand, String serialcode, int price) {
        this.name = name;
        this.brand = brand;
        this.serialcode = serialcode;
        this.price = price;
    }

    public abstract void move();
}
