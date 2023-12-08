package Session10Iterator.iterator;

import Session10Iterator.model.User;

import java.util.ArrayList;

public class UserIterator implements Iterator<User>{

    private ArrayList<User> list;
    private int currentIndex;

    public UserIterator(ArrayList<User> list) {
        this.list = list;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public User getNext() {
//        User curr = list.get(currentIndex);
//        currentIndex++;
//        return curr;

        return(list.get(currentIndex++));
    }
}
