package course.entities;

import course.entities.enums.OrderStatus2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order2 {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus2 status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order2(Date moment, OrderStatus2 status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;

    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus2 getOrderStatus() {
        return status;
    }

    public void setOrderStatus(OrderStatus2 orderStatus) {
        this.status = orderStatus;
    }

    public List<OrderItem> getOrderItems() {
        return items;
    }

    public void addItem(OrderItem orderItem) {
        items.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        items.remove(orderItem);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum = item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append("Client: ");
        sb.append(client).append("\n");
        sb.append("Order items:\n");
        for (OrderItem item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
