import Kontroler.Aplikacja;
import Model.Klient;
import Model.Pracownik;
import Model.Uzytkownik;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class AplikacjaTest {
    Aplikacja app;
    String login1 = "a", login2 = "b", login3 = "c", login4 = "d", haslo1 = "e", haslo2 = "f", haslo3 = "g", haslo4 = "h";
    Pracownik pracownik1, pracownik2;
    Klient klient1, klient2;
    @BeforeEach
    public void setup(){
        app = new Aplikacja();
        app.scanner = mock(Scanner.class);

        pracownik1 = new Pracownik(login1, haslo1);
        pracownik2 = new Pracownik(login2, haslo2);
        klient1 = new Klient(login3, haslo3);
        klient2 = new Klient(login4, haslo4);

        app.pracownicy.add(pracownik1);
        app.pracownicy.add(pracownik2);
        app.klienci.add(klient1);
        app.klienci.add(klient2);

    }
    @Test
    public void zalogujTest(){
        Uzytkownik x;

        when(app.scanner.nextLine()).thenReturn(login1).thenReturn(haslo1);
        x = app.zaloguj(true);
        assertEquals(pracownik1, x);

        when(app.scanner.nextLine()).thenReturn(login2).thenReturn(haslo2);
        x = app.zaloguj(true);
        assertEquals(pracownik2, x);

        when(app.scanner.nextLine()).thenReturn(login3).thenReturn(haslo3);
        x = app.zaloguj(false);
        assertEquals(klient1, x);

        when(app.scanner.nextLine()).thenReturn(login4).thenReturn(haslo4);
        x = app.zaloguj(false);
        assertEquals(klient2, x);

    }

}