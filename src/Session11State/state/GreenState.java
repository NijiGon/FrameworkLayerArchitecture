package Session11State.state;

import Session11State.model.TrafficLight;

public class GreenState extends TrafficLightState{
    public GreenState(TrafficLight light) {
        super(light);
    }

    @Override
    public void print() {
        System.out.println("Go");
    }

    @Override
    public void nextColor() {
        light.setState(new RedState(light));
    }
}
