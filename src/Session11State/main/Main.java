package Session11State.main;

import Session11State.model.Phone;
import Session11State.model.TrafficLight;

public class Main {
    public Main(){
        TrafficLight light = new TrafficLight();
        light.print();
        light.nextColor();
        light.print();
        light.nextColor();
        light.print();

        Phone phone = new Phone();
//        phone.turnOff();
        phone.playGame();
        phone.playGame();
        phone.playGame();
        phone.charge();
        phone.playGame();
    }

    public static void main(String[] args) {
        new Main();
    }
}
