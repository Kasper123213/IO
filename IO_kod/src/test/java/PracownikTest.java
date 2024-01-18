import Model.Kierowca;
import Model.Klient;
import Model.Pracownik;
import Model.Zamowienie;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Scanner;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class PracownikTest {
    Pracownik pracownik;
    Klient klient;
    Zamowienie zamowienie;
    Scanner scanner;

    @BeforeEach
    void setUp(){
        pracownik = new Pracownik("a","b");
        klient = new Klient("x","y");
        zamowienie = new Zamowienie(1,1,"banany",929,new Date(13, 4, 1),new Kierowca("j","k",6,true),"Wroclaw","Warszawa");
        klient.zamowienia.add(zamowienie);

    }

    @Test
    void zmienStatusTest(){
        boolean p = true;
        boolean n = false;

        pracownik.zmienStatus(zamowienie, "true");

        assertEquals("Potwierdzony", zamowienie.getStatus());
        assertEquals("Potwierdzono",klient.wiadomosci.get(klient.wiadomosci.size()-1));

        pracownik.zmienStatus(zamowienie, "false");

        assertEquals("Odrzucony", zamowienie.getStatus());
        assertEquals("Odrzucono, prosze zmienic dane",klient.wiadomosci.get(klient.wiadomosci.size()-1));

    }

    @Test
    void wiadomoscTest(){
        String wiad1, wiad2;    //wiadomosci do klienta oczekiwane
        String odp1 = "Potwierdzono", odp2 = "Odrzucono, prosze zmienic dane";      //otrzymane wiadomosci

        wiad1 = pracownik.wyslijWiadomoscDoKlienta("Potwierdzono", klient);
        wiad2 = pracownik.wyslijWiadomoscDoKlienta("Odrzucono, prosze zmienic dane", klient);

        assertEquals(odp1,wiad1);
        assertEquals(odp2,wiad2);

    }

}