package abstraction;

abstract public class BankAccount {
    private int accountNumber;
    private double balance;


    public abstract void deposit(double amount);
    public abstract void withdraw(double amont);

    public  BankAccount(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
}
