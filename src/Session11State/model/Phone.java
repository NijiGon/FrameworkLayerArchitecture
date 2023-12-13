package Session11State.model;

import Session11State.state.NormalState;
import Session11State.state.PhoneState;

public class Phone {
    private PhoneState state;

    public Phone() {
        state = new NormalState(this);
    }

    public PhoneState getState() {
        return state;
    }
    public void setState(PhoneState state) {
        this.state = state;
    }
    public void playGame(){
        state.playGame();
    }
    public void turnOff(){
        state.turnOff();
    }
    public void charge(){
        state.charge();
    }
}
