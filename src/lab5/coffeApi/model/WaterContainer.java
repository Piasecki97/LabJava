package lab5.coffeApi.model;

import lab5.coffeApi.model.interfaces.Container;

/**
 * Pojemnik na wodê
 * @author Damian Piasecki
 *
 */
public class WaterContainer extends Container {

	@Override
	public String containing() {
		return "Poziom wody wynosi" + getPercLevel();
	}
	
}
