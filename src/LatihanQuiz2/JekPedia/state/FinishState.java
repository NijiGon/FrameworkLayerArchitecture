package LatihanQuiz2.JekPedia.state;

import LatihanQuiz2.JekPedia.model.JobApplication;

public class FinishState implements IState{
    @Override
    public void nextState(JobApplication j) {

    }

    @Override
    public String displayState() {
        return "Applicant Successfully Saved";
    }
}
