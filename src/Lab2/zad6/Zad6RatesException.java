package Lab2.zad6;

public class Zad6RatesException extends Zad6Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Wprowadzone dane s� nieprawid�owe\n"
				+ "maksymalna ilo�� rat to 96 minimalna to wi�ksza od 0";
	}
}
