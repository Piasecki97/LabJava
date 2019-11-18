package Lab2;

import java.util.ArrayList;

import Lab2.zad5.Calculator;
import Lab2.zad5.Zad5Exception;
import Lab2.zad6.Zad6;
import Lab2.zad6.Zad6Exception;

public class Main {
	public static void main(String[] args) {
		System.out.println("Zad2 przeprowadzone z sukcesem:" + testZad2());
		System.out.println("Zad3 przeprowadzone z sukcesem:" + testZad3());
		System.out.println(testZad4());
		try {
			testZad5(4, 5);
		} catch (Zad5Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			testZad6(-100, 10);
//			testZad6(100.35, 96);
//			testZad6(300000, 96);
//			testZad6(0.01, 96);
//			testZad6(0.01, 1);
//			testZad6(300000, 1);
		} catch (Zad6Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static boolean testZad2() {
		Zad2 zad2 = new Zad2();
		return zad2.squareEquation(2, 3, 4)==-23;
	}

	private static boolean testZad3() {
		Zad3 zad3 = new Zad3();
		return zad3.convertMphToKph(21)==33.81;
	}

	private static String testZad4() {
		Zad4 zad4 = new Zad4();
		ArrayList<Double> testList = new ArrayList<>();
		testList.add(2.5);
		testList.add(3.5);
		testList.add(6.21);
		testList.add(14d);
		testList.add(12d);
		testList.add(23d);

		return zad4.designateMinAvgMax(testList).toString();
	}

	private static void testZad5(double a, double b) throws Zad5Exception {
		System.out.println("Suma dodawania " + a + " i " + b + " to " + Calculator.add(a, b));
		System.out.println("Róznica odejmowania " + a + " i " + b + " to " + Calculator.subtract(a, b));
		System.out.println("Wynik mno¿enia " + a + " i " + b + " to " + Calculator.multiply(a, b));
		System.out.println("Wynik dzielenia " + a + " i " + b + " to " + Calculator.divide(a, b));
	}

	private static void testZad6(double a, int b) throws Zad6Exception {
		Zad6 zad6 = new Zad6();
		System.out.println("Test 1\n"
				+ " dane wejsciowe: kwota po¿yczki" + a + " i iloœæ rat" + b + "\n"
						+ "do sp³aty: " + zad6.leasingCalculator(a,b));
	}
}
