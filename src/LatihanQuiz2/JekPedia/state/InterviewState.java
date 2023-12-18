package LatihanQuiz2.JekPedia.state;

import LatihanQuiz2.JekPedia.model.JobApplication;

public class InterviewState implements IState{
    @Override
    public void nextState(JobApplication j) {
        if(j.getPreference().equals("Backend Dev")) j.setPhase(new ProblemSolvingState());
        else if(j.getPreference().equals("Frontend Dev")) j.setPhase(new UIUXState());
    }

    @Override
    public String displayState() {
        return "Ongoing Interviews";
    }
}
