package lab3;

import java.util.ArrayList;
import java.util.List;

public class Zad2 {
	public static void main(String[] args) {
		getDividers(101);
	}
	
	private static List<Integer> getDividers(int num) {
		List<Integer> dividers = new ArrayList<>();
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				dividers.add(i);
			}
		}
		System.out.println(dividers.toString());
		return dividers;
	}

	
}
