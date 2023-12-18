package LatihanQuiz2.TemplateState.template;

import LatihanQuiz2.TemplateState.model.VendingMachine;

import java.util.Scanner;

public class BucketIceCream extends ATemplate{
    @Override
    public void prepare(VendingMachine vm) {
        System.out.println("Prepare a Bucket");
        vm.setType("Bucket");
    }

    @Override
    public void flavor(VendingMachine vm) {
        Scanner sc = new Scanner(System.in);
        String flavor;
        do{
            System.out.print("What flavor do you want? [Chocolate | Strawberry]: ");
            flavor = sc.nextLine();
        }while (!flavor.equals("Chocolate") && !flavor.equals("Strawberry"));
        vm.setFlavor(flavor);
    }

    @Override
    public void ready() {
        System.out.println("The ice cream is ready");
    }
}
