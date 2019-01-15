package at.ac.fh_kufstein.uebung;

import java.io.FileInputStream;

public class Aufgabe5 {
    public static void main(String[] args) {
        /*
        checked Exceptions:
        Diese können im Programmcode behandelt werden, passiert das nicht, kpmmert sich das
        Laufzeitsystem darum (Gefahr auf Laufzeitfehler)

       Beispiele: IOException, SQLExeption, MalformedURLException...*/

       FileInputStream a = null;
        a = new FileInputStream("B:/myfile.txt"); //FileNotFoundException

        int i;
        while((i = a.read() != -1)){
            System.out.println("i"); //IOException -->Problem beim Einlesen der Datei
        }

        a.close(); //IOException


        /*
        Unchecked Exceptions:
        müssen immer im Programmcode behandelt werden; dies wird bei der Übersetzung geprüft

        Beispiele: NullPointerException, NumberFormatException, ClassCasException, IndexOutofBoundsException */

        int num1=10;
        int num2=0;

        int res=num1/num2; //ArithmeticExeption (Division durch 0)

    }
}
