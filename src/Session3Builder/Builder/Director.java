package Session3Builder.Builder;

public class Director {
    private PizzaBuilder builder;
    public Director(PizzaBuilder builder){
        this.builder = builder;
    }
    // buat nyuruh builder
    // bikin template

    public void makeMushroomPizza(){
        builder.addTopping("Mushroom").setCheese("Parmesan cheese");
    }

    public void makePeperoniPizza(){
        builder.setCrust("Thin crust").addTopping("Peperoni");
    }
}
