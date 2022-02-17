package be.module.eShop.webshop.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import be.module.eShop.webshop.entity.Category;
import be.module.eShop.webshop.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

  @Query("SELECT p FROM Product AS p WHERE p.name LIKE :name")
  List<Product> findByName(String name);

  List<Product> findByCategory(Category category);

  Optional<Product> findByItemNumber(String itemNumber);
}
