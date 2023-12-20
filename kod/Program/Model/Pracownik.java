package Program.Model;

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
	private void zmienStatus(Zamowienie zamowienie) {
		// TODO - implement Pracownik.zmienStatus
		Scanner scanner = new Scanner(System.in);
		System.out.println("Oto parametry zamowienia: ");
		System.out.println("");	//tu wypisac parametry



		System.out.println("Czy potwierdzasz waznosc zamowienia?");
		boolean odpowiedz = scanner.nextBoolean();
		if(odpowiedz == true){
			wyslijWiadomoscDoKlienta("Potwierdzono", zamowienie.getKlient());
			zamowienie.setStatus("Potwierdzony");
		}else{
			wyslijWiadomoscDoKlienta("Odrzucono, prosze zmienic dane", zamowienie.getKlient());
			zamowienie.setStatus("Odrzucony");
		}
	}

	private void wyslijWiadomoscDoKlienta(String wiadomosc, Klient klient){

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