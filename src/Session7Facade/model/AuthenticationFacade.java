package Session7Facade.model;

import java.util.List;

public class AuthenticationFacade {
    private UserFileHandler fileHandler = new UserFileHandler("user.txt");
    public AuthenticationFacade(){

    }

    public void register(String username, String password){
        fileHandler.appendNewUser(new User(username, password));
    }

    public boolean login(String username, String password){
        List<User> users = fileHandler.importUsers();

        for(User user : users){
            boolean sameUsername = user.getUsername().equals(username);
            boolean samePassword = user.getPassword().equals(password);
            if(sameUsername && samePassword){
                return true;
            }
        }
        return false;
    }
}
