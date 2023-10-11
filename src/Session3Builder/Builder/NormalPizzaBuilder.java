package Session3Builder.Builder;

import Session3Builder.Model.Pizza;

import java.util.ArrayList;

public class NormalPizzaBuilder implements PizzaBuilder{
    private String crust;
    private String cheese;
    private ArrayList<String> toppings;
    private boolean isSpicy;
    private boolean isGlutenFree;

    public NormalPizzaBuilder(){
        toppings = new ArrayList<>();
        reset();
    }

    @Override
    public PizzaBuilder setCrust(String crust) {
        this.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public PizzaBuilder setSpicy(boolean isSpicy) {
        this.isSpicy = isSpicy;
        return this;
    }

    @Override
    public PizzaBuilder setGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
        return this;
    }

    @Override
    public Pizza order() {
        Pizza result = new Pizza(crust, cheese, isSpicy, isGlutenFree);
        for (String string : toppings) {
            result.addToppings(string);
        }
        return result;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    @Override
    public PizzaBuilder reset() {
        crust = "Thick crust";
        cheese = "Mozarella";
        isSpicy = false;
        isGlutenFree = true;
        return this;
    }
}
