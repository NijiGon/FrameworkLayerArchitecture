package LatihanQuiz2.Responsi.state;

import LatihanQuiz2.Responsi.model.Tugas;

public interface IState {
    public void changeNext(Tugas t);
    public String displayState();
}
