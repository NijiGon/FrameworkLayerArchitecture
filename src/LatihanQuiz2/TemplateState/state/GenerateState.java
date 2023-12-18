package LatihanQuiz2.TemplateState.state;

import LatihanQuiz2.TemplateState.model.VendingMachine;

public class GenerateState implements IState{
    @Override
    public void nextState(VendingMachine vm) {
        vm.setState(new ReadyState());
    }

    @Override
    public String displayState() {
        return "Generate Ice Cream State";
    }
}
