package varie;

public class ArrayInteri {

	public static void main(String[] args) {

		

		/*
		 * boolean result = false;
		 * 
		 * for (int i = 0; i < arrayInteri.length - 2; i++) {
		 * 
		 * int j = i + 1;
		 * 
		 * while (j < arrayInteri.length && arrayInteri[i] == arrayInteri[j]) {
		 * 
		 * j++; }
		 * 
		 * if (j - i >= 3) {
		 * 
		 * result = true;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * if (result) { System.out.println("\nTre consecutivi"); } else {
		 * System.out.println("\nNO");
		 * 
		 * }
		 */
		int[] arrayInteri = { 8, 31, 31, 6, 32, 93, 3, 90, 8, 44 };

		boolean doppio = false;
		
		for (int x : arrayInteri) {
			for (int y : arrayInteri) {

				if (y * 2 == x) {
					doppio = true;
				}
			}

		}
		if (doppio) {
			System.out.println("\nDoppio uno dell' altro");
		} else {
			System.out.println("\nNO");

		}

	}

}
