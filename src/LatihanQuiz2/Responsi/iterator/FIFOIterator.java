package LatihanQuiz2.Responsi.iterator;

import LatihanQuiz2.Responsi.model.Tugas;

import java.util.ArrayList;

public class FIFOIterator<T> implements IIterator<T> {
    ArrayList<T> list;
    int currIdx;

    public FIFOIterator(ArrayList<T> list) {
        this.list = list;
        this.currIdx = 0;
    }

    @Override
    public boolean hasNext() {
        return currIdx < list.size();
    }

    @Override
    public T getNext() {
        return list.get(currIdx++);
    }

    public int getCurrIdx() {
        return currIdx;
    }
}
