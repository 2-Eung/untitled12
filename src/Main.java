@FunctionalInterface                        // 인터페이스가 단 한 개의 함수만을 가질 수 있다.
interface MathOperation {
    int operate(int a, int b);
}


public class Main {
    public static void main(String[] args) {                            // add 라는 인터페이스 변수에 람다식으로 만든 구현 객체를 가리키게 한다.
       MathOperation add = (a, b) -> {return a + b;};                // 생략 전
        MathOperation add = (a, b) -> a + b;                      // 생략 후

//        MathOperation adda = new MathOperation() {                    // 동일 기능을 익명클래스 로 재현
//            @Override
//            public int operate(int a, int b) {
//                return a + b;
//            }
//        };
        MathOperation multiply = (a,b) -> a * b;

        System.out.println(add.operate(2,4));
        System.out.println(multiply.operate(3,5));
    }
}