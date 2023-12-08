package Session10Latihan.model;

import Session10Latihan.mediator.Form;

import java.util.Scanner;

public class EmailField implements Component{
    Form mediator;
    String value;
    String name;

    Scanner sc;
    public EmailField(Form mediator){
        this.mediator = mediator;
        this.name = "emailField";
        sc = new Scanner(System.in);
    }

    @Override
    public void input() {
        System.out.print("Input Email >> ");
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
        if(value.isEmpty()) return false;
        return value.contains("@");
    }
}
