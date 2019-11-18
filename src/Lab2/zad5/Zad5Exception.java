package Lab2.zad5;

public class Zad5Exception extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Podaj liczbê ró¿n¹ od zera\nNie mo¿na dzieliæ przez zero!!!";
	}
}
