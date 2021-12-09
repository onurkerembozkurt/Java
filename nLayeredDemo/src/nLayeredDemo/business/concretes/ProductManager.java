package nLayeredDemo.business.concretes;
import java.util.List;
import nLayeredDemo.business.abstracs.IProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.IProductsDao;
import nLayeredDemo.entities.concretes.Product;



public class ProductManager implements IProductService {
 
	private IProductsDao productDao;
	private LoggerService loggerService;
	

	public ProductManager(IProductsDao productDao, LoggerService loggerService) {
	super();
	this.productDao = productDao;
	this.loggerService=loggerService;

	
	/*Bunun sayesinde hybernateProductDao ya baðlý deðiliz
	 * ama hybernate in ProductDao nun refereansý tutabilen interface
	 * sayesinde kolayca ekleme yapabileceðiz
	 * 
	 * 
	 */
}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		//Ýþ kodlarý
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride Ürün Kabul Edilmiyor");
			return;//metod iþi bitirir burada aþaðý bakmaz olayý bitirir
			
		}
		//HibernateProductDao dao=new HibernateProductDao();
		//dao.add(product);
		//bu çok yanlýþ baðýmlý hale geliyoruz
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi: "+product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}//iþ kodlarýný yapan sýnýftý

	
	
	
	
}
