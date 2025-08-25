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
        // Look up the strategy for the shipment's type
        IShippingCostCalculator strategy = strategies.get(shipment.type);

        if (strategy == null) {
            throw new IllegalArgumentException("No strategy found for type: " + shipment.type);
        }

        // Delegate the calculation to the found strategy object
        return strategy.cost(shipment);
    }
}