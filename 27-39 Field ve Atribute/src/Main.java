
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product product=new Product();// burada productta product constructoru açmamýz gerek
		Product product=new Product(123, "Kerem","bu çok güzel",6000, 6,"Kýrmýzý");
		
		
			
		
		
		/*
		 * diyelim yukardaki gibi ürünleri yazdýk fakat gerçek hayattaki kullanýmý ne?
		 * siz gerçek hayatta kullanýcýya ekran veriyorsunuz
		 * id yi otamatik arkaplanda oluþturuytorunuz
		 * name için textbox yazýyorsunuz
		 * ürünün açýklamsý diyorsnuz
		 * ürünün stok adetini gir diyorsunnuz
		 * butonu yazýyorsunuz vesayre
		 * peki bu productu kim kullanacak baþka bir class
		 */
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
		
		
	}

	

}
