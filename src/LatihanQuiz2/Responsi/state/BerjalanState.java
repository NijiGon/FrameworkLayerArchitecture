package LatihanQuiz2.Responsi.state;

import LatihanQuiz2.Responsi.model.Tugas;

public class BerjalanState implements IState{
    @Override
    public void changeNext(Tugas t) {
        t.setStatusTugas(new SelesaiState());
    }

    @Override
    public String displayState() {
        return "Tugas sedang berjalan";
    }
}
