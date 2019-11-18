package lab4;

public class Zad3 {
	/**
	 * Wype³nia tablicê o podanym wymiarze 
	 * wartoœciami true lub false zale¿nie od
	 * parzystoœci indeksu
	 * @param dimension
	 * @return
	 */
	public static boolean[] fillBooleanArrayOddEven(int dimension) {
		boolean[] bools = new boolean[dimension];
		for(int i=1; i<=dimension; i++) {
			bools[i-1] = i%2 == 1;
		}
		return bools;
	}
}
