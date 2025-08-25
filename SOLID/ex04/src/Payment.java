public class Payment {
    PaymentType provider; 
    double amount;
    Payment(PaymentType p, double a)
    {
        this.provider=p; 
        this.amount=a; 
    }
}