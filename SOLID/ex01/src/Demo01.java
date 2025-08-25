public class Demo01 {
    public static void main(String[] args) {
        IDb iDb = new Db();
        IEmailClient email = new EmailClient();
        ITaxAddition taxAddition = new TaxAddition();
        OrderService orderService = new OrderService(email,taxAddition,iDb);

        orderService.checkout("a@shop.com", 100.0);
    }
}
