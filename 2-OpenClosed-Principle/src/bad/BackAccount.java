package bad;

public class BackAccount {

    private double balance=500;

    public void showBalance(){
        System.out.println("Current Balance : " +balance);
    }

    public void newBalance(double amount) {
        balance += amount; // No bonus for checking accounts
        System.out.println("Checking Account Balance :" + balance);
    }

}
class Main{
    public static void main(String[] args) {
        BackAccount backAccount =new BackAccount();

        backAccount.showBalance();
        backAccount.newBalance(500);
    }
}
