//invoker
import java.util.ArrayList;
import java.util.List;

public class Coach {
    private List<Order> orderlist = new ArrayList<>();
    
    public void setOrder(Order order){
        orderlist.add(order);

    }

    public void giveOrders() {
        for (Order order : orderlist) {
            order.execute();
        }
        orderlist.clear();
    }

    
}
