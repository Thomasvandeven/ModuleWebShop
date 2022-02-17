package be.module.eShop.webshop.repository;

import org.springframework.data.repository.CrudRepository;
import be.module.eShop.webshop.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
  Category findByName(String name);
}
