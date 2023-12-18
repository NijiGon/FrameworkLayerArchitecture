package LatihanQuiz2.TemplateState.state;

import LatihanQuiz2.TemplateState.model.VendingMachine;

public interface IState {
    public void nextState(VendingMachine vm);
    public String displayState();
}
