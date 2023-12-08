package Session9Observer.model;

public class NormalUser implements Observer{
    private String name;

    public NormalUser(String name) {
        this.name = name;
    }

    public void watchVideo(String videoTitle){
        System.out.println(name + " watched " + videoTitle);
    }

    public void receiveNotification(String notification){
        System.out.println(name + " watched a 15 second ad");
        watchVideo(notification);
    }
}
