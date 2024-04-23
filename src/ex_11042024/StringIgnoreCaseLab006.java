package ex_11042024;

import java.awt.desktop.SystemEventListener;

public class StringIgnoreCaseLab006 {
    public static void main(String[] args) {
        String password ="Password!23";
        String pass_u=password.toLowerCase();
        System.out.println(pass_u==password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        System.out.println(password.substring(0,9));
    }
}
