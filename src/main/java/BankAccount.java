public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void withdraw(){
    }
    public void deposit(double deposit){
        balance += deposit;
    }

    @Override
    public double getValue(){
        return 0;
    }
}
