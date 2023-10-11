package Session1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        char character = 'a';
        float num2 = 1.5f;
        double num3 = 1.5;
        boolean bool = true;

        String kata = "Hello";
        Integer num4 = 10;

//        System.out.println(kata + " and " + num);
//        System.out.printf("%10s and %03d\n", kata, num);

        Scanner sc = new Scanner(System.in);

//        kata = sc.nextLine();
//        kata = sc.next();
//        num = sc.nextInt();
//        sc.nextLine(); // selalu taro abis input int biar ga error
//        num2 = sc.nextFloat();
//        num3 = sc.nextDouble();
////        System.out.println(kata + " and " + num);
//        System.out.println(num + ", " + num2 + ", " + num3);

//        if(num == 10)
//            System.out.println("true");
//
//        for(int i = 0; i < 5; i++)
//            System.out.println(".");
//
////        int[] arr = new int[10];
//        ArrayList<String> stringList = new ArrayList<>();
//        stringList.add(kata);
//        ArrayList<Integer> intList = new ArrayList<>();
//
//        Vector<String> stringVector = new Vector<>();
//        stringVector.add(kata);

        Dog dog1 = new Dog("hello", 4);
        Bee bee1 = new Bee("Hello", 4);
        dog1.eat();
        bee1.eat();
        bee1.eat(5);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(dog1);
        animalList.add(bee1);

        for(Animal animal : animalList){ // foreach
//            if(animal instanceof Dog)
//                ((Dog)animal).walk();
//            else if(animal instanceof Bee)
//                ((Bee)animal).fly();
            if(animal instanceof Moveable)
                ((Moveable)animal).move();
        }

        ((Animal) bee1).eat();
    }
}
