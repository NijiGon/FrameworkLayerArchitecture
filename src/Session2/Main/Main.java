package Session2.Main;

import Session2.Singleton.Connection;
import Session2.Singleton.ThreadUnsafeConnection;

public class Main {
    public Main() throws InterruptedException {
//        Connection connection1 = Connection.getInstance();
//        connection1.insertData("Data added");
////        Connection.something();
////        // anggap beda class
//        Connection connection2 = Connection.getInstance();
//        connection2.printData();

        // bikin thread 2 cara
        // extends Thread
        // implements Runnable
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        Thread thread3 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(100);

        Connection.getInstance().printData();
    }

    public static void main(String[] args) throws InterruptedException {
        new Main();
    }
}
