package Session3Builder.Builder;

import Session3Builder.Model.Pizza;

public interface PizzaBuilder {
    public PizzaBuilder setCrust(String crust);
    public PizzaBuilder setCheese(String cheese);
    public PizzaBuilder setSpicy(boolean isSpicy);
    public PizzaBuilder setGlutenFree(boolean isGlutenFree);
    public Pizza order();
    public PizzaBuilder addTopping(String topping);

    public PizzaBuilder reset();
}
