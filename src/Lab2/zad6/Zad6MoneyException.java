package Lab2.zad6;

public class Zad6MoneyException extends Zad6Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Wprowadzone dane s¹ nieprawid³owe\n"
				+ "maksymalna kwota po¿yczki to 300000 minimalna to wiêksza od 0";
	}
}
