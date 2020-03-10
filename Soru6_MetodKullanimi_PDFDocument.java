
public class Soru6_MetodKullanimi_PDFDocument {
	public static String body = "";

	public static void main(String[] args) {
		/*
		 * Soru6: PDFDocument isminde bir sýnýf yaratýnýz. Ardýndan, WordDocument
		 * isminde bir sýnýf tasarlayýnýz. Bu iki sýnýf içinde String body = ""; isminde
		 * bir tane nesne deðiþkeni tanýmlayýnýz. Tanýmlanan bu "body" isimli
		 * deðiþkeninin tutacaðý veriyi kurucu metot vasýtasýyla gönderiniz. Sýnýfýn
		 * içinde "body" deðiþkenine ait deðeri dýþarýya döndürecek "getBody" isimli bir
		 * metot yazýnýz.
		 * 
		 * Yukarýdaki iþlemlerin ardýndan Printer isminde bir sýnýf tanýmlayýnýz.
		 * "printPDFDocument" isminde PDF dokümanýna ait "body" bilgisini konsol ekrana
		 * yazdýran bir metot tanýmlayýnýz. Ayný þekilde "printWordDocument" isminde
		 * Word dokümanýný konsol ekrana yazdýran bir metot tanýmlayýnýz. Bu metotlarý
		 * "static" tanýmlamanýz gerekmektedir.
		 * 
		 * Ardýndan main fonksiyonu içinde PDFDocument ve WordDocument nesneleri
		 * oluþturunuz. Bu nesnelere ait body bilgisini ekrana yazdýrmak için "Printer"
		 * sýnýfýnýn metotlarýný kullanýnýz.
		 * 
		 * Not: Print sýnýfý içinde niçin statik metot kullandýðýmýzý kýsaca
		 * açýklayýnýz.
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
