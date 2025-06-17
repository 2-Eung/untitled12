public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        int result = a / b;           // 0 으로 나눴을때 발생하는 오류는 런타임 오류 이다.
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//        System.out.println(result);
        try {
            int result = a / b;
            System.out.println(result);                        // : 수학적 요류
        } catch (ArithmeticException e) {  // ArithmeticException : 0 으로 나눴을때 발생하는 오류
            System.out.println(e.getMessage());    // 기존 클래스에 작성된 에러메세지
            System.out.println(e.toString());      // 기존 클래스에 작성된 에러메세지 (자세한버전)
            System.out.println("Error: Division by zero."); // 사용자가 쓴 에러메세지
        }
    }
}