package lab5;

import java.util.Date;

import lab5.utils.DateUtils;
public class Samochod {

	String marka;
	String model;
	String pojemnosc;
	String typ;
	String silnik;
	String rokProdukcji;
	Date pierRejestr;

	public Samochod(String marka, String model, String pojemnosc, String typ, String silnik, String rokProdukcji,
			Date pierRejestr) {
		this.marka = marka;
		this.model = model;
		this.pojemnosc = pojemnosc;
		this.typ = typ;
		this.silnik = silnik;
		this.rokProdukcji = rokProdukcji;
		this.pierRejestr = pierRejestr;
	}

	public String hasWarranty() {
		double years = DateUtils.yearsBetween(new Date(), pierRejestr);
		if(years <= 2d) {
			return "Gwarancja nadal obowi¹zuje";
		} else {
			return "Gwarancja siê skoñczy³a";
		}
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPojemnosc() {
		return pojemnosc;
	}
	public void setPojemnosc(String pojemnosc) {
		this.pojemnosc = pojemnosc;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getSilnik() {
		return silnik;
	}
	public void setSilnik(String silnik) {
		this.silnik = silnik;
	}
	public String getRokProdukcji() {
		return rokProdukcji;
	}
	public void setRokProdukcji(String rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}
	public Date getPierRejestr() {
		return pierRejestr;
	}
	public void setPierRejestr(Date pierRejestr) {
		this.pierRejestr = pierRejestr;
	}
	
}
