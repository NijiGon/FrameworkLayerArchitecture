package Session11Template.main;

import Session11Template.model.MeatLoverPizza;
import Session11Template.model.MozarellaPizza;
import Session11Template.model.Pizza;

public class Main {
    public Main(){
        Pizza pizza1 = new MozarellaPizza();
        pizza1.makePizza();
        System.out.println();
        Pizza pizza2 = new MeatLoverPizza();
        pizza2.makePizza();
    }

    public static void main(String[] args) {
        new Main();
    }
}
