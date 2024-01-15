package Model;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;
import Kontroler.Aplikacja;

public class Klient extends Uzytkownik {

	private Adres adres;

	boolean changes;

	public Scanner scanner;

	/**
	 * 
	 * @param login
	 * @param haslo
	 */
	public Klient(String login, String haslo) {
		scanner = new Scanner(System.in);
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


	public void dodajZamowienie(int idKlienta, double masa, String towar, double dystans, Date dataZlozenia, boolean czyWlasnyKierowca, String start, String koniec) {
		// TODO - implement Klient.dodajZamowienie
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
			kierowca = Aplikacja.kierowcy.remove(0);
			Aplikacja.kierowcy.add(kierowca);
		}

		Zamowienie zamowienie = new Zamowienie(idKlienta, masa, towar, dystans, dataZlozenia, kierowca, start, koniec);    //utworz nowe zamowienie

		System.out.println("Cena to: "+zamowienie.getCena());
		System.out.println("Przewidywana data realizacji to: "+zamowienie.getPrzewidywanaDataRealizacji());
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


	public void pokazZamowienie(){

	}

	public void usunZamowienie(){
		zamowienia.remove(zamowienia.size()-1);
	}

	public void edytujZamowienie(){

		System.out.println("Wybierz zamowienie do edycji");

		for(int i=0; i<zamowienia.size(); i++){
			System.out.println(zamowienia.toArray()[i]);
		}

		int choice = scanner.nextInt();

		Zamowienie zamowienie = (Zamowienie) zamowienia.toArray()[choice];

		System.out.println("Wybierz ktora opcje chcesz edytowac: ");

		String option = scanner.nextLine();

		switch (option){
			case("masa"):
				System.out.println("Podaj mase towaru");
				double masa = scanner.nextDouble();
				zamowienie.setMasa(masa);
				break;
			case("towar"):
				System.out.println("Podaj typ towaru");
				String towar = scanner.nextLine();
				zamowienie.setTowar(towar);
				break;
			case("dystans"):
				System.out.println("Podaj dystans zamowienia");
				double dystans = scanner.nextDouble();
				zamowienie.setDystans(dystans);
				break;
			case("dataZlozenia"):
				System.out.println("Podaj date zlozenia zamowienia");
				System.out.println("Podaj dzien");
				int day = scanner.nextInt();
				System.out.println("Podaj miesiac");
				int month = scanner.nextInt();
				System.out.println("Podaj rok");
				int year = scanner.nextInt();
				Date dataZlozenia = new Date(year - 1900,  month, day);
				zamowienie.setDataZlozenia(dataZlozenia);
				break;
			case("kierowca"):
				System.out.println("Wybierz kierowce");
				System.out.println("Czy kierowca ma bbyc przyporzadkowany przez firme?");
				boolean czyWlasny = !scanner.nextBoolean();

				String imie = null;
				String nazwisko = null;
				int nr = -1;
				if(czyWlasny) {
					System.out.println("Podaj imie");
					imie = scanner.nextLine();
					System.out.println("Podaj nazwisko");
					nazwisko = scanner.nextLine();
					System.out.println("Podaj numer prawa jazdy");
					nr = scanner.nextInt();
				}


				Kierowca kierowca = new Kierowca(imie, nazwisko, nr, czyWlasny);
				zamowienie.setKierowca(kierowca);
				break;

		}
	}

	public void wyloguj(){

	}

}