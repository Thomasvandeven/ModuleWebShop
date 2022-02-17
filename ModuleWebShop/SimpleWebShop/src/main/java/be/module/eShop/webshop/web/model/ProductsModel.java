package be.module.eShop.webshop.web.model;

import java.util.List;
import be.module.eShop.webshop.entity.Product;

public class ProductsModel {
  List<Product> productsList;

  public ProductsModel(List<Product> productsList) {
    this.productsList = productsList;
  }

  public List<Product> getProductsList() {
    return productsList;
  }

  public void setProductsList(List<Product> productsList) {
    this.productsList = productsList;
  }

}
