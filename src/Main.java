public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try {
            int result = a / b;
            System.out.println("Result : "+ result);
        } catch (NumberFormatException e) {
            System.out.println("Error : 0 으로 나눌수 없음");
        } finally {
            System.out.println("Cleanup : 이 블록은 항상 실행됩니다.");
        }
    }

}