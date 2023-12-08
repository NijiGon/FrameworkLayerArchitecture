package Session10Iterator.main;


import Session10Iterator.iterator.Iterator;
import Session10Iterator.iterator.UserIterator;
import Session10Iterator.iterator.UserLIFOIterator;
import Session10Iterator.model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        User user1 = new User("Darryl", 19);
        User user2 = new User("Tio", 19);
        User user3 = new User("Victor", 19);

        ArrayList<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        Iterator<User> iter = new UserLIFOIterator(userList);
        while (iter.hasNext()){
            System.out.println(iter.getNext().name);
        }
    }
}
