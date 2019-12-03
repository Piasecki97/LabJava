package lab5.coffeApi.model.interfaces;

import lab5.coffeApi.model.exceptions.WrongLevelException;

/**
 * klasa abstrakcyjna kontenera (zbiornika)
 * @author Damian Piasecki
 *
 */
public abstract class Container {
	private short percLevel;
	/**
	 * Zwraca procentow¹ zawartoœæ pojemnika
	 * @return
	 */
	public abstract String containing();

	public short getPercLevel() {
		return percLevel;
	}
	public void setPercLevel(short percLevel) throws WrongLevelException{
		if(percLevel > 100 || percLevel < 0) {
			throw new WrongLevelException();
		} else {
			this.percLevel = percLevel;
		}
	}
}
