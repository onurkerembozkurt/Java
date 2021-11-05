package oopIntro;

public class Main {

	public static void main(String[] args) {
	//////////////////////////////////	
	
	
	Product product2 =new Product();
	
	product2.setId(2);
	product2.setName("Lenovo V15");
	product2.setDetails("16 GB Ram Mýký");
	product2.setDiscount(10);
	product2.setUnitPrice(16000);
	
	System.out.println(product2.getUnitPriceAfterDiscount());
	Category category1=new Category();
	category1.setId(1);
	category1.setName("Drinks");
	/////////////////////////////
	Category category2=new Category();
	category2.setId(2);
	category2.setName("Foods");
	System.out.println(category1.getName());// bunlarý birer sayfa gibi düþün
	// her sayafaya teker teker gitmek yerine category.javadan get name e ! ekleyip otamatik güncellemesinin saðlýyorum
	
	System.out.println(category2.getName());
	// Þimdi Yönetim dedi ki bütün kategorolarin sonuna ! getir
	


	
	
	
	
	


}
	}
