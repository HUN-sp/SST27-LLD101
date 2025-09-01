import com.example.orders.*;
import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);

        List<OrderLine> lines = List.of(l1, l2);
        DiscountPolicy discount = new PercentageDiscount(10);

        Order o = new Order("o2", "a@b.com", lines, discount, false, "First order");

        System.out.println("Before: " + o.totalAfterDiscount());

        try {
            lines.set(0, new OrderLine("A", 999, 200));
        } catch (UnsupportedOperationException e) {
            System.out.println("List is immutable: " + e.getMessage());
        }

        System.out.println("After: " + o.totalAfterDiscount());
        System.out.println("=> Totals remain stable due to defensive copies.");
    }
}
