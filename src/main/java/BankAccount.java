public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void withdraw(double withdrawMoney){
        balance -= withdrawMoney;
        if (balance < 0) {
            System.out.println("Insufficient balance. Withdraw declined.");
        }
    }
    public void deposit(double deposit){
        balance += deposit;
    }

    @Override
    public double getValue(){
        return balance;
    }

    @Override
    public String toString(){
        String v = String.format("%s, %.2f", name, getValue());
        return v;
    }

}
