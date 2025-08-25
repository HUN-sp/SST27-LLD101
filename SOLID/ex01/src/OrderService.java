public class OrderService {
    // double taxRate = 0.18;
    IEmailClient email;
    ITaxAddition taxAddition;
    IDb db;

    OrderService(IEmailClient email,ITaxAddition taxAddition,IDb db) {
        this.email = email;
        this.taxAddition = taxAddition;
        this.db = db;
    }
  
    void checkout(String customerEmail, double subtotal) {
        double total = this.taxAddition.totalWithTax(subtotal);
        this.email.send(customerEmail, "Thanks! Your total is " + total);
        db.saveOrder();
        // System.out.println("Order stored (pretend DB).");
    }
}