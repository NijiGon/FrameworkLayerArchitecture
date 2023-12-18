package LatihanQuiz2.TemplateState.template;

import LatihanQuiz2.TemplateState.model.VendingMachine;

public abstract class ATemplate {
    public void makeIceCream(VendingMachine vm){
        prepare(vm);
        flavor(vm);
        ready();
    }
    public abstract void prepare(VendingMachine vm);
    public abstract void flavor(VendingMachine vm);
    public abstract void ready();
}
