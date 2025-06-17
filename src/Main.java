
public class Main {
    public static void main(String[] args) {
        String input = "100";

        try {
            validateTokenCount(input);


            System.out.println("숫자 2개");
        } catch(NumberFormatException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void validateTokenCount(String tokens) throws NumberFormatException {
        if (tokens.length() != 2) {
            throw new NumberFormatException("숫자 2개가 아닙니다.");
        }
    }
}