package Session3Prototype.Model;

import java.util.ArrayList;
import java.util.Objects;

public class Pizza implements Clone{
    private String crust;
    private String cheese;

    public Pizza(String crust, String cheese) {
        super();
        this.crust = crust;
        this.cheese = cheese;
    }

    public void print(){
        System.out.println("Crust: " + crust);
        System.out.println("Cheese: " + cheese);
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

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public Object makeClone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

//    @Override
//    public Pizza clone() {
//        try {
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return (Pizza) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }
}
