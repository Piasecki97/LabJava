package lab4;

public class Zad5 {
	/**
	 * Tworzy tablicê z losowymi wartoœciami w przedzia³ach:\n
	 * indeks	wartoœæ
	 * 0-10		1-5
	 * 11-20	6-10
	 * 21-30	11-55
	 * 31-39	60-75
	 * @param size
	 * @return
	 */
	public static int[] arrWithRandomNumber(int size) {
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			if(i<11) {
				arr[i] = (int) (Math.random()*4+1);
			} else if(i<21) {
				arr[i] = (int) (Math.random()*4+5);
			} else if(i<31) {
				arr[i] = (int) (Math.random()*44+11);
			} else if(i<40) {
				arr[i] = (int) (Math.random()*15+60);
			} else {
				arr[i] = (int) (Math.random()*1000+141);
			}
		}
		return arr;
	}
}
