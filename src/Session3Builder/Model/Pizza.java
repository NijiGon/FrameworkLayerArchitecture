package Session3Builder.Model;

import java.util.ArrayList;

public class Pizza {
    private String crust;
    private String cheese;
    private ArrayList<String> toppings = new ArrayList<>();
    private boolean isSpicy;
    private boolean isGlutenFree;

    public Pizza(String crust, String cheese, boolean isSpicy, boolean isGlutenFree) {
        super();
        this.crust = crust;
        this.cheese = cheese;
        this.isSpicy = isSpicy;
        this.isGlutenFree = isGlutenFree;
        toppings = new ArrayList<>();
    }

    public void addToppings(String topping){
        toppings.add(topping);
    }

    public void print(){
        System.out.println("Crust: " + crust);
        System.out.println("Cheese: " + cheese);
        System.out.println("Toppings: " + toppings);
        System.out.println("Spicy: " + isSpicy);
        System.out.println("Gluten Free: " + isGlutenFree);
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }
}
