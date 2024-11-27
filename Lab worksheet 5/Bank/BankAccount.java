public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposit amount is " + amount + ", and your new balance is " + balance);
    }
    public void withdraw(double amount){
        if (balance >= amount){
            balance = balance - amount;
            System.out.println("Withdraw amount is " + amount + ", and your new balance is " + balance);
        }else {
            System.out.println("Your cant withraw that amount, your balance is " + balance);
        }
    }
}
