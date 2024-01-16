import Model.Klient;
import Model.Pracownik;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

class PracownikTest {

    @Before
    void setUp(){
        Pracownik pracownik = new Pracownik("a","b");
        Klient klient = new Klient("x","y");

    }
}