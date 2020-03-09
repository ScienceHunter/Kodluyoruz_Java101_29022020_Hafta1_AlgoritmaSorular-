
public class Soru4_SekilCizimi {

	public static void main(String[] args) {
		/*
		 * Soru4: Aşağıdaki görüntöyö konsol ekranına yazdıran algoritmayı tasarlayınız.
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 *******
		 ********
		 *********
		 **********
		 * 
		 */

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
