package String;

import java.util.Scanner;

public class StringBuffer {
    public static void main(String[] args) {
        //Palindrome-revers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String user_input=sc.next();
        StringBuilder sb=new StringBuilder(user_input);
        String rev_user_input=sb.reverse().toString();
        if (user_input.equalsIgnoreCase(rev_user_input)){
            System.out.println("Palindrome->"+user_input);
        }
        else {
            System.out.println("Nope!!");
        }
    }
}
