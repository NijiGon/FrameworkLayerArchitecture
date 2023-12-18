package Session7Facade.main;

import Session7Facade.model.AuthenticationFacade;
import Session7Facade.model.User;

import java.util.List;
import java.util.Scanner;

public class Main {
    private List<User> users;
    public Main(){
        // user handling - facade
        // setiap user baru harus dimasukin ke file
        // password yang disimpen harus di encrypt
//        UserFileHandler fileHandler = new UserFileHandler("user.txt");
//        fileHandler.appendNewUser(new User("james", "123"));
//        users = fileHandler.importUsers();
//        for(User user : users){
//            System.out.println(user.getUsername() + " " + user.getPassword());
//        }
        AuthenticationFacade facade = new AuthenticationFacade();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to our website!");
            System.out.print("1. Login\n2. Register\n>>");
            String username, password;
            switch (sc.nextLine().trim()){
                case "1":
                    System.out.println("Enter username: ");
                    username = sc.nextLine();
                    System.out.println("Enter password: ");
                    password = sc.nextLine();
                    if(facade.login(username, password)){
                        System.out.println("You're our member");
                    }else{
                        System.out.println("You're not registered");
                    }
                    break;
                case "2":
                    System.out.println("Enter username: ");
                    username = sc.nextLine();
                    System.out.println("Enter password: ");
                    password = sc.nextLine();
                    facade.register(username, password);
            }
        }

    }

    public static void main(String[] args) {
        new Main();
    }
}
