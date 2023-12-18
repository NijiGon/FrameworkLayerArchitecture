package LatihanQuiz2.JekPedia.state;

import LatihanQuiz2.JekPedia.model.JobApplication;

public interface IState {
    public void nextState(JobApplication j);
    public String displayState();
}
