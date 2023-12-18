package LatihanQuiz2.TemplateState.state;

import LatihanQuiz2.TemplateState.model.VendingMachine;

public class IdleState implements IState{
    @Override
    public void nextState(VendingMachine vm) {
        vm.setState(new SelectState());
    }

    @Override
    public String displayState() {
        return "Idle State";
    }
}
