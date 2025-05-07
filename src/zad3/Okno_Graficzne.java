package zad3;
import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno_Graficzne extends JFrame 
{
    private JLabel opis_Towaru;
    private JTextField pole_towar;
    private JLabel opis_cena_Netto;
    private JTextField cena_Netto;
    private JLabel opis_ilosc_sztuk;
    private JTextField ilosc_sztuk;
    private JLabel opis_podatek_VAT;
    private JTextField podatek_VAT;
    private JButton dodaj_Towar;
    private JButton koniec_Paragonu;
    private JButton koniec_Programu;
    private JLabel dodana_pozycja;
    private JTextArea dodane_Pozycje;

    private Paragon paragon = new Paragon();
    private Pobierz_Dane pobierz_Dane = new Pobierz_Dane();
    private int i = 1;

    public Okno_Graficzne() 
    {
        setSize(1000, 600);
        setTitle("Aplikacja Paragon");
        setLayout(null);
        
        opis_Towaru = new JLabel("Podaj nazwę towaru :");
        opis_Towaru.setBounds(20, 40, 150, 30);
        add(opis_Towaru);

        pole_towar = new JTextField("");  // Inicjalizacja pola_towar
        pole_towar.setBounds(300, 40, 150, 30);
        add(pole_towar);

        opis_cena_Netto = new JLabel("Podaj cenę Netto:");
        opis_cena_Netto.setBounds(20, 80, 150, 30);
        add(opis_cena_Netto);

        cena_Netto = new JTextField("");
        cena_Netto.setBounds(300, 80, 150, 30);
        add(cena_Netto);

        opis_ilosc_sztuk = new JLabel("Podaj ilość sztuk:");
        opis_ilosc_sztuk.setBounds(20, 120, 150, 30);
        add(opis_ilosc_sztuk);

        ilosc_sztuk = new JTextField("");
        ilosc_sztuk.setBounds(300, 120, 150, 30);
        add(ilosc_sztuk);

        opis_podatek_VAT = new JLabel("Podaj wysokość podatku VAT w procentach:");
        opis_podatek_VAT.setBounds(20, 160, 300, 30);
        add(opis_podatek_VAT);

        podatek_VAT = new JTextField("");
        podatek_VAT.setBounds(300, 160, 150, 30);
        add(podatek_VAT);

        dodana_pozycja = new JLabel(" ");
        dodana_pozycja.setBounds(20, 200, 950, 30);
        add(dodana_pozycja);

        dodane_Pozycje = new JTextArea(" ");
        dodane_Pozycje.setBounds(20, 250, 950, 300);
        add(dodane_Pozycje);
        dodane_Pozycje.setEditable(false);

        dodaj_Towar = new JButton("Dodaj pozycje do paragonu");
        dodaj_Towar.setBounds(500, 80, 300, 30);
        add(dodaj_Towar);

        koniec_Paragonu = new JButton("Koniec wprowadzania danych do paragonu");
        koniec_Paragonu.setBounds(500, 120, 300, 30);
        add(koniec_Paragonu);

        koniec_Programu = new JButton("Koniec programu");
        koniec_Programu.setBounds(500, 160, 300, 30);
        add(koniec_Programu);

        dodaj_Towar.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                String towar = pobierz_Dane.getTekst(pole_towar.getText());
                float cena = pobierz_Dane.getFloat(cena_Netto.getText());
                int ilosc = pobierz_Dane.getInt(ilosc_sztuk.getText());
                int vat = pobierz_Dane.getInt(podatek_VAT.getText());

                Produkt produkt = new Produkt(towar, cena, vat);
                PozycjaParagonu pozycjaParagonu = new PozycjaParagonu(produkt, ilosc);
                paragon.addPozycja(pozycjaParagonu);

                float netto = pozycjaParagonu.getWartoscNetto();
                float podatek_wartosc = pozycjaParagonu.getWartoscPodatku();
                float brutto = pozycjaParagonu.getWartoscBrutto();

                String pozycja = "Towar: " + towar + ", cena netto: " + cena + ", ilość sztuk: " +
                        ilosc + ", VAT w %: " + vat + ", wartość netto: " + netto +
                        ", wartość VAT: " + podatek_wartosc + ", wartość brutto: " + brutto;

                dodana_pozycja.setText(pozycja);
                dodane_Pozycje.append(pozycja + "\n");

                pole_towar.setText("");
                cena_Netto.setText("");
                ilosc_sztuk.setText("");
                podatek_VAT.setText("");
                i++;
            }
        });

        koniec_Paragonu.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                float suma_netto = paragon.getWartoscNettoParagonu();
                float suma_podatek_wartosc = paragon.getWartoscPodatkuParagonu();
                float suma_brutto = paragon.getWartoscBruttoParagonu();

                String koniec = String.format("<tr><td colspan=5>Podsumowanie : " +
                        "</td><td ALIGN=right> %,.2f zł </td><td ALIGN=right> %,.2f zł </td><td ALIGN=right> %,.2f zł </td></tr></table> </body> </html>",
                        suma_netto, suma_podatek_wartosc, suma_brutto);

                JOptionPane.showMessageDialog(null, koniec);
            }
        });

        koniec_Programu.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                System.exit(0);
            }
        });
    }
        
        public static void main(String[] args) 
        {
            SwingUtilities.invokeLater(() -> 
            {
                Okno_Graficzne okno = new Okno_Graficzne();
                okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                okno.setVisible(true);
            });
        }
    }

