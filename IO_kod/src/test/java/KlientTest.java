import Model.Adres;
import Model.Kierowca;
import Model.Klient;
import Model.Zamowienie;
import mockit.Expectations;
import mockit.Mocked;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.*;


import java.util.Scanner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KlientTest {
    static Klient klient;
    static Zamowienie zamowienie1;
    static Zamowienie zamowienie2;
    @BeforeAll
    public static void setUp() {
        klient = new Klient("adam123", "strongPASSWORD321");
        klient.scanner = mock(Scanner.class);
        zamowienie1 = new Zamowienie(1, 211.2, "kot", 2000, new Date(121, 2, 5), new Kierowca("Andrzej", "Kon", 123987, true), "Wroclaw", "Legnica");
        zamowienie2 = new Zamowienie(1, 31.2, "dziecko", 100, new Date(111, 1, 5), new Kierowca("Arkadiusz", "Grzyb", 127, false), "Gdansk", "Warszawa");
    }


    @Test
    void adresTest(){
        Adres adres = new Adres();
        klient.setAdres(adres);
        assertEquals(adres, klient.getAdres());
    }



////    @ExtendWith(MockitoExtension.class)//todo
//    void dodajZamowienie(@Mocked Scanner anyScanner) {
//        // Przygotowanie danych testowych
//        int idKlienta = 1;
//        double masa = 100.0;
//        String towar = "Przykładowy towar";
//        double dystans = 200.0;
//        Date dataZlozenia = new Date();
//        boolean czyWlasnyKierowca = true;
//        String start = "Punkt początkowy";
//        String koniec = "Punkt docelowy";
//
//        new Expectations() {{
//            anyScanner.nextLine(); result = "Imie";
//            anyScanner.nextLine(); result = "Nazwisko";
//            anyScanner.nextInt(); result = 123;
//        }};
//
//        // Wywołanie metody do przetestowania
//        Klient klient = new Klient("a","b");
//        klient.dodajZamowienie(idKlienta, masa, towar, dystans, dataZlozenia, czyWlasnyKierowca, start, koniec);
//
//        // Sprawdzenie, czy zamówienie zostało poprawnie dodane
//        assertEquals(1, klient.getZamowienia().size());
//
//        // Tutaj można dodać więcej asercji, sprawdzając konkretne wartości itp.
//    }


    @Test
    void dodajZamowienie(){
        int iloscZamowien = klient.zamowienia.size();
        int idKlienta = 4;

        double masa = 4;
        String towar = "Towar";
        double dystans = 444.3;
        Date dataZlozenia = new Date(13, 4, 1);
        boolean czyWlasnyKierowca = true;
        String start = "Wroclaw";
        String koniec = "Gdansk";

        String imieKierowcy = "Jan Sebastian";
        String nazwiskoKierowcy = "Bach";
        int nrPrawaJazdy = 543;

        Kierowca kierowca = new Kierowca(imieKierowcy, nazwiskoKierowcy, nrPrawaJazdy, true);
        Zamowienie zamowienie = new Zamowienie(idKlienta, masa, towar, dystans, dataZlozenia, kierowca, start, koniec);

        when(klient.scanner.nextLine()).thenReturn(imieKierowcy)
                .thenReturn(nazwiskoKierowcy);

        when(klient.scanner.nextInt()).thenReturn(nrPrawaJazdy);

        klient.dodajZamowienie(idKlienta, masa, towar, dystans, dataZlozenia, czyWlasnyKierowca, start, start);

        assertEquals(iloscZamowien+1, klient.zamowienia.size());
        assertEquals(zamowienie.getKlient(), klient.zamowienia.get(klient.zamowienia.size()-1).getKlient());
        assertEquals(zamowienie.getDataZlozenia(), klient.zamowienia.get(klient.zamowienia.size()-1).getDataZlozenia());

    }
    @Test
    void usunZamowienie(){
        klient.zamowienia.clear();
        klient.zamowienia.add(zamowienie1);
        klient.zamowienia.add(zamowienie2);

        klient.usunZamowienie(zamowienie2);

        assertEquals(zamowienie1, klient.zamowienia.get(klient.zamowienia.size()-1));
    }
}