abstract class BankAccount {
    abstract double calculateInterest();

    void displayAccountType() {
        System.out.println("Bank Account Details");
    }
}

class SavingAccount extends BankAccount {
    double balance = 2000;

    double calculateInterest() {
        return (balance * 0.05);
    }
}

public class Task22 {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.displayAccountType();
        s.calculateInterest();
    }
}
