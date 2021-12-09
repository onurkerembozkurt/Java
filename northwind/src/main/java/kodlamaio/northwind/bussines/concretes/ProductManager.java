package kodlamaio.northwind.bussines.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.bussines.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();//bu fonksiyon bize bütün dataları getirecektir
		
	}
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	
	
}
//notlar1-> instance nedir bak
//springte ayrıca nasıl configure edilir bak
//spring hakkında okuma yap


/*Şimdi spring nasıl çalışıyor ?
 * normal şartlarda burada injection nun yapılabilmesi için 
 * ezbere yapmayın productdao bir interface->jpa repo ya gidiyom o da bir interface burada class yok
 * bunlar jenerik olarak arka planda çalışıyor
 * bizim burada verdiğimiz değerlere göre arka tarafta spin bir repositry class ı oluştuyor yani instance oluşturdu
 * ve instance i buraya verecek yani bu instance i almak için
 * bu interface ile oluşturulan constructon using fields a Autowired anatosyonu ekleyelim ki;
 * Autowired springten geliyor
 * beans factory yani proje class i productdao nun instance i olabilecek bir tane sınıf üretiyor ve
 * bunu spring yapıyor arka plande
 *normalde autowired i başka bir yerde de yazabilriiz burada illah const using fielda yazmamıza gerek yok
 * Yani bu da böyle
 * productdao yu bize enjekte edecek ortamı vermiş olacak
 * aynı mantıkla burada 
 * @Service
public class ProductManager implements ProductService{ bir

 *bir tane anatasyon veriyoruz
 *yani bu demektirki bu class bu projede serviceing görevini görecek
 *
 * 
 */

