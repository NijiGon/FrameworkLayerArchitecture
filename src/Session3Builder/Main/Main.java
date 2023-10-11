package Session3Builder.Main;

import Session3Builder.Builder.Director;
import Session3Builder.Builder.NormalPizzaBuilder;
import Session3Builder.Model.Pizza;

public class Main {

    public Main(){
//        Pizza pizza1 = new Pizza("Thin Crusst", "Mozarella", false, false);
//        pizza1.print();

//        NormalPizzaBuilder builder1 = new NormalPizzaBuilder();
//        // without method chaining
//        builder1.setCheese("Mozarella");
//        builder1.setCrust("Thin crust");
//
//        // with method chaining
//        builder1.setCheese("Mozarella").setCrust("Thin crust");

//        NormalPizzaBuilder builder1 = new NormalPizzaBuilder();
//        Pizza pizza2 = builder1.setCheese("Mozarella").setCrust("Thin crust").setSpicy(false).setGlutenFree(false).order();
//        pizza2.print();

//        NormalPizzaBuilder builder2 = new NormalPizzaBuilder();
//        Pizza pizza3 = builder2.addTopping("Mushroom").order();
//        pizza3.print();

        NormalPizzaBuilder builder3 = new NormalPizzaBuilder();
        Director director = new Director(builder3);
        director.makeMushroomPizza();
        Pizza pizza4 = builder3.order();
        pizza4.print();
    }

    public static void main(String[] args) {
        new Main();
    }
}
