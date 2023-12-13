package Session11Template.model;

public class MozarellaPizza extends Pizza{
    @Override
    protected void cookPizza() {
        System.out.println("Cooking mozarella pizza");
    }

    @Override
    protected void putToppings() {
        System.out.println("Putting mozarella toppings");
    }

    @Override
    protected void makeDough() {
        System.out.println("Making mozarella pizza dough");
    }
}
