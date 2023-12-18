package LatihanQuiz2.MediatorIterator.mediator;


import LatihanQuiz2.MediatorIterator.iterator.ComponentIterator;
import LatihanQuiz2.MediatorIterator.iterator.IIterator;
import LatihanQuiz2.MediatorIterator.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Form {
    EmailField emailField;
    PasswordField passwordField;
    SubmitButton submitButton;
    Captcha captcha;
    Select select;

    public void addComponent(Component... components){
        for(Component component : components){
            if(component instanceof EmailField) {
                emailField = (EmailField) component;
            }
            if(component instanceof PasswordField){
                passwordField = (PasswordField) component;
            }
            if(component instanceof SubmitButton){
                submitButton = (SubmitButton) component;
            }
            if(component instanceof Captcha){
                captcha = (Captcha) component;
            }
            if(component instanceof Select){
                select = (Select) component;
            }
        }
    }
    public void send(Component component){
        if(component instanceof EmailField){
            passwordField.input();
        }
        if(component instanceof PasswordField){
            select.input();
        }
        if(component instanceof Select){
            captcha.input();
        }
        if(component instanceof Captcha){
            submitButton.input();
        }
        if(component instanceof SubmitButton){
            ArrayList<Component> components = new ArrayList<>(Arrays.asList(emailField, passwordField, submitButton));
            IIterator<Component> iterator = new ComponentIterator(components);
            while (iterator.hasNext()){
                if(!iterator.getNext().validate()){
                    System.out.println("Invalid input");
                    return;
                }
            }
            System.out.println("Success");
        }

    }
}
