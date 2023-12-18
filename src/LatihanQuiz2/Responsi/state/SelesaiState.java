package LatihanQuiz2.Responsi.state;

import LatihanQuiz2.Responsi.model.Tugas;

public class SelesaiState implements IState{
    @Override
    public void changeNext(Tugas t) {
    }

    @Override
    public String displayState() {
        return "Tugas sudah selesai";
    }
}
