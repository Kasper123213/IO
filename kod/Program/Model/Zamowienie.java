package Program.Model;

import java.util.Date;

public class Zamowienie {

	private double cena;
	private double masa;
	private String towar;
	private double dystans;
	private Date dataZlozenia;
	private Date przewidywanaDataRealizacji;
	private Kierowca kierowca;
	private Klient klient;
	private Status status;

	private String lokalizacjaPoczatkowa;

	private String lokalizacjaKoncowa;

	/**
	 * 
	 * @param idKlienta
	 * @param masa
	 * @param towar
	 * @param dystans
	 * @param dataZlozenia
	 */
	public Zamowienie(int idKlienta, double masa, String towar, double dystans, Date dataZlozenia, Kierowca kierowca, String start, String stop) {
		// TODO - implement Zamowienie.Zamowienie
		//ustaw status na niepotwierdzony
		setStatus("Niepotwierdzony");
		throw new UnsupportedOperationException();
	}


	public void obliczCene() {
		// TODO - implement Zamowienie.obliczCene
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 */
	public void obliczPrzewidywanaDateRealizacji() {
		// TODO - implement Zamowienie.obliczPrzewidywanaDateRealizacji
		throw new UnsupportedOperationException();
	}

	public double getCena() {
		return this.cena;
	}

	public double getMasa() {
		return this.masa;
	}

	/**
	 * 
	 * @param masa
	 */
	public void setMasa(double masa) {
		this.masa = masa;
	}

	public String getTowar() {
		return this.towar;
	}

	/**
	 * 
	 * @param towar
	 */
	public void setTowar(String towar) {
		this.towar = towar;
	}

	public double getDystans() {
		return this.dystans;
	}

	/**
	 * 
	 * @param dystans
	 */
	public void setDystans(double dystans) {
		this.dystans = dystans;
	}

	public Date getDataZlozenia() {
		return this.dataZlozenia;
	}

	/**
	 * 
	 * @param dataZlozenia
	 */
	public void setDataZlozenia(Date dataZlozenia) {
		this.dataZlozenia = dataZlozenia;
	}

	public Date getPrzewidywanaDataRealizacji() {
		return this.przewidywanaDataRealizacji;
	}

	public Kierowca getKierowca() {
		return this.kierowca;
	}

	/**
	 * 
	 * @param kierowca
	 */
	public void setKierowca(Kierowca kierowca) {
		this.kierowca = kierowca;
	}

	public Klient getKlient() {
		return this.klient;
	}

	/**
	 * 
	 * @param klient
	 */
	public void setKlient(Klient klient) {

	}

	public Status getStatus() {
		return this.status;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status) {

		//ustawiamy status :3
		switch(status){
			case("Potwierdzony"):
				this.status = Status.POTWIERDZONY;
				break;
			case("Niepotwierdzony"):
				this.status = Status.NIEPOTWIERDZONY;
				break;
			case("Odrzucony"):
				this.status = Status.ODRZUCONY;
				break;
		}
	}

	public String getLokalizacjaPoczatkowa(){return this.lokalizacjaPoczatkowa;}

	public void setLokalizacjaPoczatkowa(String lokalizacjaPoczatkowa){this.lokalizacjaPoczatkowa = lokalizacjaPoczatkowa;}

	public String getLokalizacjaKoncowa(){return this.lokalizacjaKoncowa;}

	public void setLokalizacjaKoncowa(String lokalizacjaKoncowa){this.lokalizacjaKoncowa = lokalizacjaKoncowa;}


	public enum Status {
		POTWIERDZONY("Potwierdzony"),
		NIEPOTWIERDZONY("Niepotwierdzony"),
		ODRZUCONY("Odrzucony");

		private String opis;

		Status(String opis){
			this.opis = opis;
		}

		public String getOpis(){
			return opis;
		}
	}

}