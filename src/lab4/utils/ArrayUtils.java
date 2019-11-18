package lab4.utils;

import lab4.exceptions.MatrixAddOperationException;

public class ArrayUtils {
	public static void printIntMatrix(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "	");
			}
			System.out.println();
		}
	}

	public static int[][] addTwoMatrix(int[][] a, int[][] b) throws MatrixAddOperationException {
		int[][] c;
		if(a.length != b.length && a[0].length != b[0].length) {
			throw new MatrixAddOperationException();
		} else {
			c = new int[a.length][a[0].length];
			for(int i=0; i<c.length; i++) {
				for(int j=0; j<c[i].length; j++) {
					c[i][j] = a[i][j] + b[i][j];
				}
			}
		}
		return c;
	}

	public static int[][] copyIntMatrix(int[][] a) {
		int[][] arr = new int[a.length][a[0].length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				arr[i][j] = a[i][j];
			}
		}
		return arr;
	}
 }
