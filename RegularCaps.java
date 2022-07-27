public class RegularCaps {
    public static void main(String[] args) {
        String input = "HELLO";
        boolean result = input.matches("[A-Z]*");
        if (result) {
            System.out.println("CORRECT RESULT");
        } else {
            System.out.println("Incorrect result");
        }
}}
