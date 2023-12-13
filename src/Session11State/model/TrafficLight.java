package Session11State.model;

import Session11State.state.GreenState;
import Session11State.state.TrafficLightState;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        state = new GreenState(this);
    }

    public TrafficLightState getState() {
        return state;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void print(){
        state.print();
    }

    public void nextColor(){
        state.nextColor();
    }
}
