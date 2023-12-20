package Program.Model;

public class Kierowca {
    private String imie;
    private String nazwisko;
    private int nrPrawaJazdy;
    private boolean czyWynajety;


    public Kierowca(String imie, String nazwisko, int nr, boolean czyWynajety){
        setImie(imie);
        setNazwisko(nazwisko);
        setNrPrawaJazdy(nr);
        setCzyWynajety(czyWynajety);
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public int getNrPrawaJazdy(){
        return nrPrawaJazdy;
    }

    public boolean getCzyWynajety(){
        return czyWynajety;
    }

    public void setImie(String imie){
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public void setNrPrawaJazdy(int nrPrawaJazdy){
        this.nrPrawaJazdy = nrPrawaJazdy;
    }

    public void setCzyWynajety(boolean czyWynajety){
        this.czyWynajety = czyWynajety;
    }
}
