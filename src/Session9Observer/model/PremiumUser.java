package Session9Observer.model;

public class PremiumUser implements Observer{
    private String name;

    public PremiumUser(String name) {
        this.name = name;
    }

    public void watchVideo(String videoTitle){
        System.out.println(name + " watched " + videoTitle);
    }

    public void receiveNotification(String notification){
        watchVideo(notification);
    }
}
