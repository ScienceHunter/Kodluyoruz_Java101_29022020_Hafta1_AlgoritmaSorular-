import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		/*
		 * Soru1: String tipinde sabit bir þifre deðiþkeni oluþturunuz. Örneðin: String
		 * password = "12345"; gibi. Ardýndan, kullanýcýdan klavyeden bir þifre
		 * girmesini isteyiniz. Girilen þifre ile deðiþkende tuttuðunuz deðeri
		 * kýyaslayýnýz. Eðer, iki deðer birbirine eþitse ekrana "Giriþ Baþarýlý!",
		 * deðilse "Giriþ Baþarýsýz" yazdýrýnýz.
		 */
		/*
		 * Merak ettiðim husus hakkýnda 1. Yöntem ve 2. Yöntem olarak daha rahat þekilde
		 * ayýrmanýn bir yolu var mý? Bir diðer soruda þu: if-else ile soru iþareti
		 * operatörlerinden ikiside açýkken neden þöyle bir hata oluþuyor? Lütfen
		 * þifrenizi giriniz:12826 Giriþ Baþarýlý! Lütfen þifrenizi giriniz:Exception in
		 * thread "main" java.util.NoSuchElementException at
		 * java.util.Scanner.throwFor(Unknown Source) at java.util.Scanner.next(Unknown
		 * Source) at Soru1.main(Soru1.java:41)
		 */
//1. Yöntem		if-else
		/*
		 * Önceden sistemde kayýtlý olan þifre String olarak tanýmlanýr. Kullanýcýdan
		 * þifre girmesi istenir. Klavyeden girilen þifre ile sistemdeki þifre
		 * karþýlaþtýrýlýr. Ýki dizgi karþýlaþtýrýlýrken == operatörü yerine equals
		 * kullanýlýr.
		 */
		String sifre = "12826";
		System.out.print("Lütfen þifrenizi giriniz:");
		Scanner klavye = new Scanner(System.in);
		String sonuc = klavye.next();

		klavye.close();
		if (sonuc.equals(sifre)) {
			System.out.println("Giriþ Baþarýlý!");
		} else {
			System.out.println("Giriþ Baþarýsýz!");
		}
//2. Yöntem 	Soru Ýþareti Operatörü ile

		/*
		 * String sifre1 = "12826"; System.out.print("Lütfen þifrenizi giriniz:");
		 * Scanner klavye1 = new Scanner(System.in); String sonuc1 = klavye1.next();
		 * 
		 * String son = (sonuc1.equals(sifre1)) ? "Giriþ Baþarýlý!" :
		 * "Giriþ Baþarýsýz!"; System.out.println(son); klavye1.close();
		 */

	}

}
