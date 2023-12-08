package Session8Proxy1_Protection.database.proxy;

import Session8Proxy1_Protection.database.DatabaseConnection;
import Session8Proxy1_Protection.database.IExecutable;
import Session8Proxy1_Protection.model.User;

public class DatabaseConnectionProxy implements IExecutable {

    private DatabaseConnection db;

    User user;

    public DatabaseConnectionProxy(User user) {
        this.user = user;
        // protection & cache proxy
        db = new DatabaseConnection(user);
    }

    @Override
    public void executeQuery(String query) {
        if(user.role.equals("Admin")){
            db.executeQuery(query);
        }
        else if(query.toLowerCase().contains("delete")){
            System.out.println("User has no access on deletion");
        }
        else{
            db.executeQuery(query);
        }
    }
}
