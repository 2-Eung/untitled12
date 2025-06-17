

public class Main {
    public static void main(String[] args) {
        String input = "10";
        NumberFormatException e = new NumberFormatException();
        System.out.println(e);

        try {
            boolean resurt = validateTokenCount(input);

        if (resurt) {
            System.out.println("숫자 2개");
            }

        } catch (NumberFormatException s) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean validateTokenCount(String tokens) throws NumberFormatException {
        if (tokens.length() !=2) {
            throw new NumberFormatException("숫자 2개가 아닙니다.");
        }
        return true;
    }
}