package Question4;

public class BankAccount {
        private double balance;
        private static double interestRate = 5;

        public BankAccount(double initialBalance)
        {
            balance = initialBalance;
        }

        public double calculateInterest() {
            double interest = balance * (interestRate/100);
            return interest;
        }
        public static void main(String[] args)
        {
            BankAccount account = new BankAccount(1000.0);
            double interest = account.calculateInterest();
            System.out.println("Interest earned: INR " + interest);
        }
}


