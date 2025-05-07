package zad3;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Okno_Graficzne okno = new Okno_Graficzne();
            okno.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            okno.setVisible(true);
        });
    }
}