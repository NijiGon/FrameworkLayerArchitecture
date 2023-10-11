package Session3Prototype.Main;

import Session3Prototype.Model.Pizza;

public class Main {
    // prototype --> menyediakan kemampuan duplikasi object
    public Main(){
        Pizza original = new Pizza("Thick crust", "Mozarella");
        original.print();
        original.setCheese(null);

        Pizza clone1 = null;
        clone1 = (Pizza) original.makeClone();
//        original.setCheese(null);
        clone1.print();
    }
    public static void main(String[] args) {
        new Main();
    }
}
