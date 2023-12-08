package Session9Latihan.model;

public class HotelCompany implements Observer {
    private String name;

    public HotelCompany(String name) {
        this.name = name;
    }

    @Override
    public void play(String notification) {
        System.out.println(name + " is currently playing " + "'" + notification + "'");
    }
}
