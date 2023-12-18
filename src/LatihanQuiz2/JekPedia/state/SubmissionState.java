package LatihanQuiz2.JekPedia.state;

import LatihanQuiz2.JekPedia.model.JobApplication;

public class SubmissionState implements IState{
    @Override
    public void nextState(JobApplication j) {
        j.setPhase(new InterviewState());
    }

    @Override
    public String displayState() {
        return ("Going Through Paperwork");
    }
}
