package lab4;

public class Zad6 {
	/**
	 * Tworzy tablicê znaków sk³adaj¹c¹ siê na alfabet
	 * @return
	 */
	public static char[] createCharArr() {
		char[] alphabet = new char[0];
		int nextChar = 'A';
			do {
				char c = (char) nextChar;
				char[] alphabet2 = new char[alphabet.length + 1];
				for(int j=0; j<alphabet.length; j++) {
					alphabet2[j] = alphabet[j];
				}
				alphabet = alphabet2;
				alphabet[alphabet.length-1] = c;
				nextChar++;
			} while(alphabet.length == 0 || alphabet[alphabet.length-1] != 'Z');
			System.out.println("Dlugosc alfabetu to: " + alphabet.length);
		return alphabet;
	}
}
