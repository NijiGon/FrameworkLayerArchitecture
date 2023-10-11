package Session2.Main;

import Session2.Singleton.Connection;
import Session2.Singleton.ThreadUnsafeConnection;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        Connection.getInstance().insertData("Data added");
//        System.out.println();
    }
}
