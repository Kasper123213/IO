package Model;

public class Adres {
    private String miasto;

    private String ulica;

    private int numerDomu;

    private int numerMieszkania;

    private int kodPocztowy;


    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }

    public int getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(int numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public int getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(int kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }
}
