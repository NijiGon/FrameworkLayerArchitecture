package LatihanQuiz2.JekPedia.state;

import LatihanQuiz2.JekPedia.model.JobApplication;

public class UIUXState implements IState{
    @Override
    public void nextState(JobApplication j) {
        j.setPhase(new FinishState());
    }

    @Override
    public String displayState() {
        return ("Designing Application UI UX");
    }
}
