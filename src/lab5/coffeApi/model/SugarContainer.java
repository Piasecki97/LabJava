package lab5.coffeApi.model;

import lab5.coffeApi.model.interfaces.Container;

/**
 * Pojemnik na cukier
 * @author Damian Piasecki
 *
 */
public class SugarContainer extends Container{

	@Override
	public String containing() {
		return "Zawartoœæ cukru to" + getPercLevel();
	}

}
