public class SqlOrderRepository implements DBOrderRepo{
    public void save(String id){ 
        System.out.println("Saved order " + id + " to SQL"); 
    }
}
