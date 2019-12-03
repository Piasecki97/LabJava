package lab5.coffeApi.model;

import lab5.coffeApi.model.interfaces.Pump;

public class WaterPump implements Pump{

	@Override
	public String pump() {
		return "Pompuje wodê";
	}

}
