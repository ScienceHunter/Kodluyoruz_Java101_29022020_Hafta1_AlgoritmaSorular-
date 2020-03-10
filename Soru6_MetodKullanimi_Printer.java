
public class Soru6_MetodKullanimi_Printer {
	public static String body = "";

	public static void main(String[] args) {
		Soru6_MetodKullanimi_WordDocument.body = ("printWordDocument");
		Soru6_MetodKullanimi_PDFDocument.body = ("printPDFDocument");
		print(Soru6_MetodKullanimi_WordDocument.body);
		print(Soru6_MetodKullanimi_PDFDocument.body);
	}

	public static void print(String b) {
		System.out.println(b);
	}
}

/*
 * Printer sýnýfý içinde statik metot kullanýlmasýnýn nedeni metota ulaþýmýn
 * nesneden baðýmsýz olmasýndandýr. Yalnýzca sýnýfa ait tek bir deðiþken gibi
 * hareket eder. Bu tasarým ve kullaným açýsýndan bir kullaným kolaylýðý saðlar.
 */
