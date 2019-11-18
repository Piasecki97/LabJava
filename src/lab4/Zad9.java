package lab4;

import java.util.Arrays;

public class Zad9 {
	public static int[][] bubbleSortMatrix(int[][] a) {
		int[] arrToSort = parseMatrixToArray(a);
		bubbleSort(arrToSort);
		return parseArrToMatrix(a, arrToSort);
	}

	public static int[][] quickSortMatrix(int [][] matrix) {
		int[] arr = parseMatrixToArray(matrix);
		quickSort(arr, 0, arr.length-1, 1);
		return parseArrToMatrix(matrix, arr);
	}
	public static int[] parseMatrixToArray(int[][] a) {
		int[] arr = new int[a.length * a[0].length];
		int z = 0;
		for(int k=0; k<a.length; k++) {
			for(int l=0; l<a[k].length; l++) {
				arr[z] = a[k][l];
				z ++;
			}
		}
		return arr;
	}

	private static void bubbleSort(int[] arrToSort) {
		int itCount = 1;
		boolean switched = false;
		do {
			switched = false;
			for(int i=0; i<arrToSort.length-1; i++) {
					if(arrToSort[i]>arrToSort[i+1]) {
						int temp;
						if(itCount < 6) {
							System.out.println("Iteracja " + itCount);
							System.out.println(Arrays.toString(arrToSort));
						}
						temp=arrToSort[i+1];
						arrToSort[i+1] = arrToSort[i];
						if(itCount < 6)
							System.out.println(Arrays.toString(arrToSort));
						arrToSort[i] = temp;
						switched = true;
						if(itCount < 6)
							System.out.println(Arrays.toString(arrToSort));
						itCount++;
				}
			}
		} while(switched);
	}
	private static void quickSort(int[] arr, int left, int right, int ittCount) {
		int i, j;
	    int x, y;
	    i = left; j = right;
	    x = arr[(left+right)/2];
	    do {
	      while((arr[i] < x) && (i < right)) i++;
	      while((x < arr[j]) && (j > left)) j--;
	      if(i <= j) {
	        y = arr[i];
	        if(ittCount < 6) {
	        	System.out.println("Iteracja " + ittCount++);
	        	System.out.println(Arrays.toString(arr));
	        }
	        arr[i] = arr[j];
	        if(ittCount < 6) {
	        	System.out.println(Arrays.toString(arr));
	        }
	        arr[j] = y;
	        if(ittCount < 6) {
	        	System.out.println(Arrays.toString(arr));
	        }
	        i++; j--;
	      }
	    } while(i <= j);
	    if(left < j) {
	    	quickSort(arr, left, j, ittCount);
		}
	    if(i < right) {
	    	quickSort(arr, i, right, ittCount);
		}
  }
	
	public static int[][] parseArrToMatrix(int[][] resultMatrix, int[] arr) {
		int z = 0;
		for(int i=0; i<resultMatrix.length; i++) {
			for(int j=0; j<resultMatrix[i].length && z<arr.length; j++) {
				resultMatrix[i][j] = arr[z];
				z++;
			}
		}
		return resultMatrix;
	}
 }
