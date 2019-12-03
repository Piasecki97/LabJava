package lab5.coffeApi.model;

import java.util.ArrayList;
import java.util.List;

import lab5.coffeApi.model.interfaces.Container;

/**
 * Pojemnik na kawê
 * @author Damian Piasecki
 *
 */
public class CoffeContainer extends Container{
	
	@Override
	public String containing() {
		return "Zawartoœæ kawy to" + getPercLevel();
	}

	public List<CoffeeKind> getAvailableCoffeeKinds() {
		ArrayList<CoffeeKind> coffeeKinds = new ArrayList<>();
		for(CoffeeKind kind : CoffeeKind.values()) {
			coffeeKinds.add(kind);
		}
		return coffeeKinds;
	}

	public void selectCoffeeKind(CoffeeKind selectedCoffee) {
		System.out.println("Wybrany rodzaj kawy to " + selectedCoffee.toString());
	}
	public enum CoffeeKind {
		ARABICA {
			@Override
			public String toString() {
				return "Arabica";
			}
		},
		ROBUSTA {
			@Override
			public String toString() {
				return "Robusta";
			}
		},
		GWATEMALA_ANTIQUA {
			@Override
			public String toString() {
				return "Gwemala Antiqua";
			}
		},
		JAMAJKA_BLUE_MONTAIN {
			@Override
			public String toString() {
				return "Jamajka Blue Montain";
			}
		},
		LIBERICA {
			@Override
			public String toString() {
				return "Liberica";
			}
		}
	}
}
