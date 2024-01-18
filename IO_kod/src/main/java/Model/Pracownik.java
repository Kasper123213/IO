package Model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pracownik extends Uzytkownik {

	/**
	 * 
	 * @param login
	 * @param haslo
	 */
	public Pracownik(String login, String haslo) {
		// TODO - implement Pracownik.Pracownik
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param zamowienie
	 */
	public void zmienStatus(Zamowienie zamowienie, String odpowiedz) {
		// TODO - implement Pracownik.zmienStatus

		Klient klient = zamowienie.getKlient();

		boolean akceptuj = false;
		try{
			akceptuj = Boolean.parseBoolean(odpowiedz);
		}catch (InputMismatchException e){
			System.out.println(e.getStackTrace());
		}

		if(akceptuj){
			wyslijWiadomoscDoKlienta("Potwierdzono", klient);
			zamowienie.setStatus("Potwierdzony");
		}else{
			wyslijWiadomoscDoKlienta("Odrzucono, prosze zmienic dane", klient);
			zamowienie.setStatus("Odrzucony");
		}

	}

	public String wyslijWiadomoscDoKlienta(String wiadomosc, Klient klient){
		return wiadomosc; //todo
	}

	/**
	 * 
	 * @param login
	 * @param haslo
	 */
	private void getData(String login, String haslo) {
		// TODO - implement Pracownik.getData
		throw new UnsupportedOperationException();
	}





}