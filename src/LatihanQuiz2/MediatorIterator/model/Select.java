package LatihanQuiz2.MediatorIterator.model;

import LatihanQuiz2.MediatorIterator.mediator.Form;

import java.util.Scanner;

public class Select implements Component{
    Form form;
    String name;
    String value;
    Scanner sc;

    public Select(Form form) {
        this.form = form;
        name = "selectField";
        sc = new Scanner(System.in);
    }

    @Override
    public void input() {
        System.out.println("1. Login as user");
        System.out.println("2. Login as admin");
        do {
            System.out.print("Please select your question above >> ");
            value = sc.nextLine();
        }while (validate());
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
        return !value.equals("1") && !value.equals("2");
    }
}
