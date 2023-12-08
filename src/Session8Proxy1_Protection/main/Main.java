package Session8Proxy1_Protection.main;

import Session8Proxy1_Protection.database.IExecutable;
import Session8Proxy1_Protection.database.proxy.DatabaseConnectionProxy;
import Session8Proxy1_Protection.model.User;

public class Main {
    public Main(){
        User user1 = new User("Admin");
        User user2 = new User("Staff");

        IExecutable db = new DatabaseConnectionProxy(user1);
        db.executeQuery("DELETE FROM Products");
//        db.deleteAllData();

    }

    public static void main(String[] args) {
        new Main();
    }
}
