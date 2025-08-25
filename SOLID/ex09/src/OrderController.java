public class OrderController {
    private DBOrderRepo repo;
    OrderController(DBOrderRepo repo){
        this.repo = repo;
    }
    void create(String id){
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}