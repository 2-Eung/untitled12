

public class Main {
    public static void main(String[] args) {
        String strNum = "123a";

        try {
            int num = convertToInt(strNum);
            System.out.println("변환결과: " + num);
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식 오류!");
        }
    }
    public static int convertToInt(String s) throws NumberFormatException {  // NumberFormatException 이친구에게
        return Integer.parseInt(s);                                         // 떠넘긴다.
    }
}