
public class Soru3_OrtalamaHesap {

	public static void main(String[] args) {
		/**
		 * Soru_3 Rastgele say�lardan olu�mu� 100 elemanl�k tamsay� dizisindeki t�m
		 * elemanlar�n ortalamas�n� alacak program� geli�tiriniz. Program� yazarken
		 * a�a��daki �zelliklere uygun yaz�n�z.
		 * 
		 * Rastgele olu�an 100 elemanl�k say� k�mesi program yeniden her ba�lat�ld���nda
		 * de�i�sin. Sabit elemanl� bir dizi vermeyiniz! Ortalama almay� sa�layacak kodu
		 * bir fonksiyon halinde tasarlay�n�z. ��ine diziyi girdi (input) olarak als�n.
		 * Ortalama alan fonksiyon ortalamay� ondal�kl� say� olarak d�nd�rs�n. (return)
		 * etsin.
		 */

		System.out.println("Bu program rastgele 100 elemanl� tamsay� dizisindeki say�lar�n ortalamas�n� bulur.");
		int[] sayilar = new int[100];
		for (int i = 0; i < 100; i++) {
			sayilar[i] = (int) (Math.random() * 100);

		}
	}
	public static 

}
