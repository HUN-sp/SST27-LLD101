public class PaymentService {
    String pay(Payment p) {
        PaymentProvider provider = PaymentProviderRepo.getProvider(p.provider);

        return provider.pay(p.amount);
    }
}