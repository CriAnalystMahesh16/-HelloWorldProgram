package String.homework;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello world!";
        System.out.println("Original string: " + str);

        // Reversing the string without using a separate function
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
