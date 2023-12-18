package LatihanQuiz2.TemplateState.main;

import LatihanQuiz2.TemplateState.model.VendingMachine;
import LatihanQuiz2.TemplateState.state.GenerateState;
import LatihanQuiz2.TemplateState.state.IdleState;
import LatihanQuiz2.TemplateState.state.ReadyState;
import LatihanQuiz2.TemplateState.state.SelectState;
import LatihanQuiz2.TemplateState.template.ATemplate;
import LatihanQuiz2.TemplateState.template.BucketIceCream;
import LatihanQuiz2.TemplateState.template.ConeIceCream;

import java.util.Scanner;

public class Main {
    String input, type;
    Scanner sc = new Scanner(System.in);
    ATemplate template;
    VendingMachine vm = new VendingMachine();
    public Main() {
        do{
            System.out.println("Current State: " + vm.print());
            System.out.println("1. Insert Money to Vending");
            System.out.println("2. Picking ice cream");
            System.out.println("3. Generate ice cream");
            System.out.println("4. Take the ice cream");
            System.out.println("0. Exit");
            System.out.print(">> ");
            input = sc.nextLine();
            switch (input){
                case "1":
                    if(!(vm.getState() instanceof IdleState)){
                        System.out.println("error");
                        break;
                    }
                    vm.next();
                    break;
                case "2":
                    if(!(vm.getState() instanceof SelectState)){
                        System.out.println("error");
                        break;
                    }
                    do{
                        System.out.println("bucket or cone");
                        type = sc.nextLine();
                    }while (!type.equals("bucket") && !type.equals("cone"));
                    vm.next();
                    break;
                case "3":
                    if(!(vm.getState() instanceof GenerateState)){
                        System.out.println("error");
                        break;
                    }
                    switch (type){
                        case "bucket":
                            template = new BucketIceCream();
                            break;
                        case "cone":
                            template = new ConeIceCream();
                            break;
                    }
                    template.makeIceCream(vm);
                    vm.next();
                    break;
                case "4":
                    if(!(vm.getState() instanceof ReadyState)){
                        System.out.println("error");
                        break;
                    }
                    System.out.println("Name: Ice cream " + vm.getFlavor());
                    System.out.println("Flavor: " + vm.getFlavor());
                    System.out.println("Type: " + vm.getType());
                    System.out.println();
                    vm.next();
                    break;

            }
        }while(!input.equals("0"));
    }

    public static void main(String[] args) {
        new Main();
    }
}
