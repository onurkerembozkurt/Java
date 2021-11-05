// dikkat edin product Manager demedim 
/*Ürün manager i ilerde konuþucaz katmanlý yapýlarda
 * adý üstünde manage ediyor
 * ama ürün ama adý üstünde 
 * bu ürünün özellikleri nedir
 * adý leptop
 * rengi siyah
 * 15 incj
 * aðýrlýgý bla bla özellikler verirsiniz
 * fiyatýný verirsiniz bla bla
 * bir class attribute yani özellik barýndýrýr
 * peki arkadaþlar bir ürünün neleri var
 * 
 */
public class Product {
	public Product(int id, String name,String Descripton, double price, int stockAmount,String renk ) {
		System.out.println("Yapýcý blok çalýþtý");
		this.id=id;
		this.name=name;
		this.description=Descripton;
		this.price=price;
		this.stockAmount=stockAmount;
		this.renk=renk;
		
		
	}
	
	/*
	///biz bunlarý burada tutmuþ olduk bunlar bildiðimiz deðiþken
	//bunlara ayný zamanda attribute||field diyebiliriz.
	 * //tr de baþka kerem yok ama olabilir bizi ayýran tc kimlik gibi düþün prmiary key
	private int id;// bir ürüünün id si var id ürünü tanýmlayan eþsiz deðerdir
	
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	*/
	
	
	// Single responsbility bir class bir amaç uðruna oluþturulmalýdýr ona 
			//birden fazla amaç yüklersen karýþýklýk oluþur.
	//yurt dýþýnda da yapýlan hata manager a yazýalcak fonksiyonlar buraya yazýlýyor yanlýþ yazýlamaz.
///---------------------
	//Encapsulation Ýhtiyacýný Anlamak
	//Encapsulation, kapsülleme dediðimiz bir yöntemdir.Kullanýcýyý herhangi 	
	/*bir alaný(field) kullanmak için kýsýtlamyý öngörür
	 * ayný zamanda diyelim siz ürünleri
	 * String name;
	String description;
	double price;
	int stockAmount;
	String renk;
		
	 * þeklinde tanýmladýgýnýz zaman public olarak iþaretlemiþ oluyorsnuz
	 * peki nedir bu public 
	 * public her yerden ulaþýlabilir demek mesala product managerdan producta ulaþabiliyorduk classlardan
	 * eðer bunlarýn baþýna yani bu alanlardan birinin baþýna private yazarsan
	 * sadece tanýmlandýgý blokta geçerlidir demektir private
	 * demekki bu product class ýnýn içinde her yerde geçerli demek
	 * 
	 * 
	 */
	////////////////////////////////////////////
	/*Getter ve Setterlarý konuþucaðýmýzý söyledik
	 * Get= getir ve al demek bir deðeri okumayý yönelik iþlemdir
	 * Set=kurmak, ayarlamak gibi deðerin deðerini atama deðerini yenileme anlamý olur.
	 * Encapsulation için fieldlarýmzý private yaptýk ve bunun sonucuyla bunlarý kullanabilmek için bir þekilde
	 * ayarlama yapmamýz gerek
	 * 
	 * 
	 */
private int id;// bir ürüünün id si var id ürünü tanýmlayan eþsiz deðerdir
	
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	public int getId() {
		return id; // id yi okuyabilir demek
		
	}
	//setter
	public void setId(int id) {
	this.id=id;//this.id diyince bu classdaki tanýmlanmýþ fielddaki id yi içinkullanýcýnýn tanýmladýgý id yi ata demek
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	/*Biz encapsulation dan yararlanmak için ne yaptýk?
	 * bunun fieldlarýný getter ve setter la daha kullanýlýr hala getirdik
	 * BU noktada constructor lar ise class ý newlediðinizde çalýþan bloðu devreye sokmuþ oluyorsunuz.
	 * yukarda 
	 * public Product() {
		System.out.println("Yapýcý blok çalýþtý");
		}
		þekilde tanýmladýk ve mainde new lediðimiz için çoktan çalýþtý
		bu noktada product classýna baktýgýmýzda
		public Product(int id, String name,String descripton, double price, int stockAmount,String renk ) {
		System.out.println("Yapýcý blok çalýþtý");
	}
	bu þekilde parametre yazdýgýmýz zaman sadece bu parametreler girilirse constructor çalýþcak demek oluyor
	main e baktýgýmýz zaman Product product=new Product(); parantez içi hata verecek
	böylece bunu biz constructor bloðundan set edebiliriz ama istemezsek overloading yaparak
	product() yaparak yani bu claas içerisine product() yazarak bunu yapabiliriz
	böyle mainde öncede yaptýgýmýz gibi tanýmlamalarý kullanabiliriz
	Product product=new Product();
	product.setName("Laptop");
	product.setId(1);
	product.setDescription("Asus Laptop")
	product.setPrice(5000);
	product.setStockAmount(3);
	
	
		
	 */
}
