package Session1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Dog extends Animal implements Moveable {
    public Dog(String name, int legs){
        super(name, legs);
        age = 1;
    }

    @Override
    public void move() {
        walk();
    }

    void walk(){
        System.out.println(name + " is walking");
    }
}
