public class Demo04 {
    public static void main(String[] args) {
        System.out.println(new PaymentService().pay(new Payment(PaymentType.UPI, 499)));
        System.out.println(new PaymentService().pay(new Payment(PaymentType.CARD, 1200)));
    }
}