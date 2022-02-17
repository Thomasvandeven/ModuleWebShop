package be.module.eShop.webshop.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import be.module.eShop.webshop.entity.CustomerOrder;

public interface OrderRepository extends CrudRepository<CustomerOrder, Long> {

  @Query("SELECT o FROM CustomerOrder AS o WHERE o.dispatched = 1")
  List<CustomerOrder> findAllDispatchedOrders();

  @Query("SELECT o FROM CustomerOrder AS o WHERE o.dispatched = 0")
  List<CustomerOrder> findAllNotDispatchedOrders();
}
