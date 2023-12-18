package LatihanQuiz2.MediatorIterator.main;

import LatihanQuiz2.MediatorIterator.mediator.Form;
import LatihanQuiz2.MediatorIterator.model.*;

public class Main {
    public Main() {
        Form form = new Form();
        EmailField emailField = new EmailField(form);
        PasswordField passwordField = new PasswordField(form);
        SubmitButton submitButton = new SubmitButton(form);
        Select select = new Select(form);
        Captcha captcha = new Captcha(form);
        form.addComponent(emailField, passwordField, submitButton, select, captcha);
        emailField.input();
    }

    public static void main(String[] args) {
        new Main();
    }
}
