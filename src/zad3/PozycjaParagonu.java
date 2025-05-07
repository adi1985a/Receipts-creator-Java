package zad3;

public class PozycjaParagonu 
{
    private Produkt produkt;
    private int iloscSztuk;

    public PozycjaParagonu(Produkt produkt, int iloscSztuk) 
    {
        this.produkt = produkt;
        this.iloscSztuk = iloscSztuk;
    }

    public float getWartoscNetto() 
    {
        return produkt.getCenaNetto() * iloscSztuk;
    }

    public float getWartoscPodatku() 
    {
        return getWartoscNetto() * (produkt.getStawkaVAT() / 100.0f);
    }

    public float getWartoscBrutto() 
    {
        return getWartoscNetto() + getWartoscPodatku();
    }
}
