public class StandardCostCalculator implements IShippingCostCalculator{

    @Override
    public double cost(Shipment s) {
        return 50 + 5*s.weightKg;
    }
    
}
