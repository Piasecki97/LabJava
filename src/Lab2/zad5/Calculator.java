package Lab2.zad5;

public class Calculator {

	public static double add(double a, double b) {
		return a+b;
	}

	public static double subtract(double a, double b) {
		return a-b;
	}

	public static double multiply(double a, double b) {
		return a*b;
	}

	public static double divide(double a, double b) throws Zad5Exception {
		if(b == 0) {
			throw new Zad5Exception();
		} else {
			return a/b;
		}
	}
}
