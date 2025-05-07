package zad3;
import java.util.ArrayList;
import java.util.List;

public class Paragon 
{
    private List<PozycjaParagonu> pozycje = new ArrayList<>();

    public void addPozycja(PozycjaParagonu pozycja) 
    {
        pozycje.add(pozycja);
    }

    public float getWartoscNettoParagonu() 
    {
        float sumaNetto = 0;
        for (PozycjaParagonu pozycja : pozycje) 
        {
            sumaNetto += pozycja.getWartoscNetto();
        }
        return sumaNetto;
    }

    public float getWartoscPodatkuParagonu() 
    {
        float sumaPodatku = 0;
        for (PozycjaParagonu pozycja : pozycje) 
        {
            sumaPodatku += pozycja.getWartoscPodatku();
        }
        return sumaPodatku;
    }

    public float getWartoscBruttoParagonu() 
    {
        float sumaBrutto = 0;
        for (PozycjaParagonu pozycja : pozycje) 
        {
            sumaBrutto += pozycja.getWartoscBrutto();
        }
        return sumaBrutto;
    }
}
