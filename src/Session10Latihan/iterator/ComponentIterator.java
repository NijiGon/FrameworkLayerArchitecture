package Session10Latihan.iterator;

import Session10Latihan.model.Component;

import java.util.ArrayList;

public class ComponentIterator implements Iterator<Component> {
    private ArrayList<Component> list;
    private int currIdx;

    public ComponentIterator(ArrayList<Component> list) {
        this.list = list;
        currIdx = 0;
    }

    @Override
    public boolean hasNext() {
        return currIdx < list.size();
    }

    @Override
    public Component getNext() {
        return list.get(currIdx++);
    }
}
