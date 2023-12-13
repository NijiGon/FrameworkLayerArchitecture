package Session11Template.model;

public class MeatLoverPizza extends Pizza{
    @Override
    protected void cookPizza() {
        System.out.println("Cooking meat lover pizza");
    }

    @Override
    protected void putToppings() {
        System.out.println("Putting pepperoni and meatball toppings");
    }

    @Override
    protected void makeDough() {
        System.out.println("Making meat lover pizza dough");
    }
}
