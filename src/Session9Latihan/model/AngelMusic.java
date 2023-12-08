package Session9Latihan.model;

import java.util.ArrayList;

public class AngelMusic {
    ArrayList<Observer> observers = new ArrayList<>();
    public void subscribe(Observer observer){
        observers.add(observer);
    }
    public void sendNotification(String notification){
        for(Observer observer : observers){
            observer.play(notification);
        }
    }
    public void inputTrack(String title){
        System.out.println("AngelMusic inputted a new track called "  + title);
        sendNotification(title);
    }
}
