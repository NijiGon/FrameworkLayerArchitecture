package Session10Iterator.iterator;

import Session10Iterator.model.User;

import java.util.ArrayList;

public class UserLIFOIterator implements Iterator<User>{
    private ArrayList<User> list;
    private int currentIndex;

    public UserLIFOIterator(ArrayList<User> list) {
        this.list = list;
        currentIndex = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public User getNext() {
//        User curr = list.get(currentIndex);
//        currentIndex++;
//        return curr;

        return(list.get(currentIndex--));
    }
}
