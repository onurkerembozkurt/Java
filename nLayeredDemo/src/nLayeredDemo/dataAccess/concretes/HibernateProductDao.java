package nLayeredDemo.dataAccess.concretes;

import java.util.ArrayList;

import nLayeredDemo.dataAccess.abstracts.IProductsDao;
import nLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements IProductsDao {

	@Override
	public void add(Product product) {
		System.out.println("Hybernate ile eklendi"+product.getName());
		
	}

	@Override
	public void update(Product product) {
		
		
	}

	@Override
	public void delete(Product product) {
		
		
	}

	@Override
	public Product get(int id) {
		
		
		return null;
	}

	@Override
	public ArrayList<Product> getAll() {
		
		return null;
	}

}
