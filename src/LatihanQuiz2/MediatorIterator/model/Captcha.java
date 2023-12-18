package LatihanQuiz2.MediatorIterator.model;

import LatihanQuiz2.MediatorIterator.mediator.Form;

import java.util.Random;
import java.util.Scanner;

public class Captcha implements Component{
    Form form;
    String name;
    String value;
    String check;
    Scanner sc;

    public Captcha(Form form) {
        this.form = form;
        name = "emailField";
        sc = new Scanner(System.in);
    }

    @Override
    public void input() {
        do{
            generate();
            System.out.print("Input the captcha to make sure you are not a robot(" + check + ") >> ");
            value = sc.nextLine();
        }while (!validate());
        send();
    }

    private void generate() {
        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        check = "";
        for(int i = 0; i < 5; i++){
            check += alphanumeric.charAt(rand.nextInt(alphanumeric.length()));
        }
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
        return value.equals(check);
    }
}
