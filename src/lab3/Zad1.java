package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zad1 {
	public static void main(String[] args) {
		parseNumber(6543);
	}
	private static void parseNumber(int i) {
		String numberInStrRep = String.valueOf(i);
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>();
		List<Character> chars = new ArrayList<>();
		for(char c : numberInStrRep.toCharArray()) {
			chars.add(c);
		}
		for (char c : chars) {
			int digit = Integer.valueOf(c);
			if(digit%2 == 0) {
				even.add(digit);
			} else {
				odd.add(digit);
			}
		}
		if(!odd.isEmpty() && !even.isEmpty()) {
			//Zwraca stosunek œredniej nieparzystych do parzystych
			double oddAvg = calcAvg(odd);
			double evenAvg = calcAvg(even);
			System.out.println("Stosunek nieparzystych do parzystych to:\n" + oddAvg/evenAvg);
		} else {
			System.out.println("Nie mo¿na obliczyæ stosunku poniewa¿ liczba nie posiada zarówno"
					+ " \nliczb parzystych jak i nieparzystych ");
		}
		//Zwraca czy liczba jest liczb¹ pierwsz¹
		System.out.println("\nCzy liczba jest liczb¹ pierwsz¹?"
				+ "\n" + checkIfPrime(i));
	}
	private static boolean checkIfPrime(int k) {
		for(int i=2; i<k; i++) {
			if(k%i == 0) {
				return false;
			}
		}
		return true;
	}

	private static double calcAvg(List<Integer> list) {
		double max = Collections.max(list);
		double min = Collections.min(list);
		return max+min/2;
	}
}
