package zad3;

public class Produkt 
{
    private String nazwaTowaru;
    private float cenaNetto;
    private int stawkaVAT;

    public Produkt(String nazwaTowaru, float cenaNetto, int stawkaVAT) 
    {
        this.nazwaTowaru = nazwaTowaru;
        this.cenaNetto = cenaNetto;
        this.stawkaVAT = stawkaVAT;
    }

    public String getNazwaTowaru() 
    {
        return nazwaTowaru;
    }

    public float getCenaNetto() 
    {
        return cenaNetto;
    }

    public int getStawkaVAT() 
    {
        return stawkaVAT;
    }
}

