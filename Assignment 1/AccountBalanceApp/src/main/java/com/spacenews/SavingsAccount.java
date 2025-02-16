public class SavingsAccount extends Account {
    private double monthlyInterestRate;

    public SavingsAccount(double balance, double monthlyInterestRate) {
        super(balance);
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public void applyMonthlyInterest() {
        double interestPayment = balance * monthlyInterestRate;
        balance += interestPayment;
    }

    public double getMonthlyInterestPayment() {
        return balance * monthlyInterestRate;
    }
}
