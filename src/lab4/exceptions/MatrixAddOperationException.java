package lab4.exceptions;

public class MatrixAddOperationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Aby doda� 2 macierze musz� mie� one ten sam wymiar.";
	}
}
