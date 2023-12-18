package LatihanQuiz2.Proxy.main;

import LatihanQuiz2.Proxy.proxy.MovieProxy;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    MovieProxy db = new MovieProxy();
    String input;
    public Main() {
        while (true){
            System.out.println("Angel Flix");
            System.out.println("====================");
            System.out.println("What movie do you want to know");
            System.out.print("Input movie name >> ");
            input = sc.nextLine();
            if(input.equals("none")) break;
            db.display(input);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
