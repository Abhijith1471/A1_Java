public class AccountBalanceApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Account application");

        // Initial balances
        CheckingAccount checking = new CheckingAccount(1000, 1.00);
        SavingsAccount savings = new SavingsAccount(1000, 0.012); // 1.2% interest

        // Display starting balances
        System.out.printf("Starting Balances\nChecking: $%.2f\nSavings: $%.2f\n\n",
                checking.getBalance(), savings.getBalance());

        // Process transactions
        boolean continueTransactions = true;
        while (continueTransactions) {
            String transactionType = Console.getString("Withdrawal or deposit? (w/d): ").toLowerCase();
            String accountType = Console.getString("Checking or savings? (c/s): ").toLowerCase();
            double amount = Console.getDouble("Amount?: ");

            if (accountType.equals("c")) {
                if (transactionType.equals("w")) {
                    checking.withdraw(amount);
                } else if (transactionType.equals("d")) {
                    checking.deposit(amount);
                }
            } else if (accountType.equals("s")) {
                if (transactionType.equals("w")) {
                    savings.withdraw(amount);
                } else if (transactionType.equals("d")) {
                    savings.deposit(amount);
                }
            }

            String continueChoice = Console.getString("Continue? (y/n): ").toLowerCase();
            continueTransactions = continueChoice.equals("y");
        }

        // Apply monthly fees and interest
        checking.subtractMonthlyFee();
        savings.applyMonthlyInterest();

        // Display final balances
        System.out.printf("\nMonthly Payments and Fees\nChecking fee: $%.2f\nSavings interest payment: $%.2f\n\n",
                checking.getMonthlyFee(), savings.getMonthlyInterestPayment());

        System.out.printf("Final Balances\nChecking: $%.2f\nSavings: $%.2f\n",
                checking.getBalance(), savings.getBalance());
    }
}
