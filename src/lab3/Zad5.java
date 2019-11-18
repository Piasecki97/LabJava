package lab3;

public class Zad5 {
	public static void main(String[] args) {
		exponentsOfThree(19);
	}
	private static void exponentsOfThree(int num) {
		int thr = 3;
		System.out.println(0);
		for(; num > thr; thr=thr*thr) {
			System.out.println(thr);
		}
	}
}
