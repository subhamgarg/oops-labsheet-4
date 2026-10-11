class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Q7 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        account.displayBalance();

        account.deposit(2000);

        account.displayBalance();

        account.deposit(-500);
    }
}