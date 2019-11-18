package lab3;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		rollAndGuess();
	}
	public static void rollAndGuess() {
		int rolledNum = (int) Math.round((Math.random()*200)+1);
		boolean guessedNum = false;
		do {
			System.out.println("Podaj liczbê miêdzy 1-200:");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(rolledNum < num) {
				System.out.println("Liczba za du¿a");
			} else if(rolledNum > num) {
				System.out.println("Liczba za ma³a");
			} else {
				System.out.println("Poprawnie!");
				guessedNum = true;
				sc.close();
			}
		} while (!guessedNum);
	}
}
