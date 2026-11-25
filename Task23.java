abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void showAmount() {
        System.out.println("Payment Amount:$ " + amount);
    }

    abstract void processPayment();
}

class UPIPayment extends Payment {
    UPIPayment(double amount){
        super(amount)
    }

    void processPayment() {
        System.out.println("Payment processed successfully using UPI");
    }
}

public class Task23 {
    public static void main(String[] args) {
        UPIPayment u = new UPIPayment(20000);
        u.showAmount();
        u.processPayment();
    }
}
