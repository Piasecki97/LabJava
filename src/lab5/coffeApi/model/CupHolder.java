package lab5.coffeApi.model;
/**
 * Podstawka na kubki
 * @author Damain Piasecki
 *
 */
public class CupHolder{
	private boolean cupInPlace;

	public String isCupThere() {
		return cupInPlace ? "Kubek na miejscu" : "Brak kubka na podstawce";
	}

	public boolean isCupInPlace() {
		return cupInPlace;
	}
	
	public void setCupInPlace(boolean cupInPlace) {
		this.cupInPlace = cupInPlace;
	}
}
