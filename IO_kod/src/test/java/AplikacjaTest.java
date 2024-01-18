import Kontroler.Aplikacja;
import Model.Klient;
import Model.Pracownik;
import Model.Uzytkownik;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

        app.pracownicy.add(new Pracownik(login1,haslo1));
        app.pracownicy.add(new Pracownik(login2,haslo2));
        app.klienci.add(new Klient(login3,haslo3));
        app.klienci.add(new Klient(login4,haslo4));
    }
    @Test
    public void zalogujTest(){
        Uzytkownik x;

        //mozeby porownac obiekty? ale wtedy chyba beda rozne hashe
        x = app.zaloguj(true);
        when(app.scanner.nextLine()).thenReturn(login1).thenReturn(haslo1);
        assertEquals(login1, x.getLogin());
        assertEquals(haslo1, x.getHaslo());

        x = app.zaloguj(true);
        when(app.scanner.nextLine()).thenReturn(login2).thenReturn(haslo2);
        assertEquals(login2, x.getLogin());
        assertEquals(haslo2, x.getHaslo());

        x = app.zaloguj(true);
        when(app.scanner.nextLine()).thenReturn(login3).thenReturn(haslo2);
        assertEquals(login3, x.getLogin());
        assertEquals(haslo3, x.getHaslo());

        x = app.zaloguj(true);
        when(app.scanner.nextLine()).thenReturn(login4).thenReturn(haslo2);
        assertEquals(login4, x.getLogin());
        assertEquals(haslo4, x.getHaslo());
    }

}