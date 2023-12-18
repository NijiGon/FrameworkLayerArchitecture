package LatihanQuiz2.MediatorIterator.model;

import LatihanQuiz2.MediatorIterator.mediator.Form;

import java.util.Scanner;

public class SubmitButton implements Component{
    Form form;
    String name;
    String value;
    Scanner sc;
    public SubmitButton(Form form) {
        this.form = form;
        name = "submitButton";
        sc = new Scanner(System.in);
    }

    @Override
    public void input() {
        System.out.println("Press enter to continue");
        sc.nextLine();
        send();
    }

    @Override
    public void send() {
        form.send(this);
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
        return true;
    }
}
