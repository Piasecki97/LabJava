package lab4.exceptions;

public class MatrixAddOperationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Aby dodaæ 2 macierze musz¹ mieæ one ten sam wymiar.";
	}
}
