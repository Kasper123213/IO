import Model.Adres;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdresTest {
    private static Adres adres;
    private static String miasto = "Wroclaw";
    private static String ulica = "Wielka";
    private static int numerDomu = 56;
    private static int numerMieszkania = 8;
    private static int kodPocztowy = 59400;
    @BeforeAll
    public static void setAdres(){
        adres = new Adres();
        adres.setMiasto(miasto);
        adres.setKodPocztowy(kodPocztowy);
        adres.setUlica(ulica);
        adres.setNumerDomu(numerDomu);
        adres.setNumerMieszkania(numerMieszkania);
        adres.setKodPocztowy(kodPocztowy);
    }

    @Test
    public void getMiasto() {
        assertEquals(miasto, adres.getMiasto());
    }
    @Test
    public void setMiasto() {
        miasto = "Lublin";
        adres.setMiasto(miasto);
        assertEquals(miasto, adres.getMiasto());
    }
    @Test
    public void getUlica() {
        assertEquals(miasto, adres.getMiasto());
    }
    @Test
    public void setUlica( ) {
        ulica = "Mala";
        adres.setUlica(ulica);
        assertEquals(ulica, adres.getUlica());
    }
    @Test
    public void getNumerDomu() {
        assertEquals(miasto, adres.getMiasto());
    }
    @Test
    public void setNumerDomu() {
        numerDomu = 1111;
        adres.setNumerDomu(numerDomu);
        assertEquals(numerDomu, adres.getNumerDomu());
    }
    @Test
    public void getNumerMieszkania() {
        assertEquals(miasto, adres.getMiasto());
    }
    @Test
    public void setNumerMieszkania() {
        numerMieszkania = 9876;
        adres.setNumerMieszkania(numerMieszkania);
        assertEquals(numerMieszkania, adres.getNumerMieszkania());
    }
    @Test
    public void getKodPocztowy() {
        assertEquals(miasto, adres.getMiasto());
    }
    @Test
    public void setKodPocztowy() {
        kodPocztowy = 64888;
        adres.setKodPocztowy(kodPocztowy);
        assertEquals(kodPocztowy, adres.getKodPocztowy());
    }

}