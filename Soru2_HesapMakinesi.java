import java.util.Scanner;

public class Soru2_HesapMakinesi {

	public static void main(String[] args) {
		/*
		 * Kullan�c�n�n konsol ekran�ndan 4 temel matematiksel i�lemi yapabildi�i bir
		 * program yazman�z bekleniyor. Program a�a��daki �zellikleri sa�lamal�d�r.
		 * 
		 * Yap�labilecek temel i�lemler: Toplama, ��karma, �arpma, B�lme Kullan�c�ya 4
		 * i�lemden birini se�ece�i men�y� konsol ekran�na yazd�r�n�z. �rne�in:
		 * 1-Toplama, 2-��karma vb... Ard�ndan kullan�c�dan 2 adet tamsay� tipinde say�
		 * girmesini isteyiniz. Bu girilen iki say�y� de�i�kenlerde saklay�n�z. Se�ilen
		 * i�lem tipine g�re matematiksel i�lemi yap�n�z ve konsol ekran�na yazd�r�n�z.
		 */

		System.out.println(
				"Hesap Makinesi Uygulamam�za ho�geldiniz. L�tfen yapmak istedi�iniz i�lemi se�iniz: 1-Toplama, 2-��karma, 3-�arpma, 4-B�lme");
		int sayi1, sayi2, islem;
		Scanner klavye = new Scanner(System.in);
		islem = klavye.nextInt();
		System.out.print("��lemini yapmak istedi�iniz ilk tamsay�y� giriniz: ");
		sayi1 = klavye.nextInt();
		System.out.print("��lemini yapmak istedi�iniz son tamsay�y� giriniz: ");
		sayi2 = klavye.nextInt();
		klavye.close();
		switch (islem) {
		case 1:
			System.out.println("Say�lar�n toplam�: " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
			break;
		case 2:
			System.out.println("Say�lar�n fark�: " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
			break;
		case 3:
			System.out.println("Say�lar�n �arp�m�: " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
			break;
		case 4:
			System.out.println("Say�lar�n b�l�m�: " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));
			break;

		default:
			System.out.println("L�tfen sadece tamsay� giriniz. Yapt���n�z i�lem ge�ersiz!");
			break;
		}

	}

}
