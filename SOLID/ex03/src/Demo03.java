public class Demo03 {
    public static void main(String[] args) {
        Shipment myShipment = new Shipment(ShippingType.EXPRESS, 2.0);
        double cost = new ShippingCostCalculator().cost(myShipment);
        System.out.println("Shipping cost: " + cost);
    }
}
