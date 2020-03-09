import java.util.Scanner;

public class Soru2_HesapMakinesi {

	public static void main(String[] args) {
		/*
		 * Kullanıcının konsol ekranından 4 temel matematiksel işlemi yapabildiği bir
		 * program yazmanız bekleniyor. Program aşağıdaki özellikleri saklamalıdır.
		 * 
		 * Yapılabilecek temel işlemler: Toplama, çıkarma, çarpma, bölme Kullanıcıya 4
		 * işlemden birini seçeceği menüyü konsol ekranına yazdırınız. Örneğin:
		 * 1-Toplama, 2-Çıkarma vb... Ardından kullanıcıdan 2 adet tamsayı tipinde sayı
		 * girmesini isteyiniz. Bu girilen iki sayıyı değişkenlerde saklayınız. Seçilen
		 * işlem tipine göre matematiksel işlemi yapınız ve konsol ekranına yazdırınız.
		 */

		System.out.println(
				"Hesap Makinesi Uygulamamıza hoşgeldiniz. Lütfen yapmak istediğiniz işlemi seçiniz: 1-Toplama, 2-Çıkarma, 3-Çarpma, 4-Bölme");
		int sayi1, sayi2, islem;
		Scanner klavye = new Scanner(System.in);
		islem = klavye.nextInt();
		System.out.print("İşlemini yapmak istediğiniz ilk tamsayıyı giriniz: ");
		sayi1 = klavye.nextInt();
		System.out.print("İşlemini yapmak istediğiniz son tamsayıyı giriniz: ");
		sayi2 = klavye.nextInt();
		klavye.close();
		switch (islem) {
		case 1:
			System.out.println("Sayıların toplamı: " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
			break;
		case 2:
			System.out.println("Sayıların farkı: " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
			break;
		case 3:
			System.out.println("Sayıların çarpımı: " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
			break;
		case 4:
			System.out.println("Sayıların bölümü: " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));
			break;

		default:
			System.out.println("Lütfen sadece tamsayı giriniz. Yaptığınız işlem geçersiz!");
			break;
		}

	}

}
