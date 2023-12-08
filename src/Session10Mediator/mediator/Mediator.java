package Session10Mediator.mediator;

import Session10Mediator.model.Host;

import java.util.HashMap;

public class Mediator {
    HashMap<String, Host> hosts;
    public Mediator(){
        hosts = new HashMap<>();
    }

    public void send(String senderIp, String receiverIp){
        Host receiver = hosts.get(receiverIp);
        if(receiver == null){
            System.out.println("Invalid IP");
            return;
        }
        receiver.receive(senderIp);
    }

    public void addHost(Host host){
        hosts.put(host.ipAddress, host);
    }
}
