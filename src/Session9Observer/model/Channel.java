package Session9Observer.model;

import java.util.ArrayList;

public class Channel {
    private String channelName;
    private ArrayList<Observer> observers = new ArrayList<>();

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public void subscribe(Observer observer){
        observers.add(observer);
    }

    public void sendNotification(String notification){
        for(Observer observer : observers){
            observer.receiveNotification(notification);
        }
    }

    public void uploadVideo(String videoTitle){
        System.out.println(channelName + " uploaded a video title: " + videoTitle);
        sendNotification(videoTitle);
    }
}
