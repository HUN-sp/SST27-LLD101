public class Shipment {
    ShippingType type; 
    double weightKg;
    Shipment(ShippingType type, double w)
    { 
        this.type=type;
        this.weightKg=w; 
    }
}