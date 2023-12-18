package LatihanQuiz2.Facade.main;

import LatihanQuiz2.Facade.model.AuthenticationFacade;
import LatihanQuiz2.Facade.model.Computer;

import javax.naming.AuthenticationException;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    Computer computer = new Computer();
    AuthenticationFacade facade = new AuthenticationFacade();
    String input, password, state;
    public Main() {
        do{
            computer.display();
            System.out.println("1. Start playing game");
            System.out.println("2. Finish playing game");
            System.out.println("3. Exit");
            System.out.print(">> ");
            input = sc.nextLine();
            switch (input){
                case "1":
                    state = "on";
                    if(facade.nextState(computer, state)){
                        do{
                            System.out.print("Input password: ");
                            password = sc.nextLine();
                        }while (!facade.isValid(password));
                    }
                    break;
                case "2":
                    state = "off";
                    facade.nextState(computer, state);
                    break;
            }
        }while (!input.equals("3"));
    }

    public static void main(String[] args) {
        new Main();
    }
}
