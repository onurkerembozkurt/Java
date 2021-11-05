
public class KrediUI {//userinterface siz managerde yazdýgýnz kodlarý arayüzde çaðýrýsýnýz
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.hesapla();
	}
	/*
	 * sýra sýra öðretmen, tarým için kredi oluþturmak yerine ki
	 * ilerde diyelim asker kredi de gelebilir hepsi için ayrý fonksyion oluþturmamýz gerekir
	 * ama base krediden miras aldýklarý için onlara basekredi den ulaþabilirim
	 * yani biz burada anneyi verip çocuklarýndan istediklerimizi yollayabiliriz
	 * bu özelliði referans tip olmasý sayesinde yapýyor
	 * 
	 */
}
