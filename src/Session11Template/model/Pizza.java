package Session11Template.model;

public abstract class Pizza {

    public void makePizza(){
        makeDough();
        putToppings();
        cookPizza();
    }

    protected abstract void cookPizza();

    protected abstract void putToppings();

    protected abstract void makeDough();
}
