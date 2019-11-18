package lab4;

public class Zad4 {

	/**
	 * Tworzy tabliczkê mno¿enia do wartoœci parametru @param dimension
	 * @param dimension
	 * @return
	 */
	public static int[][] createMultiplyArray(int dimension) {
		int[][] arr = new int[dimension][dimension];
		for(int i=0; i<dimension ; i++) {
			for(int j=0; j<dimension; j++) {
				if(i == 0)  {
					arr[i][j] = j+1;
				} else if(j == 0) {
					arr[i][j] = i+1;
				} else {
					arr[i][j] = arr[i][0] * arr[0][j];
				}
			}
		}
		return arr;
	}

	/**
	 * Zlicza œrednie dla ka¿dej z kolumn
	 * @param arr
	 * @return
	 */
	public static double[][] average(int[][] arr) {
		double[][] arr2 = new double[1][arr.length];
		double sum = 0;
		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr.length; j++) {
				sum += arr[i][j];
			}
			arr2[0][i] = sum/arr[0].length;
			sum = 0;
		}
		return arr2;
	}
}
