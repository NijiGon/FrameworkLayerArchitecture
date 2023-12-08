package Session9Latihan.model;

public class RadioCompany implements Observer {
    private String name;

    public RadioCompany(String name) {
        this.name = name;
    }

    @Override
    public void play(String notification) {
        System.out.println(name + " is now playing " + "'" + notification + "'");
    }
}
