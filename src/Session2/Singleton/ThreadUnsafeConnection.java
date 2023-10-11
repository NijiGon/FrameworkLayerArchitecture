package Session2.Singleton;

import java.util.ArrayList;

public class ThreadUnsafeConnection {
    private ArrayList<String> database;
//    private static Connection instance = new Connection(); // eager singleton
    private static ThreadUnsafeConnection instance = null; // lazy singleton

    private ThreadUnsafeConnection(){
        System.out.println("New connection to database");
        database = new ArrayList<>();
    }

    public static ThreadUnsafeConnection getInstance(){
        if(instance == null){
            instance = new ThreadUnsafeConnection();
        }
        return instance;
    }

//    public static void something(){
//
//    }

    public void insertData(String data){
        database.add(data);
    }

    public void printData(){
        for (String string : database){
            System.out.println(string);
        }
    }
}
