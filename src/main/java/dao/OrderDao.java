package dao;


import Entity.Order;
import java.util.List;

public interface OrderDao {

    void addOrder(Order order);

    Order viewOrderById(int id);

    List<Order> viewOrdersByCustomerName(String name);
}