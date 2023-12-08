package Session10Mediator.main;

import Session10Mediator.mediator.Mediator;
import Session10Mediator.model.Host;

import javax.print.attribute.standard.Media;

public class Main {
    public static void main(String[] args) {
        new Main();
    }
    public Main(){

        Mediator server = new Mediator();

        Host host1 = new Host("www.google.com", "Google", server);
        Host host2 = new Host("www.facebook.com", "Facebook", server);
        Host host3 = new Host("www.instagram.com", "Instagram", server);

        server.addHost(host1);
        server.addHost(host2);
        server.addHost(host3);

        host1.send(host2.ipAddress);
    }
}
