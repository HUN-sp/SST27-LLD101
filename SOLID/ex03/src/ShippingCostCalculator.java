import java.util.EnumMap;
import java.util.Map;

public class ShippingCostCalculator {
    private final Map<ShippingType, IShippingCostCalculator> strategies;

    public ShippingCostCalculator() {
        strategies = new EnumMap<>(ShippingType.class);

        strategies.put(ShippingType.STANDARD, new StandardCostCalculator());
        strategies.put(ShippingType.EXPRESS, new ExpressCostCalculator());
        strategies.put(ShippingType.OVERNIGHT, new OvernightCostCalculator());
    }

    public double cost(Shipment shipment) {
        IShippingCostCalculator strategy = strategies.get(shipment.type);

        if (strategy == null) {
            throw new IllegalArgumentException("No strategy found for type: " + shipment.type);
        }

        return strategy.cost(shipment);
    }
}