package String.homework;

public class DuplicateString {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Original string: " + str);

        // Duplicating the string by removing duplicate characters
        StringBuilder duplicated = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (duplicated.indexOf(String.valueOf(ch)) == -1) {
                duplicated.append(ch);
            }
        }

        System.out.println("Duplicated string: " + duplicated.toString());
    }
}
