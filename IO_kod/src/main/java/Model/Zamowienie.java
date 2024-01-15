package Model;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDateTime;


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
		setMasa(masa);
		setTowar(towar);
		setDystans(dystans);
		setDataZlozenia(dataZlozenia);
		setKierowca(kierowca);
		setKlient(klient);
		obliczCene();
		obliczPrzewidywanaDateRealizacji();
		setStatus("Niepotwierdzony");
	}


	public void obliczCene() {
		double pensjaKierowcy;
		if(this.kierowca.getCzyWynajety()){	//wynajety = nasz wlasny
			pensjaKierowcy = 0;
		}else{
			pensjaKierowcy = (dystans*3)+masa*0.9;
		}

		this.cena = 0.54*(masa+dystans/100)+pensjaKierowcy;
	}

	/**
	 * 
	 */
	public void obliczPrzewidywanaDateRealizacji() {
		double x = dystans*0.01;
		LocalDateTime dataTeraz = LocalDateTime.now();

		// Przesunięcie daty
		LocalDateTime dataRealizacji = dataTeraz.plusDays((int)x);

		// Konwersja na typ Date
		this.przewidywanaDataRealizacji = Date.from(dataRealizacji.atZone(ZoneId.systemDefault()).toInstant());

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

	public void anulujZamowienie(){}
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