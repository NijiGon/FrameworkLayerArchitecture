package Session10Latihan.main;

import Session10Latihan.mediator.Form;
import Session10Latihan.model.EmailField;
import Session10Latihan.model.PasswordField;
import Session10Latihan.model.SubmitButton;

public class Main {
    public Main(){
        Form loginForm = new Form();
        EmailField emailField = new EmailField(loginForm);
        PasswordField passwordField = new PasswordField(loginForm);
        SubmitButton submitButton = new SubmitButton(loginForm);

        loginForm.addComponent(emailField);
        loginForm.addComponent(passwordField);
        loginForm.addComponent(submitButton);

        emailField.input();
    }

    public static void main(String[] args) {
        new Main();
    }
}
