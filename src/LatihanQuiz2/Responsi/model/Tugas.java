package LatihanQuiz2.Responsi.model;

import LatihanQuiz2.Responsi.state.DibuatState;
import LatihanQuiz2.Responsi.state.IState;

public class Tugas {
    String name;
    IState statusTugas;

    public Tugas(String name) {
        this.name = name;
        this.statusTugas = new DibuatState();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IState getStatusTugas() {
        return statusTugas;
    }

    public void setStatusTugas(IState statusTugas) {
        this.statusTugas = statusTugas;
    }

    public void next(){
        statusTugas.changeNext(this);
    }

    public void print(){
        statusTugas.displayState();
    }
}
