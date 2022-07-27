public class Regular {

    public static void main(String[] args) {
        String input = "+38(097)555-55-55";
        boolean result = input.matches("^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
        if (result) {
            System.out.println("It is valid phone number");
        } else {
            System.out.println("It is not a phone number!");
        }
    }
}