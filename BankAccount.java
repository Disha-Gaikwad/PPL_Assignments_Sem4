// Object-Oriented paradigm implementation (Java)
public class BankAccount {
    private double balance;  // Instance variable to store balance
    public BankAccount() {
        balance = 0.0;  // Initial balance is 0
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();  // Create a new bank account instance
        account.deposit(1000);
        account.withdraw(500);
        account.checkBalance();
        account.withdraw(600);  // This should trigger insufficient funds message
    }
}
