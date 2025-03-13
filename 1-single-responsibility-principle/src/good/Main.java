package good;

public class Main {
    public static void main(String[] args) {
        UserData userData=new UserData("Dinelka","exmaple@gamil.com");
        System.out.println(userData.name);
        System.out.println(userData.email);

        UserFileData.saveDataFileName(userData);
    }
}
