interface PaymentGateway{
    abstract void makePayment();
}
class GooglePay implements PaymentGateway{
    public void makePayment(){
    System.out.println("Payment compleated using GooglePay");
    }
}
class PhonePay implements PaymentGateway{
    public void makePayment(){
        System.out.println("Payment compleated using phonepay");
    }
}
public class Task25 {
    public static void main(String[] args) {
        GooglePay g=new GooglePay();
        PhonePay p=new PhonePay();
        g.makePayment();
        p.makePayment();
    }
}
