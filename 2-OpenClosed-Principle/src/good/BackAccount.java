package good;

abstract class BackAccount {
    protected double balance = 1000;

    public void showBalance(){
        System.out.println("Current Balance :" +balance);
    }
    public void newBalance(double amount){
        balance +=amount;
        System.out.println("New Balance :" +balance);
    }
}
class SavingAccount extends BackAccount{}
class BusinessAccount extends BackAccount {}

class Main{
    public static void main(String[] args) {
        BackAccount savings=new SavingAccount();
        BackAccount business=new BusinessAccount();

        savings.showBalance();
        savings.newBalance(500);

        business.showBalance();
        business.newBalance(500);
    }
}