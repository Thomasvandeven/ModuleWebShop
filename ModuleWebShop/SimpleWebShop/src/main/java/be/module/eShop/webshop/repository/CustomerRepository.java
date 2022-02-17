package be.module.eShop.webshop.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import be.module.eShop.webshop.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
  Optional<Customer> findByUsername(String username);
}
