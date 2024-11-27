package hhh.Bank;

public class BankManagementSystem {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(5000);
        bankAccount.withdraw(2500);
        System.out.println("Your account balance is : " + bankAccount.getBalance());
    }
}
