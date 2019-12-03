package lab5.coffeApi.model.exceptions;

public class WrongLevelException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String getMessage() {
		return "Podano nieprawid³owy poziom\nPoziom mo¿e byæ od 0 do 100 (%)";
	}
}
