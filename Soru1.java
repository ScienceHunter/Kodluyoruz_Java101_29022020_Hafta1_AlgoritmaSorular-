import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		/*
		 * Soru1: String tipinde sabit bir �ifre de�i�keni olu�turunuz. �rne�in: String
		 * password = "12345"; gibi. Ard�ndan, kullan�c�dan klavyeden bir �ifre
		 * girmesini isteyiniz. Girilen �ifre ile de�i�kende tuttu�unuz de�eri
		 * k�yaslay�n�z. E�er, iki de�er birbirine e�itse ekrana "Giri� Ba�ar�l�!",
		 * de�ilse "Giri� Ba�ar�s�z" yazd�r�n�z.
		 */
		/*
		 * Merak etti�im husus hakk�nda 1. Y�ntem ve 2. Y�ntem olarak daha rahat �ekilde
		 * ay�rman�n bir yolu var m�? Bir di�er soruda �u: if-else ile soru i�areti
		 * operat�rlerinden ikiside a��kken neden ��yle bir hata olu�uyor? L�tfen
		 * �ifrenizi giriniz:12826 Giri� Ba�ar�l�! L�tfen �ifrenizi giriniz:Exception in
		 * thread "main" java.util.NoSuchElementException at
		 * java.util.Scanner.throwFor(Unknown Source) at java.util.Scanner.next(Unknown
		 * Source) at Soru1.main(Soru1.java:41)
		 */
//1. Y�ntem		if-else
		/*
		 * �nceden sistemde kay�tl� olan �ifre String olarak tan�mlan�r. Kullan�c�dan
		 * �ifre girmesi istenir. Klavyeden girilen �ifre ile sistemdeki �ifre
		 * kar��la�t�r�l�r. �ki dizgi kar��la�t�r�l�rken == operat�r� yerine equals
		 * kullan�l�r.
		 */
		String sifre = "12826";
		System.out.print("L�tfen �ifrenizi giriniz:");
		Scanner klavye = new Scanner(System.in);
		String sonuc = klavye.next();

		klavye.close();
		if (sonuc.equals(sifre)) {
			System.out.println("Giri� Ba�ar�l�!");
		} else {
			System.out.println("Giri� Ba�ar�s�z!");
		}
//2. Y�ntem 	Soru ��areti Operat�r� ile

		/*
		 * String sifre1 = "12826"; System.out.print("L�tfen �ifrenizi giriniz:");
		 * Scanner klavye1 = new Scanner(System.in); String sonuc1 = klavye1.next();
		 * 
		 * String son = (sonuc1.equals(sifre1)) ? "Giri� Ba�ar�l�!" :
		 * "Giri� Ba�ar�s�z!"; System.out.println(son); klavye1.close();
		 */

	}

}
