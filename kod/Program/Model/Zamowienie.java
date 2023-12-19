package Program.Model;

public class Zamowienie {

	private double cena;
	private double masa;
	private String towar;
	private double dystans;
	private Date dataZlozenia;
	private Date przewidywanaDataRealizacji;
	private Kierowca kierowca;
	private Klient klient;
	private String status;

	/**
	 * 
	 * @param idKlienta
	 * @param masa
	 * @param towar
	 * @param dystans
	 * @param dataZlozenia
	 * @param kierowca
	 */
	public Zamowienie(int idKlienta, double masa, String towar, double dystans, Date dataZlozenia, Kierowca kierowca) {
		// TODO - implement Zamowienie.Zamowienie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cena
	 * @param masa
	 * @param towar
	 * @param dystans
	 * @param kierowca
	 */
	public void obliczCene(double cena, double masa, String towar, double dystans, Kierowca kierowca) {
		// TODO - implement Zamowienie.obliczCene
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param przewidywanaDataRealizacji
	 */
	public void obliczPrzewidywanaDateRealizacji(Date przewidywanaDataRealizacji) {
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
	 * @param Klient
	 */
	public Klient setKlient(klient Klient) {
		// TODO - implement Zamowienie.setKlient
		throw new UnsupportedOperationException();
	}

	public String getStatus() {
		return this.status;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	public enum Kierowca {
		imie,
		nazwisko,
		nrPrawaJazdy,
		czyWynajety
	}

}