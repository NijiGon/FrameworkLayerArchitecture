package Session9Latihan.main;

import Session9Latihan.model.AngelMusic;
import Session9Latihan.model.HotelCompany;
import Session9Latihan.model.RadioCompany;

import java.util.Scanner;

public class Main {
    public Main(){
        AngelMusic angelMusic = new AngelMusic();
        RadioCompany radio1 = new RadioCompany("PT Gogo Company");
        RadioCompany radio2 = new RadioCompany("PT Lolo Company");
        HotelCompany hotel1 = new HotelCompany("PT Loga Company");

        angelMusic.subscribe(radio1);
        angelMusic.subscribe(hotel1);
        angelMusic.subscribe(radio2);

        Scanner sc = new Scanner(System.in);

        System.out.println("Angle Music");
        System.out.println("=====================");
        System.out.print("Input current track >> ");
        String track = sc.nextLine();

        angelMusic.inputTrack(track);
    }

    public static void main(String[] args) {
        new Main();
    }
}
