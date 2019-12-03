package lab5.coffeApi.model;

import lab5.coffeApi.model.interfaces.Heater;

/**
 * Podgrzewacz mleka
 * @author Damian Piasecki
 *
 */
public class MilkHeater implements Heater {

	@Override
	public String heat() {
		return "Podgrzewam mleko";
	}
}
