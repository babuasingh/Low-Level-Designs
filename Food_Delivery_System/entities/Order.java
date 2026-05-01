package Food_Delivery_System.entities;

import Food_Delivery_System.ObserverDesign.OrderObserver;
import Food_Delivery_System.StateDesign.OrderStatusState;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private Customer customer;
    private Restaurant restaurant;
    private OrderStatusState orderStatusState;
    private OrderItems orderItems;
    private List<OrderObserver> orderObservers ;

    public Order(Customer customer, Restaurant restaurant, OrderStatusState orderStatusState, OrderItems orderItems) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.orderStatusState = orderStatusState;
        this.orderItems = orderItems;
        this.orderObservers = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public OrderStatusState getOrderStatusState() {
        return orderStatusState;
    }

    public OrderItems getOrderItems() {
        return orderItems;
    }

    public void setOrderStatusState(OrderStatusState orderStatusState) {
        this.orderStatusState = orderStatusState;
        notifyObserrvers();
    }

    public void updateNextOrderStatus(){
        orderStatusState.next(this);
    }

    public void addObserver(OrderObserver observer){
        orderObservers.add(observer);
    }

    public void notifyObserrvers() {
        orderObservers.forEach(observer -> observer.OnUpdate(this));
    }

}
