package Session11State.state;

import Session11State.model.Phone;

public class TurnedOffState extends PhoneState{
    public TurnedOffState(Phone phone) {
        super(phone);
    }

    @Override
    public void playGame() {
        System.out.println("Can't do that, phone is off");
    }

    @Override
    public void turnOff() {
        System.out.println("Can't do that, phone is off");
    }

    @Override
    public void charge() {
        System.out.println("Phone back online");
        phone.setState(new NormalState(phone));
    }
}
