package LatihanQuiz2.Observer.main;

import LatihanQuiz2.Observer.model.HotelCompany;
import LatihanQuiz2.Observer.model.Music;
import LatihanQuiz2.Observer.model.RadioCompany;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    String input;
    HotelCompany loga = new HotelCompany("PT Loga Company");
    RadioCompany gogo = new RadioCompany("PT Gogo Company");
    RadioCompany lolo = new RadioCompany("PT Lolo Company");
    Music angle = new Music("Angle");
    public Main() {
        angle.subscribe(gogo, loga, lolo);
//        angle.subscribe(loga);
//        angle.subscribe(gogo);
//        angle.subscribe(lolo);
        System.out.println("Angle Music");
        System.out.println("=================");
        System.out.print("Input current track >> ");
        input = sc.nextLine();
        angle.send(input);
    }

    public static void main(String[] args) {
        new Main();
    }
}
