package lab4;

import java.util.Arrays;
import java.util.Collections;

import lab4.exceptions.MatrixAddOperationException;
import lab4.utils.ArrayUtils;

public class Main {

	public static void main(String[] args) throws MatrixAddOperationException {
		int[][] tab = new int[2][3];
		int k =0;
		for(int i=0; i<tab.length; i++) {
			for(int j= 0; j<tab[i].length ; j++) {
				tab[i][j] = ++k;
				System.out.print(k+ "	");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(tab[0]));
		System.out.println("----------------ZAD1-------------------");
		int[] arr = Zad1.createRandArr(30);
		Arrays.toString(arr);
		System.out.println("Kopiowanie tablicy");
		Arrays.toString(Zad1.copyArray(arr));
		System.out.println("----------------ZAD2-------------------");
		int[][] zad2 = Zad2.generateRandMatrix(7,7);
		ArrayUtils.printIntMatrix(zad2);
		ArrayUtils.printIntMatrix(Zad2.findMaxAndMinsInMatrixColumns(zad2));
		Arrays.toString(Zad2.findMinAndMax(zad2));
		System.out.println("Srednia macierzy:");
		System.out.println(Zad2.computeAverage(zad2));
		System.out.println("Iloœæ elementów wiêkszych od œredniej");
		System.out.println(Zad2.countAboveAvg(zad2));
		System.out.println("Iloœæ elementów mniejszych od œredniej:");
		System.out.println(Zad2.countUnderAvg(zad2));
		int[][] zad3Copy = Zad2.reverseMatrixOrder(zad2);
		ArrayUtils.printIntMatrix(zad3Copy);
		System.out.println("----------------ZAD3-------------------");
		System.out.println("Macierz boolean");
		Arrays.toString(Zad3.fillBooleanArrayOddEven(40));
		System.out.println("----------------ZAD4-------------------");
		int[][] arr4 = Zad4.createMultiplyArray(15);
		ArrayUtils.printIntMatrix(arr4);
		System.out.println();
		System.out.println("---------------Srednia-----------------");
		System.out.println(Arrays.toString(Zad4.average(arr4)[0]));

		System.out.println("----------------ZAD5-------------------");
		System.out.println(Arrays.toString(Zad5.arrWithRandomNumber(40)));
		System.out.println();

		System.out.println("----------------ZAD6-------------------");
		System.out.println(Arrays.toString(Zad6.createCharArr()));

		System.out.println("----------------ZAD7-------------------");
		int[][] a = Zad7.randomMatrix(12);
		int[][] b = ArrayUtils.copyIntMatrix(a);
		ArrayUtils.printIntMatrix(a);

		System.out.println("----------------ZAD8-------------------");
		ArrayUtils.printIntMatrix(Zad8.addPrevMatrixToNew(a));

		System.out.println("----------------ZAD9-------------------");
		System.out.println("Algorytm sortowania b¹belkowego");
		Zad9.bubbleSortMatrix(a);
		System.out.println("Algorytm sortowania szybkiego");
		Zad9.quickSortMatrix(b);
	}
}
