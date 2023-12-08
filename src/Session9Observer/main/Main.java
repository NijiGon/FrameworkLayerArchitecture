package Session9Observer.main;

import Session9Observer.model.Channel;
import Session9Observer.model.NormalUser;
import Session9Observer.model.PremiumUser;

public class Main {
    public Main(){
        // channel -> diamati
        // pengen tau kapan channel upload
        // channel -> observable
        Channel pewdeephi = new Channel("Pewdeephi");
        // user -> mengamati
        // user -> observer
        NormalUser user1 = new NormalUser("John");
        NormalUser user2 = new NormalUser("Mary");
        NormalUser user3 = new NormalUser("William");
        PremiumUser user4 = new PremiumUser("Rich Man");

        pewdeephi.subscribe(user1);
        pewdeephi.subscribe(user2);
        pewdeephi.subscribe(user3);
        pewdeephi.subscribe(user4);

        Channel missBeast = new Channel("Ms. Beast");
        missBeast.subscribe(user2);
        missBeast.uploadVideo("Free money");

        pewdeephi.uploadVideo("24 Hours livestream cuts");
    }
    public static void main(String[] args) {
        new Main();
    }
}
