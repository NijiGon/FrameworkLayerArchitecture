package LatihanQuiz2.JekPedia.iterator;

import LatihanQuiz2.JekPedia.model.JobApplication;

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

    public int getCurrIdx() {
        return currIdx;
    }

    @Override
    public T getNext() {
        return list.get(currIdx++);
    }
}
