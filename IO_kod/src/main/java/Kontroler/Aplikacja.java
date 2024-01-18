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
			for (Pracownik pracownik : pracownicy) {
				if (pracownik.getLogin() == login && pracownik.getHaslo() == haslo) {
					return pracownik;
				}
			}
		} else {
			for (Klient klient : klienci) {
				if (klient.getLogin() == login && klient.getHaslo() == haslo) {
					return klient;
				}
			}
		}
		return null;
	}


	public Aplikacja(){

	}

}