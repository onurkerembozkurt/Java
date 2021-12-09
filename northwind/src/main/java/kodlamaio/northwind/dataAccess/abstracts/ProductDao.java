package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	/*burada hangi tabloda hangi id tipiyle repositry oluşmasını söylemiş oluyoruz
	 * product burada az önce oluşturdugumuz class ve buradki kısımların sorgularını integer şeklinde istiyorum
	 * 
	 * 
	 */
		
	
	
}
