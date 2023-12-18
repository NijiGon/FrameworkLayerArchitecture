package LatihanQuiz2.TemplateState.state;

import LatihanQuiz2.TemplateState.model.VendingMachine;

public class SelectState implements IState{
    @Override
    public void nextState(VendingMachine vm) {
        vm.setState(new GenerateState());
    }

    @Override
    public String displayState() {
        return "Selecting Ice Scream State";
    }
}
