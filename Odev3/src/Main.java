
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Person wPerson=new WomanPerson(1,"Ayþe","Bozkurt",2001);
	wPerson.bilgiDogrulama();
	Person mPerson=new ManPerson(2,"Kerem","Bozkurt",2001);
	mPerson.bilgiDogrulama();
	Person ChildPerson=new ChildPerson(3,"Ali","Yýlmaz",2006);
	ChildPerson.bilgiDogrulama();
	Game WhoBuyedGame=new Game();
	WhoBuyedGame.buyGame(ChildPerson);


	

}
}
/*Bir oyun yazmak istiyorsunuz. Bu yazýlým için backend kodlarýný JAVA ile geliþtirmeyi planlýyoruz. Yeni üye, satýþ ve kampanya yönetimi yapýlmasý isteniyor. Nesnelere ait özellikleri istediðiniz gibi verebilirsiniz. Burada amaç yazdýðýnýz kodun kalitesidir. Ödevde gereksinimleri tam anlamadýðýnýz durum benim için önemli deðil, kendinize göre mantýk geliþtirebilirsiniz. Dediðim gibi kod kalitesiyle ilgileniyoruz þu an :)



Gereksinimler

1.     Oyuncularýn sisteme kayýt olabileceði, bilgilerini güncelleyebileceði, kayýtlarýný silebileceði bir ortamý simule ediniz. Müþteri bilgilerinin doðruluðunu e-devlet sistemlerini kullanarak doðrulama yapmak istiyoruz. (E-devlet sistemlerinde doðrulama TcNo, Ad, Soyad, DoðumYýlý bilgileriyle yapýlýr. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)

2.     Oyun satýþý yapýlabilecek satýþ ortamýný simule ediniz.( Yapýlan satýþlar oyuncu ile iliþkilendirilmelidir. Oyuncunun parametre olarak metotta olmasýný kastediyorum.)

3.     Sisteme yeni kampanya giriþi, kampanyanýn silinmesi ve güncellenmesi imkanlarýný simule ediniz.

4.     Satýþlarda kampanya entegrasyonunu simule ediniz.

5.     Ödevinizi Github’a yükleyiniz. Github linkinizi paylaþýnýz.

6. Diðer arkadaþlarýnýnýz Github kodlarýný inceleyiniz. Ona yýldýz vermeyi unutmayýnýz :)
*/