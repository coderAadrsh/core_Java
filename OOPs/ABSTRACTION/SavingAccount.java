package abstraction;

public class SavingAccount extends BankAccount{
    public SavingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);

    }

    @Override
    public void deposit(double amount){
        System.out.println("Deposited");

    }
    @Override
    public void withdraw(double amount){
        System.out.println("Withdrawn");

    }
    public void start(){
        System.err.println("warnning...........");
    }

    
}
