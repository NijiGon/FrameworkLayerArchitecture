package Session10Latihan.mediator;

import Session10Latihan.iterator.ComponentIterator;
import Session10Latihan.iterator.Iterator;
import Session10Latihan.model.Component;
import Session10Latihan.model.EmailField;
import Session10Latihan.model.PasswordField;
import Session10Latihan.model.SubmitButton;

import java.util.ArrayList;

public class Form {
    EmailField emailField;
    PasswordField passwordField;
    SubmitButton submitButton;
    public Form(){

    }
    public void addComponent(Component component){
        if(component.getName().equals("emailField")){
            emailField = (EmailField) component;
        }
        else if(component.getName().equals("passwordField")){
            passwordField = (PasswordField) component;
        }
        else if(component.getName().equals("submitButton")){
            submitButton = (SubmitButton) component;
        }
    }
    public void send(Component component){
        if(component.getName().equals("emailField")){
            passwordField.input();
        }
        else if(component.getName().equals("passwordField")){
            submitButton.input();
        }
        else if(component.getName().equals("submitButton")){
            ArrayList<Component> components = new ArrayList<>();
            components.add(emailField);
            components.add(passwordField);
            components.add(submitButton);

            Iterator<Component> iter = new ComponentIterator(components);

            while(iter.hasNext()){
                if(!iter.getNext().validate()){
                    System.out.println("Invalid input");
                    return;
                }
            }
            System.out.println("Success");
        }
    }
}
