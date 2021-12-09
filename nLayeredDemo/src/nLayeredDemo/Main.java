package nLayeredDemo;

import nLayeredDemo.business.abstracs.IProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
//import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bir projede anlayýn ki entityler hariç newliyorsanýz ilerde problem 
		//yaþayacaðýz
		
		
		//ToDo:Spring IoC ile Çözülecek
		
		IProductService productService=new ProductManager(new AbcProductDao()
				,new JLoggerManagerAdapter());
	
		Product product=new Product(1,2,"elma",12,50);
		productService.add(product);

		
		
		
	}

}
