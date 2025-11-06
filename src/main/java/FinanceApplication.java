import java.util.ArrayList;
import java.util.Objects;

public class FinanceApplication {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);
        Jewelry ring = new Jewelry(10, "diamond", 500);
        Jewelry necklace = new Jewelry(3, "silver", 50);

        // try to deposit money into both accounts
        account1.deposit(100);
       // account2.deposit(100); <- this wouldn't work

//        ArrayList<Valuable> things = new ArrayList<Valuable>();
//        things.add(account1);
//        things.add(account2);
//        for (int i = 0; i < 2; i++){
//            if (things.get(i) instanceof Valuable) {
//            BankAccount bankAccount = (BankAccount) things.get(i);
//            bankAccount.deposit(100);
//                System.out.println(bankAccount.getValue());
//            }
//       }
//   ^ This casting isn't necessary

        Portfolio portfolio = new Portfolio("Dave", "Dave");
        portfolio.add(account1);
        portfolio.add(necklace);
        portfolio.add(ring);

        Valuable mostValuable = portfolio.getMostValuable();
        System.out.println("Most Valuable: " + mostValuable.toString());

        Valuable leastValuable = portfolio.getLeastValuable();
        System.out.println("Least Valuable: " + leastValuable.toString());

    }


}
