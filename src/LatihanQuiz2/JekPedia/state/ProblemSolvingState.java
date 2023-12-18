package LatihanQuiz2.JekPedia.state;

import LatihanQuiz2.JekPedia.model.JobApplication;

public class ProblemSolvingState implements IState{
    @Override
    public void nextState(JobApplication j) {
        j.setPhase(new FinishState());
    }

    @Override
    public String displayState() {
        return ("Solving Algorithm Problems");
    }
}
