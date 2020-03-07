public class Soru5_TekCiftBulma {

	public static void main(String[] args) {
		/*
		 * Soru5: Rastgele sayýlardan oluþan 100 elemanlýk tamsayý dizisi oluþturunuz.
		 * Ardýndan tek ve çift sayýlarý bulan bir program yazýnýz.
		 */
		System.out.println("Bu program rastgele 100 elemanlý tamsayý dizisinde tek ve çift sayýlarý bulur.");
		int[] sayilar = new int[100];
		for (int i = 0; i < 100; i++) {
			sayilar[i] = (int) (Math.random() * 100);
			// System.out.print(sayilar[i] + " ");
			if (sayilar[i] % 2 == -1 || sayilar[i] % 2 == 1) {
				System.out.println(sayilar[i] + "=TEK");
			}
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + "=ÇÝFT");
			}
		}

	}

}
