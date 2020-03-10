
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
 * Printer s�n�f� i�inde statik metot kullan�lmas�n�n nedeni metota ula��m�n
 * nesneden ba��ms�z olmas�ndand�r. Yaln�zca s�n�fa ait tek bir de�i�ken gibi
 * hareket eder. Bu tasar�m ve kullan�m a��s�ndan bir kullan�m kolayl��� sa�lar.
 */
