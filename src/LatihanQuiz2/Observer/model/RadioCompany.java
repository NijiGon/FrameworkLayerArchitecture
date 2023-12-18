package LatihanQuiz2.Observer.model;

public class RadioCompany implements Observer{
    String name;

    public RadioCompany(String name) {
        this.name = name;
    }

    @Override
    public void play(String s) {
        System.out.printf("%s is now playing '%s'\n", name, s);
    }
}
