public class CardProvider implements PaymentProvider {
    @Override
    public String pay(double amount) {
        return "Charged card: " + amount;
    }
}