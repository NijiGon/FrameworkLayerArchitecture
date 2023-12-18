package LatihanQuiz2.JekPedia.main;

import LatihanQuiz2.JekPedia.model.Applications;
import LatihanQuiz2.JekPedia.model.JobApplication;
import LatihanQuiz2.Responsi.model.KumpulanTugas;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    Applications applications = new Applications();
    String input, name, pref, proceed;
    int exp;
    public Main() {
        do{
            System.out.println("1. Register New Applicant Form");
            System.out.println("2. View Form");
            System.out.println("3. Exit");
            System.out.print(">> ");
            input = sc.nextLine();
            switch (input){
                case "1":
                    register();
                    break;
                case "2":
                    view();
                    break;
            }
        }while (!input.equals("3"));
        System.out.println("Thank You for Your Cooperation");
    }

    private void view() {
        boolean exist = applications.displayAll();
        if(exist){
            do {
                System.out.print("Preview next applicant form ? [N for next | Q to quit][case sensitive]: ");
                proceed = sc.nextLine();
                if(proceed.equals("N")){
                    applications.updateAll();
                    applications.displayAll();
                }
            }while (!proceed.equals("Q"));
        }
    }

    private void register() {
        do {
            System.out.print("Input name [cannot be empty]: ");
            name = sc.nextLine();
        }while (name.isEmpty() || name.isBlank());
        do{
            System.out.print("Input job experience [> 1]: ");
            exp = sc.nextInt();
            sc.nextLine();
        }while (exp <= 1);
        do{
            System.out.print("Input job preferences [Backend Dev | Frontend Dev]: ");
            pref = sc.nextLine();
        }while (!pref.equals("Backend Dev") && !pref.equals("Frontend Dev"));
        applications.add(new JobApplication(name, exp, pref));
    }

    public static void main(String[] args) {
        new Main();
    }
}
