package be.module.eShop.webshop.repository;

import org.springframework.data.repository.CrudRepository;
import be.module.eShop.webshop.entity.OrderLine;

public interface OrderLineRepository extends CrudRepository<OrderLine, Long> {
}
