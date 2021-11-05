
public class Main {
	//claslarla çalýþmamýzýn sebebi gündelik hayattta insanlarýn ihtiyacý deðiþtiði için insanlarýn ihtiyacýna göre
	//direnmeyen programlar yapmamýz gerekir.
	/*Classlarla baþlayalým sonra soyutlama kýsmýna geçelim
	* class olayý interface olayý ve abstack olay syntax olarak bilinir ama 
	* kullanýlmýyor
	* Class ýn özellikleri
	* classlarla gruplama yapýyoruz(yazdýgýmýz metotlarý fonskiyonlarý vesayre)
	*
	*
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// normal deðiþken oluþturur gibi bu sefer int yerine class yazýcaz
		//böyle dediðimiz bellekte customer manager ürettik
		//classlar reference tiptir. bellekte stack da adres heap de obje oluþturur
		//CustomerManager customerManager; bellekte oluþuyor
		//classlarý kullanambilmek için newlenmiþ olmasý lazým
		//new yazdýgýmýz zaman Belleðin Heap kýsmýnda obje yani nesne yani customer manager nesnesi oluþuyor
		//stackde customerManager; heapdeki objenin adresini tutuyor
		/*mesala customerManager2 diyip olustursam onunda stack ve heapde gerekli þeyleri oluþuyor
		 * ben eðer customerManager2 nin update veya add fonksiyonunu kullanacaksam onun
		 * heap indeki fonksiyonlarý kullanmýþ oluyorum
		 * þimdi aþaðýda bunlarý birbirine atayacam
		 * yani
		 * customerManager=customerManager2;
		 * böyle biþi yaparsam
		 * diyelim customerManagerin bellekteki yeri 101(stack)
		 * customerManager2 nin bellekteki yeri 102 (stack )ü
		 * bunu yaptýgýmýzda 102 nini adresini customer manager a ata demek
		 * 
		 * yani artýk ikiside 102 ye gidiyor
		 * new diyince heapte nesne oluþturuyordu
		 * böyle olunca 101 boþta kaldý
		 * birazdan garbage collecter gelip 101 deki boþ kalan yeri siliyor yani java nýn bellek yöneticisi
		 * bir programcý new oluþtururken dikkat etmesi lazým her zaman
		 *///////////////////////////////////////////////////////////////////////////
		/*Çok Önemli-deger ve referans tipleri anlamak
		 * bunlara value type denir
		 * 
		 * int sayi1=10;
		 * int sayi2=20;
		 * sayi2=sayi1;
		 * sayi1=30;
		 * peki bu value typle ler nasýl çalýþýyr
		 * stack ve heap olsun
		 * siz deðer tipte bir þey tanýmladgýnýz zaman stack te oluþuyor
		 * diðerinde ise yani refarance tipte deðeri heapte oluyor
		 * sayi2=20 dedik
		 * deger tipleri okurken sayi2 nin deðeri sayi 1 in deðerine ata dediðimizde ikiside 10 oluyor
		 * sonra sayi 1 i 30 yapmýþýz 
		 * þimdi size bir soru daha 
		 * int [] sayilar1=new int[]{1,2,3};
		 * int[] sayilar2=new int[]{4,5,6};
		 * sayilar2=sayilar1;
		 * sayilar1[0]=10;
		 * System.out.println(sayilar2[0])
		 * dediðigimizde ne olur sizce
		 * arkadaþlar diziler referans tiptir
		 * türü ne olursa olsun dizilerde ayný class gibi referans tiptir
		 * diyelim Stack de
		 * s1 101
		 * s2 102
		 * heapte 101 123
		 * 		102 4 5 6
		 * sayilar2=sayilar1 sonrasýnda bu deðiþkenlerin ikiside 123 yani 101 li olan adresi tutuyor
		 *  
		 * 
		 */
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		customerManager=customerManager2;
		
	
		
		
	}


}
