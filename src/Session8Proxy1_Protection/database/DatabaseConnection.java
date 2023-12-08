package Session8Proxy1_Protection.database;

import Session8Proxy1_Protection.model.User;

public class DatabaseConnection implements IExecutable{

    User user;

    public DatabaseConnection(User user) {
        this.user = user;
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing Query " + query);
    }

    public void deleteAllData(){
        System.out.println("Deleting all data");
    }
}
