package bad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class User {
    public String name;
    public String email;

    public User(String name,String email){
        this.name=name;
        this.email=email;
    }
    public void saveDataToFile() {
        try (FileWriter writer = new FileWriter("user.txt", true)) {
            writer.write("User: " + name + "\n" + "Email: " + email);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
