abstract class Account {
    double account_balance;
    String account_holder_name;
    long account_number;
    String address;

    abstract void depositedBalance();

    void accountDetails() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Account Number: " + account_number);
        System.out.println("Address: " + address);
    }
}

class SavingsAccount extends Account {
    double depositedAmount;
    double RateofInterest;
    double newBalance;

    void depositedBalance() {
        System.out.println("Deposited Amount: " + depositedAmount);
        System.out.println("Rate of Interest: " + RateofInterest);
        System.out.println("New Balance: " + newBalance);
    }
}

public class MainClass6 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.account_holder_name = "John Doe";
        savingsAccount.account_number = 123456789;
        savingsAccount.address = "123 Main St";
        savingsAccount.depositedAmount = 1000;
        savingsAccount.RateofInterest = 5.0;
        savingsAccount.newBalance = savingsAccount.depositedAmount * (1 + savingsAccount.RateofInterest / 100);

        savingsAccount.accountDetails();
        savingsAccount.depositedBalance();
    }
}
