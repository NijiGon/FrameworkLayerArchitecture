package Session10Latihan.model;

import Session10Latihan.mediator.Form;

import java.util.Scanner;

public class PasswordField implements Component{
    Form mediator;
    String value;
    String name;

    Scanner sc;
    public PasswordField(Form mediator){
        this.mediator = mediator;
        this.name = "passwordField";
        sc = new Scanner(System.in);
    }

    @Override
    public void input() {
        System.out.print("Input Password >> ");
        value = sc.nextLine();
        send();
    }

    @Override
    public void send() {
        mediator.send(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean validate() {
        // check alphanumeric
        return !value.isEmpty();
    }
}
