package lab5;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class AutoKomis {
	private List<Samochod> flota = Collections.emptyList();

	public AutoKomis(List<Samochod> flota) {
		this.flota = flota;
	}

	@SuppressWarnings("deprecation")
	public AutoKomis() {
		flota.add(new Samochod("Fiat", "126p", "0.8L", "hatchback", "TFSI bez turbo", "1989", new Date("1980-11-23")));
		flota.add(new Samochod("Polonez", "du¿y", "1.4L", "sedan", "TDI turbo", "2000", new Date("2018-11-21")));
		flota.add(new Samochod("Seat", "Ibiza", "0.8L", "hatchback", "TFSI bez turbo", "2019", new Date()));
	}
	public List<Samochod> getFlota() {
		return flota;
	}
	public void setFlota(List<Samochod> flota) {
		this.flota = flota;
	}
}
