package Chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_54
 * Date: 2017-10-31
 * Time: 오전 9:15
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Customer addOrder(Order order) {
        orders.add(order);
        return this;
    }

    public class Order {
        private int id;

        public Order(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }

}
