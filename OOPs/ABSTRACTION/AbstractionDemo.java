package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // SavingAccount savingAccount=new SavingAccount();
        // savingAccount.deposit(100);
        BankAccount savingAccount1=new SavingAccount(12345, 1000.0);//referance of bank account follow parent -child relationship.
        savingAccount1.deposit(1000);
        ((SavingAccount)savingAccount1).start();//type casting because BankAccount does not have start method.

        savingAccount1=new CurrentAccount(67890, 200.0);
        savingAccount1.deposit(200);
       System.out.println( savingAccount1.getAccountNumber());

    }
    
}
