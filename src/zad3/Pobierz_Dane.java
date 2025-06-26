package zad3;
import javax.swing.*;

public class Pobierz_Dane 
{
    public String getTekst(String input) 
    {
        if (input.trim().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Field cannot be empty!");
            return null;
        }
        return input.trim();
    }

    public float getFloat(String input) 
    {
        try 
        {
            return Float.parseFloat(input);
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Invalid numeric value entered!");
            return 0;
        }
    }

    public int getInt(String input) 
    {
        try 
        {
            return Integer.parseInt(input);
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, "Invalid numeric value entered!");
            return 0;
        }
    }
}
