package LatihanQuiz2.Responsi.state;

import LatihanQuiz2.Responsi.model.Tugas;

public class DibuatState implements IState{
    @Override
    public void changeNext(Tugas t) {
        t.setStatusTugas(new BerjalanState());
    }

    @Override
    public String displayState() {
        return "Tugas sedang dibuat";
    }
}
