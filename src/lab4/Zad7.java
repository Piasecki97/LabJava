package lab4;

public class Zad7 {
	/**
	 * Tworzy losow¹ macierz, po przek¹tnej s¹ wartoœci
	 * od 1 do @param squareSize
	 * @param squareSize
	 * @return
	 */
	public static int[][] randomMatrix(int squareSize) {
		int[][] arr = new int[squareSize][squareSize];
		for(int i=0; i<squareSize; i++) {
			for(int j=0; j<squareSize; j++) {
				if(i == j) {
					arr[i][j] = i;
				} else {
					arr[i][j] = (int) (Math.random()*100+1);
				}
			}
		}
		return arr;
	}
}
