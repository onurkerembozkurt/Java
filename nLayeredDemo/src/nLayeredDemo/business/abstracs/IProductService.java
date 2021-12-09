package nLayeredDemo.business.abstracs;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface IProductService {
void add(Product product);
List<Product> getAll();

}
