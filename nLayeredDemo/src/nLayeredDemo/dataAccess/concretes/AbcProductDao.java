package nLayeredDemo.dataAccess.concretes;

import java.util.ArrayList;

import nLayeredDemo.dataAccess.abstracts.IProductsDao;
import nLayeredDemo.entities.concretes.Product;

public class AbcProductDao implements IProductsDao{

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("ABC ile eklendi " + product.getName());
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
