package kodlamaio.northwind.bussines.abstracts;

import java.util.List; //list java utilden import edilir

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {

	List<Product> getAll();//buradaki product kodlamaio.northwind.entities.concretes.Productda olan product
	
	
	
}
