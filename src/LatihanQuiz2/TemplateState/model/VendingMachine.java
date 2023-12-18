package LatihanQuiz2.TemplateState.model;

import LatihanQuiz2.TemplateState.state.IState;
import LatihanQuiz2.TemplateState.state.IdleState;

public class VendingMachine {
    IState state;
    String flavor;
    String type;

    public VendingMachine() {
        state = new IdleState();
    }
    public void next(){
        state.nextState(this);
    }
    public String print(){
        return state.displayState();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }
}
