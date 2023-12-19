package Program.Model;

public class Klient extends Uzytkownik {

	private Adres adres;

	/**
	 * 
	 * @param login
	 * @param haslo
	 */
	public Klient(String login, String haslo) {
		// TODO - implement Klient.Klient
		throw new UnsupportedOperationException();
	}

	public Adres getAdres() {
		return this.adres;
	}

	/**
	 * 
	 * @param adres
	 */
	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	/**
	 * 
	 * @param zamowienie
	 */
	private void dodajZamowienie(Zamowienie zamowienie) {
		// TODO - implement Klient.dodajZamowienie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param login
	 * @param haslo
	 */
	private void getData(String login, String haslo) {
		// TODO - implement Klient.getData
		throw new UnsupportedOperationException();
	}


	public enum Adres {
		miasto,
		ulica,
		numerDomu,
		numerMieszkania,
		kodPocztowy
	}

}