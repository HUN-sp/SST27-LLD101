public class TaxAddition implements ITaxAddition{
    double taxRate = 0.18;

    TaxAddition(){
        this.taxRate = taxRate;
    }

    TaxAddition(double taxRate) {
        this.taxRate = taxRate;
    }
    
    @Override
    public double totalWithTax(double subtotal) {
         return subtotal + subtotal * taxRate;
    }
}
