package lab5.coffeApi.model;

import lab5.coffeApi.model.interfaces.Heater;

/**
 * Podgrzewacz wody
 * @author Damian Piasecki
 *
 */
public class WaterHeater implements Heater {

	@Override
	public String heat() {
		return "Podgrzewam wodê";
	}

}
