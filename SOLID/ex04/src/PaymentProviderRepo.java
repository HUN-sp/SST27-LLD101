public class PaymentProviderRepo {
    public static PaymentProvider getProvider(PaymentType providerType) {
        switch (providerType) {
            case CARD:
                return new CardProvider();
            case UPI:
                return new UPIProvider();
            case WALLET:
                return new WalletProvider();
            default:
                throw new IllegalArgumentException("Unknown provider: " + providerType);
        }
    }
}