package Lab2.zad5;

public class Zad5Exception extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Podaj liczb� r�n� od zera\nNie mo�na dzieli� przez zero!!!";
	}
}
