package lab4;

public class Zad1 {
	/**
	 * Tworzy tablic� o zadanej wielko�ci wype�nion�
	 * losowymi liczbami (int)
	 * @param size
	 * @return
	 */
	public static int[] createRandArr(int size) {
		int[] arr = new int[size];
		for(int i=0; i<size-1; i++) {
			arr[i] = (int)(Math.random()*51+99);
		}
		return arr;
	}

	/**
	 * Kopiuje i zwraca kopi� podanej tablicy
	 * @param array
	 * @return
	 */
	public static int[] copyArray(int[] array) {
		int[] newArr = new int[array.length];
		for(int i=0; i<newArr.length; i++) {
			newArr[i] = array[i];
		}
		return newArr;
	}
}
