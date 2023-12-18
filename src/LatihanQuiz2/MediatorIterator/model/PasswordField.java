package LatihanQuiz2.MediatorIterator.model;

import LatihanQuiz2.MediatorIterator.mediator.Form;

import java.util.Scanner;

public class PasswordField implements Component{
    Form form;
    String name;
    String value;
    Scanner sc;

    public PasswordField(Form form) {
        this.form = form;
        name = "passwordField";
        sc = new Scanner(System.in);
    }

    @Override
    public void input() {
        System.out.print("Input your password >> ");
        value = sc.nextLine();
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
        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for(int i = 0; i < value.length(); i++){
            if(!alphanumeric.contains(String.valueOf(value.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
