public class Main {
    public static void main(String[] args) {
        String input = "123a";

        try {
            int number = Integer.parseInt(input);

            System.out.println("Parse number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Unable to parse the input");
        } finally {
            System.out.println("Process completed.");
        }
    }
}