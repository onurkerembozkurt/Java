package nLayeredDemo.dataAccess.abstracts;

import java.util.ArrayList;

import nLayeredDemo.entities.concretes.Product;

public interface IProductsDao {
 void add(Product product);
 void update(Product product);
 void delete(Product product);
 Product get(int id);
 ArrayList<Product> getAll();
 
}
