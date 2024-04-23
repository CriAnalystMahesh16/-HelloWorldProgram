package ex_11042024;

import java.util.Locale;

public class StringLab002 {
    public static void main(String[] args) {
        String name="SKY";
        System.out.println("Your Name is-> Mumbai Indians");
    //String is the bunch of characters.
        //We can create String using two ways:1.Assignment operator 2.Using new keyword
        System.out.println(name);
        System.out.println("Your name is->"+name);
        System.out.println("Your name is-> %s"+name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase(Locale.ROOT));

    }
}
