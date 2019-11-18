package lab3;

import java.util.Scanner;

public class Zad4 {
	public static void main(String[] args) {
		readNums();
	}
	
	public static void readNums() {
		int multipler = 1;
		boolean stop = false;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Podaj liczbe:");
			int numbr = scan.nextInt();
			if(numbr == 5) {
				System.out.println("Podany zosta³ kod wyjœcia"
						+ "dotychczasowy iloczyn to: "+ multipler);
				stop = true;
				scan.close();
				return;
			} 
			multipler *= numbr;
		} while (!stop);
	}
}
