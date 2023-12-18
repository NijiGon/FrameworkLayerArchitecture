package LatihanQuiz2.Observer.model;

import java.util.ArrayList;

public class Music {
    String name;
    ArrayList<Observer> observers = new ArrayList<>();

    public Music(String name) {
        this.name = name;
    }
    public void subscribe(Observer observer){
        observers.add(observer);
    }
    public void subscribe(Observer... observers){
        for(Observer o : observers){
            this.observers.add(o);
        }
    }
    public void send(String s){
        for(Observer observer : observers){
            observer.play(s);
        }
    }
}
