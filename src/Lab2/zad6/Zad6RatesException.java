package Lab2.zad6;

public class Zad6RatesException extends Zad6Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Wprowadzone dane s¹ nieprawid³owe\n"
				+ "maksymalna iloœæ rat to 96 minimalna to wiêksza od 0";
	}
}
