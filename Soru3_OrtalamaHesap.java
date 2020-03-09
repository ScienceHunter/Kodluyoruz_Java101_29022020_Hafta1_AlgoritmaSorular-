public class Soru3_OrtalamaHesap {
	public static int n = 100;
	public static int[] sayilar = new int[n];
	public static double toplam = 0, ortalama;

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
		System.out.print("�retilen say�lar= ");
		SayiUret(sayilar);
		SayilarinToplami(sayilar);
		SayilarinOrtalamasi(toplam);
		System.out.println("Say�lar�n ortalamas�: " + ortalama);
	}

	public static void SayiUret(int[] s) {
		for (int i = 0; i < n; i++) {
			sayilar[i] = (int) (Math.random() * n); // n tane rastgele say� �retir.
			System.out.print(sayilar[i] + " ");
		}
	}

	public static void SayilarinToplami(int[] s) {
		for (int i = 0; i < sayilar.length; i++) {
			toplam = toplam + sayilar[i];
		}
		System.out.println("\nSay�lar�n toplam�= " + toplam);
	}

	public static double SayilarinOrtalamasi(double t) {

		return ortalama = toplam / sayilar.length;
	}

}
