package Session11State.state;

import Session11State.model.Phone;

public class LowBatteryState extends PhoneState{
    public LowBatteryState(Phone phone) {
        super(phone);
    }

    @Override
    public void playGame() {
        System.out.println("Playing a game...");
        System.out.println("Games take a lot of battery");
        phone.setState(new TurnedOffState(phone));
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off");
        phone.setState(new TurnedOffState(phone));
    }

    @Override
    public void charge() {
        System.out.println("Phone back to full");
        phone.setState(new NormalState(phone));
    }
}
