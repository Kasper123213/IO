import Model.Kierowca;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KierowcaTest {

    private static Kierowca kierowca;
    private static String imie;
    private static String nazwisko;
    private static int nr;
    private static boolean czyWynajety;
    @BeforeAll
    public static void setKierowca(){
        imie = "Antoni";
        nazwisko = "Kleks";
        nr = 203213;
        czyWynajety = false;
        kierowca = new Kierowca(imie, nazwisko, nr, czyWynajety);
    }

    @Test
    void getImie(){
        assertEquals(imie, kierowca.getImie());
    }
    @Test
    void getNazwisko(){
        assertEquals(nazwisko, kierowca.getNazwisko());
    }
    @Test
    void getNrPrawaJazdy(){
        assertEquals(nr, kierowca.getNrPrawaJazdy());
    }
    @Test
    void getCzyWynajety(){
        assertEquals(czyWynajety, kierowca.getCzyWynajety());
    }
    @Test
    void setImie(){
        imie = "Jan";
        kierowca.setImie(imie);
        assertEquals(imie, kierowca.getImie());
    }
    @Test
    void setNazwisko(){
        nazwisko = "JAAAAAAAn";
        kierowca.setNazwisko(nazwisko);
        assertEquals(nazwisko, kierowca.getNazwisko());
    }
    @Test
    void setNrPrawaJazdy(){
        nr = 5789;
        kierowca.setNrPrawaJazdy(nr);
        assertEquals(nr, kierowca.getNrPrawaJazdy());
    }
    @Test
    void setCzyWynajety(){
        czyWynajety = !czyWynajety;
        kierowca.setCzyWynajety(czyWynajety);
        assertEquals(czyWynajety, kierowca.getCzyWynajety());
    }
}