package abstractClasses;

public abstract class GameCalculator {
	

		public abstract void hesapla();
		
		public final void gameOver() {
			System.out.println("Oyun Bitti");
		}
	 
}
/* Abstract class oldugu zaman herkes kendi hesaplasýný yazmak zorunda
 * yani override olucak ve herkes kendi hesabýný yazacak
 * Abstract classlar base sýnýflarý gizlemeye yarar çünkü abstract classlar 
 * tek baþýna kullanmaz yani newlenemez
 * 
 * 
 */

