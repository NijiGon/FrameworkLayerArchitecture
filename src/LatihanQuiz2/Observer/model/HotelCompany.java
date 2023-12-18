package LatihanQuiz2.Observer.model;

public class HotelCompany implements Observer{
    String name;

    public HotelCompany(String name) {
        this.name = name;
    }

    @Override
    public void play(String s) {
        System.out.printf("%s is currently playing '%s'\n", name, s);
    }
}
