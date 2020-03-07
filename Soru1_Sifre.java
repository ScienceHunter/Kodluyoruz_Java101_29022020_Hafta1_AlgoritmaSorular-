import java.util.Scanner;

public class Soru1_Sifre {

	public static void main(String[] args) {
		/*
		 * Soru1: String tipinde sabit bir şifre değişkeni oluşturunuz. Örneğin: String
		 * password = "12345"; gibi. Ardından, kullanıcıdan klavyeden bir şifre
		 * girmesini isteyiniz. Girilen şifre ile değişkende tuttuğunuz değeri
		 * kıyaslayınız. Eğer, iki değer birbirine eşitse ekrana "Giriş Başarılı!",
		 * değilse "Giriş Başarısız" yazdırınız.
		 */
		/*
		 * Merak ettiğim husus hakkında 1. Yöntem ve 2. Yöntem olarak daha rahat şekilde
		 * ayırmanın bir yolu var mı? Bir diğer soruda şu: if-else ile soru işareti
		 * operatörlerinden ikiside açıkken neden şöyle bir hata oluşuyor? Lütfen
		 * şifrenizi giriniz:12826 Giriş Başarılı! Lütfen şifrenizi giriniz:Exception in
		 * thread "main" java.util.NoSuchElementException at
		 * java.util.Scanner.throwFor(Unknown Source) at java.util.Scanner.next(Unknown
		 * Source) at Soru1.main(Soru1.java:41)
		 */
//1. Yöntem		if-else
		/*
		 * Önceden sistemde kayıtlı olan şifre String olarak tanımlanır. Kullanıcıdan
		 * şifre girmesi istenir. Klavyeden girilen şifre ile sistemdeki şifre
		 * karşılaştırılır. İki dizgi karşılaştırılırken == operatörü yerine equals
		 * kullanılır.
		 */
		String sifre = "12826";
		System.out.print("Lütfen şifrenizi giriniz:");
		Scanner klavye = new Scanner(System.in);
		String sonuc = klavye.next();

		klavye.close();
		if (sonuc.equals(sifre)) {
			System.out.println("Giriş Başarılı!");
		} else {
			System.out.println("Giriş Başarısız!");
		}
//2. Yöntem 	Soru İşareti Operatörü ile

		/*
		 * String sifre1 = "12826"; System.out.print("Lütfen şifrenizi giriniz:");
		 * Scanner klavye1 = new Scanner(System.in); String sonuc1 = klavye1.next();
		 * 
		 * String son = (sonuc1.equals(sifre1)) ? "Giriş Başarılı!" :
		 * "Giriş Başarısız!"; System.out.println(son); klavye1.close();
		 */

	}

}
