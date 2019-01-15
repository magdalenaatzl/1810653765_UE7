package at.ac.fh_kufstein.uebung;

import javax.swing.*;

public class Aufgabe2 {

    public static void main(String[] args) {

        while(true){
            String eingabe = JOptionPane.showInputDialog("Zahl eingebenn");
            if (isNumeric(eingabe)){
                int zahl = Integer.parseInt(eingabe);
            }
            else break;
        }
    }
    private static boolean isNumeric(String eingabe) {
        try {
            int zahl = Integer.parseInt(eingabe);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
