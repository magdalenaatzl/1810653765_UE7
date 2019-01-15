package at.ac.fh_kufstein.uebung;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe3 {
    public static void main(String[] args) {

        String mail = JOptionPane.showInputDialog("Deie E-Mail?");
        try {
            checkEmail(mail);
            System.out.println(mail);
            } catch (Exception ex){
            System.out.println("falsche E-Mail");

        }
    }


    public static void checkEmail (String email) throws Exception{

        Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
        Matcher m = pattern.matcher(email);
        if (!m.find());{
            throw new Exception();
        }
    }
}
