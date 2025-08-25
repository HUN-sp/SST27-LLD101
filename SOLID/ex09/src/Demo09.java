public class Demo09 {
    public static void main(String[] args) {
        DBOrderRepo repo = new SqlOrderRepository();
        OrderController orderController =  new OrderController(repo);
        orderController.create("ORD-1");
       
    }
}
