package lab5.coffeApi.model;

import lab5.coffeApi.model.interfaces.Pump;
/**
 * Pompka do mleka
 * @author Damian Piasecki
 *
 */
public class MilkPump implements Pump{

	@Override
	public String pump() {
		return "Pompowanie mleka";
	}
	
}
