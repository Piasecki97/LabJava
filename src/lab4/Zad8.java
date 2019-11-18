package lab4;

import lab4.exceptions.MatrixAddOperationException;
import lab4.utils.ArrayUtils;

public class Zad8 {
	public static int[][] addPrevMatrixToNew(int[][] a) throws MatrixAddOperationException {
		int[][] b = Zad2.generateRandMatrix(12, 12);
		return ArrayUtils.addTwoMatrix(a, b);
	}
}
