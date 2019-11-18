package lab4;

public class Zad2 {

	/**
	 * Generuje macie¿ z losowo wype³nionymi indeksami
	 * @param cols
	 * @param rows
	 * @return
	 */
	public static int[][] generateRandMatrix(int cols, int rows) {
		int[][] matrix = new int[cols][rows];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 30 + 1);
			}
		}
		return matrix;
	}

	/**
	 * Znajduje wartoœci minimalne i maksymalne dla ka¿dej z kolumn
	 * @param arrToCheck
	 * @return
	 */
	public static int[][] findMaxAndMinsInMatrixColumns(int[][] arrToCheck) {
		int[][] minsAndMaxs = new int [arrToCheck.length][2];
		for (int i = 0; i < arrToCheck.length; i++) {
			for (int j = 0; j < arrToCheck[i].length; j++) {
				minsAndMaxs[i][0] = findInArray(arrToCheck[i], FindInArray.MIN);
				minsAndMaxs[i][1] = findInArray(arrToCheck[i], FindInArray.MAX);
 			}
		}
		return minsAndMaxs;
	}

	/**
	 * Transpozycja podanej macierzy
	 * @param arrToSwtch
	 * @return
	 */
	public static int[][] transposition(int[][] arrToSwtch) {
		int[][] arr = new int[arrToSwtch[0].length][arrToSwtch.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[j][i] = arrToSwtch[i][j];
			}
		}
		return arr;
	}

	/**
	 * dla podanej macierzy znajduje wartoœæ minimaln¹ i
	 * maksymaln¹ dla podanej macierzy i zwraca je w 
	 * tablicy o wielkosci 2. 
	 * [0] - MIN
	 * [1] - MAX
	 * @param arrToCheck
	 * @return
	 */
	public static int[] findMinAndMax(int[][] arrToCheck) {
		int[][] switchedArr = transposition(arrToCheck);
		int[][] maxesAndMins = findMaxAndMinsInMatrixColumns(switchedArr);
		int[] minsToCheck = new int[maxesAndMins.length];
		int[] maxesToCheck = new int[maxesAndMins.length];
		for(int i=0; i<maxesAndMins.length-1; i++) {
			minsToCheck[i] = maxesAndMins[i][0];
			maxesToCheck[i] = maxesAndMins[i][1];
		}
		int max = findInArray(minsToCheck, FindInArray.MIN);
		int min = findInArray(maxesToCheck, FindInArray.MAX);
		int[] minAndMax = new int[2];
		minAndMax[0] = min;
		minAndMax[1] = max;
		return minAndMax;
	}

	/**
	 * Znajduje w tablicy wartoœæ maksymaln¹ lub minimaln¹
	 * zale¿nie od @param minOrMax
	 * @param ar
	 * @param minOrMax
	 * @return
	 */
	public static int findInArray(int[] ar, FindInArray minOrMax) {
		boolean swapped = false;
		int minMax = ar[0];
		do {
			for(int i=0; i<ar.length; i++) {
				swapped = false;
				for(int j=0; j<ar.length; j++) {
				switch (minOrMax) {
				case MIN:
					if(minMax<ar[j]) {
						minMax=ar[j];
						swapped = true;
					}
					break;
				case MAX:
					if(minMax>ar[j]) {
						minMax=ar[j];
						swapped = true;
					}
					break;
				}
			}
		}
		}
		while(swapped);
		return minMax;
	}

	/**
	 * Wylicza œredni¹ podanej macierzy
	 * @param arr
	 * @return
	 */
	public static double computeAverage(int [][] arr) {
		double arrSize = arr.length;
		double arrSum = 0d;
		for(int i=0; i<arrSize; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arrSum += arr[i][j];
			}
		}
		return arrSum/arrSize;
	}

	/**
	 * Zlicza liczbê elementów powy¿ej œredniej
	 * w podanej macierzy
	 * @param arr
	 * @return
	 */
	public static int countAboveAvg(int[][] arr) {
		double avg = computeAverage(arr);
		int aboveAvgCount = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]>avg) {
					aboveAvgCount++;
				}
			}
		}
		return aboveAvgCount;
	}

	/**
	 * Zlicza liczbê elementów poni¿ej œredniej elementów
	 * macierzy
	 * @param arr
	 * @return
	 */
	public static int countUnderAvg(int[][] arr) {
		double avg = computeAverage(arr);
		int underAvgCount = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				if(arr[i][j]<avg) {
					underAvgCount++;
				}
			}
		}
		return underAvgCount;
	}

	/**
	 * Odwraca kolejnoœæ elementów macierzy
	 * @param arr
	 * @return
	 */
	public static int[][] reverseMatrixOrder(int[][] arr) {
		int[][] reversedMatrix = arr;
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				reversedMatrix[i][j] = arr[arr.length-1-i][arr[i].length-1-j];
			}
		}
		return reversedMatrix;
	}
	public enum FindInArray{
		MIN,
		MAX,
	}
}
