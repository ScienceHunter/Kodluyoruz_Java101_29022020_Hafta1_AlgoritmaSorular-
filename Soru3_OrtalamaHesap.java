public class Soru3_OrtalamaHesap {
	public static int n = 100;
	public static int[] sayilar = new int[n];
	public static double toplam = 0, ortalama;

	public static void main(String[] args) {
		/**
		 * Soru_3 Rastgele sayýlardan oluþmuþ 100 elemanlýk tamsayý dizisindeki tüm
		 * elemanlarýn ortalamasýný alacak programý geliþtiriniz. Programý yazarken
		 * aþaðýdaki özelliklere uygun yazýnýz.
		 * 
		 * Rastgele oluþan 100 elemanlýk sayý kümesi program yeniden her baþlatýldýðýnda
		 * deðiþsin. Sabit elemanlý bir dizi vermeyiniz! Ortalama almayý saðlayacak kodu
		 * bir fonksiyon halinde tasarlayýnýz. Ýçine diziyi girdi (input) olarak alsýn.
		 * Ortalama alan fonksiyon ortalamayý ondalýklý sayý olarak döndürsün. (return)
		 * etsin.
		 */

		System.out.println("Bu program rastgele 100 elemanlý tamsayý dizisindeki sayýlarýn ortalamasýný bulur.");
		System.out.print("Üretilen sayýlar= ");
		SayiUret(sayilar);
		SayilarinToplami(sayilar);
		SayilarinOrtalamasi(toplam);
		System.out.println("Sayýlarýn ortalamasý: " + ortalama);
	}

	public static void SayiUret(int[] s) {
		for (int i = 0; i < n; i++) {
			sayilar[i] = (int) (Math.random() * n); // n tane rastgele sayý üretir.
			System.out.print(sayilar[i] + " ");
		}
	}

	public static void SayilarinToplami(int[] s) {
		for (int i = 0; i < sayilar.length; i++) {
			toplam = toplam + sayilar[i];
		}
		System.out.println("\nSayýlarýn toplamý= " + toplam);
	}

	public static double SayilarinOrtalamasi(double t) {

		return ortalama = toplam / sayilar.length;
	}

}
