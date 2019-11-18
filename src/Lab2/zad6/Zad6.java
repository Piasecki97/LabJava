package Lab2.zad6;

public class Zad6 {
	/**
	 * @param moneyAmount maksymalna wartoœæ do 300 000 
	 * @param numberOfRates maksymaln¹ iloœæ rat do 96
	 */
	public Double leasingCalculator(double moneyAmount, int numberOfRates) throws Zad6Exception{
		if(moneyAmount > 300000 || moneyAmount < 0) {
			throw new Zad6MoneyException();
		}  else {
			if(numberOfRates <= 24) {
				return moneyAmount*1.02;
			} else if(numberOfRates <= 48) {
				return moneyAmount*1.03;
			} else if(numberOfRates <= 60) {
				return moneyAmount*1.04;
			} else if(numberOfRates <= 72) {
				return moneyAmount*1.05;
			} else if(numberOfRates <= 96) {
				return moneyAmount*1.06;
			} else {
				throw new Zad6RatesException();
			}
		}
	}
}
