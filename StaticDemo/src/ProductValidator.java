
public class ProductValidator {
	static {
		System.out.println("Yapýcý blok çalýþtý");
		//static olan ortamda static yapýcý blok çalýþýr
	}
	public static class BaskaBirClass{
		//inner class 
		//class içerisinde class açarsak inner class denir
		
		public static void Sil() {
					
		}
	}
	
	
	
	
	
	
public static boolean isValid(Product product){
if(product.price>0.0&& !product.name.isEmpty()) {
	return true;
	
}else {
	return false;
	
}

}

public void bisey() {
	//bakýn bu static deðil bunu çaðýrmak için new lemek lazým
	
}

}
/*normalde validator.isValid yazýyor aþaðýdaki yazdýgým yerde
 * ki bu olabilsin diye yukarda da new leyip validator diye obje örneði oluþturmuþtuk
 * 
 * if(ProductValidator.isValid(product)) yapýcna gelmiyor
 * gelmesi için yapmamýz gereken;
 * ProductValidator classýna gidip, public static boolean isValid(Product product)
 * yazmak
 * Static ifadesi gene bu nesnenin örneðini oluþturyoýr. Fakat
 * bu statik olarak bir kere oluþuyor
 * ama sadece birkez kullanýlýr sadece isValid gibi utility lerde
 * Peki biz niye uðraþýyor
 * hepsine static yazalým
 * Biz önceden new li oluþturdugumuz zaman bellekte o obje oluþuyordu 
 * sonra o bellekten atýlýyordu iþimiz bitince
 * fakat static yaparsak hiçbir þekilde atýlmaz yani bellekten atýlmaz
 * dikkatli yani önemli sýnýflar yani classlar static yapýlmaz
 * yardýmcý araçlar isvalid kullanýmý için sadece mesala
 * onlar için kullanýlabilir
 * 
 * 
 * 
 */
