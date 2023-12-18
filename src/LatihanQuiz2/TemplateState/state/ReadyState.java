package LatihanQuiz2.TemplateState.state;

import LatihanQuiz2.TemplateState.model.VendingMachine;

public class ReadyState implements IState{
    @Override
    public void nextState(VendingMachine vm) {
        vm.setState(new IdleState());
    }

    @Override
    public String displayState() {
        return "Ice Cream Ready to Take";
    }
}
