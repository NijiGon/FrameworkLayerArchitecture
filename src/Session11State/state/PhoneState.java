package Session11State.state;

import Session11State.model.Phone;

public abstract class PhoneState {
    protected Phone phone;
    public PhoneState(Phone phone) {
        this.phone = phone;
    }
    public abstract void playGame();
    public abstract void turnOff();
    public abstract void charge();

}
