package Session11State.state;

import Session11State.model.TrafficLight;

public class YellowState extends TrafficLightState{
    public YellowState(TrafficLight light) {
        super(light);
    }

    @Override
    public void print() {
        System.out.println("Slow down!");
    }

    @Override
    public void nextColor() {
        light.setState(new GreenState(light));
    }
}
