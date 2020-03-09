
public class Soru3_OrtalamaHesap {

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
		int[] sayilar = new int[100];
		for (int i = 0; i < 100; i++) {
			sayilar[i] = (int) (Math.random() * 100);

		}
	}
	public static 

}
