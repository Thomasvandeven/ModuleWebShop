package be.module.eShop.webshop.web.model;

import java.util.ArrayList;
import java.util.List;
import be.module.eShop.webshop.entity.CustomerOrder;

public class AdminOrderModel {
  List<CustomerOrder> orders;

  public AdminOrderModel(List<CustomerOrder> orders) {
    this.orders = orders;
  }

  public AdminOrderModel(Iterable<CustomerOrder> ordersIterable) {
    orders = new ArrayList<>();
    for (CustomerOrder customerOrder : ordersIterable) {
      orders.add(customerOrder);
    }
  }

  public List<CustomerOrder> getOrders() {
    return orders;
  }

  public void setOrders(List<CustomerOrder> orders) {
    this.orders = orders;
  }

}
