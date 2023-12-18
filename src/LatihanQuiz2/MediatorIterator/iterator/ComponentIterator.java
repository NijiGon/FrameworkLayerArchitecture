package LatihanQuiz2.MediatorIterator.iterator;

import LatihanQuiz2.MediatorIterator.model.Component;

import java.util.ArrayList;

public class ComponentIterator implements IIterator<Component> {
    ArrayList<Component> components;
    int currIdx;

    public ComponentIterator(ArrayList<Component> components) {
        this.components = components;
        this.currIdx = 0;
    }

    @Override
    public boolean hasNext() {
        return currIdx < components.size();
    }

    @Override
    public Component getNext() {
        return components.get(currIdx++);
    }
}
