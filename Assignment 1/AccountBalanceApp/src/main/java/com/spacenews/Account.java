public class Account implements Depositable, Withdrawable, Balanceable {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double amount) {
        this.balance = amount;
    }
}
