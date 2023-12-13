package Session11State.state;

import Session11State.model.Phone;

public class NormalState extends PhoneState{
    public NormalState(Phone phone) {
        super(phone);
    }

    @Override
    public void playGame() {
        System.out.println("Playing a game...");
        System.out.println("Games take a lot of battery");
        phone.setState(new LowBatteryState(phone));
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off");
        phone.setState(new TurnedOffState(phone));
    }

    @Override
    public void charge() {
        System.out.println("Battery already full");
    }
}
