public class Soru5_TekCiftBulma {

	public static void main(String[] args) {
		/*
		 * Soru5: Rastgele say�lardan olu�an 100 elemanl�k tamsay� dizisi olu�turunuz.
		 * Ard�ndan tek ve �ift say�lar� bulan bir program yaz�n�z.
		 */
		System.out.println("Bu program rastgele 100 elemanl� tamsay� dizisinde tek ve �ift say�lar� bulur.");
		int[] sayilar = new int[100];
		for (int i = 0; i < 100; i++) {
			sayilar[i] = (int) (Math.random() * 100);
			// System.out.print(sayilar[i] + " ");
			if (sayilar[i] % 2 == -1 || sayilar[i] % 2 == 1) {
				System.out.println(sayilar[i] + "=TEK");
			}
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + "=��FT");
			}
		}

	}

}
