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
    private JButton remove_Last;
    private JButton save_Receipt;
    private JLabel summaryLabel;

    private Paragon paragon = new Paragon();
    private Pobierz_Dane pobierz_Dane = new Pobierz_Dane();
    private int i = 1;

    public Okno_Graficzne() 
    {
        setSize(1400, 1100);
        setTitle("Receipt Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(34, 40, 49));
        setLayout(new BorderLayout());

        // Panel nagłówka: grafika + opis + autor
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));
        headerPanel.setBackground(new Color(34, 40, 49));

        // Grafika
        ImageIcon icon = new ImageIcon(getClass().getResource("header.jpg"));
        Image img = icon.getImage();
        int maxW = 600, maxH = 100;
        int imgW = icon.getIconWidth();
        int imgH = icon.getIconHeight();
        double scale = Math.min((double)maxW/imgW, (double)maxH/imgH);
        int newW = (int)(imgW * scale);
        int newH = (int)(imgH * scale);
        Image scaledImg = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        JLabel headerLabel = new JLabel(scaledIcon, SwingConstants.CENTER);
        headerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        headerPanel.add(headerLabel);

        // Opis
        JLabel desc = new JLabel("Modern receipt generator for small businesses and shops. Quickly create, sum and save your receipts.");
        desc.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        desc.setForeground(Color.LIGHT_GRAY);
        desc.setAlignmentX(Component.CENTER_ALIGNMENT);
        headerPanel.add(desc);
        headerPanel.add(Box.createRigidArea(new Dimension(0, 4)));

        // Autor
        JLabel author = new JLabel("Created by Adrian Lesniak");
        author.setFont(new Font("Segoe UI", Font.BOLD, 16));
        author.setForeground(new Color(0, 255, 0));
        author.setAlignmentX(Component.CENTER_ALIGNMENT);
        headerPanel.add(author);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

        add(headerPanel, BorderLayout.NORTH);

        // Panel główny z polami
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.setBackground(new Color(34, 40, 49));
        panelMain.setBorder(BorderFactory.createEmptyBorder(30, 200, 30, 200));

        Font labelFont = new Font("Segoe UI", Font.BOLD, 22);
        Font fieldFont = new Font("Segoe UI", Font.PLAIN, 22);

        opis_Towaru = new JLabel("Enter product name:");
        opis_Towaru.setFont(labelFont);
        opis_Towaru.setForeground(Color.WHITE);
        opis_Towaru.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(opis_Towaru);
        pole_towar = new JTextField(20);
        pole_towar.setFont(fieldFont);
        pole_towar.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        pole_towar.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(pole_towar);
        panelMain.add(Box.createRigidArea(new Dimension(0, 10)));

        opis_cena_Netto = new JLabel("Enter net price:");
        opis_cena_Netto.setFont(labelFont);
        opis_cena_Netto.setForeground(Color.WHITE);
        opis_cena_Netto.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(opis_cena_Netto);
        cena_Netto = new JTextField(20);
        cena_Netto.setFont(fieldFont);
        cena_Netto.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        cena_Netto.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(cena_Netto);
        panelMain.add(Box.createRigidArea(new Dimension(0, 10)));

        opis_ilosc_sztuk = new JLabel("Enter quantity:");
        opis_ilosc_sztuk.setFont(labelFont);
        opis_ilosc_sztuk.setForeground(Color.WHITE);
        opis_ilosc_sztuk.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(opis_ilosc_sztuk);
        ilosc_sztuk = new JTextField(20);
        ilosc_sztuk.setFont(fieldFont);
        ilosc_sztuk.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        ilosc_sztuk.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(ilosc_sztuk);
        panelMain.add(Box.createRigidArea(new Dimension(0, 10)));

        opis_podatek_VAT = new JLabel("Enter VAT rate (%):");
        opis_podatek_VAT.setFont(labelFont);
        opis_podatek_VAT.setForeground(Color.WHITE);
        opis_podatek_VAT.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(opis_podatek_VAT);
        podatek_VAT = new JTextField(20);
        podatek_VAT.setFont(fieldFont);
        podatek_VAT.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        podatek_VAT.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(podatek_VAT);
        panelMain.add(Box.createRigidArea(new Dimension(0, 20)));

        // Panel przycisków
        JPanel panelButtons = new JPanel();
        panelButtons.setBackground(new Color(34, 40, 49));
        panelButtons.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
        dodaj_Towar = new JButton("Add item to receipt");
        dodaj_Towar.setFont(labelFont);
        remove_Last = new JButton("Remove last item");
        remove_Last.setFont(labelFont);
        save_Receipt = new JButton("Save receipt to file");
        save_Receipt.setFont(labelFont);
        koniec_Paragonu = new JButton("Finish data entry");
        koniec_Paragonu.setFont(labelFont);
        koniec_Programu = new JButton("Exit program");
        koniec_Programu.setFont(labelFont);
        panelButtons.add(dodaj_Towar);
        panelButtons.add(remove_Last);
        panelButtons.add(save_Receipt);
        panelButtons.add(koniec_Paragonu);
        panelButtons.add(koniec_Programu);
        panelButtons.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(panelButtons);
        panelMain.add(Box.createRigidArea(new Dimension(0, 20)));

        // Panel z dodanymi pozycjami
        dodana_pozycja = new JLabel(" ");
        dodana_pozycja.setFont(new Font("Segoe UI", Font.ITALIC, 18));
        dodana_pozycja.setForeground(new Color(0, 255, 0));
        dodana_pozycja.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(dodana_pozycja);
        panelMain.add(Box.createRigidArea(new Dimension(0, 10)));

        dodane_Pozycje = new JTextArea(14, 60);
        dodane_Pozycje.setFont(new Font("Consolas", Font.PLAIN, 16));
        dodane_Pozycje.setBackground(new Color(57, 62, 70));
        dodane_Pozycje.setForeground(Color.WHITE);
        dodane_Pozycje.setEditable(false);
        dodane_Pozycje.setAlignmentX(Component.CENTER_ALIGNMENT);
        JScrollPane scroll = new JScrollPane(dodane_Pozycje);
        scroll.setPreferredSize(new Dimension(800, 220));
        scroll.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(scroll);
        panelMain.add(Box.createRigidArea(new Dimension(0, 20)));

        // Summary label
        summaryLabel = new JLabel("Items: 0 | Net: 0.00 | VAT: 0.00 | Gross: 0.00");
        summaryLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
        summaryLabel.setForeground(new Color(0, 255, 0));
        summaryLabel.setHorizontalAlignment(SwingConstants.CENTER);
        summaryLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelMain.add(summaryLabel);

        add(panelMain, BorderLayout.CENTER);

        dodaj_Towar.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                String product = pobierz_Dane.getTekst(pole_towar.getText());
                float price = pobierz_Dane.getFloat(cena_Netto.getText());
                int quantity = pobierz_Dane.getInt(ilosc_sztuk.getText());
                int vat = pobierz_Dane.getInt(podatek_VAT.getText());
                if (product == null || product.isEmpty() || price <= 0 || quantity <= 0 || vat < 0) {
                    JOptionPane.showMessageDialog(null, "Please enter valid data in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Produkt produkt = new Produkt(product, price, vat);
                PozycjaParagonu pozycjaParagonu = new PozycjaParagonu(produkt, quantity);
                paragon.addPozycja(pozycjaParagonu);
                float netto = pozycjaParagonu.getWartoscNetto();
                float podatek_wartosc = pozycjaParagonu.getWartoscPodatku();
                float brutto = pozycjaParagonu.getWartoscBrutto();
                String pozycja = "Product: " + product + ", net price: " + price + ", quantity: " + quantity + ", VAT %: " + vat + ", net: " + netto + ", VAT: " + podatek_wartosc + ", gross: " + brutto;
                dodana_pozycja.setText(pozycja);
                dodane_Pozycje.append(pozycja + "\n");
                pole_towar.setText("");
                cena_Netto.setText("");
                ilosc_sztuk.setText("");
                podatek_VAT.setText("");
                updateSummary();
            }
        });
        remove_Last.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (paragon.removeLast()) {
                    String text = dodane_Pozycje.getText();
                    int lastNewline = text.lastIndexOf("\n", text.length() - 2);
                    if (lastNewline >= 0) {
                        dodane_Pozycje.setText(text.substring(0, lastNewline + 1));
                    } else {
                        dodane_Pozycje.setText("");
                    }
                    dodana_pozycja.setText("Last item removed.");
                    updateSummary();
                } else {
                    JOptionPane.showMessageDialog(null, "No items to remove!", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        save_Receipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JFileChooser fileChooser = new JFileChooser();
                int option = fileChooser.showSaveDialog(Okno_Graficzne.this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    java.io.File file = fileChooser.getSelectedFile();
                    try (java.io.PrintWriter out = new java.io.PrintWriter(file)) {
                        out.println("RECEIPT 2.0");
                        out.println("------------------------------");
                        out.print(dodane_Pozycje.getText());
                        out.println("------------------------------");
                        out.println(summaryLabel.getText());
                        JOptionPane.showMessageDialog(null, "Receipt saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error saving file!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        koniec_Paragonu.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                updateSummary();
                JOptionPane.showMessageDialog(null, "Summary:\n" + summaryLabel.getText(), "Summary", JOptionPane.INFORMATION_MESSAGE);
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

    private void updateSummary() {
        int count = paragon.getCount();
        float net = paragon.getWartoscNettoParagonu();
        float vat = paragon.getWartoscPodatkuParagonu();
        float gross = paragon.getWartoscBruttoParagonu();
        summaryLabel.setText("Items: " + count + " | Net: " + String.format("%.2f", net) + " | VAT: " + String.format("%.2f", vat) + " | Gross: " + String.format("%.2f", gross));
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

