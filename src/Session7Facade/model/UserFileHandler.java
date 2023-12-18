package Session7Facade.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserFileHandler {
    private String fileLocation;
    public UserFileHandler(String fileLocation){
        this.fileLocation = fileLocation;
    }

    public List<User> importUsers(){
        ArrayList<User> users = new ArrayList<>();
        File file = new File(fileLocation);
        try {
            Scanner sc = new Scanner(file);
            // format -> username#password
            while (sc.hasNextLine()){
                String userData = sc.nextLine();
                String[] split = userData.split("#");
                users.add(new User(split[0], split[1]));
            }
            return users;
        } catch (FileNotFoundException e) {
            return users;
        }
    }

    public void appendNewUser(User newUser){
        File file = new File(fileLocation);
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write("\n" + newUser.getUsername() + "#" + newUser.getPassword());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
