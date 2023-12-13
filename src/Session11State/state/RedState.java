package Session11State.state;

import Session11State.model.TrafficLight;

public class RedState extends TrafficLightState{
    public RedState(TrafficLight light) {
        super(light);
    }

    @Override
    public void print() {
        System.out.println("Stop");
    }

    @Override
    public void nextColor() {
        light.setState(new YellowState(light));
    }
}
