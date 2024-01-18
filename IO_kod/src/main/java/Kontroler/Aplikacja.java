package Kontroler;

import java.util.*;
import Model.*;

public class Aplikacja {

	public static ArrayList<Pracownik> pracownicy = new ArrayList<Pracownik>();
	public static ArrayList<Klient> klienci = new ArrayList<Klient>();

	public static ArrayList<Kierowca> kierowcy = new ArrayList<Kierowca>();
	public Scanner scanner;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO - implement Aplikacja.main
		throw new UnsupportedOperationException();
	}

	/**
	 * @param czyPracownik
	 */
	public Uzytkownik zaloguj(boolean czyPracownik) {
		System.out.println("Podaj login");
		String login = scanner.nextLine();
		System.out.println("Podaj haslo");
		String haslo = scanner.nextLine();

		if (czyPracownik == true) {
			Pracownik p;
			for (int i = 0; i < pracownicy.size(); i++) {
				p = pracownicy.get(i);
				if (p.getLogin() == login && p.getHaslo() == haslo) {
					return p;
				}
			}
		} else {
			Klient k;
			for (int i = 0; i < klienci.size(); i++) {
				k = klienci.get(i);
				if (k.getLogin() == login && k.getHaslo() == haslo) {
					return k;
				}
			}
		}
		return null;
	}


	public Aplikacja(){

	}

}