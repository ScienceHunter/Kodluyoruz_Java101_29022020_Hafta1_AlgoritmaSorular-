
public class Soru6_MetodKullanimi_PDFDocument {
	public static String body = "";

	public static void main(String[] args) {
		/*
		 * Soru6: PDFDocument isminde bir s�n�f yarat�n�z. Ard�ndan, WordDocument
		 * isminde bir s�n�f tasarlay�n�z. Bu iki s�n�f i�inde String body = ""; isminde
		 * bir tane nesne de�i�keni tan�mlay�n�z. Tan�mlanan bu "body" isimli
		 * de�i�keninin tutaca�� veriyi kurucu metot vas�tas�yla g�nderiniz. S�n�f�n
		 * i�inde "body" de�i�kenine ait de�eri d��ar�ya d�nd�recek "getBody" isimli bir
		 * metot yaz�n�z.
		 * 
		 * Yukar�daki i�lemlerin ard�ndan Printer isminde bir s�n�f tan�mlay�n�z.
		 * "printPDFDocument" isminde PDF dok�man�na ait "body" bilgisini konsol ekrana
		 * yazd�ran bir metot tan�mlay�n�z. Ayn� �ekilde "printWordDocument" isminde
		 * Word dok�man�n� konsol ekrana yazd�ran bir metot tan�mlay�n�z. Bu metotlar�
		 * "static" tan�mlaman�z gerekmektedir.
		 * 
		 * Ard�ndan main fonksiyonu i�inde PDFDocument ve WordDocument nesneleri
		 * olu�turunuz. Bu nesnelere ait body bilgisini ekrana yazd�rmak i�in "Printer"
		 * s�n�f�n�n metotlar�n� kullan�n�z.
		 * 
		 * Not: Print s�n�f� i�inde ni�in statik metot kulland���m�z� k�saca
		 * a��klay�n�z.
		 */
		// b.getBody(body);
	}

	public Soru6_MetodKullanimi_PDFDocument(String b) {
		body = b;
	}

	public String getBody(String b) {
		return body;
	}
}
