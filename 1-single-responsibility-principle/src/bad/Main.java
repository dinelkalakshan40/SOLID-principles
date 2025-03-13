package bad;

public class Main {
    public static void main(String[] args) {
        User user=new User("Dinelka","Example@gmail.com");
        System.out.println(user.name);
        System.out.println(user.email);

        User user2 = new User("Dinelka", "Example@gmail.com");
        user2.saveDataToFile();
    }
}
