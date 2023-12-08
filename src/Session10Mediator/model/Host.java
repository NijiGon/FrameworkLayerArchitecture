package Session10Mediator.model;

import Session10Mediator.mediator.Mediator;

public class Host {
    public String ipAddress;
    public String hostName;
    private Mediator mediator;

    public Host(String ipAddress, String hostName, Mediator mediator) {
        this.ipAddress = ipAddress;
        this.hostName = hostName;
        this.mediator = mediator;
    }

    public void send(String receiverIp){
        System.out.println(hostName + " is sending message to " + receiverIp);
        mediator.send(ipAddress, receiverIp);
    }

    public void receive(String senderIp){
        System.out.println(hostName + " received a message from " + senderIp);
    }
}
