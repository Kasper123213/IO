package Program.Model;

import java.util.*;

public abstract class Uzytkownik {

	private String login;
	private String haslo;
	private String imie;
	private String nazwisko;
	private int numerTelefonu;
	private String email;
	private int id;
	public Collection<Zamowienie> zamowienia = new ArrayList<Zamowienie>();

	public String getLogin() {
		return this.login;
	}

	/**
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	public String getHaslo() {
		return this.haslo;
	}

	/**
	 * 
	 * @param haslo
	 */
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	public String getImie() {
		return this.imie;
	}

	/**
	 * 
	 * @param imie
	 */
	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	/**
	 * 
	 * @param nazwiski
	 */
	public void setNazwisko(String nazwiski) {
		this.nazwisko = nazwiski;
	}

	public int getNumerTelefonu() {
		return this.numerTelefonu;
	}

	/**
	 * 
	 * @param numerTelefonu
	 */
	public void setNumerTelefonu(int numerTelefonu) {
		this.numerTelefonu = numerTelefonu;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Zamowienie> getZamowienia() {
		// TODO - implement Uzytkownik.getZamowienia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param zamowienia
	 */
	public void setZamowienia(ArrayList<Zamowienie> zamowienia) {
		// TODO - implement Uzytkownik.setZamowienia
		throw new UnsupportedOperationException();
	}

}