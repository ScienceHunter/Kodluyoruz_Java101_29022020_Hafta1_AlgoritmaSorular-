import java.util.Scanner;

public class Soru2_HesapMakinesi {

	public static void main(String[] args) {
		/*
		 * Kullanýcýnýn konsol ekranýndan 4 temel matematiksel iþlemi yapabildiði bir
		 * program yazmanýz bekleniyor. Program aþaðýdaki özellikleri saðlamalýdýr.
		 * 
		 * Yapýlabilecek temel iþlemler: Toplama, Çýkarma, Çarpma, Bölme Kullanýcýya 4
		 * iþlemden birini seçeceði menüyü konsol ekranýna yazdýrýnýz. Örneðin:
		 * 1-Toplama, 2-Çýkarma vb... Ardýndan kullanýcýdan 2 adet tamsayý tipinde sayý
		 * girmesini isteyiniz. Bu girilen iki sayýyý deðiþkenlerde saklayýnýz. Seçilen
		 * iþlem tipine göre matematiksel iþlemi yapýnýz ve konsol ekranýna yazdýrýnýz.
		 */

		System.out.println(
				"Hesap Makinesi Uygulamamýza hoþgeldiniz. Lütfen yapmak istediðiniz iþlemi seçiniz: 1-Toplama, 2-Çýkarma, 3-Çarpma, 4-Bölme");
		int sayi1, sayi2, islem;
		Scanner klavye = new Scanner(System.in);
		islem = klavye.nextInt();
		System.out.print("Ýþlemini yapmak istediðiniz ilk tamsayýyý giriniz: ");
		sayi1 = klavye.nextInt();
		System.out.print("Ýþlemini yapmak istediðiniz son tamsayýyý giriniz: ");
		sayi2 = klavye.nextInt();
		klavye.close();
		switch (islem) {
		case 1:
			System.out.println("Sayýlarýn toplamý: " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
			break;
		case 2:
			System.out.println("Sayýlarýn farký: " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
			break;
		case 3:
			System.out.println("Sayýlarýn çarpýmý: " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
			break;
		case 4:
			System.out.println("Sayýlarýn bölümü: " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));
			break;

		default:
			System.out.println("Lütfen sadece tamsayý giriniz. Yaptýðýnýz iþlem geçersiz!");
			break;
		}

	}

}
