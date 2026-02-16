public class Main {
    public static void main(String[] args) {
        double balance = 5000.00;
        double annualRate = 0.17;
        double monthlyRate = annualRate / 12;

        double interestMonth1 = balance * monthlyRate;
        double balanceAfterMonth1 = balance + interestMonth1;

        double interestMonth2 = balanceAfterMonth1 * monthlyRate;
        double balanceAfterMonth2 = balanceAfterMonth1 + interestMonth2;

        System.out.println("Starting balance: $" + balance);
        System.out.println("Annual interest rate: 17%");
        System.out.println("Monthly interest rate: " + monthlyRate);
        System.out.println();
        System.out.println("Interest after month 1: $" + interestMonth1);
        System.out.println("Balance after month 1: $" + balanceAfterMonth1);
        System.out.println();
        System.out.println("Interest after month 2: $" + interestMonth2);
        System.out.println("Balance after month 2: $" + balanceAfterMonth2);
    }
}
