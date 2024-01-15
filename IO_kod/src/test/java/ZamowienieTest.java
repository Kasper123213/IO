import Model.Kierowca;
import Model.Zamowienie;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ZamowienieTest {
    private Random random = new Random();
    private double masa = random.nextDouble();
    private double dystans = random.nextDouble();
    private boolean czyKierowcaWlasny = random.nextBoolean();
    private Date dataZlozenia = new Date(123, 1, 15);
    private Kierowca kierowca = new Kierowca("Andrzej", "Kon", 123987, czyKierowcaWlasny);

    private Zamowienie zamowienie = new Zamowienie(1, masa, "pies", dystans, dataZlozenia, kierowca, "Wroclaw", "Legnica");


    @Test
    void obliczCene() {
        double pensjaKierowcy = czyKierowcaWlasny ? 0 : (dystans*3)+masa*0.9;

        assertEquals(0.54*(masa+dystans/100)+pensjaKierowcy, zamowienie.getCena());
    }

    @Test
    void obliczPrzewidywanaDateRealizacji() {
        double x = dystans*0.01;
        LocalDateTime dataTeraz = LocalDateTime.now();

        // Przesunięcie daty
        LocalDateTime dataRealizacji = dataTeraz.plusDays((int)x);

        // Konwersja na typ Date
        Date pDataRealizacji = Date.from(dataRealizacji.atZone(ZoneId.systemDefault()).toInstant());
        assertTrue(pDataRealizacji.toString().equals(zamowienie.getPrzewidywanaDataRealizacji().toString()));
    }
}