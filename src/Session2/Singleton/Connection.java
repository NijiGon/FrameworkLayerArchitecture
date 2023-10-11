package Session2.Singleton;

import java.util.ArrayList;

public class Connection {
    private ArrayList<String> database;
    //    private static Connection instance = new Connection(); // eager singleton
    private static volatile Connection instance = null; // lazy singleton

    private Connection(){
        System.out.println("New connection to database");
        database = new ArrayList<>();
    }

    public static Connection getInstance(){
        if(instance == null){
            synchronized (Connection.class){
                if(instance == null){
                    instance = new Connection();
                }
            }
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
