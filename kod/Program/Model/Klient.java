package Program.Model;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;
import Program.Kontroler.Aplikacja;

public class Klient extends Uzytkownik {

	private Adres adres;

	boolean changes;

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


	private void dodajZamowienie(int idKlienta, double masa, String towar, double dystans, Date dataZlozenia, boolean czyWlasnyKierowca, String start, String koniec) {
		// TODO - implement Klient.dodajZamowienie
		Scanner scanner = new Scanner(System.in);
		Kierowca kierowca;
		if(czyWlasnyKierowca){
			System.out.println("Podaj imie kierowcy");
			String imie = scanner.nextLine();
			System.out.println("Podaj nazwisko kierowcy");
			String nazwisko = scanner.nextLine();
			System.out.println("Podaj nr prawa jazdy kierowcy");
			int nrPrawaJazdy = scanner.nextInt();
			boolean czyWynajety = true;
			kierowca = new Kierowca(imie,nazwisko,nrPrawaJazdy,czyWynajety);
		}else{
			kierowca = Aplikacja.kierowcy.get(0);
		}

		Zamowienie zamowienie = new Zamowienie(idKlienta, masa, towar, dystans, dataZlozenia, kierowca, start, koniec);    //utworz nowe zamowienie

		System.out.println("Cena to: "+zamowienie.getCena());
		System.out.println("Przewidywana data realizacji to: "+zamowienie.getPrzewidywanaDataRealizacji());
		zamowienie.setStatus("Niepotwierdzony");
		this.zamowienia.add(zamowienie);	//dodaj do listy zamowien tego uzytkownika


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




}