package LatihanQuiz2.Responsi.model;

import LatihanQuiz2.Responsi.iterator.FIFOIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class KumpulanTugas {
    ArrayList<Tugas> list;

    public KumpulanTugas() {
        list = new ArrayList<>();
    }
    public void tambahTugas(Tugas t){
        list.add(t);
    }

    public Tugas getTugas(int idx){
        return list.get(idx);
    }

    public void tampilkanSemuaTugas(){
        FIFOIterator<Tugas> itugas = new FIFOIterator<>(list);
        while (itugas.hasNext()){
            Tugas tugas = itugas.getNext();
            System.out.println(itugas.getCurrIdx() + " | " + tugas.getName() + " | " + tugas.getStatusTugas().displayState());
        }
    }

    public void lanjutkanSemuaTugas() {
        FIFOIterator<Tugas> itugas = new FIFOIterator<>(list);
        while (itugas.hasNext()){
            Tugas tugas = itugas.getNext();
            tugas.next();
        }
    }
}
