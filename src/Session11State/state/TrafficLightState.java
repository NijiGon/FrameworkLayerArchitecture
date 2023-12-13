package Session11State.state;

import Session11State.model.TrafficLight;

public abstract class TrafficLightState {
    protected TrafficLight light;

    public TrafficLightState(TrafficLight light) {
        this.light = light;
    }

    public abstract void print();

    public abstract void nextColor();
}
