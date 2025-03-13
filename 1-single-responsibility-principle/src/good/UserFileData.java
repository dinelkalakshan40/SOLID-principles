package good;


import java.io.FileWriter;
import java.io.IOException;

public class UserFileData {
    private static final String FILE_NAME ="user.txt";

    public static void saveDataFileName(UserData userData){
        try (FileWriter writer =new FileWriter(FILE_NAME,true)){
            writer.write("User: " + userData.name + "\n" + "Email: " + userData.email);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
